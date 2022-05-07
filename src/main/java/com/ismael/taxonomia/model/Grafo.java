package com.ismael.taxonomia.model;

import java.util.ArrayList;
import java.util.List;

public class Grafo {

    private List<Nodo> nodos;

    public void addNode(Nodo node) {
	if (nodos == null) {
	    nodos = new ArrayList<>();
	}
	nodos.add(node);
    }

    public List<Nodo> getNodes() {
	return nodos;
    }

    @Override
    public String toString() {
	return "Grafo [nodos=" + nodos + "]";
    }

    public void addGrafo(Grafo g) {
	if (g.nodos == null) {
	    g.nodos = new ArrayList<>();
	}
	nodos.addAll(g.nodos);
    }

}