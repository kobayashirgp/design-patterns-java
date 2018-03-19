package builder;


public class TesteDaNotaFiscal {

	public static void main(String[] args) {
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		
		builder.paraEmpresa("Caelum")
		.comCnpj("000.0000.0000/0000-1")
		.comItem(new ItemDaNota("Item 1", 200.0))
		.comItem(new ItemDaNota("Item 2", 300.0))
		.comItem(new ItemDaNota("Item 3", 400.0))
		.comObservacoes("obs")
		.naDataAtual();
		
		NotaFiscal nf = builder.constroi();
		
		System.out.println(nf.getValorBruto());
	}
}

