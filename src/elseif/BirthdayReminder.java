

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		String momsBirthday = "June 26th";
		String dadsBirthday = "June 2nd";
		String myBirthday = "March 7th";


		for (int i = 0; i < 5; i++) {
			
		String Birthday = JOptionPane.showInputDialog("Which family members birthday would you like to know?");
		if (Birthday.equals("Mom")){
		JOptionPane.showMessageDialog(null, "Mom's Birthday is "+ momsBirthday);
	}
		else if (Birthday.equals("Dad")) {
			JOptionPane.showMessageDialog(null, "Dad's birthday is " + dadsBirthday);
	}
		else if (Birthday.equals("Yours")) {
			JOptionPane.showMessageDialog(null, "My Birthday is " + myBirthday);
		}
		else {
			JOptionPane.showMessageDialog(null, "I am not sure who it is you are speaking of");
			
	}
	}
	} 
	}
