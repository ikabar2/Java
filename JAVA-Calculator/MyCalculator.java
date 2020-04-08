package simple_Clac;

/** 
 * @author Kabar()
 * 
 * @version 1.8
 * 
 * @since 27/10/2018
 * 
 */

import java.lang.*;
import javax.swing.JPanel;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.JButton;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCalculator extends JFrame {

	private JPanel panel = new JPanel();
	private JButton buttonEm1 = new JButton("");
	private JButton buttonEm2 = new JButton("");
	private JButton buttonEm3 = new JButton("");
	private JButton buttonEm = new JButton("");
	private JButton buttonE = new JButton("=");
	private JButton buttonc = new JButton("c");
	private JButton button0 = new JButton("0");
	private JButton button1 = new JButton("1");
	private JButton button2 = new JButton("2");
	private JButton button3 = new JButton("3");
	private JButton button4 = new JButton("4");
	private JButton button5 = new JButton("5");
	private JButton button6 = new JButton("6");
	private JButton button7 = new JButton("7");
	private JButton button8 = new JButton("8");
	private JButton button9 = new JButton("9");
	private JButton buttonM = new JButton("-");
	private JButton buttonP = new JButton("+");
	private JButton buttonMu = new JButton("*");
	private JButton buttonD = new JButton("/");
	public JLabel labl = new JLabel();
	public JLabel outlabl = new JLabel();

	JPanel topPanel = new JPanel();

	// btn1.setSize();

	public MyCalculator() {

		super();
		setPreferredSize(new Dimension(300, 500));
		setLayout(new GridLayout(2, 1));

		topPanel.setLayout(new GridLayout(2, 1));
		topPanel.setBackground(new Color(150, 150, 150));
		topPanel.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(1)));

		add(topPanel);
		topPanel.add(labl);
		topPanel.add(outlabl);

		panel.setLayout(new GridLayout(4, 5));

		// add to frame
		add(panel);

		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(buttonD);
		panel.add(buttonc);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(buttonMu);
		panel.add(buttonEm);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(buttonM);
		panel.add(buttonEm1);
		panel.add(buttonEm3);
		panel.add(button0);
		panel.add(buttonEm2);
		panel.add(buttonP);
		panel.add(buttonE);

		buttonc.addActionListener(new actionButtonEm1());
		buttonc.addActionListener(new actionButtonEm2());
		buttonEm.addActionListener(new actionButtonEm());
		buttonc.addActionListener(new actionButtonc());
		buttonE.addActionListener(new actionButtonE());

		button0.addActionListener(new actionButton0());
		button1.addActionListener(new actionButton1());
		button2.addActionListener(new actionButton2());
		button3.addActionListener(new actionButton3());
		button4.addActionListener(new actionButton4());
		button5.addActionListener(new actionButton5());
		button6.addActionListener(new actionButton6());
		button7.addActionListener(new actionButton7());
		button8.addActionListener(new actionButton8());
		button9.addActionListener(new actionButton9());
		buttonM.addActionListener(new actionButtonM());
		buttonD.addActionListener(new actionButtonD());
		buttonMu.addActionListener(new actionButtonMu());
		buttonP.addActionListener(new actionButtonP());
		buttonc.addActionListener(new actionButtonc());

		// frame show
		pack();
		setVisible(true);

	}

	public static void main(String[] args) {
		MyCalculator calculator = new MyCalculator();

	}

	private class actionButtonEm2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			labl.setText(labl.getText() + "");

		}

	}

	private class actionButtonEm1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			labl.setText(labl.getText() + "");

		}

	}

	private class actionButtonEm implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			labl.setText(labl.getText() + "");

		}

	}

	private class actionButtonE implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String str = labl.getText();
			String number[];
			try {
				if (str.contains("/")) {
					number = str.split("\\/");
					System.out.println(number.length);
					if (number.length == 2) {

						outlabl.setText(
								String.format("%s", (Double.parseDouble(number[0])) / (Double.parseDouble(number[1]))));

					}

					else {
						throw new Exception();
					}

				}

				else if (str.contains("+")) {

					number = str.split("\\+");
					if (number.length == 2) {
						double f = Double.parseDouble(number[0]) + Double.parseDouble(number[1]);
						outlabl.setText(String.format("%s", f));
					}

					else {
						throw new Exception();
					}
				} else if (str.contains("*")) {

					number = str.split("\\*");
					if (number.length == 2) {
						double f = Double.parseDouble(number[0]) * Double.parseDouble(number[1]);
						outlabl.setText(String.format("%s", f));
					}

					else {
						throw new Exception();
					}

				} else if (str.contains("-")) {

					number = str.split("\\-");
					if (number.length == 2) {
						double f = Double.parseDouble(number[0]) - Double.parseDouble(number[1]);
						outlabl.setText(String.format("%s", f));
					}

					else {
						throw new Exception();
					}
				}
			}

			catch (Exception ex) {
				labl.setText(" ");
				outlabl.setText("0.0");

			}

			labl.setText(labl.getText() + "=");
		}

	}

	private class actionButtonc implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			labl.setText("");

		}

	}

	private class actionButton0 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			labl.setText(labl.getText() + "0");
		}
	}

	private class actionButton1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			labl.setText(labl.getText() + "1");
		}
	}

	private class actionButton2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			labl.setText(labl.getText() + "2");
		}

	}

	private class actionButton3 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			labl.setText(labl.getText() + "3");
		}

	}

	private class actionButton4 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			labl.setText(labl.getText() + "4");
		}

	}

	private class actionButton5 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			labl.setText(labl.getText() + "5");
		}

	}

	private class actionButton6 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			labl.setText(labl.getText() + "6");
		}

	}

	private class actionButton7 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			labl.setText(labl.getText() + "7");
		}

	}

	private class actionButton8 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			labl.setText(labl.getText() + "8");
		}

	}

	private class actionButton9 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			labl.setText(labl.getText() + "9");
		}

	}

	private class actionButtonD implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			labl.setText(labl.getText() + "/");
		}

	}

	private class actionButtonP implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			labl.setText(labl.getText() + "+");
		}

	}

	private class actionButtonM implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			labl.setText(labl.getText() + "-");
		}

	}

	private class actionButtonMu implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			labl.setText(labl.getText() + "*");
		}

	}

	private class logic implements ActionLinstener {

		public void actionPerformed(ActionEvent e) {
		}
	}
}
