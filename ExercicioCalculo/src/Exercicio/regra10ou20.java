package Exercicio;

public class regra10ou20 implements RegraCalculo {
	
	@Override
	public double calcular(Funcionario funcionario) {
        double salario = funcionario.getSalario();
        if (salario > 3000) {
            return salario * 0.8;
        } else {
            return salario * 0.9;
        }
    }
}
