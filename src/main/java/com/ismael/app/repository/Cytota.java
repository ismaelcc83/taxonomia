package com.ismael.app.repository;

import org.springframework.stereotype.Repository;

import com.ismael.app.model.Grafo;
import com.ismael.app.model.Nodo;

@Repository
public class Cytota {

    private Grafo g;

    public Grafo generarGrafo() {
	g = new Grafo();
	Nodo n;
	n = new Nodo("Archaea", "Dominio", "Cytota");
	g.addNode(n);
	generarGrafoArchaea();
	n = new Nodo("Bacteria", "Dominio", "Cytota");
	g.addNode(n);
	generarGrafoBacteria();
	n = new Nodo("Eukaryota", "Dominio", "Cytota");
	g.addNode(n);
	generarGrafoEukaryota();
	n = new Nodo("Protobionte", "Dominio", "Cytota");
	g.addNode(n);
	generarGrafoProtobionte();
	return g;
    }

    // CYTOTA>Archaea
    // ==============
    private void generarGrafoArchaea() {
	Nodo n;
	n = new Nodo("DPANN", "Supergrupo", "Archaea");
	g.addNode(n);
	generarGrafoDPANN();
	n = new Nodo("Euryarchaeotan", "Filo", "Archaea");
	g.addNode(n);
	generarGrafoEuryarchaeota();
	n = new Nodo("Proteoarchaeota", "Reino", "Archaea");
	g.addNode(n);
	generarGrafoProteoarchaeota();
    }

    // CYTOTA>Archaea>DPANN
    private void generarGrafoDPANN() {
	//
    }

    // CYTOTA>Archaea>Euryarchaeota
    private void generarGrafoEuryarchaeota() {
	Nodo n;
	n = new Nodo("Hydrothermarchaeota", "Clase", "Euryarchaeotan");
	g.addNode(n);
	n = new Nodo("Hadesarchaea", "Clase", "Euryarchaeotan");
	g.addNode(n);
	n = new Nodo("Methanobacteriota", "Grupo", "Euryarchaeotan");
	g.addNode(n);
	generarGrafoMethanobacteriota();
	n = new Nodo("Thermoplasmatota", "Grupo", "Euryarchaeotan");
	g.addNode(n);
	generarGrafoThermoplasmatota();
	n = new Nodo("Halobacteriota", "Grupo", "Euryarchaeotan");
	g.addNode(n);
	generarGrafoHalobacteriota();
    }

    // CYTOTA>Archaea>Euryarchaeota>Methanobacteriota
    private void generarGrafoMethanobacteriota() {
	Nodo n;
	n = new Nodo("Thermococci", "Clase", "Methanobacteriota");
	g.addNode(n);
	generarGrafoThermococci();
	n = new Nodo("Methanopyri", "Clase", "Methanobacteriota");
	g.addNode(n);
	generarGrafoMethanopyri();
	n = new Nodo("Methanococci", "Clase", "Methanobacteriota");
	g.addNode(n);
	generarGrafoMethanococci();
	n = new Nodo("Methanobacteria", "Clase", "Methanobacteriota");
	g.addNode(n);
	generarGrafoMethanobacteria();
    }

    // CYTOTA>Archaea>Euryarchaeota>Methanobacteriota>Thermococci
    private void generarGrafoThermococci() {
	Nodo n;
	n = new Nodo("Thermococcales", "Orden", "Thermococci");
	g.addNode(n);
	generarGrafoThermococcales();
	n = new Nodo("Methanofastidiosales", "Orden", "Thermococci");
	g.addNode(n);
	generarGrafoMethanofastidiosales();
    }

    // CYTOTA>Archaea>Euryarchaeota>Methanobacteriota>Thermococci>Thermococcales
    private void generarGrafoThermococcales() {
	Nodo n;
	n = new Nodo("Thermococcaceae", "Familia", "Thermococcales");
	g.addNode(n);
	generarGrafoThermococcaceae();
    }

    // CYTOTA>Archaea>Euryarchaeota>Methanobacteriota>Thermococci>Thermococcales>Thermococcaceae
    private void generarGrafoThermococcaceae() {
	Nodo n;
	n = new Nodo("Palaeococcus", "Genero", "Thermococcaceae");
	g.addNode(n);
	generarGrafoPalaeococcus();
	n = new Nodo("Pyrococcus", "Genero", "Thermococcaceae");
	g.addNode(n);
	generarGrafoPyrococcus();
	n = new Nodo("Thermococcus", "Genero", "Thermococcaceae");
	g.addNode(n);
	generarGrafoThermococcus();
    }

    // CYTOTA>Archaea>Euryarchaeota>Methanobacteriota>Thermococci>Thermococcales>Thermococcaceae>Pyrococcus
    private void generarGrafoPalaeococcus() {
	Nodo n;
	n = new Nodo("Palaeococcus ferrophilus", "Especie", "Palaeococcus");
	g.addNode(n);
    }

