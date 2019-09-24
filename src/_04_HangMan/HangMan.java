package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener{
	
	int lives = 3;
	int numWords;
	String currentWord; 
	JFrame frame = new JFrame("Lives: "+lives);
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
			popNextWord();
	}
	
	void setup() {
		frame.add(panel);
		panel.add(label);
		frame.addKeyListener(this);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
	}

	void popNextWord() {
		label.setText("");
		currentWord = words.pop();
			System.out.println(currentWord);
			for (int j = 0; j < currentWord.length(); j++) {
				label.setText(label.getText()+"_");
			}
	}
	
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		boolean removeLife = true;
		String newLabel = label.getText(); 
		System.out.println("key pressed");
		StringBuilder sb = new StringBuilder(newLabel); 
		if(currentWord.contains(""+e.getKeyChar())) {
			for (int i = 0; i < currentWord.length(); i++) {
				if(currentWord.charAt(i) == e.getKeyChar()) {
				sb.setCharAt(i, e.getKeyChar());
				removeLife = false;
				}
			}
		}
		if(removeLife) {
			lives --; 
		}
		removeLife = true;
		label.setText(sb.toString());
		if(!label.getText().contains("_")) {
			if(words.size() > 0) {
			popNextWord();
			}else {
				if(JOptionPane.showInputDialog("You win! Do you want to make a new game? (yes/no").equals("yes")) {
					lives = 3;
					run();
				}else{
					System.exit(0);
				}
			}
		}
		
		if(lives <= 0) {
			if(JOptionPane.showInputDialog("You lose! Do you want to make a new game? (yes/no").equals("yes")) {
				words.clear();
				lives = 3;
				run();
			}else{
				System.exit(0);
			}
		}
		
		frame.setTitle("Lives: "+lives);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
