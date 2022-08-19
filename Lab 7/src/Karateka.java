public class Karateka extends Lutador implements Karate{

    static int sequencialNome = 1;

    public Karateka(String nome) {
        super(nome);
    }
    public Karateka() {
        this.nivelEnergia = 120;
        this.nome = "Karateka sem nome" +sequencialNome++;
    }

    public int magueri() {
        return 7;
    }

    public int guedanBarai() {
        return 10;
    }

    public void ataque1(Personagem personagem) {
		personagem.defender(10 + magueri());
	};

	public void ataque2(Personagem personagem) {
		personagem.defender(20 + guedanBarai());
	};

	public void esquivar(double poderAtaque) {
		nivelEnergia = nivelEnergia - (poderAtaque * 0.01);
	};

	public void fazerGuarda(double poderAtaque) {
		nivelEnergia = nivelEnergia - (poderAtaque * 0.05);;
	};

	public void atacar(Personagem personagem) {
		int tipoAtaque = (int) (Math.random() * 2);

		if (tipoAtaque == 0) ataque1(personagem);
		else if (tipoAtaque == 1) ataque2(personagem);

	}


	public void defender(double poderAtaque) {
		int tipoDefesa = (int) (Math.random() * 3);

		if (tipoDefesa == 0) esquivar(poderAtaque);
		else if (tipoDefesa == 1) fazerGuarda(poderAtaque);
		else {
			nivelEnergia = nivelEnergia - poderAtaque;
		}
	}
}