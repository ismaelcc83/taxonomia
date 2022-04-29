package com.ismael.taxonomia;

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

}