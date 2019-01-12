package window;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainClass implements ActionListener{

	static JButton b1, b2, b3, b4;
	static JLabel me;
		
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("���� �׷��� ���α׷� ����");
		f.setSize(280, 300);

		me = new JLabel("�������� �׷���");
		b1 = new JButton("<<<<< ���� ���� >>>>>");
		b2 = new JButton("<<<<< ���� �̹��� >>>>>");
		b3 = new JButton("<<<<< �̹��� ���� >>>>>");
		b4 = new JButton("<<<<< �������� �� >>>>>");
		
		
		b1.setBackground(Color.green);
		b2.setBackground(Color.green);
		b3.setBackground(Color.green);
		b4.setBackground(Color.ORANGE);
		
//		b1.addActionListener(new );
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		f.add(me);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		MainClass main = new MainClass();  // -> �̷��� �� ���� ������, ����ó�� ��ư���� ó������ ���� ���� (�ȵ���̵�� ��ư���� ���� ó��)
		b1.addActionListener(main);
		b2.addActionListener(main);
		b3.addActionListener(main);
		b4.addActionListener(main);
		
		f.setVisible(true);
		
		
	}
	
	
	@Override //����� (overwrite)
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == b1) {
			MyCalculator cal = new MyCalculator();
		}

		if (e.getSource() == b2) {
			MyPicture pic1 = new MyPicture();
		}

		if (e.getSource() == b3) {
			MyPicture2 pic2 = new MyPicture2();
		}

		if (e.getSource() == b4) {
			Game game = new Game();
		}
		
		
	}

}