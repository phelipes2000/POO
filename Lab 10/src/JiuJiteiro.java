public class JiuJiteiro extends Lutador implements JiuJitsu {
    public JiuJiteiro(String nome) {
        super(nome, 100);
    }
    public JiuJiteiro() {
        super("JiuJiteiro sem nome ", 100);
    }

    public JiuJiteiro(String nome, double energia) {
		super(nome, energia);
    }
    public int armLock(){
        System.out.println("armLock");
        return 8;
    }
    public int guilhotina(){
        System.out.println("guilhotina");
        return 10;
    }

    public void ataque1(Personagem personagem) {
		personagem.defender(10 + armLock());
	};

	public void ataque2(Personagem personagem) {
		personagem.defender(20 + guilhotina());
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
