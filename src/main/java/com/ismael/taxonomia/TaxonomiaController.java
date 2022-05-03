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

	generarGrafoTaxonomico();
	String taxonomia = "Animalia > Chordata > Mammalia > Primates > Haplorhini > Simiiformes > Hominidae > Homininae > Hominini > Homo > Homo sapiens > Homo sapiens sapiens";

	String respuesta = String.format(template, nombre, taxonomia);
	Mensaje msj = new Mensaje(contadorConsultas.incrementAndGet(), respuesta);
	return msj;
    }

    private void generarGrafoTaxonomico() {
	Grafo g = new Grafo();
	Nodo n;
	n = new Nodo("Biota");
	g.addNode(n);
	n = new Nodo("Cytota", "Superdominio", "Biota");
	g.addNode(n);
	n = new Nodo("Acytota", "Superdominio", "Biota");
	g.addNode(n);

	// Cytota
	n = new Nodo("Archaea", "Dominio", "Cytota");
	g.addNode(n);
	n = new Nodo("Bacteria", "Dominio", "Cytota");
	g.addNode(n);
	n = new Nodo("Eukaryota", "Dominio", "Cytota");
	g.addNode(n);
	n = new Nodo("Protobionte", "Dominio", "Cytota");
	g.addNode(n);

	// Acytota
	n = new Nodo("Viroidia", "Dominio", "Acytota");
	g.addNode(n);
	n = new Nodo("Ribozyviria", "Dominio", "Acytota");
	g.addNode(n);
	n = new Nodo("Virus", "Dominio", "Acytota");
	g.addNode(n);
	n = new Nodo("Plásmido", "Dominio", "Acytota");
	g.addNode(n);
	n = new Nodo("Replicadores del mundo de ARN", "Dominio", "Acytota");
	g.addNode(n);

	// Archaea
	g.addNode(n);
	n = new Nodo("", "Reino", "Archaea");

	// Bacteria
	g.addNode(n);
	n = new Nodo("", "Reino", "Bacteria");

	// Eukaryota
	g.addNode(n);
	n = new Nodo("Animalia", "Reino", "Eukaryota");
	g.addNode(n);
	n = new Nodo("Fungi", "Reino", "Eukaryota");
	g.addNode(n);
	n = new Nodo("Plantae", "Reino", "Eukaryota");
	g.addNode(n);
	n = new Nodo("Protista", "Reino", "Eukaryota");

	// Protobionte

	// Viroidia
	n = new Nodo("Avsunviroidae");
	g.addNode(n);
	n = new Nodo("Pospiviroidae");
	g.addNode(n);

	// Avsunviroidae
	n = new Nodo("Avsunviroid");
	g.addNode(n);
	n = new Nodo("Pelamoviroid");
	g.addNode(n);
	n = new Nodo("Elaviroid");
	g.addNode(n);

	// Pospiviroidae
	n = new Nodo("Apscaviroid");
	g.addNode(n);
	n = new Nodo("Cocadviroid");
	g.addNode(n);
	n = new Nodo("Coleviroid");
	g.addNode(n);
	n = new Nodo("Hostuviroid");
	g.addNode(n);
	n = new Nodo("Pospiviroid");
	g.addNode(n);

	// Ribozyviria
	n = new Nodo("Kolmioviridae");
	g.addNode(n);

	// Virus
	n = new Nodo("Adnaviria");
	g.addNode(n);
	n = new Nodo("Duplodnaviria");
	g.addNode(n);
	n = new Nodo("Riboviria");
	g.addNode(n);
	n = new Nodo("Varidnaviria");
	g.addNode(n);
	n = new Nodo("Monodnaviria");
	g.addNode(n);

	// Adnaviria
	n = new Nodo("Zilligvirae");
	g.addNode(n);
	n = new Nodo("Tristromaviridae");
	g.addNode(n);
	n = new Nodo("Ligamenvirales");
	g.addNode(n);
	n = new Nodo("Rudiviridae");
	g.addNode(n);
	n = new Nodo("Lipothrixviridae");
	g.addNode(n);
	n = new Nodo("Ungulaviridae");
	g.addNode(n);

	// Duplodnaviria
	n = new Nodo("Caudoviricetes");
	g.addNode(n);
	n = new Nodo("Herpesvirales");
	g.addNode(n);

	// Riboviria
	n = new Nodo("Orthornavirae");
	g.addNode(n);
	n = new Nodo("Pararnavirae");
	g.addNode(n);

	// Varidnaviria
	n = new Nodo("Bamfordvirae");
	g.addNode(n);
	n = new Nodo("Helvetiavirae");
	g.addNode(n);

	// Monodnaviria
	n = new Nodo("Loebvirae");
	g.addNode(n);
	n = new Nodo("Sangervirae");
	g.addNode(n);
	n = new Nodo("Shotokuvirae");
	g.addNode(n);
	n = new Nodo("Trapavirae");
	g.addNode(n);

    }
}