    // CYTOTA>Archaea>Euryarchaeota>Methanobacteriota>Thermococci>Thermococcales>Thermococcaceae>Pyrococcus
    private void generarGrafoPyrococcus() {
	Nodo n;
	n = new Nodo("Pyrococcus abyssi", "Especie", "Pyrococcus");
	g.addNode(n);
	n = new Nodo("Pyrococcus endeavori", "Especie", "Pyrococcus");
	g.addNode(n);
	n = new Nodo("Pyrococcus furiosus", "Especie", "Pyrococcus");
	g.addNode(n);
	n = new Nodo("Pyrococcus glycovorans", "Especie", "Pyrococcus");
	g.addNode(n);
	n = new Nodo("Pyrococcus horikoshii", "Especie", "Pyrococcus");
	g.addNode(n);
	n = new Nodo("Pyrococcus woesei", "Especie", "Pyrococcus");
	g.addNode(n);
	n = new Nodo("Pyrococcus sp. 121", "Especie", "Pyrococcus");
	g.addNode(n);
	n = new Nodo("Pyrococcus sp. 303", "Especie", "Pyrococcus");
	g.addNode(n);
	n = new Nodo("Pyrococcus sp. 304", "Especie", "Pyrococcus");
	g.addNode(n);
    }

    // CYTOTA>Archaea>Euryarchaeota>Methanobacteriota>Thermococci>Thermococcales>Thermococcaceae>Thermococcus
    private void generarGrafoThermococcus() {
	Nodo n;
	n = new Nodo("Thermococcus acidaminovorans", "Especie", "Thermococcus");
	g.addNode(n);
	n = new Nodo("Thermococcus aegaeus", "Especie", "Thermococcus");
	g.addNode(n);
	n = new Nodo("Thermococcus aggregans", "Especie", "Thermococcus");
	g.addNode(n);
	n = new Nodo("Thermococcus alcaliphilus", "Especie", "Thermococcus");
	g.addNode(n);
	n = new Nodo("Thermococcus atlanticus", "Especie", "Thermococcus");
	g.addNode(n);
	n = new Nodo("Thermococcus barophilus", "Especie", "Thermococcus");
	g.addNode(n);
	n = new Nodo("Thermococcus barossii", "Especie", "Thermococcus");
	g.addNode(n);
	n = new Nodo("Thermococcus celer", "Especie", "Thermococcus");
	g.addNode(n);
	n = new Nodo("Thermococcus chitonophagus", "Especie", "Thermococcus");
	g.addNode(n);
	n = new Nodo("Thermococcus coalescens", "Especie", "Thermococcus");
	g.addNode(n);
	n = new Nodo("Thermococcus fumicolans", "Especie", "Thermococcus");
	g.addNode(n);
	n = new Nodo("Thermococcus gammatolerans", "Especie", "Thermococcus");
	g.addNode(n);
	n = new Nodo("Thermococcus gorgonarius", "Especie", "Thermococcus");
	g.addNode(n);
	n = new Nodo("Thermococcus guaymasensis", "Especie", "Thermococcus");
	g.addNode(n);
	n = new Nodo("Thermococcus hydrothermalis", "Especie", "Thermococcus");
	g.addNode(n);
	n = new Nodo("Thermococcus kodakarensis", "Especie", "Thermococcus");
	g.addNode(n);
	n = new Nodo("Thermococcus litoralis", "Especie", "Thermococcus");
	g.addNode(n);
	n = new Nodo("Thermococcus marinus", "Especie", "Thermococcus");
	g.addNode(n);
	n = new Nodo("Thermococcus mexicalis", "Especie", "Thermococcus");
	g.addNode(n);
	n = new Nodo("Thermococcus pacificus", "Especie", "Thermococcus");
	g.addNode(n);
	n = new Nodo("Thermococcus peptonophilus", "Especie", "Thermococcus");
	g.addNode(n);
	n = new Nodo("Thermococcus profundus", "Especie", "Thermococcus");
	g.addNode(n);
	n = new Nodo("Thermococcus radiotolerans", "Especie", "Thermococcus");
	g.addNode(n);
	n = new Nodo("Thermococcus sibiricus", "Especie", "Thermococcus");
	g.addNode(n);
	n = new Nodo("Thermococcus siculi", "Especie", "Thermococcus");
	g.addNode(n);
	n = new Nodo("Thermococcus stetteri", "Especie", "Thermococcus");
	g.addNode(n);
	n = new Nodo("Thermococcus waimanguensis", "Especie", "Thermococcus");
	g.addNode(n);
	n = new Nodo("Thermococcus waiotapuensis", "Especie", "Thermococcus");
	g.addNode(n);
	n = new Nodo("Thermococcus zilligii", "Especie", "Thermococcus");
	g.addNode(n);
    }

    // CYTOTA>Archaea>Euryarchaeota>Methanobacteriota>Thermococci>Methanofastidiosales
    private void generarGrafoMethanofastidiosales() {
	Nodo n;
	n = new Nodo("Methanofastidiosum", "Genero", "Methanofastidiosales");
	g.addNode(n);
	generarGrafoMethanofastidiosum();
    }

    // CYTOTA>Archaea>Euryarchaeota>Methanobacteriota>Thermococci>Methanofastidiosales>Methanofastidiosum
    private void generarGrafoMethanofastidiosum() {
	Nodo n;
	n = new Nodo("Methanofastidiosum methylthiophilus", "Especie", "Methanofastidiosum");
	g.addNode(n);
    }

    // CYTOTA>Archaea>Euryarchaeota>Methanobacteriota>Methanopyri
    private void generarGrafoMethanopyri() {
	Nodo n;
	n = new Nodo("Methanopyrales", "Orden", "Methanopyri");
	g.addNode(n);
	generarGrafoMethanopyrales();
    }

