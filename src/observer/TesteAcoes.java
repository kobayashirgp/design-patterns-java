package observer;



public class TesteAcoes {

	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		
		builder.adicionaAcao(new EnviadorDeEmail());
		builder.adicionaAcao(new EnviadorDeSMS());
		builder.adicionaAcao(new Impressora());
		builder.adicionaAcao(new NotaFiscalDAO());
		
		NotaFiscal nf = builder.paraEmpresa("Caelum")
		.comCnpj("000.0000.0000/0000-1")
		.comItem(new ItemDaNota("Item 1", 200.0))
		.comItem(new ItemDaNota("Item 2", 300.0))
		.comItem(new ItemDaNota("Item 3", 400.0))
		.comObservacoes("obs")
		.naDataAtual().constroi();
		
		System.out.println(nf.getValorBruto());
	}
}
