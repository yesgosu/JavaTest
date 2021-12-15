import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CISSOR28 {
	CISSOR28() {
		JLabel IBLDIS , Ibloutput;
		JButton rock, scissor, paper;
		JPanel panel;
		IBLDIS = new JLabel();
		Ibloutput = new JLabel();
		rock = new JButton("바위");
		paper = new JButton("보");
		scissor = new JButton("가위");
		IBLDIS.setText("하나를 고르세요");
		panel = new JPanel();
		panel.setLayout(new GridLayout(1,3));
		Random r = new Random();
		
		panel.add(rock);
		panel.add(paper);
		panel.add(scissor);
		
		add(IBLDIS,BorderLayout.NORTH);
		add(Ibloutput, BorderLayout.CENTER);
		
	}
	
	
	
	private void add(JLabel iBLDIS, String north) {
		// TODO Auto-generated method stub
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
