package mvc;

public class MenorMaiorModel {
	
	private int idade;

	public MenorMaiorModel(int idade) {
		this.idade = idade;
	}

	public boolean maior() {
		return idade >= 18;
	}

	public String resultado() {
		if (maior()) {
			return "De Maior! :)";
		} else {
			return "De Menor! :(";
		}
	}

}
