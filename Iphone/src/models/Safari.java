package models;

import interfaces.NavegadorDeInternet;

public class Safari implements NavegadorDeInternet {

    @Override
    public String exibirPagina(String url) {
        return "Exibindo página " + url;
    }

    @Override
    public String novaAba() {
        return "Criando n ova aba";
    }

    @Override
    public String atualizarPagina() {
        return "Atualizando a página";
    }
}
