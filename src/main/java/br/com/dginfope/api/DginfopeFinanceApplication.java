package br.com.dginfope.api;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

import br.com.dginfope.api.config.property.DginfopeProperty;

@SpringBootApplication
@EnableConfigurationProperties({ DginfopeProperty.class })
public class DginfopeFinanceApplication {

	private static ApplicationContext APPLICATION_CONTEXT;
	
    @PostConstruct
    public void init(){
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }
		
	public static void main(String[] args) {
		APPLICATION_CONTEXT = SpringApplication.run(DginfopeFinanceApplication.class, args);
	}
	
	public static <T> T getBean(Class<T> type) {
		return APPLICATION_CONTEXT.getBean(type);
	}

}
