package com.ismael.taxonomia;

public class Message {

    private final long consultaId;
    private final String contenido;

    public Message(long consultaId, String contenido) {
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
