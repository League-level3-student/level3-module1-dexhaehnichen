package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener{
	
	int lives;
	int numWords;
	String currentWord; 
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	Stack<String> words = new Stack<String>();
		
	public static void main(String[] args) {
		HangMan man = new HangMan();
		man.run();
		man.setup();
	}
	
	void run() {
		numWords = Integer.parseInt(JOptionPane.showInputDialog("Give a number between one and 266 (inclusive)"));
		for (int i = 0; i < numWords; i++) {
			words.push(Utilities.readRandomLineFromFile("dictionary.txt"));
		}
			currentWord = words.pop();
			for (int j = 0; j < currentWord.length(); j++) {
				label.setText(label.getText()+"_");
			}
			
	}
	
	void setup() {
		frame.add(panel);
		panel.add(label);
		panel.addKeyListener(this);
		frame.pack();
		frame.setVisible(true);
		
	}

	
	
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		String s = "";
		if(currentWord.contains(s+e.getKeyChar())) {
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
