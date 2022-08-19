
public class Lutador extends Personagem implements ArteMarcial{

 
	
	public Lutador(String nome) {
		super(nome);
		this.nivelEnergia = 100;
	}

	public Lutador() {
		this("Lutador sem nome " +sequencialNome++);
		this.nivelEnergia = 100;
	}
	
	public Lutador(String nome, Double nivelEnergia) {
		super(nome, nivelEnergia);
	}
	
	public boolean estaVivo() {
		if (super.nivelEnergia <= 0) return false;

		return true;
	}


	public void atacar(Personagem personagem) {
		int tipoAtaque = (int) (Math.random() * 2);

		if (tipoAtaque == 0) socar(personagem);
		else if (tipoAtaque == 1) chutar(personagem);

	}


	public void defender(double poderAtaque) {
		int tipoDefesa = (int) (Math.random() * 3);

		if (tipoDefesa == 0) esquivar(poderAtaque);
		else if (tipoDefesa == 1) fazerGuarda(poderAtaque);
		else {
			nivelEnergia = nivelEnergia - poderAtaque;
		}
	}


	public void socar(Personagem personagem) {
		personagem.defender(10);
	};

	public void chutar(Personagem personagem) {
		personagem.defender(20);
	};

	public void esquivar(double poderAtaque) {
		nivelEnergia = nivelEnergia - (poderAtaque * 0.01);
	};

	public void fazerGuarda(double poderAtaque) {
		nivelEnergia = nivelEnergia - (poderAtaque * 0.05);;
	};

}