package models;

import interfaces.ReprodutorMusical;

public class Ipod implements ReprodutorMusical {
    @Override
    public String tocar() {
        return "Tocando a música";
    }

    @Override
    public String pausar() {
        return "Pausando a música";
    }

    @Override
    public String selecionarMusica(String musica) {
        return "Selecionando " + musica + "\n" + tocar();
    }
}
