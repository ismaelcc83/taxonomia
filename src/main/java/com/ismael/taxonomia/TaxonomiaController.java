package com.ismael.taxonomia;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaxonomiaController {

    private static final String template = "La taxonomia de %s es %s";
    private final AtomicLong contadorConsultas = new AtomicLong();

    @GetMapping("/taxonomia")
    public Mensaje taxonomia(@RequestParam(value = "nombre", defaultValue = "Homo sapiens sapiens") String nombre) {
	String taxonomia = "Animalia > Chordata > Mammalia > Primates > Haplorhini > Simiiformes > Hominidae > Homininae > Hominini > Homo > Homo sapiens > Homo sapiens sapiens";
	String respuesta = String.format(template, nombre, taxonomia);
	Mensaje msj = new Mensaje(contadorConsultas.incrementAndGet(), respuesta);
	return msj;
    }
}