    // CYTOTA>Archaea>Euryarchaeota>Methanobacteriota>Methanopyri>Methanopyrales
    private void generarGrafoMethanopyrales() {
	Nodo n;
	n = new Nodo("Methanopyraceae", "Familia", "Methanopyrales");
	g.addNode(n);
	generarGrafoMethanopyraceae();
    }

    // CYTOTA>Archaea>Euryarchaeota>Methanobacteriota>Methanopyri>Methanopyrales>Methanopyraceae
    private void generarGrafoMethanopyraceae() {
	Nodo n;
	n = new Nodo("Methanopyrus", "Genero", "Methanopyraceae");
	g.addNode(n);
	generarGrafoMethanopyrus();
    }

    // CYTOTA>Archaea>Euryarchaeota>Methanobacteriota>Methanopyri>Methanopyrales>Methanopyraceae>Methanopyrus
    private void generarGrafoMethanopyrus() {
	Nodo n;
	n = new Nodo("Methanopyrus kandleri", "Especie", "Methanopyrus");
	g.addNode(n);
    }

    // CYTOTA>Archaea>Euryarchaeota>Methanobacteriota>Methanococci
    private void generarGrafoMethanococci() {
	Nodo n;
	n = new Nodo("Methanococcales", "Orden", "Methanococci");
	g.addNode(n);
	generarGrafoMethanococcales();
    }

    // CYTOTA>Archaea>Euryarchaeota>Methanobacteriota>Methanococci>Methanococcales
    private void generarGrafoMethanococcales() {
	Nodo n;
	n = new Nodo("Methanocaldococcaceae", "Familia", "Methanococcales");
	g.addNode(n);
	generarGrafoMethanocaldococcaceae();
	n = new Nodo("Methanococcaceae", "Familia", "Methanococcales");
	g.addNode(n);
	generarGrafoMethanococcaceae();
    }

    // CYTOTA>Archaea>Euryarchaeota>Methanobacteriota>Methanococci>Methanococcales>Methanocaldococcaceae
    private void generarGrafoMethanocaldococcaceae() {
	Nodo n;
	n = new Nodo("Methanocaldococcus", "Genero", "Methanocaldococcaceae");
	g.addNode(n);
	generarGrafoMethanocaldococcus();
	n = new Nodo("Methanotorris", "Genero", "Methanocaldococcaceae");
	g.addNode(n);
	generarGrafoMethanotorris();
    }

    // CYTOTA>Archaea>Euryarchaeota>Methanobacteriota>Methanococci>Methanococcales>Methanocaldococcaceae>Methanocaldococcus
    private void generarGrafoMethanocaldococcus() {
	Nodo n;
	n = new Nodo("Methanocaldococcus fervens", "Especie", "Methanocaldococcus");
	g.addNode(n);
	n = new Nodo("Methanocaldococcus indicus", "Especie", "Methanocaldococcus");
	g.addNode(n);
	n = new Nodo("Methanocaldococcus infernus", "Especie", "Methanocaldococcus");
	g.addNode(n);
	n = new Nodo("Methanocaldococcus jannaschii", "Especie", "Methanocaldococcus");
	g.addNode(n);
	n = new Nodo("Methanocaldococcus vulcanius", "Especie", "Methanocaldococcus");
	g.addNode(n);
    }

    // CYTOTA>Archaea>Euryarchaeota>Methanobacteriota>Methanococci>Methanococcales>Methanocaldococcaceae>Methanotorris
    private void generarGrafoMethanotorris() {
	Nodo n;
	n = new Nodo("Methanotorris formicicus", "Especie", "Methanotorris");
	g.addNode(n);
	n = new Nodo("Methanotorris igneus", "Especie", "Methanotorris");
	g.addNode(n);
    }

    // CYTOTA>Archaea>Euryarchaeota>Methanobacteriota>Methanococci>Methanococcales>Methanococcaceae
    private void generarGrafoMethanococcaceae() {
	Nodo n;
	n = new Nodo("Methanococcus", "Genero", "Methanococcaceae");
	g.addNode(n);
	generarGrafoMethanococcus();
	n = new Nodo("Methanothermococcus", "Genero", "Methanococcaceae");
	g.addNode(n);
	generarGrafoMethanothermococcus();
    }

    // CYTOTA>Archaea>Euryarchaeota>Methanobacteriota>Methanococci>Methanococcales>Methanococcaceae>Methanococcus
    private void generarGrafoMethanococcus() {
	Nodo n;
	n = new Nodo("Methanococcus aeolicus", "Especie", "Methanococcus");
	g.addNode(n);
	n = new Nodo("Methanococcus maripaludis", "Especie", "Methanococcus");
	g.addNode(n);
	n = new Nodo("Methanococcus annielii", "Especie", "Methanococcus");
	g.addNode(n);
	n = new Nodo("Methanococcus voltae", "Especie", "Methanococcus");
	g.addNode(n);
    }

    // CYTOTA>Archaea>Euryarchaeota>Methanobacteriota>Methanococci>Methanococcales>Methanococcaceae>Methanothermococcus
    private void generarGrafoMethanothermococcus() {
	Nodo n;
	n = new Nodo("Methanothermococcus okinawensis", "Especie", "Methanothermococcus");
	g.addNode(n);
	n = new Nodo("Methanothermococcus thermolithotrophicus", "Especie", "Methanothermococcus");
	g.addNode(n);
    }

