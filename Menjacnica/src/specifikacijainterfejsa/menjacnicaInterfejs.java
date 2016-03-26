package specifikacijainterfejsa;

import java.util.GregorianCalendar;

import menjacnica.Kurs;
import menjacnica.Valuta;

public interface menjacnicaInterfejs {

	public void dodajKurs(Valuta valuta);
	public void obrisiKurs(String nazivKursa, GregorianCalendar datum);
	public Kurs pronadjiKurs(String nazivKursa, GregorianCalendar datum);
	
}
