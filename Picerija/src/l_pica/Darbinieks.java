package l_pica;

import javax.swing.JOptionPane;

public class Darbinieks {

	public static void main(String[] args) {
		
		String[] piedevas = {};
		String adrese,pVards,iev,merce = "";
		int tlrNr,picasIzm = 0;
		
		do {
		iev = JOptionPane.showInputDialog("Vai vēlaties reģistrēt pasūtijumu? (jā/nē)");
		}while(!iev.equals("jā" ) || !iev.equals("nē" ));
		if(iev == "jā"){
			
			iev = JOptionPane.showInputDialog("Vai pasūtijums tiks saņemts uz vietas vai arī tas tiks piegādāts ? (vietas/piegade)");
			
			if(iev == "piegade") {
				
			pVards = JOptionPane.showInputDialog("Ievadi klienta vārdu : ");
			tlrNr = Integer.parseInt(JOptionPane.showInputDialog("Ievadi klienta talr : "));
			adrese = JOptionPane.showInputDialog("Ievadi pasūtijuma pigādes ardresi: ");
			
			do {			
			iev	= JOptionPane.showInputDialog("Ievadi kāds būs picas izmērs (jaievada dotais burts!) | s - maza pica (20 cm) | m - vidēja lieluma pica (35 cm) | b - liela izmera pica (50 cm) |");			
			}while(!iev.equals("s") || !iev.equals("m") || !iev.equals("b"));
			
			if(iev == "s") {
			picasIzm = 20;
			}else if(iev == "m") {
			picasIzm = 35;
			}else if(iev == "b") {
			picasIzm = 50;
			}
			
			do {			
			iev	= JOptionPane.showInputDialog("Ievadi vai būs piedevas | šķiņķis - š | vista - v | siers = s  |");			
			}while(!iev.equals("s") || !iev.equals("m") || !iev.equals("b"));
			
			Pica pica = new Pica(adrese,pVards,tlrNr,picasIzm,merce,piedevas);
			pica.sagInfo(pVards, adrese, tlrNr);
			
			
			}else if(iev == "vietas") {
				adrese = "Piegādāts uz vietas";
				do {			
					iev	= JOptionPane.showInputDialog("Ievadi kāds būs picas izmērs (jaievada dotais burts!) | s - maza pica (20 cm) | m - vidēja lieluma pica (35 cm) | b - liela izmera pica (50 cm) |");			
					}while(!iev.equals("s") || !iev.equals("m") || !iev.equals("b"));
					
					if(iev == "s") {
					picasIzm = 20;
					}else if(iev == "m") {
					picasIzm = 35;
					}else if(iev == "b") {
					picasIzm = 50;
					}
				
			}else {
				JOptionPane.showInputDialog("Tika nepareizi ievadīta atbilde!");
			}
			
		}else if(iev == "nē") {
			System.exit(0);
		}else {
			JOptionPane.showMessageDialog(null, "Nepareizi tika ievadīta atbilde!");
		}
		
	}
  }