    // CYTOTA>Archaea>Euryarchaeota>Methanobacteriota>Methanobacteria
    private void generarGrafoMethanobacteria() {
	Nodo n;
	n = new Nodo("Methanobacteriales", "Orden", "Methanobacteria");
	g.addNode(n);
	generarGrafoMethanobacteriales();
    }

    // CYTOTA>Archaea>Euryarchaeota>Methanobacteriota>Methanobacteria>Methanobacteriales
    private void generarGrafoMethanobacteriales() {
	Nodo n;
	n = new Nodo("Methanobacteriaceae", "Familia", "Methanobacteriales");
	g.addNode(n);
	generarGrafoMethanobacteriaceae();
	n = new Nodo("Methanothermaceae", "Familia", "Methanobacteriales");
	g.addNode(n);
	generarGrafoMethanothermaceae();
    }

    // CYTOTA>Archaea>Euryarchaeota>Methanobacteriota>Methanobacteria>Methanobacteriales>Methanobacteriaceae
    private void generarGrafoMethanobacteriaceae() {
	Nodo n;
	n = new Nodo("Methanobacterium", "Genero", "Methanobacteriaceae");
	g.addNode(n);
	generarGrafoMethanobacterium();
	n = new Nodo("Methanobrevibacter", "Genero", "Methanobacteriaceae");
	g.addNode(n);
	generarGrafoMethanobrevibacter();
	n = new Nodo("Methanosphaera", "Genero", "Methanobacteriaceae");
	g.addNode(n);
	generarGrafoMethanosphaera();
	n = new Nodo("Methanothermobacter", "Genero", "Methanobacteriaceae");
	g.addNode(n);
	generarGrafoMethanothermobacter();
    }

    // CYTOTA>Archaea>Euryarchaeota>Methanobacteriota>Methanobacteria>Methanobacteriales>Methanobacterium
    private void generarGrafoMethanobacterium() {
	Nodo n;
	n = new Nodo("Methanobacterium aarhusense", "Especie", "Methanobacterium");
	g.addNode(n);
	n = new Nodo("Methanobacterium alcaliphilum", "Especie", "Methanobacterium");
	g.addNode(n);
	n = new Nodo("Methanobacterium beijingense", "Especie", "Methanobacterium");
	g.addNode(n);
	n = new Nodo("Methanobacterium bryantii", "Especie", "Methanobacterium");
	g.addNode(n);
	n = new Nodo("Methanobacterium congolense", "Especie", "Methanobacterium");
	g.addNode(n);
	n = new Nodo("Methanobacterium curvum", "Especie", "Methanobacterium");
	g.addNode(n);
	n = new Nodo("Methanobacterium espanolae", "Especie", "Methanobacterium");
	g.addNode(n);
	n = new Nodo("Methanobacterium formicicum", "Especie", "Methanobacterium");
	g.addNode(n);
	n = new Nodo("Methanobacterium ivanovii", "Especie", "Methanobacterium");
	g.addNode(n);
	n = new Nodo("Methanobacterium oryzae", "Especie", "Methanobacterium");
	g.addNode(n);
	n = new Nodo("Methanobacterium palustre", "Especie", "Methanobacterium");
	g.addNode(n);
	n = new Nodo("Methanobacterium subterraneum", "Especie", "Methanobacterium");
	g.addNode(n);
	n = new Nodo("Methanobacterium thermaggregans", "Especie", "Methanobacterium");
	g.addNode(n);
	n = new Nodo("Methanobacterium uliginosum", "Especie", "Methanobacterium");
	g.addNode(n);
    }

    // CYTOTA>Archaea>Euryarchaeota>Methanobacteriota>Methanobacteria>Methanobacteriales>Methanobrevibacter
    private void generarGrafoMethanobrevibacter() {
	Nodo n;
	n = new Nodo("Methanobrevibacter acididurans", "Especie", "Methanobrevibacter");
	g.addNode(n);
	n = new Nodo("Methanobrevibacter arboriphilus", "Especie", "Methanobrevibacter");
	g.addNode(n);
	n = new Nodo("Methanobrevibacter curvatus", "Especie", "Methanobrevibacter");
	g.addNode(n);
	n = new Nodo("Methanobrevibacter cuticularis", "Especie", "Methanobrevibacter");
	g.addNode(n);
	n = new Nodo("Methanobrevibacter filiformis", "Especie", "Methanobrevibacter");
	g.addNode(n);
	n = new Nodo("Methanobrevibacter gottschalkii", "Especie", "Methanobrevibacter");
	g.addNode(n);
	n = new Nodo("Methanobrevibacter millerae", "Especie", "Methanobrevibacter");
	g.addNode(n);
	n = new Nodo("Methanobrevibacter olleyae", "Especie", "Methanobrevibacter");
	g.addNode(n);
	n = new Nodo("Methanobrevibacter oralis", "Especie", "Methanobrevibacter");
	g.addNode(n);
	n = new Nodo("Methanobrevibacter ruminantium", "Especie", "Methanobrevibacter");
	g.addNode(n);
	n = new Nodo("Methanobrevibacter smithii", "Especie", "Methanobrevibacter");
	g.addNode(n);
	n = new Nodo("Methanobrevibacter thaueri", "Especie", "Methanobrevibacter");
	g.addNode(n);
	n = new Nodo("Methanobrevibacter woesei", "Especie", "Methanobrevibacter");
	g.addNode(n);
	n = new Nodo("Methanobrevibacter wolinii", "Especie", "Methanobrevibacter");
	g.addNode(n);
    }

