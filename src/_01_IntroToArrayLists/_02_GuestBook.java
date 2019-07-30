package _01_IntroToArrayLists;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements MouseListener{
	
	JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		JButton add = new JButton("Add Name");
		JButton view = new JButton("View Names");
		ArrayList<String> GuestList = new ArrayList<String>();
		String viewN;
		
	public static void main(String[] args) {
		_02_GuestBook gb = new _02_GuestBook();
		gb.run();
	}
	
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	void run(){
		setUpGUI();
		
	}
	
	void setUpGUI() {
		frame.add(panel);
		panel.add(add);
		panel.add(view);
		add.addMouseListener(this);
		view.addMouseListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getComponent() == add) {
		GuestList.add(JOptionPane.showInputDialog("Enter Guest Name"));
		}else if(e.getComponent() == view) {
		viewN = "";
		for (int i = 0; i < GuestList.size(); i++) {
			int z = i+1;
		viewN = viewN + "Guest #" + z + ": " + GuestList.get(i) + "\n";
		}
		JOptionPane.showMessageDialog(null, viewN);
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
