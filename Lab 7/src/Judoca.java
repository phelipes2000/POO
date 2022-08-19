
public class Judoca extends Lutador implements Judo {

	int sequencialNome = 1;

	public Judoca(String nome) {
		super(nome);
	}

	public Judoca() {
		this.nivelEnergia = 120;
		this.nome = "Judoca sem nome " +sequencialNome++;
	}

	public int ipponSeioiNague() {
		System.out.println("Ippon");
		return 5;

	}

	public int haraiGoshi() {
		System.out.println("Ippon");
		return 8;

	}

	public void ataque1(Personagem personagem) {
		personagem.defender(10 + ipponSeioiNague());
	};

	public void ataque2(Personagem personagem) {
		personagem.defender(20 + haraiGoshi());
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