    // CYTOTA>Archaea>Euryarchaeota>Methanobacteriota>Methanobacteria>Methanobacteriales>Methanosphaera
    private void generarGrafoMethanosphaera() {
	Nodo n;
	n = new Nodo("Methanosphaera cuniculi", "Especie", "Methanosphaera");
	g.addNode(n);
	n = new Nodo("Methanosphaera stadtmaniae", "Especie", "Methanosphaera");
	g.addNode(n);
    }

    // CYTOTA>Archaea>Euryarchaeota>Methanobacteriota>Methanobacteria>Methanobacteriales>Methanothermobacter
    private void generarGrafoMethanothermobacter() {
	Nodo n;
	n = new Nodo("Methanosphaera defluvii", "Especie", "Methanothermobacter");
	g.addNode(n);
	n = new Nodo("Methanosphaera marburgensis", "Especie", "Methanothermobacter");
	g.addNode(n);
	n = new Nodo("Methanosphaera thermautotrophicus", "Especie", "Methanothermobacter");
	g.addNode(n);
	n = new Nodo("Methanosphaera thermoflexus", "Especie", "Methanothermobacter");
	g.addNode(n);
	n = new Nodo("Methanosphaera thermophilus", "Especie", "Methanothermobacter");
	g.addNode(n);
	n = new Nodo("Methanosphaera wolfeii", "Especie", "Methanothermobacter");
	g.addNode(n);
    }

    // CYTOTA>Archaea>Euryarchaeota>Methanobacteriota>Methanobacteria>Methanobacteriales>Methanothermaceae
    private void generarGrafoMethanothermaceae() {
	Nodo n;
	n = new Nodo("Methanothermus", "Genero", "Methanothermaceae");
	g.addNode(n);
	generarGrafoMethanothermus();
    }

    // CYTOTA>Archaea>Euryarchaeota>Methanobacteriota>Methanobacteria>Methanobacteriales>Methanothermaceae>Methanothermus
    private void generarGrafoMethanothermus() {
	Nodo n;
	n = new Nodo("Methanothermus fervidus", "Especie", "Methanothermus");
	g.addNode(n);
	n = new Nodo("Methanothermus jannaschii", "Especie", "Methanothermus");
	g.addNode(n);
	n = new Nodo("Methanothermus sociabilis", "Especie", "Methanothermus");
	g.addNode(n);
    }

    // CYTOTA>Archaea>Euryarchaeota>Thermoplasmatota
    private void generarGrafoThermoplasmatota() {
	Nodo n;
	n = new Nodo("Thermoplasmata", "Clase", "Thermoplasmatota");
	g.addNode(n);
	generarGrafoThermoplasmata();
	n = new Nodo("Poseidoniia", "Clase", "Thermoplasmatota");
	g.addNode(n);
    }

    // CYTOTA>Archaea>Euryarchaeota>Thermoplasmatota>Thermoplasmata
    private void generarGrafoThermoplasmata() {
	Nodo n;
	n = new Nodo("Aciduliprofundales", "Orden", "Thermoplasmata");
	g.addNode(n);
	generarGrafoAciduliprofundales();
	n = new Nodo("Thermoplasmatales", "Orden", "Thermoplasmata");
	g.addNode(n);
	generarGrafoThermoplasmatales();
	n = new Nodo("Methanomassiliicoccales", "Orden", "Thermoplasmata");
	g.addNode(n);
	generarGrafoMethanomassiliicoccales();
    }

    // CYTOTA>Archaea>Euryarchaeota>Thermoplasmatota>Thermoplasmata>Aciduliprofundales
    private void generarGrafoAciduliprofundales() {
	Nodo n;
	n = new Nodo("Aciduliprofundaceae", "Familia", "Aciduliprofundales");
	g.addNode(n);
    }

    // CYTOTA>Archaea>Euryarchaeota>Thermoplasmatota>Thermoplasmata>Methanomassiliicoccales
    private void generarGrafoMethanomassiliicoccales() {
	Nodo n;
	n = new Nodo("Methanomassiliicoccaceae", "Familia", "Methanomassiliicoccales");
	g.addNode(n);
    }

    // CYTOTA>Archaea>Euryarchaeota>Thermoplasmatota>Thermoplasmata>Thermoplasmatales
    private void generarGrafoThermoplasmatales() {
	Nodo n;
	n = new Nodo("Cuniculiplasmataceae", "Familia", "Thermoplasmatales");
	g.addNode(n);
	n = new Nodo("Ferroplasmaceae", "Familia", "Thermoplasmatales");
	g.addNode(n);
	generarGrafoFerroplasmaceae();
	n = new Nodo("Picrophilaceae", "Familia", "Thermoplasmatales"); //
	g.addNode(n);
	generarGrafoPicrophilaceae();
	n = new Nodo("Thermoplasmataceae", "Familia", "Thermoplasmatales");
	g.addNode(n);
	generarGrafoThermoplasmataceae();
    }

    // CYTOTA>Archaea>Euryarchaeota>Thermoplasmatota>Thermoplasmata>Thermoplasmatales>Ferroplasmaceae
    private void generarGrafoFerroplasmaceae() {
	Nodo n;
	n = new Nodo("Ferroplasma", "Genero", "Ferroplasmaceae");
	g.addNode(n);
	generarGrafoFerroplasma();
	n = new Nodo("Acidiplasma", "Genero", "Ferroplasmaceae");
	g.addNode(n);
	generarGrafoAcidiplasma();
    }

