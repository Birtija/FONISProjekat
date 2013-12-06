package klase;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class TarzanskiUSrpski {
	 public String metoda (String tekst){

	        //KONVERTOVANJE VELIKIH SLOVA
	            
	            tekst = tekst.replace('W', 'V');
	            tekst = tekst.replace('Q', 'K');
	            tekst = tekst.replace('Y', 'I');
	            tekst = tekst.replace('X', 'H');
	            tekst = tekst.replaceAll("EE", "I");
	            tekst = tekst.replaceAll("Sh", "Š");
	            tekst = tekst.replaceAll("Ch", "Č");
	            tekst = tekst.replaceAll("Zh", "Ž");
	            
	        //konvertovanje malih slova
	            
	            tekst = tekst.replace('w', 'v');
	            tekst = tekst.replaceAll("sh", "š");
	            tekst = tekst.replace('q', 'k');
	            tekst = tekst.replaceAll("ch", "č");
	            tekst = tekst.replace('y', 'i');
	            tekst = tekst.replace('x', 'h');
	            tekst = tekst.replaceAll("ee", "i");
	            tekst = tekst.replaceAll("zh", "ž");
	            
	       // konvertovanje reci sa pocetnim velikim slovom
	            tekst = tekst.replaceAll("Vozdra", "Zdravo");
	            tekst = tekst.replaceAll("A ", "Molim ");
	            tekst = tekst.replaceAll("Ae", "Hajde");
	            tekst = tekst.replaceAll("Bg", "Beograd");
	            tekst = tekst.replaceAll("Vopi", "Pivo");
	            tekst = tekst.replaceAll("Matori", "Druže");
	            tekst = tekst.replaceAll("Lood", "Lud");
	            tekst = tekst.replaceAll("Mojne", "Nemoj");
	            tekst = tekst.replaceAll("Riba", "Devojka");
	            tekst = tekst.replaceAll("Gajba", "Kuća");
	            tekst = tekst.replaceAll("Satro", "Kao");
	            tekst = tekst.replaceAll("Smaranje", "Dosada");
	            tekst = tekst.replaceAll("Bleja", "Druženje");
	            tekst = tekst.replaceAll("Ortak", "Poznanik");
	            tekst = tekst.replaceAll("Batica", "Osoba");
	            tekst = tekst.replaceAll("Lik", "Zanimljiva osoba");
	            tekst = tekst.replaceAll("E ", "Hej");
	            
	            
	            
	       // konvertovanje reci sa pocetnim malim slovom     
	            tekst = tekst.replaceAll("vozdra", "zdravo");
	            tekst = tekst.replaceAll("ae", "hajde");
	            tekst = tekst.replaceAll("bg", "Beograd");
	            tekst = tekst.replaceAll("vopi", "pivo");
	            tekst = tekst.replaceAll("matori", "druže");
	            tekst = tekst.replaceAll("lood", "lud");
	            tekst = tekst.replaceAll("mojne", "nemoj");
	            tekst = tekst.replaceAll("riba", "devojka");
	            tekst = tekst.replaceAll("gajba", "kuća");
	            tekst = tekst.replaceAll("pglu", "glup");
	            tekst = tekst.replaceAll("satro", "kao");
	            tekst = tekst.replaceAll("smaranje", "dosada");
	            tekst = tekst.replaceAll("bleja", "druženje");
	            tekst = tekst.replaceAll("ortak", "poznanik");
	            tekst = tekst.replaceAll("batica", "osoba");
	            tekst = tekst.replaceAll("lik", "zanimljiva osoba");
	            
	            
	            
	       //konvertovanje poznatih fraza     
	            tekst = tekst.replaceAll("U fulu", "Totalno");
	            tekst = tekst.replaceAll("shta e bilo", "Šta je bilo");
	            tekst = tekst.replaceAll("Shta e bilo", "šta je bilo");
	            tekst = tekst.replaceAll("Ludilo", "Veoma otkacena situacija");
	            tekst = tekst.replaceAll("Ce izadjem na televizor a", "Da li ću se pojaviti na televizoru");
	            tekst = tekst.replaceAll("E si mi dobar", "Kako si danas");
	            
	            
	            
	            
	            
	            
	            
	           
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
				else s +=pom+"\n ";
				
			}
			ucitaj.close();
			return s;
		} catch (Exception e) {
			return null;
		}
		 
	 }
}
