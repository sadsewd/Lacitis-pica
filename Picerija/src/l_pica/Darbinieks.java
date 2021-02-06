package l_pica;

import javax.swing.JOptionPane;

public class Darbinieks {

		static void pasutijums() {
			
		String[] piedevas = {};
		String adrese="",pVards="",iev="",merce="",x;
		int tlrNr=0, picasIzm=0,i=0;
		Pica pica = new Pica(adrese,pVards,tlrNr,picasIzm,merce,piedevas);
		
		do {
		iev = JOptionPane.showInputDialog("Vai pasūtijums tiks nodots ar kurjeru? (jā/nē)");
		}while(!iev.equals("jā") || !iev.equals("nē"));
		
		if(iev.equals("jā")) {
			pVards = JOptionPane.showInputDialog("Ievadi klienta vārdu : ");
			tlrNr = Integer.parseInt(JOptionPane.showInputDialog("Ievadi klienta talr : "));
			adrese = JOptionPane.showInputDialog("Ievadi pasūtijuma pigādes ardresi: ");
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
