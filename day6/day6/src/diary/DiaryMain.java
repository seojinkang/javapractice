package diary;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DiaryMain extends JFrame {
	private JTextField id;
	private JTextField pw;

	public DiaryMain() {
		getContentPane().setBackground(Color.GREEN);
		//��Ʈ��+����Ʈ+f(�ڵ�����)
		setTitle("���� �ϱ��� ����ȭ��");
		setSize(600, 600);
		
		FlowLayout flow = new FlowLayout();
		getContentPane().setLayout(flow);
		
		JLabel lblNewLabel = new JLabel("");
		getContentPane().add(lblNewLabel);
		ImageIcon icon = new ImageIcon("�ϱ������.png");
		lblNewLabel.setIcon(icon);
		
		JLabel label = new JLabel("\uC544\uC774\uB514: ");
		getContentPane().add(label);
		
		id = new JTextField();
		getContentPane().add(id);
		id.setColumns(20);
		
		JLabel label_1 = new JLabel("\uD328\uC2A4\uC6CC\uB4DC: ");
		getContentPane().add(label_1);
		
		pw = new JTextField();
		getContentPane().add(pw);
		pw.setColumns(20);
		
		JButton btnNewButton = new JButton("<<<<\uB85C\uADF8\uC778>>>>");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sId = "root";
				String sPw = "1234";
				String gId = id.getText();
				String gPw = pw.getText();
				
				if ((sId.equals(gId)) && (sPw.equals(gPw))) {
					JOptionPane.showMessageDialog(null, "�α��� OK�Դϴ�");
				} else {
					JOptionPane.showMessageDialog(null, "�α��� NOT�Դϴ�. �ٽ� �Է����ּ���");
				}
			}
		});
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("<<<<\uCD08\uAE30\uD654>>>>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id.setText("");
				pw.setText("");
			}
		});
		getContentPane().add(btnNewButton_1);
		
		
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		DiaryMain name = new DiaryMain();
	}

}
