package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import specifikacijainterfejsa.menjacnicaInterfejs;

public class Menjacnica implements menjacnicaInterfejs{

	LinkedList<Valuta> menjacnica = new LinkedList<Valuta>();

	@Override
	public void dodajKurs(Valuta valuta) {
		
		if(menjacnica.contains(valuta))
			return;
		
		menjacnica.add(valuta);
			
	}

	@Override
	public void obrisiKurs(String nazivKursa, GregorianCalendar datum) {
	
		
	}

	@Override
	public Kurs pronadjiKurs(String nazivKursa, GregorianCalendar datum) {
		
		return null;
	}

}
