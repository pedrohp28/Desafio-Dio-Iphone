package models;

public class Iphone {
    private Ipod ipod;
    private Safari safari;
    private Telefone telefone;

    public Iphone(Ipod ipod, Safari safari, Telefone telefone) {
        this.ipod = ipod;
        this.safari = safari;
        this.telefone = telefone;
    }

    public Ipod getIpod() {
        return ipod;
    }

    public void setIpod(Ipod ipod) {
        this.ipod = ipod;
    }

    public Safari getSafari() {
        return safari;
    }

    public void setSafari(Safari safari) {
        this.safari = safari;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }
}
