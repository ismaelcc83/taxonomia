package com.ismael.app.model;

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

    public Nodo findByName(String s) {
	for (Nodo n : nodos) {
	    if (s.equals(n.getNomenclatura())) {
		return n;
	    }
	}
	return null;

    }

    public String getPath(Nodo n) {
	String s = "";
	for (int i = 0; i < nodos.size(); i++) {
	    if (n.getNomenclatura().equals(nodos.get(i).getNomenclatura())) {
		s = getPath(findByName(n.getNodoPadre())) + " > " + n.getNomenclatura();
	    }
	}
	return s;

    }

}