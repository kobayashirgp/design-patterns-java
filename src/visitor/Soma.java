package visitor;

public class Soma implements Expressao{
	
	private Expressao esquerda;
	private Expressao direita;

	public Soma(Expressao esquerda, Expressao direita){
		
		this.esquerda = esquerda;
		this.direita = direita;	
	}

	@Override
	public int avalia() {
		return this.esquerda.avalia() + this.direita.avalia(); 
	}
	
	public Expressao getEsquerda() {
		return esquerda;
	}
	public Expressao getDireita() {
		return direita;
	}

	@Override
	public void aceita(Visitor impressora) {
		impressora.visitaSoma(this);
	}
}