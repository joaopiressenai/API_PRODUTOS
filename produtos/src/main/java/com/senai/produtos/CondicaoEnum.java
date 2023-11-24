package com.senai.produtos;

public enum CondicaoEnum {
    NOVO("Novo"),
    USADO("Usado");

    private String condicao;

    private CondicaoEnum(String condicao) {
        this.condicao = condicao;
    }

    public String getCategoria() {
        return condicao;
    }
}
