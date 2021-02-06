package l_pica;

import javax.swing.JOptionPane;

public class Darbinieks {

		static void pasutijums() {
			
		String[] piedevas = {};
		String adrese="",pVards="",iev="",merce="";
		int tlrNr=0, picasIzm=0;
		
		Pica pica = new Pica(adrese,pVards,tlrNr,picasIzm,merce,piedevas);
		
		do {
		iev = JOptionPane.showInputDialog("Vai pasūtijums tiks nodots ar kurjeru? (jā/nē)");
		}while(!iev.equals("jā") && !iev.equals("nē"));
		
		if(iev.equals("jā")) {
		pVards = JOptionPane.showInputDialog("Ievadi klienta vārdu : ");
		tlrNr = Integer.parseInt(JOptionPane.showInputDialog("Ievadi klienta talr : "));
		adrese = JOptionPane.showInputDialog("Ievadi pasūtijuma pigādes ardresi : ");
		}
		
		do{			
		iev	= JOptionPane.showInputDialog("Ievadi kāds būs picas izmērs (jaievada dotais burts!) | s - maza pica (20 cm) | m - vidēja lieluma pica (35 cm) | b - liela izmera pica (50 cm) |");			
		}while(!iev.equals("s") && !iev.equals("m") && !iev.equals("b"));
			
		if(iev == "s") {
		picasIzm = 20;
		}else if(iev == "m") {
		picasIzm = 35;
		}else if(iev == "b") {
		picasIzm = 50;
		}
		pica.sagInfo(pVards, adrese, tlrNr, picasIzm);
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
