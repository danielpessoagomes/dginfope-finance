package br.com.dginfope.api.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import br.com.dginfope.api.exception.BancoNaoExisteException;
import br.com.dginfope.api.exception.CategoriaNaoExisteException;
import br.com.dginfope.api.exception.ResponsavelNaoExisteException;
import br.com.dginfope.api.model.Banco;
import br.com.dginfope.api.model.Categoria;
import br.com.dginfope.api.model.Lancamento;
import br.com.dginfope.api.model.Responsavel;
import br.com.dginfope.api.model.enumeration.TipoLancamento;
import br.com.dginfope.api.repository.BancoRepository;
import br.com.dginfope.api.repository.CategoriaRepository;
import br.com.dginfope.api.repository.LancamentoRepository;
import br.com.dginfope.api.repository.ResponsavelRepository;

@Service
public class LancamentoService {

	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	@Autowired
	private ResponsavelRepository responsavelRepository;
	
	@Autowired
	private BancoRepository bancoRepository;
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	public Lancamento salvar(Lancamento lancamento) {
		return lancamentoRepository.save(lancamento);
	}

	public Lancamento atualizar(Long codigo, Lancamento lancamento) {
		Lancamento lancamentoSalvo = buscarPorId(codigo);

		BeanUtils.copyProperties(lancamento, lancamentoSalvo, "codigo");

		return lancamentoRepository.save(lancamentoSalvo);
	}

	public void excluir(Long codigo) {
		Lancamento lancamentoSalvo = buscarPorId(codigo);
		lancamentoRepository.delete(lancamentoSalvo);
	}

	private Lancamento buscarPorId(Long codigo) {
		Optional<Lancamento> lancamentoSalvo = lancamentoRepository.findById(codigo);
		if (!lancamentoSalvo.isPresent()) {
			throw new EmptyResultDataAccessException(1);
		}
		return lancamentoSalvo.get();
	}

	public void upload(MultipartFile file) throws IOException {
		List<Lancamento> lancamentos = new ArrayList<Lancamento>();
		
		try {
			Path tempDir = Files.createTempDirectory("");
			File tempFile = tempDir.resolve(file.getOriginalFilename()).toFile();
			file.transferTo(tempFile);
			
			Workbook workbook = WorkbookFactory.create(tempFile);
			Sheet sheet = workbook.getSheetAt(0);
			
			Iterator<Row> rowIterator = sheet.iterator();
			
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				 				
				if(row.getRowNum() == 0) { 
					continue;
				}
				
				System.out.println(row.getRowNum() + 1);
				
				Lancamento lancamento = new Lancamento();
				lancamentos.add(lancamento);
				
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					switch (cell.getColumnIndex()) {
					case 0:
						validarInformacao(cell);
						lancamento.setData(cell.getLocalDateTimeCellValue().toLocalDate());
						break;
					case 1:
						validarInformacao(cell);
						Responsavel responsavel = buscarResponsavelPorNome(cell.getStringCellValue());
						lancamento.setResponsavel(responsavel); 
						break;
					case 2: 
						validarInformacao(cell);
						lancamento.setDescricao(cell.getStringCellValue());
						break;
					case 3:
						validarInformacao(cell);
						Categoria categoria = buscarCategoriaPorDescricao(cell.getStringCellValue());
						lancamento.setCategoria(categoria);
						break;
					case 4:
						validarInformacao(cell);
						Banco banco = buscarBancoPorNome(cell.getStringCellValue());
						lancamento.setBanco(banco);
						break;
					case 5:
						validarInformacao(cell);
						lancamento.setValor(BigDecimal.valueOf(cell.getNumericCellValue()));
					default:
						break;
					}
					lancamento.setTipoLancamento(TipoLancamento.DESPESA);
				}
			}
			
			for (Lancamento lancamento : lancamentos) {
				salvar(lancamento);
			}
			
			workbook.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}		
	}
	
	private Responsavel buscarResponsavelPorNome(String nome) {
		Optional<Responsavel> responsavel = responsavelRepository.findByNome(nome);
		
		if (!responsavel.isPresent()) {
			throw new ResponsavelNaoExisteException();
		}		
		
		return responsavel.get();
	}
	
	private Categoria buscarCategoriaPorDescricao(String descricao) {
		Optional<Categoria> categoria = categoriaRepository.findByDescricaoAndCategoriaNotNullAndSubCategoriaNotNullAndCategoriaCodigo(descricao, Long.valueOf(2));
		
		if (!categoria.isPresent()) {
			throw new CategoriaNaoExisteException();
		}		
		
		return categoria.get();
	}
	
	private Banco buscarBancoPorNome(String nome) {
		Optional<Banco> banco = bancoRepository.findByNome(nome);
		
		if (!banco.isPresent()) {
			throw new BancoNaoExisteException();
		}		
		
		return banco.get();
	}
	
	private Cell validarInformacao(Cell cell) {
		
		if(cell.equals(null)) {
			System.out.println("Informação vazio");
			throw new CategoriaNaoExisteException();
		}
		
		return cell;
	}
	
}