    // CYTOTA>Archaea>Euryarchaeota>Thermoplasmatota>Thermoplasmata>Thermoplasmatales>Ferroplasmaceae>Ferroplasma
    private void generarGrafoFerroplasma() {
	Nodo n;
	n = new Nodo("Ferroplasma acidophilum", "Especie", "Ferroplasma");
	g.addNode(n);
    }

    // CYTOTA>Archaea>Euryarchaeota>Thermoplasmatota>Thermoplasmata>Thermoplasmatales>Ferroplasmaceae>Acidiplasma
    private void generarGrafoAcidiplasma() {
	Nodo n;
	n = new Nodo("Acidiplasma aeolicum ", "Especie", "Acidiplasma");
	g.addNode(n);
    }

    // CYTOTA>Archaea>Euryarchaeota>Thermoplasmatota>Thermoplasmata>Thermoplasmatales>Picrophilaceae
    private void generarGrafoPicrophilaceae() {
	Nodo n;
	n = new Nodo("Picrophilus", "Genero", "Picrophilaceae");
	g.addNode(n);
	generarGrafoPicrophilus();
    }

    // CYTOTA>Archaea>Euryarchaeota>Thermoplasmatota>Thermoplasmata>Thermoplasmatales>Picrophilaceae>Picrophilus
    private void generarGrafoPicrophilus() {
	Nodo n;
	n = new Nodo("Picrophilus oshimae", "Especie", "Picrophilus");
	g.addNode(n);
	n = new Nodo("Picrophilus torridus", "Especie", "Picrophilus");
	g.addNode(n);
    }

    // CYTOTA>Archaea>Euryarchaeota>Thermoplasmatota>Thermoplasmata>Thermoplasmatales>Thermoplasmataceae
    private void generarGrafoThermoplasmataceae() {
	Nodo n;
	n = new Nodo("Thermoplasma", "Genero", "Thermoplasmataceae");
	g.addNode(n);
	generarGrafoThermoplasma();
    }

    // CYTOTA>Archaea>Euryarchaeota>Thermoplasmatota>Thermoplasmata>Thermoplasmatales>Thermoplasmataceae>Thermoplasma
    private void generarGrafoThermoplasma() {
	Nodo n;
	n = new Nodo("Thermoplasma acidophilum", "Especie", "Thermoplasma");
	g.addNode(n);
	n = new Nodo("Thermoplasma volcanium", "Especie", "Thermoplasma");
	g.addNode(n);
    }

    // CYTOTA>Archaea>Euryarchaeota>Halobacteriota
    private void generarGrafoHalobacteriota() {
	Nodo n;
	n = new Nodo("Archaeoglobi", "Clase", "Halobacteriota");
	g.addNode(n);
	generarGrafoArchaeoglobi();
	n = new Nodo("Haloarchaea", "Clase", "Halobacteriota");
	g.addNode(n);
	// TODO generarGrafoHaloarchaea();
	n = new Nodo("Methanomicrobia", "Clase", "Halobacteriota");
	g.addNode(n);
	// TODO generarGrafoMethanomicrobia();
	n = new Nodo("Methanocellia", "Clase", "Halobacteriota");
	g.addNode(n);
	// TODO generarGrafoMethanocellia();
	n = new Nodo("Methanoliparia", "Clase", "Halobacteriota");
	g.addNode(n);
	// TODO generarGrafoMethanoliparia();
	n = new Nodo("Methanosarcinia", "Clase", "Halobacteriota");
	g.addNode(n);
	// TODO generarGrafoMethanosarcinia();
	n = new Nodo("Methanonatronarchaeia", "Clase", "Halobacteriota");
	g.addNode(n);
	// TODO generarGrafoMethanonatronarchaeia();
	n = new Nodo("Syntropharchaeia", "Clase", "Halobacteriota");
	g.addNode(n);
	// TODO generarGrafoSyntropharchaeia();
    }

    // CYTOTA>Archaea>Euryarchaeota>Archaeoglobi
    private void generarGrafoArchaeoglobi() {
	Nodo n;
	n = new Nodo("Archaeoglobales", "Orden", "Archaeoglobi");
	g.addNode(n);
	generarGrafoArchaeoglobales();
    }

    // CYTOTA>Archaea>Euryarchaeota>Archaeoglobi>Archaeoglobales
    private void generarGrafoArchaeoglobales() {
	Nodo n;
	n = new Nodo("Archaeoglobaceae", "Familia", "Archaeoglobales");
	g.addNode(n);
	generarGrafoArchaeoglobaceae();
    }

    // CYTOTA>Archaea>Euryarchaeota>Archaeoglobi>Archaeoglobales>Archaeoglobaceae
    private void generarGrafoArchaeoglobaceae() {
	Nodo n;
	n = new Nodo("Archaeoglobus", "Genero", "Archaeoglobaceae");
	g.addNode(n);
	generarGrafoArchaeoglobus();
	n = new Nodo("Ferroglobus", "Genero", "Archaeoglobaceae");
	g.addNode(n);
	generarGrafoFerroglobus();
	n = new Nodo("Geoglobus", "Genero", "Archaeoglobaceae");
	g.addNode(n);
	generarGrafoGeoglobus();
    }

