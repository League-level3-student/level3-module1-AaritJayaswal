package _00_Intro_To_ArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
	/*
	 * Create a GUI with two buttons. One button reads "Add Name" and the other
	 * button reads "View Names". When the add name button is clicked, display an
	 * input dialog that asks the user to enter a name. Add that name to an
	 * ArrayList. When the "View Names" button is clicked, display a message dialog
	 * that displays all the names added to the list. Format the list as follows:
	 * Guest #1: Bob Banders Guest #2: Sandy Summers Guest #3: Greg Ganders Guest
	 * #4: Donny Doners
	 */
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton view = new JButton();
	ArrayList<String>names = new ArrayList<String>();
	public static void main(String[] args) {
		new _02_GuestBook().setup();
		
	}
 public void setup() {
	
	panel.add(add);
	panel.add(view);

	frame.add(panel);
	frame.pack();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	add.setText("Add Name");
	view.setText("View Names");
	add.addActionListener(this);
	view.addActionListener(this);
	
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		JButton buttonClicked = (JButton) e.getSource();
		if(buttonClicked==add) {
String nameEntered = JOptionPane.showInputDialog(null,"Enter a name");
names.add(nameEntered);
	}
		if(buttonClicked==view) {
			for(int i = 0; i<names.size();i++) {
				JOptionPane.showMessageDialog(null, names.get(i));
			}
			
		}

	}
}
