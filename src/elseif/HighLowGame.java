//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;
import java.util.jar.JarOutputStream;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {

		int random = new Random().nextInt(5) + 1;
		System.out.println(random);
		for (int i = 0; i < 5; i++) {

				String Guess = JOptionPane.showInputDialog("Give your best numerical guess from 1-5");

				int Answer = Integer.parseInt(Guess);
			
				if (Answer == random) {
				JOptionPane.showMessageDialog(null, "You Win");
				System.exit(0);
			} 
				else if (Answer > random) {
				JOptionPane.showMessageDialog(null, "Your Guess is too high");
			} 
				else if (Answer < random) {
				JOptionPane.showMessageDialog(null, "Your guess is too low");
			}
		}
	}
}
