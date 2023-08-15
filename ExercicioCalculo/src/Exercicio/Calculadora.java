package Exercicio;

public class Calculadora {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario(Cargos.DESENVOLVEDOR,7000.00);
		System.out.println(new CalcularSalario().calculaSalario(funcionario));
	}
}
