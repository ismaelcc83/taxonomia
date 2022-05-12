package com.ismael.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//http://localhost:8080/taxonomia
//http://localhost:8080/taxonomia?nombre=Methanothermobacter
@SpringBootApplication
public class TaxonomiaApplication {

    public static void main(String[] args) {
	SpringApplication.run(TaxonomiaApplication.class, args);
    }

}
