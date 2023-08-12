package models;

import interfaces.AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico {
    @Override
    public String ligar(String telefone) {
        return "Ligando para o número " + telefone;
    }

    @Override
    public String atender() {
        return "Atendendo ligação";
    }

    @Override
    public String correioDeVoz() {
        return "Ouvindo correio de voz";
    }
}
