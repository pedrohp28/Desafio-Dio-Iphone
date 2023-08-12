import models.Iphone;
import models.Ipod;
import models.Safari;
import models.Telefone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone(new Ipod(), new Safari(), new Telefone());

        //Ipod
        System.out.println("IPOD");
        System.out.println(iphone.getIpod().selecionarMusica("Bohemian Rhapsody"));
        System.out.println(iphone.getIpod().pausar());
        System.out.println(iphone.getIpod().tocar());

        System.out.println("-".repeat(30));

        //Safari
        System.out.println("SAFARI");
        System.out.println(iphone.getSafari().exibirPagina("www.google.com.br"));
        System.out.println(iphone.getSafari().novaAba());
        System.out.println(iphone.getSafari().atualizarPagina());

        System.out.println("-".repeat(30));

        //Telefone
        System.out.println("TELEFONE");
        System.out.println(iphone.getTelefone().ligar("1234-5678"));
        System.out.println(iphone.getTelefone().atender());
        System.out.println(iphone.getTelefone().correioDeVoz());
    }
}
