package Exercicio;

public class Funcionario {
	private Cargos cargo;
	private double salario;
	
	public Funcionario(Cargos cargo, double salario) {
		this.cargo = cargo;
		this.salario = salario;
	}

	public Cargos getCargo() {
		return cargo;
	}
	
	public double getSalario() {
		return salario;
	}
	
}
