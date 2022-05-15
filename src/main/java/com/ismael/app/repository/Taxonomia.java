package com.ismael.app.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ismael.app.model.Constants;
import com.ismael.app.model.Grafo;
import com.ismael.app.model.Nodo;

@Repository
public class Taxonomia {

    private Grafo g;

    public void generarGrafoTaxonomico() {
	g = new Grafo();
	Nodo n = new Nodo("Biota");
	g.addNode(n);
	List<String> listaBiota = new ArrayList<String>();
	listaBiota.addAll(Arrays.asList(Constants.Biota));
	g.addGrafo(generarGrafo(listaBiota, Constants.INICIO, "-"));
    }

    public Grafo getGrafo() {
	return g;
    }

    public Grafo generarGrafo(List<String> names, int categoria, String padre) {
	Nodo n;
	for (String name : names) {
	    n = new Nodo(name, categoria, padre);
	    if ("Cytota".equals(name)) {
		Cytota c = new Cytota();
		List<String> listaCytota = new ArrayList<String>();
		listaCytota.addAll(Arrays.asList(Constants.Cytota));
		g.addGrafo(c.generarGrafo(listaCytota, categoria + 1, name));
	    } else if ("Acytota".equals(name)) {
		Acytota a = new Acytota();
		List<String> listaAcytota = new ArrayList<String>();
		listaAcytota.addAll(Arrays.asList(Constants.Acytota));
		g.addGrafo(a.generarGrafo(listaAcytota, categoria + 1, name));
	    }
	    g.addNode(n);
	}
	return g;
    }
}