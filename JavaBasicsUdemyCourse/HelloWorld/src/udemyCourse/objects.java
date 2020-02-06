package udemyCourse;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class objects {
	
	public static void main(String[] args) {
		
		int number = 5;
		
		
		//create our window
		JFrame window = new JFrame(); //window variable that holds JFrame objects, and we're creating a new JFrame to assign to our variables
		window.setVisible(true);  //we're calling methods on our JFrame object to configure it
		window.setSize(500, 500);
		window.setTitle("My Jframe Window");
		
		
		JLabel label = new JLabel(); // label variable holds JLabel objects, and we're creating a new JLabel to assign to our variable
		label.setText("My label Text"); // we're calling the setText method to our JLabel object to set its text property
		
		
		window.add(label);  // we're calling the add method of our JFrame object to add our label to our window
		
		String s = "hi";
		
		
	}

}
