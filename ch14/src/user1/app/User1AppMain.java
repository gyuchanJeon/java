package user1.app;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import user1.User1DAO;
import user1.User1VO;

public class User1AppMain extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tblList;
	private JTextField txtUid;
	private JTextField txtName;
	private JTextField txtHp;
	private JTextField txtAge;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User1AppMain frame = new User1AppMain();
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
	public User1AppMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));

		JPanel listPanel = new JPanel();
		contentPane.add(listPanel, "listPanel");
		listPanel.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel = new JLabel("User1 목록");
		listPanel.add(lblNewLabel, BorderLayout.NORTH);

		JScrollPane scrollPane = new JScrollPane();
		listPanel.add(scrollPane, BorderLayout.CENTER);

		//////////////////////////////////////////////////////////////////////////////////////
		// 테이블 설정
		//////////////////////////////////////////////////////////////////////////////////////
		// 테이블 생성
		tblList = new JTable();
		scrollPane.setViewportView(tblList);

		// 컬럼 설정
		String[] columnNames = { "아이디", "이름", "휴대폰", "나이" };
		DefaultTableModel model = new DefaultTableModel(columnNames, 0);
		model.setRowCount(0);
		tblList.setModel(model);

		// 데이터 출력
		User1DAO dao = User1DAO.getInstance();
		List<User1VO> users = dao.selectUsers();

		for (User1VO user : users) {
			Object[] rowData = { user.getUid(), user.getName(), user.getHp(), user.getAge() };
			model.addRow(rowData);
		}

		//////////////////////////////////////////////////////////////////////////////////////

		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		listPanel.add(panel_1, BorderLayout.SOUTH);

		JButton btnRegister = new JButton("등록");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// 등록 화면으로 전환
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(getContentPane(), "resgisterPanel");
			}
		});
		panel_1.add(btnRegister);

		JPanel resgisterPanel = new JPanel();
		contentPane.add(resgisterPanel, "resgisterPanel");
		resgisterPanel.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("User1 등록");
		lblNewLabel_1.setBounds(9, 10, 76, 15);
		resgisterPanel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("아이디");
		lblNewLabel_2.setBounds(12, 53, 57, 15);
		resgisterPanel.add(lblNewLabel_2);

		txtUid = new JTextField();
		txtUid.setBounds(60, 47, 116, 21);
		resgisterPanel.add(txtUid);
		txtUid.setColumns(10);

		JLabel lblNewLabel_2_1 = new JLabel("이름");
		lblNewLabel_2_1.setBounds(12, 81, 57, 15);
		resgisterPanel.add(lblNewLabel_2_1);

		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(60, 75, 116, 21);
		resgisterPanel.add(txtName);

		JLabel lblNewLabel_2_2 = new JLabel("휴대폰");
		lblNewLabel_2_2.setBounds(12, 109, 57, 15);
		resgisterPanel.add(lblNewLabel_2_2);

		txtHp = new JTextField();
		txtHp.setColumns(10);
		txtHp.setBounds(60, 103, 116, 21);
		resgisterPanel.add(txtHp);

		JLabel lblNewLabel_2_3 = new JLabel("나이");
		lblNewLabel_2_3.setBounds(12, 137, 57, 15);
		resgisterPanel.add(lblNewLabel_2_3);

		txtAge = new JTextField();
		txtAge.setColumns(10);
		txtAge.setBounds(60, 131, 116, 21);
		resgisterPanel.add(txtAge);

		JButton btnInsert = new JButton("등록하기");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uid = txtUid.getText();
				String name = txtName.getText();
				String hp = txtHp.getText();
				int age = Integer.parseInt(txtAge.getText());
				
				User1VO vo = new User1VO(uid, name, hp, age);
				User1DAO.getInstance().insertUser(vo);
				
				JOptionPane.showConfirmDialog(null, "등록 완료!");
				
			}
		});
		btnInsert.setBounds(88, 176, 88, 23);
		resgisterPanel.add(btnInsert);

		JButton btnList = new JButton("목록");
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// 목록 화면으로 전환
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(getContentPane(), "listPanel");

			}
		});
		btnList.setBounds(12, 176, 73, 23);
		resgisterPanel.add(btnList);
	}
}
