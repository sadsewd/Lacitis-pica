package l_pica;

import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Pica {
	String[] piedevas;
	String adrese,pVards,merce;
	int tlrNr,picasIzm;
	
	public Pica(String adrese, String pVards, int tlrNr, int picasIzm, String merce, String[] piedevas) {
		
		this.pVards = pVards;
		this.adrese = adrese;
		this.tlrNr = tlrNr;
		this.picasIzm = picasIzm;
		this.merce = merce;
		this.piedevas = piedevas;
		
	}
	
	void sagInfo(String pVards, String adrese, int tlrNr, int picasIzm) {
		
		try {
			FileWriter fw = new FileWriter("PKlientaInfo.txt", true);
			PrintWriter raksta = new PrintWriter(fw);
			raksta.println("-------------------------------------------");
			raksta.println("Klienta vārds - "+pVards+"\nKlienta adrese - "+adrese+"\nKlienta tālrunis - "+tlrNr);
			raksta.println("Picas lielums "+picasIzm+" cm");
			raksta.close();
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Radās kļūme saglabājot failu!", "Kļūme!",JOptionPane.ERROR_MESSAGE);
		}
	}
}
