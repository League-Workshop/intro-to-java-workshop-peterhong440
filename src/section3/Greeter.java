package section3;

import javax.swing.JOptionPane;

public class Greeter {
     public static void main(String[] args) {
         String name = JOptionPane.showInputDialog(null, "What is your name?");
	     
	     if(name.equals("Peter")) {
	    	 JOptionPane.showMessageDialog(null, "You're the coolest person ever!");
	     }
	     else {
	    	 JOptionPane.showMessageDialog(null,  "Hello " + name);
	     }
	}
}
