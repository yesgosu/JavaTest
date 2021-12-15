import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Number11 extends JFrame {

	private JPanel panel;
	private JTextField tfield;
	private JButton[] buttons;
	private String[] labels = {
			"BackSpece", "" , "" , "CE", "C",
			"7", "8" , "9" , "/" , "sqrt",
			"4", "5", "6", "x", "%",
			"1","2", "3" , "+" , "="
	};
	
	public Number11() {
		tfield = new JTextField(35);
		panel = new JPanel();
		tfield.setText("0.");
		tfield.setEnabled(false);
		
		panel.setLayout(new GridLayout(0,5,3,3));
		buttons = new JButton[25];
		int index = 0;
		for ( int row = 0; row < 5; row++) {
			for(int cols=0; cols<5; cols++) {
				buttons[index] = new JButton(labels[index]);
				if(cols >= 3)
					buttons[index].setForeground(Color.red);
				else
					buttons[index].setForeground(Color.blue);
				buttons[index].setBackground(Color.black);
				panel.add(buttons[index]);
				index++;
			}
		}
		add(tfield, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		setVisible(true);
		pack();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number11 n = new Number11();
	}

}
