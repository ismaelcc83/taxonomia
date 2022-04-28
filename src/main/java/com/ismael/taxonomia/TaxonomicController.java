package com.ismael.taxonomia;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaxonomicController {

    private static final String template = "La taxonomia de %s es %s";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/taxonomia")
    public Message taxonomia(@RequestParam(value = "nombre", defaultValue = "Homo sapiens sapiens") String nombre) {
	String taxonomia = "Animalia>Chordata>Mammalia>Primates>Haplorhini>Simiiformes>Hominidae>Homininae>Hominini>Homo>Homo sapiens>Homo sapiens sapiens";
	return new Message(counter.incrementAndGet(), String.format(template, nombre, taxonomia));
    }
}