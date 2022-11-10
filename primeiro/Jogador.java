package primeiro;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Jogador {
	String nome;
	String posicao;
	Date data_nsc;
	double altura;
	double pesso;
	String nacionalidade;
	
	// GET RETORNA VALOR E SET N SE QUER RETORNAR VALOR USA GET SE N SET
	public String getnome() {
		return nome;
	}
	public void setnome() {
		this.nome = nome;
	}
	public String getposicao() {
		return posicao;
	}
	public void setposicao() {
		this.posicao = posicao;
	}
	public Date getdata_nsc() {
		return data_nsc;
	}
	//THIS APONTA O ATRIBUTO QUE VOCE VAI USAR
	public void setdata_nsc() {
		this.data_nsc = data_nsc;
	}
	public double getaltura() {
		return altura;
	}
	public void setaltura() {
		this.altura = altura;
	}
	public double getpesso() {
		return pesso;
	}
	public void setpesso() {
		this.pesso = pesso;
	}
	public String getnacionalidade() {
		return nacionalidade;
	}
	public void setnacionalidade() {
		this.nacionalidade = nacionalidade;
	}
	
	
	//System.out.println(localDate); printa a data
	
	 public Date calc(Date data_nsc) {
		Jogador dataAtual      = LocalDate.now();
		LocalDate dataNascimento = LocalDate.parse(dtNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		return null;
		}
		
/*
	public void idade (){
		System.out.println("Digite a sua idade");
		Scanner sc = new Scanner(System.in);
		String lerdata = sc.nextLine();
				
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		 try {
			this.data_nsc = formato.parse(lerdata);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/
	
	}
