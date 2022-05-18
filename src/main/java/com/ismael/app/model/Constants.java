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
    public static final String[] Pyrococcus = { "", "" };
    public static final String[] Name = { "", "" };
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