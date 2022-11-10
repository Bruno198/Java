package primeiro;

public class Veículo {
	 double potencia;
	  String habilidade;
	
	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public String getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(String habilidade) {
		this.habilidade = habilidade;
	}

	public int acelerar() {
		//int i= 10;
		//ENQUANTO ACELERAR FOR IGUAL AO QUE O USUARIO INFORMAR
		//PORQUE QUE SEMPRE QUE EU COLOCO PARAMETROS A CLASSE FICA VERMELHA ACUSA ERRO
		int calc = 0;
		//int resp = 0;
		//calc = i * n;
		while (calc < 100) {
			System.out.println(calc + " km/h");
			calc = calc + 10;
		}
		return calc;
	}
	
	public int freiar () {
		int freiada = 0;
		freiada = acelerar() - 50;
		return freiada;
		
		}
	
}
