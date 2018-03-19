package visitor;

public class Programa {

	public static void main(String[] args) {
		
		Expressao esquerda = new Subtracao(new Soma(new Numero(5), new Numero(7)), new Numero(5));
		Expressao direita = new Soma(new Numero(2), new Numero(10));
		Expressao soma = new Soma(esquerda,direita);
		
		int resultado = soma.avalia();
		
	//	(((5 + 7) - 5)+(2+10))
		System.out.println(resultado);
		
		Visitor imp = new ImpressoraVisitor();
		soma.aceita(imp);
	}
}