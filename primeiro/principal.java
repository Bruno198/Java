package primeiro;

import java.util.Scanner;

public class principal {

	private static Object cls;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // ISSO AQUI � A LEITURA COMO O SCANF DO C
		Ve�culo carro = new Ve�culo();
		Carro carro2 = new Carro();
		Avi�o av = new Avi�o();
		Camin�o ca = new Camin�o();
		System.out.println("Seu Carro");
		System.out.println("Qual a Potencia ?");
		carro.potencia= sc.nextDouble();
		System.out.println("Qual a Habilidade ?");
		carro.habilidade = sc.next();
		System.out.println("Qual o Tipo De Peneu ?");
		carro2.tipo_de_pneu = sc.next();
		System.out.println("Ligue o Veicolo");
		System.out.println(" km/h" + carro2.acelerar());
		System.out.println(" km/h" + carro2.freiar());
		System.out.println(" km/h" + carro2.ligarturbo());
		System.out.println("Avi�o");
		System.out.println("Qual a Potencia ?");
		av.potencia = sc.nextDouble();
		System.out.println("Qual a Habilidade ?");
		av.habilidade = sc.next();
		System.out.println(" Metros" + av.acelerar());
		System.out.println(" Metros" + av.freiar());
		System.out.println("Qual Sua Altitude ?");
		av.altitude= sc.nextInt();
		System.out.println(" metros" + av.mudar_altitude());
		System.out.println("Caminh�o");
		System.out.println("Qual a Potencia ?");
		av.potencia = sc.nextDouble();
		System.out.println("Qual a Habilidade ?");
		av.habilidade = sc.next();
		System.out.println(" km/h" + av.acelerar());
		System.out.println(" km/h" + av.freiar());
	}

}
