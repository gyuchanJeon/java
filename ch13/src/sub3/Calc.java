package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Calc extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc frame = new Calc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 374, 502);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 16));
		btnNewButton.setBounds(12, 122, 74, 74);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 16));
		btnNewButton_1.setBounds(98, 122, 74, 74);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 16));
		btnNewButton_2.setBounds(184, 122, 74, 74);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setFont(new Font("굴림", Font.PLAIN, 16));
		btnNewButton_3.setBounds(270, 122, 74, 74);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setFont(new Font("굴림", Font.PLAIN, 16));
		btnNewButton_4.setBounds(12, 206, 74, 74);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setFont(new Font("굴림", Font.PLAIN, 16));
		btnNewButton_5.setBounds(98, 206, 74, 74);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.setFont(new Font("굴림", Font.PLAIN, 16));
		btnNewButton_6.setBounds(184, 206, 74, 74);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("New button");
		btnNewButton_7.setFont(new Font("굴림", Font.PLAIN, 16));
		btnNewButton_7.setBounds(270, 206, 74, 74);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_7_1 = new JButton("New button");
		btnNewButton_7_1.setFont(new Font("굴림", Font.PLAIN, 16));
		btnNewButton_7_1.setBounds(270, 290, 74, 74);
		contentPane.add(btnNewButton_7_1);
		
		JButton btnNewButton_6_1 = new JButton("New button");
		btnNewButton_6_1.setFont(new Font("굴림", Font.PLAIN, 16));
		btnNewButton_6_1.setBounds(184, 290, 74, 74);
		contentPane.add(btnNewButton_6_1);
		
		JButton btnNewButton_5_1 = new JButton("New button");
		btnNewButton_5_1.setFont(new Font("굴림", Font.PLAIN, 16));
		btnNewButton_5_1.setBounds(98, 290, 74, 74);
		contentPane.add(btnNewButton_5_1);
		
		JButton btnNewButton_4_1 = new JButton("New button");
		btnNewButton_4_1.setFont(new Font("굴림", Font.PLAIN, 16));
		btnNewButton_4_1.setBounds(12, 290, 74, 74);
		contentPane.add(btnNewButton_4_1);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setFont(new Font("굴림", Font.PLAIN, 16));
		btnPlus.setBounds(270, 374, 74, 74);
		contentPane.add(btnPlus);
		
		JButton btnEquals = new JButton("=");
		btnEquals.setFont(new Font("굴림", Font.PLAIN, 16));
		btnEquals.setBounds(184, 374, 74, 74);
		contentPane.add(btnEquals);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("굴림", Font.PLAIN, 16));
		btn0.setBounds(98, 374, 74, 74);
		contentPane.add(btn0);
		
		JButton btnC = new JButton("C");
		btnC.setFont(new Font("굴림", Font.PLAIN, 16));
		btnC.setBounds(12, 374, 74, 74);
		contentPane.add(btnC);
		
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.PLAIN, 48));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setEditable(false);
		textField.setText("0");
		textField.setBounds(12, 10, 332, 89);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
