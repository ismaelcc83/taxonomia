package com.ismael.app.model;

public class Nodo {
    private String nomenclatura;
    private String categoria;
    private String nodoPadre;

    public Nodo(String nomenclatura) {
	this.nomenclatura = nomenclatura;
    }

    public Nodo(String nomenclatura, String categoria, String nodoPadre) {
	this.nomenclatura = nomenclatura;
	this.setCategoria(categoria);
	this.setNodoPadre(nodoPadre);
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

    public String getCategoria() {
	return categoria;
    }

    public void setCategoria(String categoria) {
	this.categoria = categoria;
    }

    public String getNodoPadre() {
	return nodoPadre;
    }

    public void setNodoPadre(String nodoPadre) {
	this.nodoPadre = nodoPadre;
    }
}