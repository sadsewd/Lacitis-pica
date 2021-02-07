package l_pica;

import javax.swing.JOptionPane;

public class Darbinieks {

		static void pasutijums() {
			
		String[] piedevas = {};
		String adrese="",pVards="",iev="",merce="";
		int tlrNr=0, picasIzm=0,m = 0,s1=0,s2=0,v=0,t=0,sn=0;
		
		Pica pica = new Pica(adrese,pVards,tlrNr,picasIzm,merce,piedevas);
		
		do {
		iev = JOptionPane.showInputDialog("Vai pasūtijums tiks nodots ar kurjeru? (jā/nē)");
		}while(!iev.equals("jā") && !iev.equals("nē"));
		
		if(iev.equals("jā")) {
		pVards = JOptionPane.showInputDialog("Ievadi klienta vārdu : ");
		tlrNr = Integer.parseInt(JOptionPane.showInputDialog("Ievadi klienta talr : "));
		adrese = JOptionPane.showInputDialog("Ievadi pasūtijuma pigādes ardresi : ");
		
		do{			
		iev	= JOptionPane.showInputDialog("Ievadi kāds būs picas izmērs (jaievada dotais burts!) | s - maza pica (20 cm) | m - vidēja lieluma pica (35 cm) | b - liela izmera pica (50 cm) |");			
		}while(!iev.equals("s") && !iev.equals("m") && !iev.equals("b"));
				
			if(iev.equals("s")) {
			picasIzm = 20;
			}else if(iev.equals("m")) {
			picasIzm = 35;
			}else if(iev.equals("b")) {
			picasIzm = 50;
			}
			
			do {
				
				iev	= JOptionPane.showInputDialog("Ievadi vai būs piedevas | šķiņķis - š | vista - v | siers - s  | tomātu mērce - t | sēnes - sn | stop - beigt izvēlēties piedevas |");
				
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
					piedevas[x] = "Sķiņķis";
					x++;
				}if (s2 > 0) {
					piedevas[x] = "siers";
					x++;
				}if (v > 0) {
					piedevas[x] = "Vista";
					x++;
				}if (t > 0) {
					piedevas[x] = "tomātu mērce";
					x++;
				}if (sn > 0) {
					piedevas[x] = "sēnes";
					x++;
				}
				
				
			pica.sagInfo(pVards, adrese, tlrNr, picasIzm, piedevas);
			
			}else if(iev.equals("nē")) {
				
				do{			
					iev	= JOptionPane.showInputDialog("Ievadi kāds būs picas izmērs (jaievada dotais burts!) | s - maza pica (20 cm) | m - vidēja lieluma pica (35 cm) | b - liela izmera pica (50 cm) |");			
					}while(!iev.equals("s") && !iev.equals("m") && !iev.equals("b"));
							
						if(iev.equals("s")) {
						picasIzm = 20;
						}else if(iev.equals("m")) {
						picasIzm = 35;
						}else if(iev.equals("b")) {
						picasIzm = 50;
						}
			
				do {
					iev	= JOptionPane.showInputDialog("Ievadi vai būs piedevas | šķiņķis - š | vista - v | siers - s  | tomātu mērce - t | sēnes - sn | stop - beigt izvēlēties piedevas |");
					
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
						piedevas[x] = "Sķiņķis";
						x++;
					}if (s2 > 0) {
						piedevas[x] = "siers";
						x++;
					}if (v > 0) {
						piedevas[x] = "Vista";
						x++;
					}if (t > 0) {
						piedevas[x] = "tomātu mērce";
						x++;
					}if (sn > 0) {
						piedevas[x] = "sēnes";
						x++;
					}
					
					
				pica.sagInfoBezAd(picasIzm, piedevas);				
			}
		}
		
	public static void main(String[] args) {	
	String iev;
	
	JOptionPane.showMessageDialog(null,"Izvēlaties kuru funkciju vēlaties izpildīt");
	
	do {
	iev = JOptionPane.showInputDialog("1 - veikt pasūtijuma reģistrēšanu | 2 - veikt aktīvo pasūtijumu apskati | 3 - veikt nodoto pasūtijumu apskati | stop - pārtraukt programmas darbību");
	
	switch(iev) {
	case "1": pasutijums(); break;
	case "2": break;
	case "3": break;
	case "stop": System.exit(0);
	}
	}while(!iev.equals("stop"));
   }
  }
