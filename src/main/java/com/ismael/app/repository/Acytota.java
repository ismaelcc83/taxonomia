package com.ismael.app.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ismael.app.model.Grafo;
import com.ismael.app.model.Nodo;

@Repository
public class Acytota {

    private Grafo g;

    public Grafo generarGrafo(List<String> names, int categoria, String padre) {
	g = new Grafo();
	Nodo n;
	for (String name : names) {
	    n = new Nodo(name, categoria, padre);
	    g.addNode(n);
	    generarGrafo(names, categoria + 1, name);
	}

	generarGrafoViroidia();
	generarGrafoRibozyviria();
	generarGrafoVirus();
	generarGrafoPlasmido();
	generarGrafoReplicadores();
	return g;
    }

    // ACYTOTA>Viroidia
    // ================
    private void generarGrafoViroidia() {
	Nodo n;
	n = new Nodo("", "Reino", "Viroidia"); // TODO
	g.addNode(n);
    }

    // ACYTOTA>Ribozyviria
    // ===================
    private void generarGrafoRibozyviria() {
	Nodo n;
	n = new Nodo("Avsunviroidae", "Reino", "Ribozyviria");
	g.addNode(n);
	generarGrafoAvsunviroidae();
	n = new Nodo("Pospiviroidae", "Reino", "Ribozyviria");
	g.addNode(n);
	generarGrafoPospiviroidae();
    }

    private void generarGrafoAvsunviroidae() {
	Nodo n;
	n = new Nodo("Avsunviroid", "Reino", "Avsunviroidae");
	g.addNode(n);
	n = new Nodo("Pelamoviroid", "Reino", "Avsunviroidae");
	g.addNode(n);
	n = new Nodo("Elaviroid", "Reino", "Avsunviroidae");
	g.addNode(n);
    }

    private void generarGrafoPospiviroidae() {
	Nodo n;
	n = new Nodo("Apscaviroid", "Reino", "Pospiviroidae");
	g.addNode(n);
	n = new Nodo("Cocadviroid", "Reino", "Pospiviroidae");
	g.addNode(n);
	n = new Nodo("Coleviroid", "Reino", "Pospiviroidae");
	g.addNode(n);
	n = new Nodo("Hostuviroid", "Reino", "Pospiviroidae");
	g.addNode(n);
	n = new Nodo("Pospiviroid", "Reino", "Pospiviroidae");
	g.addNode(n);

    }

    // ACYTOTA>Virus
    // ================
    private void generarGrafoVirus() {
	Nodo n;
	n = new Nodo("Adnaviria", "Reino", "Virus");
	g.addNode(n);
	generarGrafoAdnaviria();
	n = new Nodo("Duplodnaviria", "Reino", "Virus");
	g.addNode(n);
	generarGrafoDuplodnaviria();
	n = new Nodo("Riboviria", "Reino", "Virus");
	g.addNode(n);
	generarGrafoRiboviria();
	n = new Nodo("Varidnaviria", "Reino", "Virus");
	g.addNode(n);
	generarGrafoVaridnaviria();
	n = new Nodo("Monodnaviria", "Reino", "Virus");
	g.addNode(n);
	generarGrafoMonodnaviria();

    }

    private void generarGrafoAdnaviria() {
	Nodo n;
	n = new Nodo("Zilligvirae", "Reino", "Adnaviria");
	g.addNode(n);
	n = new Nodo("Tristromaviridae", "Reino", "Adnaviria");
	g.addNode(n);
	n = new Nodo("Ligamenvirales", "Reino", "Adnaviria");
	g.addNode(n);
	n = new Nodo("Rudiviridae", "Reino", "Adnaviria");
	g.addNode(n);
	n = new Nodo("Lipothrixviridae", "Reino", "Adnaviria");
	g.addNode(n);
	n = new Nodo("Ungulaviridae", "Reino", "Adnaviria");
	g.addNode(n);
    }

    private void generarGrafoDuplodnaviria() {
	Nodo n;
	n = new Nodo("Caudoviricetes", "Reino", "Duplodnaviria");
	g.addNode(n);
	n = new Nodo("Herpesvirales", "Reino", "Duplodnaviria");
	g.addNode(n);

    }

    private void generarGrafoRiboviria() {
	Nodo n;
	n = new Nodo("Orthornavirae", "Reino", "Riboviria");
	g.addNode(n);
	n = new Nodo("Pararnavirae", "Reino", "Riboviria");
	g.addNode(n);

    }

    private void generarGrafoVaridnaviria() {
	Nodo n;
	n = new Nodo("Bamfordvirae", "Reino", "Varidnaviria");
	g.addNode(n);
	n = new Nodo("Helvetiavirae", "Reino", "Varidnaviria");
	g.addNode(n);
    }

    private void generarGrafoMonodnaviria() {
	Nodo n;
	n = new Nodo("Loebvirae", "Reino", "Monodnaviria");
	g.addNode(n);
	n = new Nodo("Sangervirae", "Reino", "Monodnaviria");
	g.addNode(n);
	n = new Nodo("Shotokuvirae", "Reino", "Monodnaviria");
	g.addNode(n);
	n = new Nodo("Trapavirae", "Reino", "Monodnaviria");
	g.addNode(n);
    }

    // ACYTOTA>Plasmido
    // ================
    private void generarGrafoPlasmido() {

    }

    // ACYTOTA>Replicadores
    // ================
    private void generarGrafoReplicadores() {

    }

}