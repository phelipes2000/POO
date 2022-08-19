public class Baioneta extends Arma implements Fogo, Perfurante {

    public int atirar(){
        return 65;
    }
    public int coronhada(){
        return 8;
    }
    public int furar(){
        return 20;
    }
    public int furarRasgar(){
        return 25;
    }

    public Baioneta() {
        super("Baioneta");
        this.addGolpe("atirar", atirar());
        this.addGolpe("coronhada", coronhada());
        this.addGolpe("furar", furar());
        this.addGolpe("furarRasgar", furarRasgar());
    }
}
