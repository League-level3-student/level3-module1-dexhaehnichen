package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	
	HashMap<Integer, String> log = new HashMap<Integer, String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton("Add Entry");
	JButton search = new JButton("Search By ID");
	JButton view = new JButton("View List");
	
	public static void main(String[] args) {
		_02_LogSearch ls = new _02_LogSearch();
		ls.setup();
		ls.run();
	}
	
	void run() {
		
	}
	
	void setup() {
		frame.add(panel);
		panel.add(add);
		panel.add(search);
		panel.add(view);
		add.addActionListener(this);
		search.addActionListener(this);
		view.addActionListener(this);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		log.put(0, "test0");
		log.put(1, "test1");
		log.put(2, "test2");
		log.put(4, "test3");
		log.put(5, "test4");
		log.put(6, "test5");
		log.put(256, "test6");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(add)) {
			log.put(Integer.parseInt(JOptionPane.showInputDialog("Insert ID Number")), JOptionPane.showInputDialog("Insert Name"));
		}else if(e.getSource().equals(search)) {
			JOptionPane.showMessageDialog(null, log.get(Integer.parseInt(JOptionPane.showInputDialog("Insert ID Number"))));
		}else if(e.getSource().equals(view)) {
			String s = "";
			for (int i = 0; i <= log.size(); i++) {
				System.out.println(i);
				if(log.keySet().contains(i)) {
				s = s + "ID: " + i + " Name: " + log.get(i) + "\n";
				System.out.println("//" + i + " is valid");
				}
			}
			JOptionPane.showMessageDialog(null, s);
			System.out.println("--");
		}
	}
	
	
	
	
}

