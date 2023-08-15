package Exercicio;

public class regra15ou20 implements RegraCalculo{
	
	@Override
	 public double calcular(Funcionario funcionario) {
	        double salario = funcionario.getSalario();
	        if (salario > 2000) {
	            return salario * 0.75;
	        } else {
	            return salario * 0.85;
	        }
	    }
}
