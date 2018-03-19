package bridgesAndAdapters;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class GoogleMaps implements Mapa{

	@Override
	public String devolveMapa(String rua) {
		try {
		String googleMaps = "http://maps.google.com.br/maps?'=rua+vergueiro";
		URL url = new URL (googleMaps);
		InputStream openStream = url.openStream();
		
		return "mapa do google maps";
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		
		
	}

}
