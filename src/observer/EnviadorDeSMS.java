package observer;

public class EnviadorDeSMS implements AcaoAposGerarNota{

	public void executa(NotaFiscal nf){
		System.out.println("Enviando por SMS");
	}
}

