package com.ismael.app.controller;

import java.util.concurrent.atomic.AtomicLong;
//import java.util.logging.Level;
//import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ismael.app.model.Grafo;
import com.ismael.app.model.Nodo;
import com.ismael.app.repository.Taxonomia;

@RestController
public class TaxonomiaController {

    // private final static Logger LOGGER = Logger.getLogger("log");
    private static final String template = "La taxonomia de %s es %s";
    private final AtomicLong contadorConsultas = new AtomicLong();

    @GetMapping("/taxonomia")
    public Mensaje taxonomia(@RequestParam(value = "nombre", defaultValue = "Biota") String nombre) {

	Taxonomia t = new Taxonomia();
	Grafo g;
	String ruta = "";

	try {
	    t.generarGrafoTaxonomico();
	    g = t.getGrafo();
	    Nodo n = g.findByName(nombre);
	    if (n != null) {
		ruta = g.getPath(n);
	    } else {
		ruta = "Error: No existe.";
	    }
	} catch (Exception e) {
	    // LOGGER.log(Level.SEVERE, "ERROR GENERANDO EL MENSAJE");
	    System.out.println("Error generando el mensaje.");
	}

	String respuesta = String.format(template, nombre, ruta);
	Mensaje msj = new Mensaje(contadorConsultas.incrementAndGet(), respuesta);
	return msj;
    }

}