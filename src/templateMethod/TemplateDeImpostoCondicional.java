package templateMethod;

public abstract class TemplateDeImpostoCondicional  implements Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		if(deveUsarMaximaTaxacao(orcamento)){
			return maximaTaxacao(orcamento);
		}else{
			return minimaTaxacao(orcamento);
		}
	}

	public double minimaTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return 0;
	}

	public  double maximaTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return false;
	}

}
