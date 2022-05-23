package com.ismael.app.model;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public final class Constants {
    public static enum Listas {
	NEW, START, CONTINUE, SENTTOCLIENT
    };

    // Listas
    public static final String[] Name = { "", "" };
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
    public static final String[] Name = { "", "" };
    public static final String[] Name = { "", "" };
    public static final String[] Name = { "", "" };
    public static final String[] Name = { "", "" };
    public static final String[] Name = { "", "" };
    public static final String[] Name = { "", "" };
    public static final String[] Name = { "", "" };

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