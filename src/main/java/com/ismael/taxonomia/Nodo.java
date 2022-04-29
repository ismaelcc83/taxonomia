package com.ismael.taxonomia;

public class Nodo {
    private String nomenclatura;

    public Nodo(String nomenclatura) {
	this.nomenclatura = nomenclatura;
    }

    public String getNomenclatura() {
	return nomenclatura;
    }

    public void setNomenclatura(String nomenclatura) {
	this.nomenclatura = nomenclatura;
    }

    @Override
    public String toString() {
	return "[nomenclatura=" + nomenclatura + "]";
    }
}