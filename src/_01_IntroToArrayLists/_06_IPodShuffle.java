package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	Random r = new Random();
	int songNum;
	Song demo = new Song("demo.mp3");
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
				
				demo.play();
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
		doJStuff();
	}
	
	void doJStuff() {
		frame.add(panel);
		panel.add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}
	
	public static void main(String[] args) {
		new _06_IPodShuffle();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		songNum = r.nextInt(10);
		if(songNum == 0) {
			System.out.println("play song 0");
			demo.play();
		}else if(songNum==1) {
			System.out.println("play song 1");
			demo.play();
		}else if(songNum==2) {
			System.out.println("play song 2");
			demo.play();
		}else if(songNum==3) {
			System.out.println("play song 3");
			demo.play();
		}else if(songNum==4) {
			System.out.println("play song 4");
			demo.play();
		}else if(songNum==5) {
			System.out.println("play song 5");
			demo.play();
		}else if(songNum==6) {
			System.out.println("play song 6");
			demo.play();
		}else if(songNum==7) {
			System.out.println("play song 7");
			demo.play();
		}else if(songNum==8) {
			System.out.println("play song 8");
			demo.play();
		}else if(songNum==9) {
			System.out.println("play song 9");
			demo.play();
		}
	}
}