    // CYTOTA>Archaea>Euryarchaeota>Archaeoglobi>Archaeoglobales>Archaeoglobaceae>Archaeoglobus
    private void generarGrafoArchaeoglobus() {
	Nodo n;
	n = new Nodo("Archaeoglobus fulgidus", "Especie", "Archaeoglobus");
	g.addNode(n);
	n = new Nodo("Archaeoglobus profundus", "Especie", "Archaeoglobus");
	g.addNode(n);
    }

    // CYTOTA>Archaea>Euryarchaeota>Archaeoglobi>Archaeoglobales>Archaeoglobaceae>Ferroglobus
    private void generarGrafoFerroglobus() {
	Nodo n;
	n = new Nodo("Ferroglobus placidus", "Especie", "Ferroglobus");
	g.addNode(n);
    }

    // CYTOTA>Archaea>Euryarchaeota>Archaeoglobi>Archaeoglobales>Archaeoglobaceae>Geoglobus
    private void generarGrafoGeoglobus() {
	Nodo n;
	n = new Nodo("Geoglobus ahangari", "Especie", "Geoglobus");
	g.addNode(n);
    }

    // CYTOTA>Archaea>Euryarchaeota>Haloarchaea
    private void generarGrafoHaloarchaea() {
	Nodo n;
	n = new Nodo("", "", "Haloarchaea");
	g.addNode(n);
    }

    // CYTOTA>Archaea>Proteoarchaeota
    private void generarGrafoProteoarchaeota() {
	Nodo n;
	n = new Nodo("Thermoproteota", "Filo", "Proteoarchaeota");
	g.addNode(n);
	generarGrafoThermoproteota();
	n = new Nodo("Asgardarchaeota", "Filo", "Proteoarchaeota");
	g.addNode(n);
	generarGrafoAsgardarchaeota();
    }

    // CYTOTA>Archaea>Proteoarchaeota>Thermoproteota
    private void generarGrafoThermoproteota() {
	Nodo n;
	n = new Nodo("Bathyarchaeia", "Clase", "Thermoproteota");
	g.addNode(n);
	n = new Nodo("Korarchaeia", "Clase", "Thermoproteota");
	g.addNode(n);
	generarGrafoKorarchaeia();
	n = new Nodo("Methanomethylicia", "Clase", "Thermoproteota");
	g.addNode(n);
	generarGrafoMethanomethylicia();
	n = new Nodo("Nitrososphaeria", "Clase", "Thermoproteota");
	g.addNode(n);
	generarGrafoNitrososphaeria();
	n = new Nodo("Thermoproteia", "Clase", "Thermoproteota");
	g.addNode(n);
	generarGrafoThermoproteia();
    }

    // CYTOTA>Archaea>Proteoarchaeota>Korarchaeia
    private void generarGrafoKorarchaeia() {
	Nodo n;
	n = new Nodo("Korarchaeales", "Orden", "Korarchaeia");
	g.addNode(n);
    }

    // CYTOTA>Archaea>Proteoarchaeota>Methanomethylicia
    private void generarGrafoMethanomethylicia() {
	Nodo n;
	n = new Nodo("Methanomethyliciales", "Orden", "Methanomethylicia");
	g.addNode(n);
	n = new Nodo("Nezharchaeales", "Orden", "Methanomethylicia");
	g.addNode(n);
    }

    // CYTOTA>Archaea>Proteoarchaeota>Nitrososphaeria
    private void generarGrafoNitrososphaeria() {
	Nodo n;
	n = new Nodo("Caldarchaeales", "Orden", "Nitrososphaeria");
	g.addNode(n);
	generarGrafoCaldarchaeales();
	n = new Nodo("Nitrososphaerales", "Orden", "Nitrososphaeria");
	g.addNode(n);
	n = new Nodo("Geothermarchaeales", "Orden", "Nitrososphaeria");
	g.addNode(n);
	n = new Nodo("Conexvisphaerales", "Orden", "Nitrososphaeria");
	g.addNode(n);
    }

    // CYTOTA>Archaea>Proteoarchaeota>Caldarchaeales
    private void generarGrafoCaldarchaeales() {
	Nodo n;
	n = new Nodo("Caldiarchaeum subterraneum", "Especie", "Nitrososphaeria");
	g.addNode(n);
    }

    // CYTOTA>Archaea>Proteoarchaeota>Thermoproteia
    private void generarGrafoThermoproteia() {
	Nodo n;
	n = new Nodo("Gearchaeales", "Orden", "Thermoproteia");
	g.addNode(n);
	n = new Nodo("Thermoproteales", "Orden", "Thermoproteia"); // TODO familias Thermoproteaceae Y Thermocladiaceae
	g.addNode(n);
	n = new Nodo("Sulfolobales", "Orden", "Thermoproteia"); // TODO
								// Acidilobaceae,Desulfurococcaceae,Fervidicoccaceae,Ignicoccaceae,Ignisphaeraceae,Pyrodictiaceae,Sulfolobaceae
	g.addNode(n);
	n = new Nodo("Marsarchaeales", "Orden", "Thermoproteia");
	g.addNode(n);
	n = new Nodo("Thermofilales", "Orden", "Thermoproteia"); // TODO familia Thermofilaceae > genero Thermofilum
	g.addNode(n);
    }

