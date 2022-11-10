package primeiro;

public class Carro extends Veículo {
	String tipo_de_pneu;
	int ativar;
	
	public int ligarturbo() {
		int turbo = 0;
		//this.ativar = 0;
		//if(this.ativar == 1)
		//{
		    turbo = (turbo + acelerar()) + 100;
		//}
		
		return turbo;
	}
}
