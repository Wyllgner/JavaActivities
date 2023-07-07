package entities;

public class Aluno {
	public String nome;
	public double n1;
	public double n2;
	public double n3;
	
	public  double soma() {
		return n1 + n2 + n3;
	}
	
	public double falta() {
		return (60.0 - soma());
	}
}
