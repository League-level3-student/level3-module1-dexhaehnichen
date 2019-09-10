package _03_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel(); 
	Stack <Character> deletedChars = new Stack<Character>();
	boolean isShiftPressed = false;
	boolean isCtrlPressed = false; 
	
	
	public static void main(String[] args) {
		_02_TextUndoRedo tur = new _02_TextUndoRedo();
		tur.run();
	}
	
	void run (){
		addJthings();
	}
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 *   
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	
	void addJthings() {
		frame.add(panel);
		panel.add(label);
		frame.addKeyListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 250);
		frame.setVisible(true);
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println(e.getSource());
		
		if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
		
			String s = "";
			deletedChars.push((label.getText().charAt(label.getText().length()-1)));
			System.out.println(deletedChars);
			for (int i = 0; i < label.getText().length()-1; i++) {
					s += label.getText().charAt(i);
			}
			label.setText(s);
			
		}else if(e.getKeyCode() == KeyEvent.VK_CONTROL) {
			isCtrlPressed = true; 
			System.out.println("ctrl = " + isCtrlPressed);
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_SHIFT) {
			isShiftPressed = true;
			System.out.println("shift = " + isShiftPressed);
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			label.setText(label.getText() + ' ');
		}
		
		else if(isCtrlPressed){
			
				if(!deletedChars.isEmpty()) {
				label.setText(label.getText() + deletedChars.pop());
				
			}
			
			else if(e.getKeyCode() == KeyEvent.VK_C) {
				deletedChars.clear();
				System.out.println(deletedChars);
			}
			
			else if(e.getKeyCode() == KeyEvent.VK_R) {
				for (int i = label.getText().length()-1; i > 0; i--) {
					deletedChars.push(label.getText().charAt(i));
				System.out.println(deletedChars);
				}
				label.setText("");
			}
		}
		
		else if(!isShiftPressed) {
		if(e.getKeyCode() == KeyEvent.VK_A) {
			label.setText(label.getText() + 'a');
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_B) {
			label.setText(label.getText() + 'b');
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_C) {
			label.setText(label.getText() + 'c');
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_D) {
			label.setText(label.getText() + 'd');
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_E) {
			label.setText(label.getText() + 'e');
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_F) {
			label.setText(label.getText() + 'f');
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_G) {
			label.setText(label.getText() + 'g');
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_H) {
			label.setText(label.getText() + 'h');
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_I) {
			label.setText(label.getText() + 'i');
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_J) {
			label.setText(label.getText() + 'j');
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_K) {
			label.setText(label.getText() + 'k');
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_L) {
			label.setText(label.getText() + 'l');
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_M) {
			label.setText(label.getText() + 'm');
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_N) {
			label.setText(label.getText() + 'n');
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_O) {
			label.setText(label.getText() + 'o');
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_P) {
			label.setText(label.getText() + 'p');
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_Q) {
			label.setText(label.getText() + 'q');
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_R) {
			label.setText(label.getText() + 'r');
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_S) {
			label.setText(label.getText() + 's');
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_T) {
			label.setText(label.getText() + 't');
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_U) {
			label.setText(label.getText() + 'u');
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_V) {
			label.setText(label.getText() + 'v');
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_W) {
			label.setText(label.getText() + 'w');
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_X) {
			label.setText(label.getText() + 'x');
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_Y) {
			label.setText(label.getText() + 'y');
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_Z) {
			label.setText(label.getText() + 'z');
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_PERIOD) {
			label.setText(label.getText() + '.');
		}
		else if(e.getKeyCode() == KeyEvent.VK_COMMA) {
			label.setText(label.getText() + ',');
		}
		else if(e.getKeyCode() == KeyEvent.VK_SEMICOLON) {
			label.setText(label.getText() + ';');
		}
		
		}

			else if(isShiftPressed){
			if(e.getKeyCode() == KeyEvent.VK_A) {
				label.setText(label.getText() + 'A');
			}
			
			else if(e.getKeyCode() == KeyEvent.VK_B) {
				label.setText(label.getText() + 'B');
			}
			
			else if(e.getKeyCode() == KeyEvent.VK_C) {
				label.setText(label.getText() + 'C');
			}
			
			else if(e.getKeyCode() == KeyEvent.VK_D) {
				label.setText(label.getText() + 'D');
			}
			
			else if(e.getKeyCode() == KeyEvent.VK_E) {
				label.setText(label.getText() + 'E');
			}
			
			else if(e.getKeyCode() == KeyEvent.VK_F) {
				label.setText(label.getText() + 'F');
			}
			
			else if(e.getKeyCode() == KeyEvent.VK_G) {
				label.setText(label.getText() + 'G');
			}
			
			else if(e.getKeyCode() == KeyEvent.VK_H) {
				label.setText(label.getText() + 'H');
			}
			
			else if(e.getKeyCode() == KeyEvent.VK_I) {
				label.setText(label.getText() + 'I');
			}
			
			else if(e.getKeyCode() == KeyEvent.VK_J) {
				label.setText(label.getText() + 'J');
			}
			
			else if(e.getKeyCode() == KeyEvent.VK_K) {
				label.setText(label.getText() + 'K');
			}
			
			else if(e.getKeyCode() == KeyEvent.VK_L) {
				label.setText(label.getText() + 'L');
			}
			
			else if(e.getKeyCode() == KeyEvent.VK_M) {
				label.setText(label.getText() + 'M');
			}
			
			else if(e.getKeyCode() == KeyEvent.VK_N) {
				label.setText(label.getText() + 'N');
			}
			
			else if(e.getKeyCode() == KeyEvent.VK_O) {
				label.setText(label.getText() + 'O');
			}
			
			else if(e.getKeyCode() == KeyEvent.VK_P) {
				label.setText(label.getText() + 'P');
			}
			
			else if(e.getKeyCode() == KeyEvent.VK_Q) {
				label.setText(label.getText() + 'Q');
			}
			
			else if(e.getKeyCode() == KeyEvent.VK_R) {
				label.setText(label.getText() + 'R');
			}
			
			else if(e.getKeyCode() == KeyEvent.VK_S) {
				label.setText(label.getText() + 'S');
			}
			
			else if(e.getKeyCode() == KeyEvent.VK_T) {
				label.setText(label.getText() + 'T');
			}
			
			else if(e.getKeyCode() == KeyEvent.VK_U) {
				label.setText(label.getText() + 'U');
			}
			
			else if(e.getKeyCode() == KeyEvent.VK_V) {
				label.setText(label.getText() + 'V');
			}
			
			else if(e.getKeyCode() == KeyEvent.VK_W) {
				label.setText(label.getText() + 'W');
			}
			
			else if(e.getKeyCode() == KeyEvent.VK_X) {
				label.setText(label.getText() + 'X');
			}
			
			else if(e.getKeyCode() == KeyEvent.VK_Y) {
				label.setText(label.getText() + 'Y');
			}
			
			else if(e.getKeyCode() == KeyEvent.VK_Z) {
				label.setText(label.getText() + 'Z');
			}
			
			else if(e.getKeyCode() == KeyEvent.VK_PERIOD) {
				label.setText(label.getText() + '>');
			}
			else if(e.getKeyCode() == KeyEvent.VK_COMMA) {
				label.setText(label.getText() + '<');
			}
			else if(e.getKeyCode() == KeyEvent.VK_SEMICOLON) {
				label.setText(label.getText() + ':');
			}	
		}
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_CONTROL) {
			isCtrlPressed = false; 
			System.out.println("ctrl = " + isCtrlPressed);
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_SHIFT) {
			isShiftPressed = false;
			System.out.println("shift = " + isShiftPressed);
		}
		
		
	}
			
			
			
			
			
			
			
}
