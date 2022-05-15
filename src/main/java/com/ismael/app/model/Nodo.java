package com.ismael.app.model;

public class Nodo {
    private String nomenclatura;
    private int categoria;
    private String nodoPadre;

    public Nodo(String nomenclatura) {
	this.nomenclatura = nomenclatura;
    }

    public Nodo(String nomenclatura, int categoria, String nodoPadre) {
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

    public int getCategoria() {
	return categoria;
    }

    public void setCategoria(int categoria) {
	this.categoria = categoria;
    }

    public String getNodoPadre() {
	return nodoPadre;
    }

    public void setNodoPadre(String nodoPadre) {
	this.nodoPadre = nodoPadre;
    }
}