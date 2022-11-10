package primeiro;

public class Alunos {

	int matricola;
	String nome;
	double nota_prova1;
	double nota_prova2;
	double nota_trabralho;

	public double calcmedia() {
		double media = 0, p1 = 0, p2 = 0, t1 = 0;
		p1 = p1 + 2.5;
		p2 = p2 + 2.5;
		t1 = t1 + 2.0;
		// QUANDO TEM PESSO É A NOTA MUTIPLICADAPELO PESSO
		// quando tem o numero defido n precissa passar parametros ex 5 definido
		// nota_trabralho é um atributo por isso q pasei parametro
		//media = (nota_prova1 + p1) + (nota_prova2 + p2) + (nota_trabralho + t1) / (p1 + p2 + t1);
		media = (nota_prova1  + nota_prova2  + nota_trabralho) /3;
		return media;
	}

	public double calc_pontos() {
		double exame = 0;
		if(exame < 4.0)
			return 0;
		exame = calcmedia() / 3;
		return exame;
	}
}
