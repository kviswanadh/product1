package com.premier.books;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication
public class BookApplication  {

	public static void main(String[] args) {
		SpringApplication.run(BookApplication.class, args);
	}

}
