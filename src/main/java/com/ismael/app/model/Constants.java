package com.ismael.app.model;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public final class Constants {
    public static enum Listas {
	NEW, START, CONTINUE, SENTTOCLIENT
    };

    // Listas
    public static final String[] Biota = { "Cytota", "Acytota" };
    public static final String[] Cytota = { "Archaea", "Bacteria", "Eukaryota", "Protobionte" };
    public static final String[] Acytota = { "Viroidia", "Ribozyviria", "Virus", "Plásmido",
	    "Replicadores del mundo de ARN" };
    public static final String[] Archaea = { "DPANN", "Euryarchaeota", "Proteoarchaeota" };
    public static final String[] Euryarchaeota = { "Hydrothermarchaeota", "Hadesarchaea", "Thermococci", "Methanopyri",
	    "Methanococci", "Methanobacteria", "Thermoplasmata", "Poseidoniia", "Archaeoglobi", "Haloarchaea",
	    "Methanomicrobia", "Methanocellia", "Methanoliparia", "Methanosarcinia", "Methanonatronarchaeia",
	    "Syntropharchaeia", "Syntropharchaeia" };
    public static final String[] Thermococci = { "Thermococcales", "Methanofastidiosales" };
    public static final String[] Thermococcales = { "Thermococcaceae" };
    public static final String[] Thermococcaceae = { "Palaeococcus", "Pyrococcus", "Thermococcus" };
    public static final String[] Palaeococcus = { "Palaeococcus ferrophilus" };
    public static final String[] Pyrococcus = { "Pyrococcus abyssi", "Pyrococcus endeavori", "Pyrococcus furiosus",
	    "Pyrococcus glycovorans", "Pyrococcus horikoshii", "Pyrococcus woesei", "Pyrococcus sp. 121",
	    "Pyrococcus sp. 303", "Pyrococcus sp. 304" };
    public static final String[] Thermococcus = { "Thermococcus acidaminovorans", "Thermococcus aegaeus",
	    "Thermococcus aggregans", "Thermococcus alcaliphilus", "Thermococcus atlanticus", "Thermococcus barophilus",
	    "Thermococcus barossii", "Thermococcus celer", "Thermococcus chitonophagus", "Thermococcus coalescens",
	    "Thermococcus fumicolans", "Thermococcus gammatolerans", "Thermococcus gorgonarius",
	    "Thermococcus guaymasensis", "Thermococcus hydrothermalis", "Thermococcus kodakarensis",
	    "Thermococcus litoralis", "Thermococcus marinus", "Thermococcus mexicalis", "Thermococcus pacificus",
	    "Thermococcus peptonophilus", "Thermococcus profundus", "Thermococcus radiotolerans",
	    "Thermococcus sibiricus", "Thermococcus siculi", "Thermococcus stetteri", "Thermococcus waimanguensis",
	    "Thermococcus waiotapuensis", "Thermococcus zilligii" };
    public static final String[] Methanofastidiosales = { "Methanofastidiosum" };
    public static final String[] Methanofastidiosum = { "Methanofastidiosum methylthiophilus" };
    public static final String[] Methanopyri = { "Methanopyrales" };
    public static final String[] Methanopyrales = { "Methanopyraceae" };
    public static final String[] Methanopyraceae = { "Methanopyrus" };
    public static final String[] Methanopyrus = { "Methanopyrus kandleri" };
    public static final String[] Methanococci = { "Methanococcales" };
    public static final String[] Methanococcales = { "Methanocaldococcaceae", "Methanococcaceae" };
    public static final String[] Methanocaldococcaceae = { "Methanocaldococcus", "Methanotorris" };
    public static final String[] Methanocaldococcus = { "Methanocaldococcus fervens", "Methanocaldococcus indicus",
	    "Methanocaldococcus infernus", "Methanocaldococcus jannaschii", "Methanocaldococcus vulcanius" };
    public static final String[] Methanotorris = { "Methanotorris formicicus", "Methanotorris igneus" };
    public static final String[] Methanococcaceae = { "Methanococcus", "Methanothermococcus" };
    public static final String[] Methanococcus = { "Methanococcus aeolicus", "Methanococcus maripaludis",
	    "Methanococcus annielii", "Methanococcus voltae" };
    public static final String[] Methanothermococcus = { "Methanothermococcus okinawensis",
	    "Methanothermococcus thermolithotrophicus" };
    public static final String[] Methanobacteria = { "Methanobacteriales" };
    public static final String[] Methanobacteriales = { "Methanobacteriaceae", "Methanothermaceae" };
    public static final String[] Methanobacteriaceae = { "Methanobacterium", "Methanobrevibacter", "Methanosphaera",
	    "Methanothermobacter" };
    public static final String[] Methanobacterium = { "Methanobacterium aarhusense", "Methanobacterium alcaliphilum",
	    "Methanobacterium beijingense", "Methanobacterium bryantii", "Methanobacterium congolense",
	    "Methanobacterium curvum", "Methanobacterium espanolae", "Methanobacterium formicicum",
	    "Methanobacterium ivanovii", "Methanobacterium oryzae", "Methanobacterium palustre",
	    "Methanobacterium subterraneum", "Methanobacterium thermaggregans", "Methanobacterium uliginosum" };
    public static final String[] Methanobrevibacter = { "Methanobrevibacter acididurans",
	    "Methanobrevibacter arboriphilus", "Methanobrevibacter curvatus", "Methanobrevibacter cuticularis",
	    "Methanobrevibacter filiformis", "Methanobrevibacter gottschalkii", "Methanobrevibacter millerae",
	    "Methanobrevibacter olleyae", "Methanobrevibacter oralis", "Methanobrevibacter ruminantium",
	    "Methanobrevibacter smithii", "Methanobrevibacter thaueri", "Methanobrevibacter woesei",
	    "Methanobrevibacter wolinii" };
    public static final String[] Methanosphaera = { "Methanosphaera cuniculi", "Methanosphaera stadtmaniae" };
    public static final String[] Methanothermobacter = { "Methanosphaera defluvii", "Methanosphaera marburgensis",
	    "Methanosphaera thermautotrophicus", "Methanosphaera thermoflexus", "Methanosphaera thermophilus",
	    "Methanosphaera wolfeii" };
    public static final String[] Methanothermaceae = { "Methanothermus" };
    public static final String[] Methanothermus = { "Methanothermus fervidus", "Methanothermus jannaschii",
	    "Methanothermus sociabilis" };
    public static final String[] Thermoplasmata = { "Aciduliprofundales", "Thermoplasmatales",
	    "Methanomassiliicoccales" };
    public static final String[] Aciduliprofundales = { "Aciduliprofundaceae" };
    public static final String[] Methanomassiliicoccales = { "Methanomassiliicoccaceae" };
    public static final String[] Thermoplasmatales = { "Cuniculiplasmataceae", "Ferroplasmaceae", "Picrophilaceae",
	    "Thermoplasmataceae" };
    public static final String[] Ferroplasmaceae = { "Ferroplasma", "Acidiplasma" };
    public static final String[] Ferroplasma = { "Ferroplasma acidophilum" };
    public static final String[] Acidiplasma = { "Acidiplasma aeolicum" };
    public static final String[] Picrophilaceae = { "Picrophilus" };
    public static final String[] Picrophilus = { "Picrophilus oshimae", "Picrophilus torridus" };
    public static final String[] Thermoplasmataceae = { "Thermoplasma" };
    public static final String[] Thermoplasma = { "Thermoplasma acidophilum", "Thermoplasma volcanium" };
    // public static final String[] Name = { "", "" };

    // Categorias
    public static final int INICIO = 0;
    public static final int SUPERDOMINIO = 1;
    public static final int DOMINIO = 2;
    public static final int FILO = 3;
    public static final int CLASE = 4;
    public static final int ORDEN = 5;
    public static final int FAMILIA = 6;
    public static final int GENERO = 7;
    public static final int ESPECIE = 7;

    public static String[] getList(String cte) {
	Class<Constants> c = Constants.class;
	for (Field f : c.getDeclaredFields()) {
	    int mod = f.getModifiers();
	    if (Modifier.isStatic(mod) && Modifier.isPublic(mod) && Modifier.isFinal(mod)) {
		try {
		    if (cte.equals(f.getName())) {
			return (String[]) f.get(cte);
		    }
		} catch (IllegalAccessException e) {
		    e.printStackTrace();
		}
	    }
	}
	return null;
    }
}