    // CYTOTA>Archaea>Proteoarchaeota>Asgardarchaeota
    private void generarGrafoAsgardarchaeota() {
	Nodo n;
	n = new Nodo("Heimdallarchaeia", "Clase", "Asgardarchaeota");
	g.addNode(n);
	n = new Nodo("Lokiarchaeia", "Clase", "Asgardarchaeota");
	g.addNode(n);
	generarGrafoLokiarchaeia();
	n = new Nodo("Thorarchaeia", "Clase", "Asgardarchaeota");
	g.addNode(n);
    }

    // CYTOTA>Archaea>Proteoarchaeota>Asgardarchaeota>Lokiarchaeia
    private void generarGrafoLokiarchaeia() {
	Nodo n;
	n = new Nodo("Helarchaeales", "Orden", "Lokiarchaeia");
	g.addNode(n);
	n = new Nodo("Odinarchaeales", "Orden", "Lokiarchaeia");
	g.addNode(n);
    }

    // CYTOTA>Bacteria
    // ===============
    private void generarGrafoBacteria() {
	Nodo n;
	n = new Nodo("Monodérmicos", "Grupo", "Bacteria");
	g.addNode(n);
	generarGrafoMonodermico();
	n = new Nodo("Didérmicos", "Grupo", "Bacteria");
	g.addNode(n);
	generarGrafoDidermico();
    }

    // CYTOTA>Bacteria>Monodermico
    private void generarGrafoMonodermico() {
	Nodo n;
	n = new Nodo("Actinobacteria", "Filo", "Monodermico");
	g.addNode(n);
	// generarGrafoActinobacteria();
	n = new Nodo("Chloroflexi", "Filo", "Monodermico");
	g.addNode(n);
	// generarGrafoChloroflexi();
	n = new Nodo("Firmicutes", "Filo", "Monodermico");
	g.addNode(n);
	// generarGrafoFirmicutes();
	n = new Nodo("Patescibacteria", "Filo", "Monodermico");
	g.addNode(n);
	// generarGrafoChloroflexi();
    }

    // CYTOTA>Bacteria>Didermico
    private void generarGrafoDidermico() {
	Nodo n;
	n = new Nodo("Aquificae", "Filo", "Didermico");
	g.addNode(n);
	// generarGrafoAquificae();
	n = new Nodo("Armatimonadetes", "Filo", "Didermico");
	g.addNode(n);
	// generarGrafoArmatimonadetes();
	n = new Nodo("Bacteroidetes", "Filo", "Didermico");
	g.addNode(n);
	// generarGrafoBacteroidetes();
	n = new Nodo("Caldiserica", "Filo", "Didermico");
	g.addNode(n);
	// generarGrafoCaldiserica();
	n = new Nodo("Chlamydiae", "Filo", "Didermico");
	g.addNode(n);
	// generarGrafoChlamydiae();
	n = new Nodo("Cyanobacteria", "Filo", "Didermico");
	g.addNode(n);
	// generarGrafoCyanobacteria();
	n = new Nodo("Coprothermobacterota", "Filo", "Didermico");
	g.addNode(n);
	// generarGrafoCoprothermobacterota();
	n = new Nodo("Deinococcus-Thermus", "Filo", "Didermico");
	g.addNode(n);
	// generarGrafoDeinococcus-Thermus();
	n = new Nodo("Dictyoglomi", "Filo", "Didermico");
	g.addNode(n);
	// generarGrafoDictyoglomi();
	n = new Nodo("Elusimicrobia", "Filo", "Didermico");
	g.addNode(n);
	// generarGrafoElusimicrobia();
	n = new Nodo("Fibrobacteres", "Filo", "Didermico");
	g.addNode(n);
	// generarGrafoFibrobacteres();
	n = new Nodo("Fusobacteria", "Filo", "Didermico");
	g.addNode(n);
	// generarGrafoFusobacteria();
	n = new Nodo("Gemmatimonadetes", "Filo", "Didermico");
	g.addNode(n);
	// generarGrafoGemmatimonadetes();
	n = new Nodo("Planctomycetes", "Filo", "Didermico");
	g.addNode(n);
	// generarGrafoPlanctomycetes();
	n = new Nodo("Proteobacteria", "Filo", "Didermico");
	g.addNode(n);
	// generarGrafoProteobacteria();
	n = new Nodo("Spirochaetes", "Filo", "Didermico");
	g.addNode(n);
	// generarGrafoSpirochaetes();
	n = new Nodo("Synergistetes", "Filo", "Didermico");
	g.addNode(n);
	// generarGrafoSynergistetes();
	n = new Nodo("Thermodesulfobacteria", "Filo", "Didermico");
	g.addNode(n);
	// generarGrafoThermodesulfobacteria();
	n = new Nodo("Thermotogae", "Filo", "Didermico");
	g.addNode(n);
	// generarGrafoThermotogae();
	n = new Nodo("Verrucomicrobia", "Filo", "Didermico");
	g.addNode(n);
	// generarGrafoVerrucomicrobia();
    }

    // CYTOTA>Eukaryota
    // ================
    private void generarGrafoEukaryota() {
	Nodo n;
	n = new Nodo("Animalia", "Reino", "Eukaryota");
	g.addNode(n);
	n = new Nodo("Fungi", "Reino", "Eukaryota");
	g.addNode(n);
	n = new Nodo("Plantae", "Reino", "Eukaryota");
	g.addNode(n);
	n = new Nodo("Protista", "Reino", "Eukaryota");
    }

    // CYTOTA>Protobionte
    // ================
    private void generarGrafoProtobionte() {

    }

}