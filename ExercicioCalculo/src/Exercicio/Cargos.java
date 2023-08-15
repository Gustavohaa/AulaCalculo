package Exercicio;

public enum Cargos {
	DESENVOLVEDOR(new regra10ou20()),
	DBA(new regra15ou20()),
	TESTER(new regra15ou20());
	
	private RegraCalculo regraCalculo;
	
	Cargos(RegraCalculo regraCalculo){
		this.regraCalculo = regraCalculo;
	}
	
	public RegraCalculo getRegraCalculo(){
		return this.regraCalculo;
	}
}
