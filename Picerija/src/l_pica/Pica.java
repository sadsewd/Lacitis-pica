package l_pica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Pica {
	String[] piedevas;
	String adrese,pVards,merce,fails;
	int tlrNr,picasIzm;
	double cena;
	
	public Pica(String adrese, String pVards, int tlrNr, int picasIzm, String merce, String[] piedevas,String fails,double cena) {
		
		this.pVards = pVards;
		this.adrese = adrese;
		this.tlrNr = tlrNr;
		this.picasIzm = picasIzm;
		this.merce = merce;
		this.piedevas = piedevas;
		this.fails = fails;
		this.cena = cena;
		
	}
	
	void sagInfo(String pVards, String adrese, int tlrNr, int picasIzm, String[] piedevas,double cena) {	
		double cenaArPVN = cena*1.21;
		try {
			FileWriter fw = new FileWriter("PasutijumaInfoArAdresi.txt", true);
			PrintWriter raksta = new PrintWriter(fw);
			raksta.println("Klienta vārds - "+pVards+"\nKlienta adrese - "+adrese+"\nKlienta tālrunis - "+tlrNr);
			raksta.println("Picas lielums "+picasIzm+" cm");
			raksta.print("Picas piedevas - ");
			for(int i = 0; i<piedevas.length;i++) {
				raksta.print(piedevas[i]+" ");
			}
			raksta.println("Pasūtijuma cena bez PVN - "+cena+" EUR (+3.0 Euro par piegādi)");
			raksta.println("Pasūtijuma cena ar PVN - "+cenaArPVN+" EUR");
			raksta.println("\n-------------------------------------------");
			raksta.close();
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Radās kļūme saglabājot failu!", "Kļūme!",JOptionPane.ERROR_MESSAGE);
		}
	}
	void sagInfoBezAd(int picasIzm, String[] piedevas,double cena) {
		double cenaArPVN = cena*1.21;
		try {
			FileWriter fw = new FileWriter("PasutijumaInfoBezAdreses.txt", true);
			PrintWriter raksta = new PrintWriter(fw);
			raksta.println("Pica tiek saņemta uz vietas");
			raksta.println("Picas lielums "+picasIzm+" cm");
			raksta.print("Picas piedevas - ");
			for(int i = 0; i<piedevas.length;i++) {
				raksta.print(piedevas[i]+" ");
			}
			raksta.println("Pasūtijuma cena bez PVN - "+cena+" EUR");
			raksta.println("Pasūtijuma cena ar PVN - "+cenaArPVN+" EUR");
			raksta.println("\n-------------------------------------------");
			raksta.close();
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Radās kļūme saglabājot failu!", "Kļūme!",JOptionPane.ERROR_MESSAGE);
		}
	}

	public static void izlasitfailu(String failaNos) {
		if(failaNos.equals("PasutijumaInfoArAdresi.txt")) {
			
			try {
				String teksts;
				FileReader fr = new FileReader("PasutijumaInfoArAdresi.txt");
				BufferedReader lasa = new BufferedReader(fr);
				while((teksts=lasa.readLine())!=null) {
					System.out.println(teksts);
				}
				lasa.close();
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Radās kļūme lasot failu!", "Kļūme!",JOptionPane.ERROR_MESSAGE);}
			
		}else if(failaNos.equals("PasutijumaInfoBezAdreses.txt")) {
			
			try {
				String teksts;
				FileReader fr = new FileReader("PasutijumaInfoBezAdreses.txt");
				BufferedReader lasa = new BufferedReader(fr);
				while((teksts=lasa.readLine())!=null) {
					System.out.println(teksts);	
				}
				lasa.close();
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Radās kļūme lasot failu!", "Kļūme!",JOptionPane.ERROR_MESSAGE);}
			
		}
		
		}
	}
