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
		rock = new JButton("����");
		paper = new JButton("��");
		scissor = new JButton("����");
		IBLDIS.setText("�ϳ��� ������");
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
