
public class UfcFighter extends Lutador implements Judo, Karate, JiuJitsu {

	public int sequencialNome = 1;

	public UfcFighter(String nome) {
		super(nome);
	}
	public UfcFighter() {
		this.nivelEnergia = 150;
		this.nome = "UFCFighter sem nome" +sequencialNome++;
	}

    public int magueri() {
        return 7;
    }

    public int guedanBarai() {
        return 10;
    }

	public int ipponSeioiNague() {
		System.out.println("Ippon");
		return 5;

	}

	public int haraiGoshi() {
		System.out.println("Ippon");
		return 8;

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
		personagem.defender(10 + ipponSeioiNague());
	};

	public void ataque2(Personagem personagem) {
		personagem.defender(20 + haraiGoshi());
	};

	public void ataque3(Personagem personagem) {
		personagem.defender(10 + armLock());
	};

	public void ataque4(Personagem personagem) {
		personagem.defender(20 + guilhotina());
	};

	public void ataque5(Personagem personagem) {
		personagem.defender(10 + magueri());
	};

	public void ataque6(Personagem personagem) {
		personagem.defender(20 + guedanBarai());
	};

	public void esquivar(double poderAtaque) {
		nivelEnergia = nivelEnergia - (poderAtaque * 0.01);
	};

	public void fazerGuarda(double poderAtaque) {
		nivelEnergia = nivelEnergia - (poderAtaque * 0.05);;
	};

	public void atacar(Personagem personagem) {
		int tipoAtaque = (int) (Math.random() * 6);

		if (tipoAtaque == 0) ataque1(personagem);
		else if (tipoAtaque == 1) ataque2(personagem);
		else if (tipoAtaque == 2) ataque2(personagem);
		else if (tipoAtaque == 3) ataque2(personagem);
		else if (tipoAtaque == 4) ataque2(personagem);
		else if (tipoAtaque == 5) ataque2(personagem);

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
