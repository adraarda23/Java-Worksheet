package Day06;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class AnonimClasses {


	
	ActionListener listener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			Date now = new Date();
			System.out.println("At the tone, the time is " + now);
			Toolkit.getDefaultToolkit().beep();		
		}
	}; //interfaces anonymous calls
}




//listener does the same thing
class SelamPrinter1 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Selaaammm :)");
		Toolkit.getDefaultToolkit().beep();		
	}
}