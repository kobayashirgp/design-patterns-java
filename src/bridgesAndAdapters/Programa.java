package bridgesAndAdapters;

import java.io.InputStream;
import java.net.URL;
import java.util.Calendar;

public class Programa {

	public static void main(String[] args) {
		//regra de negocio
		
		//Bridge
		Mapa mapa = new GoogleMaps();
		
		mapa.devolveMapa("rua vergueiro");
		
		//...
		
		
		//Adapter
		Relogio relogio = new RelogioDoSistema();
		Calendar dataHoje = relogio.hoje();
	}
	
}
