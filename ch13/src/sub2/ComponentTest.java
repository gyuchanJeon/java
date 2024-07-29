package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JTable;

public class ComponentTest extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUid;
	private JTextField txtName;
	private JTextField txtHp;
	private JTextField txtPlus1;
	private JTextField txtPlus2;
	private JTextField txtResultPlus;
	private JTextField txtMinus1;
	private JTextField txtMinus2;
	private JTextField txtResultMinus;
	private JTextField txtMultiple1;
	private JTextField txtMultiple2;
	private JTextField txtResultMultiple;
	private JTextField txtDivide1;
	private JTextField txtDivide2;
	private JTextField txtResultDivide;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentTest frame = new ComponentTest();
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
	public ComponentTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 1011);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("컴포넌트 실습");
		lblNewLabel.setBounds(12, 10, 76, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("버튼 실습");
		lblNewLabel_1.setBounds(12, 35, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		JButton btn1 = new JButton("확인 1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("확인1 버튼 클릭...");
			}
		});
		btn1.setBounds(12, 60, 97, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("확인 2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "버튼2 클릭...");
				
			}
		});
		btn2.setBounds(121, 60, 97, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("확인 3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(null, "버튼3 클릭...", "확인대화상자", JOptionPane.YES_NO_OPTION);
				
				if (answer == 0) {
					System.out.println("YES 클릭!");
				} else {
					System.out.println("NO 클릭!");
				}
				
			}
		});
		btn3.setBounds(230, 60, 97, 23);
		contentPane.add(btn3);
		
		JLabel lblNewLabel_1_1 = new JLabel("텍스트필드 실습");
		lblNewLabel_1_1.setBounds(12, 93, 88, 15);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("아이디");
		lblNewLabel_1_2.setBounds(12, 118, 38, 15);
		contentPane.add(lblNewLabel_1_2);
		
		txtUid = new JTextField();
		txtUid.setBounds(50, 115, 116, 21);
		contentPane.add(txtUid);
		txtUid.setColumns(10);
		
		JLabel lbResultUid = new JLabel("결과 :");
		lbResultUid.setBounds(247, 118, 149, 15);
		contentPane.add(lbResultUid);
		
		JButton btnUid = new JButton("확인");
		btnUid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uid = txtUid.getText();
				lbResultUid.setText("결과 : " + uid);
				
			}
		});
		btnUid.setBounds(172, 114, 69, 23);
		contentPane.add(btnUid);
		
		
		JLabel lblNewLabel_1_2_1 = new JLabel("이름");
		lblNewLabel_1_2_1.setBounds(12, 147, 38, 15);
		contentPane.add(lblNewLabel_1_2_1);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(50, 143, 116, 21);
		contentPane.add(txtName);
		
		JLabel lbResultName = new JLabel("결과 :");
		lbResultName.setBounds(247, 147, 149, 15);
		contentPane.add(lbResultName);
		
		JButton btnName = new JButton("확인");
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Name = txtName.getText();
				lbResultName.setText("결과 : " + Name);
			}
		});
		btnName.setBounds(172, 143, 69, 23);
		contentPane.add(btnName);
		
		
		JLabel lblNewLabel_1_2_2 = new JLabel("휴대폰");
		lblNewLabel_1_2_2.setBounds(12, 176, 38, 15);
		contentPane.add(lblNewLabel_1_2_2);
		
		txtHp = new JTextField();
		txtHp.setColumns(10);
		txtHp.setBounds(50, 173, 116, 21);
		contentPane.add(txtHp);
		
		JLabel lbResultHp = new JLabel("결과 :");
		lbResultHp.setBounds(247, 176, 149, 15);
		contentPane.add(lbResultHp);
		
		JButton btnHp = new JButton("확인");
		btnHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Hp = txtHp.getText();
				lbResultHp.setText("결과 : " + Hp);
			}
		});
		btnHp.setBounds(172, 172, 69, 23);
		contentPane.add(btnHp);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("덧셈");
		lblNewLabel_1_2_2_1.setBounds(12, 210, 38, 15);
		contentPane.add(lblNewLabel_1_2_2_1);
		
		txtPlus1 = new JTextField();
		txtPlus1.setColumns(10);
		txtPlus1.setBounds(50, 207, 59, 21);
		contentPane.add(txtPlus1);
		
		txtPlus2 = new JTextField();
		txtPlus2.setColumns(10);
		txtPlus2.setBounds(148, 207, 59, 21);
		contentPane.add(txtPlus2);
		
		JLabel lblNewLabel_1_2_2_1_1 = new JLabel("+");
		lblNewLabel_1_2_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_1_1.setBounds(109, 210, 38, 15);
		contentPane.add(lblNewLabel_1_2_2_1_1);
		
		txtResultPlus = new JTextField();
		txtResultPlus.setColumns(10);
		txtResultPlus.setBounds(247, 207, 59, 21);
		contentPane.add(txtResultPlus);
		
		JLabel lblNewLabel_1_2_2_1_1_1 = new JLabel("=");
		lblNewLabel_1_2_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_1_1_1.setBounds(208, 210, 38, 15);
		contentPane.add(lblNewLabel_1_2_2_1_1_1);
		
		JButton btnPlus = new JButton("확인");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String strNum1 = txtPlus1.getText();
				String strNum2 = txtPlus2.getText();
				
				int num1 = Integer.parseInt(strNum1);
				int num2 = Integer.parseInt(strNum2);
				
				int num3 = num1 + num2;
				String strNum3 = (""+num3);
				
				txtResultPlus.setText("" + num3);
			}
		});
		btnPlus.setBounds(327, 206, 69, 23);
		contentPane.add(btnPlus);
		
		JLabel lblNewLabel_1_2_2_1_2 = new JLabel("뺄셈");
		lblNewLabel_1_2_2_1_2.setBounds(12, 242, 38, 15);
		contentPane.add(lblNewLabel_1_2_2_1_2);
		
		txtMinus1 = new JTextField();
		txtMinus1.setColumns(10);
		txtMinus1.setBounds(50, 239, 59, 21);
		contentPane.add(txtMinus1);
		
		JLabel lblNewLabel_1_2_2_1_1_2 = new JLabel("-");
		lblNewLabel_1_2_2_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_1_1_2.setBounds(109, 242, 38, 15);
		contentPane.add(lblNewLabel_1_2_2_1_1_2);
		
		txtMinus2 = new JTextField();
		txtMinus2.setColumns(10);
		txtMinus2.setBounds(148, 239, 59, 21);
		contentPane.add(txtMinus2);
		
		JLabel lblNewLabel_1_2_2_1_1_1_1 = new JLabel("=");
		lblNewLabel_1_2_2_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_1_1_1_1.setBounds(208, 242, 38, 15);
		contentPane.add(lblNewLabel_1_2_2_1_1_1_1);
		
		txtResultMinus = new JTextField();
		txtResultMinus.setColumns(10);
		txtResultMinus.setBounds(247, 239, 59, 21);
		contentPane.add(txtResultMinus);
		
		JButton btnMinus = new JButton("확인");
		btnMinus.setBounds(327, 238, 69, 23);
		contentPane.add(btnMinus);
		
		JLabel lblNewLabel_1_2_2_1_3 = new JLabel("곱셈");
		lblNewLabel_1_2_2_1_3.setBounds(12, 274, 38, 15);
		contentPane.add(lblNewLabel_1_2_2_1_3);
		
		txtMultiple1 = new JTextField();
		txtMultiple1.setColumns(10);
		txtMultiple1.setBounds(50, 271, 59, 21);
		contentPane.add(txtMultiple1);
		
		JLabel lblNewLabel_1_2_2_1_1_3 = new JLabel("x");
		lblNewLabel_1_2_2_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_1_1_3.setBounds(109, 274, 38, 15);
		contentPane.add(lblNewLabel_1_2_2_1_1_3);
		
		txtMultiple2 = new JTextField();
		txtMultiple2.setColumns(10);
		txtMultiple2.setBounds(148, 271, 59, 21);
		contentPane.add(txtMultiple2);
		
		JLabel lblNewLabel_1_2_2_1_1_1_2 = new JLabel("=");
		lblNewLabel_1_2_2_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_1_1_1_2.setBounds(208, 274, 38, 15);
		contentPane.add(lblNewLabel_1_2_2_1_1_1_2);
		
		txtResultMultiple = new JTextField();
		txtResultMultiple.setColumns(10);
		txtResultMultiple.setBounds(247, 271, 59, 21);
		contentPane.add(txtResultMultiple);
		
		JButton btnMultiple = new JButton("확인");
		btnMultiple.setBounds(327, 270, 69, 23);
		contentPane.add(btnMultiple);
		
		JLabel lblNewLabel_1_2_2_1_4 = new JLabel("나눗셈");
		lblNewLabel_1_2_2_1_4.setBounds(12, 306, 38, 15);
		contentPane.add(lblNewLabel_1_2_2_1_4);
		
		txtDivide1 = new JTextField();
		txtDivide1.setColumns(10);
		txtDivide1.setBounds(50, 303, 59, 21);
		contentPane.add(txtDivide1);
		
		JLabel lblNewLabel_1_2_2_1_1_4 = new JLabel("/");
		lblNewLabel_1_2_2_1_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_1_1_4.setBounds(109, 306, 38, 15);
		contentPane.add(lblNewLabel_1_2_2_1_1_4);
		
		txtDivide2 = new JTextField();
		txtDivide2.setColumns(10);
		txtDivide2.setBounds(148, 303, 59, 21);
		contentPane.add(txtDivide2);
		
		JLabel lblNewLabel_1_2_2_1_1_1_3 = new JLabel("=");
		lblNewLabel_1_2_2_1_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_1_1_1_3.setBounds(208, 306, 38, 15);
		contentPane.add(lblNewLabel_1_2_2_1_1_1_3);
		
		txtResultDivide = new JTextField();
		txtResultDivide.setColumns(10);
		txtResultDivide.setBounds(247, 303, 59, 21);
		contentPane.add(txtResultDivide);
		
		JButton btnDivide = new JButton("확인");
		btnDivide.setBounds(327, 302, 69, 23);
		contentPane.add(btnDivide);
		
		JLabel lblNewLabel_2 = new JLabel("체크박스 실습");
		lblNewLabel_2.setBounds(12, 347, 76, 15);
		contentPane.add(lblNewLabel_2);
		
		JCheckBox chk1 = new JCheckBox("서울");
		chk1.setBounds(12, 378, 57, 23);
		contentPane.add(chk1);
		
		JCheckBox chk2 = new JCheckBox("대전");
		chk2.setBounds(73, 378, 57, 23);
		contentPane.add(chk2);
		
		JCheckBox chk3 = new JCheckBox("대구");
		chk3.setBounds(134, 378, 57, 23);
		contentPane.add(chk3);
		
		JCheckBox chk4 = new JCheckBox("부산");
		chk4.setBounds(195, 378, 57, 23);
		contentPane.add(chk4);
		
		JCheckBox chk5 = new JCheckBox("광주");
		chk5.setBounds(256, 378, 57, 23);
		contentPane.add(chk5);
		
		JLabel lbResultCheck = new JLabel("결과 :");
		lbResultCheck.setBounds(12, 419, 384, 15);
		contentPane.add(lbResultCheck);
		
		JButton btnCheck = new JButton("확인");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> cities = new ArrayList<>();
				
				if (chk1.isSelected()) {
					cities.add(chk1.getText());
				}
				
				if (chk2.isSelected()) {
					cities.add(chk2.getText());
				}
				
				if (chk3.isSelected()) {
					cities.add(chk3.getText());
				}
				
				if (chk4.isSelected()) {
					cities.add(chk4.getText());
				}
				
				if (chk5.isSelected()) {
					cities.add(chk5.getText());
				}
				
				lbResultCheck.setText("결과 : " + cities);
			}
		});
		btnCheck.setBounds(327, 378, 69, 23);
		contentPane.add(btnCheck);
		
		JLabel lblNewLabel_2_1 = new JLabel("테이블 실습");
		lblNewLabel_2_1.setBounds(12, 459, 76, 15);
		contentPane.add(lblNewLabel_2_1);
		
		table = new JTable();
		table.setBounds(12, 484, 384, 148);
		contentPane.add(table);
		
		// 테이블 설정
		String[] columnName = {"아이디", "이름", "나이", "휴대폰"};
		
		DefaultTableModel model = new DefaultTableModel(columnName, 0);
		model.setRowCount(0);
		table.setModel(model);
		
		JButton btnTable = new JButton("출력");
		btnTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<Person> persons = new ArrayList<>();
				persons.add(new Person("a101", "김유신", 23, "010-1234-1001"));
				persons.add(new Person("a102", "김춘추", 21, "010-1234-1002"));
				persons.add(new Person("a103", "장보고", 33, "010-1234-1003"));
				persons.add(new Person("a104", "강감찬", 43, "010-1234-1004"));
				persons.add(new Person("a105", "이순신", 53, "010-1234-1005"));
				
				for(Person person : persons) {
					Object[] rowData = {person.getId(), person.getName(), person.getAge(), person.getHp()};
					model.addRow(rowData);
					
				}
			}
		});
		btnTable.setBounds(12, 642, 69, 23);
		contentPane.add(btnTable);
		
	
		
	}
}
