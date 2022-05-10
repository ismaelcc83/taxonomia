package com.ismael.app.controller;

public class Mensaje {

    private final long consultaId;
    private final String contenido;

    public Mensaje(long consultaId, String contenido) {
	this.consultaId = consultaId;
	this.contenido = contenido;
    }

    public long getConsultaId() {
	return consultaId;
    }

    public String getContenido() {
	return contenido;
    }
}
