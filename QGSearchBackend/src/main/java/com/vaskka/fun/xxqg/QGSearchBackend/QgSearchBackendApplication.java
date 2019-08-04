package com.vaskka.fun.xxqg.QGSearchBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class QgSearchBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(QgSearchBackendApplication.class, args);
	}

}
