package l_pica;

import javax.swing.JOptionPane;

public class Darbinieks {

		static void pasutijums() {
		
		double cena = 0;
		String[] piedevas = {};
		String adrese="",pVards="",iev="",merce="",fails = "",iev1;
		int tlrNr=0, picasIzm=0,m = 0,s1=0,s2=0,v=0,t=0,sn=0;
		
		Pica pica = new Pica(adrese,pVards,tlrNr,picasIzm,merce,piedevas,fails,cena);
		
		do {
		iev = JOptionPane.showInputDialog("Vai pasūtijums tiks nodots ar kurjeru? (jā/nē)");
		iev = iev.toLowerCase();
		}while(!iev.equals("jā") && !iev.equals("nē"));
		
		if(iev.equals("jā")) {
		pVards = JOptionPane.showInputDialog("Ievadi klienta vārdu : ");
		tlrNr = Integer.parseInt(JOptionPane.showInputDialog("Ievadi klienta talr : "));
		adrese = JOptionPane.showInputDialog("Ievadi pasūtijuma pigādes ardresi : ");

		cena = 3.0; /*3 Euro par piegādi*/
		
		do{			
			iev	= JOptionPane.showInputDialog("Ievadi kāds būs picas izmērs (jaievada dotais burts!) | s - maza pica (20 cm) | m - vidēja lieluma pica (35 cm) | b - liela izmera pica (50 cm) |");	
			iev = iev.toLowerCase();
			}while(!iev.equals("s") && !iev.equals("m") && !iev.equals("b"));
					
				if(iev.equals("s")) {
				picasIzm = 20;
				cena = cena + 1.5;
				}else if(iev.equals("m")) {
				picasIzm = 35;
				cena = cena + 2.5;
				}else if(iev.equals("b")) {
				picasIzm = 50;
				cena = cena + 3.5;
				}
			
			do {
				
				iev	= JOptionPane.showInputDialog("Ievadi vai būs piedevas | Šķiņķis - š | Vista - v | Siers - s  | Tomātu mērce - t | Sēnes - sn | stop - beigt izvēlēties piedevas |");
				iev = iev.toLowerCase();
				if(iev.equals("š")) {
					s1++;
				}else if (iev.equals("v")) {
					v++;
				}else if (iev.equals("s")) {
					s2++;
				}else if (iev.equals("t")) {
					t++;
				}else if (iev.equals("sn")) {
					sn++;
				}
				
			}while(!iev.equals("stop"));
				
				if(s1 > 0) {
					m++;
				}if (s2 > 0) {
					m++;
				}if (v > 0) {
					m++;
				}if (t > 0) {
					m++;
				}if (sn > 0) {
					m++;
				}
				
				piedevas = new String[m];
				
				int x=0;
				
				if(s1 > 0) {
					piedevas[x] = "Šķiņķis";
					x++;
					cena = cena + 3.8;
				}if (s2 > 0) {
					piedevas[x] = "Siers";
					x++;
					cena = cena + 2.85;
				}if (v > 0) {
					piedevas[x] = "Vista";
					x++;
					cena = cena + 3;
				}if (t > 0) {
					piedevas[x] = "Tomātu mērce";
					x++;
					cena = cena + 1.3;
				}if (sn > 0) {
					piedevas[x] = "Sēnes";
					x++;
					cena = cena + 1.6;
				}
				
				
			pica.sagInfo(pVards, adrese, tlrNr, picasIzm, piedevas,cena);
			
			do {
				iev1 = JOptionPane.showInputDialog("Ievadi vai vēlies izdrukāt ievadīto informāciju tagat (jā/nē)");
				iev1 = iev1.toLowerCase();
			}while(!iev1.equals("jā")&&!iev1.equals("nē"));
			if(iev1.equals("jā")) {
				double cenaArPVN = cena*1.21;
				System.out.println("Klienta vārds - "+pVards+"\nKlienta adrese - "+adrese+"\nKlienta tālrunis - "+tlrNr);
				System.out.println("Picas lielums "+picasIzm+" cm");
				System.out.print("Picas piedevas - ");
				for(int i = 0; i<piedevas.length;i++) {
					System.out.print(piedevas[i]+" ");
				}
				System.out.println("Pasūtijuma cena bez PVN - "+cena+" EUR (+3.0 Euro par piegādi)");
				System.out.println("Pasūtijuma cena ar PVN - "+cenaArPVN+" EUR");
				System.out.println("\n-------------------------------------------");
			}
			}else if(iev.equals("nē")) {
				
				cena = 0;
				
				do{			
					iev	= JOptionPane.showInputDialog("Ievadi kāds būs picas izmērs (jaievada dotais burts!) | s - maza pica (20 cm) | m - vidēja lieluma pica (35 cm) | b - liela izmera pica (50 cm) |");			
					iev = iev.toLowerCase();
					}while(!iev.equals("s") && !iev.equals("m") && !iev.equals("b"));
							
						if(iev.equals("s")) {
						picasIzm = 20;
						cena = cena + 1.5;
						}else if(iev.equals("m")) {
						picasIzm = 35;
						cena = cena + 2.5;
						}else if(iev.equals("b")) {
						picasIzm = 50;
						cena = cena + 3.5;
						}
						
				do {
					iev	= JOptionPane.showInputDialog("Ievadi vai būs piedevas | Šķiņķis - š | Vista - v | Siers - s  | Tomātu mērce - t | Sēnes - sn | stop - beigt izvēlēties piedevas |");
					iev = iev.toLowerCase();
					if(iev.equals("š")) {
						s1++;
					}else if (iev.equals("v")) {
						v++;
					}else if (iev.equals("s")) {
						s2++;
					}else if (iev.equals("t")) {
						t++;
					}else if (iev.equals("sn")) {
						sn++;
					}
					}while(!iev.equals("stop"));
					
					if(s1 > 0) {
						m++;
					}if (s2 > 0) {
						m++;
					}if (v > 0) {
						m++;
					}if (t > 0) {
						m++;
					}if (sn > 0) {
						m++;
					}
					
					piedevas = new String[m];
					
					int x=0;
					 
					
					if(s1 > 0) {
						piedevas[x] = "Šķiņķis";
						x++;
						cena = cena + 3.8;
					}if (s2 > 0) {
						piedevas[x] = "Siers";
						x++;
						cena = cena + 2.85;
					}if (v > 0) {
						piedevas[x] = "Vista";
						x++;
						cena = cena + 3;
					}if (t > 0) {
						piedevas[x] = "Tomātu mērce";
						x++;
						cena = cena + 1.3;
					}if (sn > 0) {
						piedevas[x] = "Sēnes";
						x++;
						cena = cena + 1.6;
					}
					
					
				pica.sagInfoBezAd(picasIzm, piedevas,cena);	
				do {
					iev1 = JOptionPane.showInputDialog("Ievadi vai vēlies izdrukāt ievadīto informāciju tagat (jā/nē)");
					iev1 = iev1.toLowerCase();
				}while(!iev1.equals("jā") && !iev1.equals("nē"));
				if(iev1.equals("jā")) {
					double cenaArPVN = cena*1.21;
					System.out.println("Pica tiek saņemta uz vietas");
					System.out.println("Picas lielums "+picasIzm+" cm");
					System.out.print("Picas piedevas - ");
					for(int i = 0; i<piedevas.length;i++) {
						System.out.print(piedevas[i]+" ");
					}
					System.out.println("Pasūtijuma cena bez PVN - "+cena+" EUR");
					System.out.println("Pasūtijuma cena ar PVN - "+cenaArPVN+" EUR");
					System.out.println("\n-------------------------------------------");
				}
			}
		
		}
		
	public static void main(String[] args) {	
	String iev,fails;
	JOptionPane.showMessageDialog(null,"Izvēlaties kuru funkciju vēlaties izpildīt");
	
	do {
	iev = JOptionPane.showInputDialog("1 - veikt pasūtijuma reģistrēšanu | 2 - veikt aktīvo pasūtijumu apskati | 3 - veikt nodoto pasūtijumu apskati | stop - pārtraukt programmas darbību");
	iev = iev.toLowerCase();
	switch(iev) {
	case "1": pasutijums(); break;
	case "2": fails = "PasutijumaInfoArAdresi.txt"; Pica.izlasitfailu(fails); break;
	case "3": fails = "PasutijumaInfoBezAdreses.txt"; Pica.izlasitfailu(fails); break;
	case "stop": System.exit(0);
	default : JOptionPane.showMessageDialog(null, "Tika nepareizi ievadīt");
	}
	}while(!iev.equals("stop"));
   }
  }
