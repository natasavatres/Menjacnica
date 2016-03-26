package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import specifikacijainterfejsa.menjacnicaInterfejs;

public class Menjacnica implements menjacnicaInterfejs {

	LinkedList<Valuta> menjacnica = new LinkedList<Valuta>();

	@Override
	public void dodajKurs(Valuta valuta) {
		
		if (valuta == null)
			throw new RuntimeException("Greska pri unosu valute.");
		
		if(menjacnica.contains(valuta))
			return;
		
		menjacnica.add(valuta);

	}

	@Override
	public void obrisiKurs(String nazivKursa, GregorianCalendar datum) {

		if (nazivKursa == null || datum == null)
			throw new RuntimeException("Greska pri unosu naziva ili datuma.");

		for (int i = 0; i < menjacnica.size(); i++) {

			if (menjacnica.get(i).getNaziv().equals(nazivKursa)) {

				for (int j = 0; j < menjacnica.get(i).kurs.size(); j++) {
					if (menjacnica.get(i).kurs.get(j).getDatum().equals(datum))
						menjacnica.get(i).kurs.remove(j);
				}

			}

		}

	}

	@Override
	public Kurs pronadjiKurs(String nazivKursa, GregorianCalendar datum) {

		if (nazivKursa == null || datum == null)
			throw new RuntimeException("Greska pri unosu naziva ili datuma.");

		for (int i = 0; i < menjacnica.size(); i++) {

			if (menjacnica.get(i).getNaziv().equals(nazivKursa)) {

				for (int j = 0; j < menjacnica.get(i).kurs.size(); j++) {
					if (menjacnica.get(i).kurs.get(j).getDatum().equals(datum))
						return menjacnica.get(i).kurs.get(j);
				}
			}
		}
		
		return null;
	}

}
