package klase;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;


public class SrpskiUTarzanski {
	 public String metoda (String tekst){

		 //konvertovanje poznatih fraza  
		 
		      tekst = tekst.replaceAll("Veoma otkačena situacija", "Ludilo");
		      tekst = tekst.replaceAll("Da li ću se pojaviti na televizoru", "Će izadjem na televizor a");
		      tekst = tekst.replaceAll("Kako si danas", "E si mi dobar");
		 // konvertovanje reci sa pocetnim velikim slovom
		      
		      tekst = tekst.replace("Zdravo", "Vozdra");
		      tekst = tekst.replace("Molim", "A");
		      tekst = tekst.replaceAll("Hajde", "Ae");
		      tekst = tekst.replaceAll("Beograd", "Bg");
		      tekst = tekst.replaceAll("Pivo", "Vopi");
		      tekst = tekst.replaceAll("Druže", "Matori");
		      tekst = tekst.replaceAll("Lud", "Lood");
		      tekst = tekst.replaceAll("Nemoj", "Mojne");
		      tekst = tekst.replaceAll("Devojka", "Riba");
		      tekst = tekst.replaceAll("Kuća", "Gajba");
		      tekst = tekst.replaceAll("Dosada", "Smaranje");
	          tekst = tekst.replaceAll("Druženje", "Bleja");
	          tekst = tekst.replaceAll("Poznanik", "Ortak");
	          tekst = tekst.replaceAll("Osoba", "Batica");
	          tekst = tekst.replaceAll("Zanimljiva osoba", "Lik");
	          tekst = tekst.replaceAll("Hej", "E ");
		 
		 // konvertovanje reci sa pocetnim malim slovom 
		      
		      tekst = tekst.replaceAll("Šta ta je bilo", "Shta e bilo");
		      tekst = tekst.replaceAll("zdravo", "vozdra");
		      tekst = tekst.replaceAll("shta e bilo", "šta je bilo");
		      tekst = tekst.replaceAll("hajde", "ae");
		      tekst = tekst.replaceAll("beograd", "Bg");
		      tekst = tekst.replaceAll("pivo", "vopi");
		      tekst = tekst.replaceAll("druže", "matori");
		      tekst = tekst.replaceAll("lud", "lood");
		      tekst = tekst.replaceAll("nemoj", "mojne");
		      tekst = tekst.replaceAll("devojka", "riba");
		      tekst = tekst.replaceAll("kuća", "gajba");
		      tekst = tekst.replaceAll("glup", "pglu");
		      tekst = tekst.replaceAll("kao", "satro");
	          tekst = tekst.replaceAll("dosada", "smaranje");
	          tekst = tekst.replaceAll("druženje", "bleja");
	          tekst = tekst.replaceAll("poznanik", "ortak");
	          tekst = tekst.replaceAll("osoba", "batica");
	          tekst = tekst.replaceAll("zanimljiva osoba", "lik");
	          tekst = tekst.replaceAll("Hej", "E ");
		      
	        //KONVERTOVANJE VELIKIH SLOVA
	            
	            tekst = tekst.replace('V', 'W');
	            tekst = tekst.replace('K', 'Q');
	            tekst = tekst.replace('I', 'Y');
	            tekst = tekst.replace('H', 'X');
	            tekst = tekst.replaceAll("Ž", "Zh");
	            tekst = tekst.replaceAll("Š ", "Sh");
	            tekst = tekst.replaceAll("Č", "Ch");
	            
	        //konvertovanje malih slova
	            
	          
	            tekst = tekst.replaceAll("š", "sh");
	            tekst = tekst.replaceAll("ž", "zh");
	            tekst = tekst.replaceAll("č", "ch");
	 
	            return tekst;
	 }
	 

	 
	 public String ispisi (File tekst){
		 try {
			BufferedReader ucitaj = new BufferedReader(new FileReader(tekst));
			boolean kraj = false;
			String s ="";
			while (!kraj){
				String pom = ucitaj.readLine();
				if (pom==null) kraj = true;
				else s +=pom+"\n";
				
			}
			ucitaj.close();
			return s;
		} catch (Exception e) {
			return null;
		}
		 
	 }
}

