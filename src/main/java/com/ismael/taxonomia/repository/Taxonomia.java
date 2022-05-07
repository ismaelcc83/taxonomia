package com.ismael.taxonomia.repository;

import org.springframework.stereotype.Repository;

import com.ismael.taxonomia.model.Grafo;
import com.ismael.taxonomia.model.Nodo;

@Repository
public class Taxonomia {

    private Grafo g;

    public void generarGrafoTaxonomico() {
	g = new Grafo();
	Nodo n;
	n = new Nodo("Biota");
	g.addNode(n);
	n = new Nodo("Cytota", "Superdominio", "Biota");
	g.addNode(n);
	Cytota c = new Cytota();
	g.addGrafo(c.generarGrafo());
	n = new Nodo("Acytota", "Superdominio", "Biota");
	g.addNode(n);
	Acytota a = new Acytota();
	g.addGrafo(a.generarGrafo());
    }

    public Grafo getGrafo() {
	return g;
    }
}