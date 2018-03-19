package decorator;


public class ICPP extends Imposto{

	public ICPP(Imposto outroImposto){
		super(outroImposto);
	}
	
	public ICPP(){
		
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calculoDoOutroImposto(orcamento);
	}
	


}
