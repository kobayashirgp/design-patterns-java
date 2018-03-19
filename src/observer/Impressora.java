package observer;

public class Impressora implements AcaoAposGerarNota{

	public void executa(NotaFiscal nf){
		System.out.println("Imprimindo nf");
	}
}
