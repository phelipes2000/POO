import java.util.ArrayList;

public class Arma implements ArmaEfeitoMoral, ArmaFogo {

	String descricao;
	ArrayList<Golpe> golpes;
	public Arma(String descricao) {	
		this.descricao = descricao;
		this.golpes = new ArrayList();
	}
	public Arma(String descricao, String golpeNome, double poderGolpe) {	
		this.descricao = descricao;
		this.golpes = new ArrayList();
		golpes.add(new Golpe(golpeNome,  poderGolpe));
	}

	public void addGolpe(String nomeGolpe, double poderOfensivo) {
		golpes.add(new Golpe(nomeGolpe,  poderOfensivo));
	}

	public Golpe pegarGolpeRandomico() {
		if(golpes.size() > 0) {
			int tipoGolpe = (int) (Math.random() * golpes.size());
			return golpes.get(tipoGolpe);						
		}
		return null;
	}
	
	@Override
	public Golpe atirar() {
		return new Golpe("Ratata",100);
		
	}

	@Override
	public Golpe explodir() {
		return new Golpe("Kabum",1000);
		
	}

}




