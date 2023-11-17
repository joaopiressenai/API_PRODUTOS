package com.senai.produtos;

public enum CategoriaEnum {
    TENIS("Tênis"),
    CHINELO("Chinelo"),
    SANDALIA("Sandália"),
    SAPATILHA("Sapatilha"),
    BOTA("Bota");

    private String categoria;

    private CategoriaEnum(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }
}
