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
		f.setTitle("나의 그래픽 프로그램 모음");
		f.setSize(280, 300);

		me = new JLabel("강서진의 그래픽");
		b1 = new JButton("<<<<< 나의 계산기 >>>>>");
		b2 = new JButton("<<<<< 나의 이미지 >>>>>");
		b3 = new JButton("<<<<< 이미지 변신 >>>>>");
		b4 = new JButton("<<<<< 가위바위 보 >>>>>");
		
		
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
		
		MainClass main = new MainClass();  // -> 이렇게 할 수도 있지만, 위에처럼 버튼마다 처리해줄 수도 있음 (안드로이드는 버튼마다 개별 처리)
		b1.addActionListener(main);
		b2.addActionListener(main);
		b3.addActionListener(main);
		b4.addActionListener(main);
		
		f.setVisible(true);
		
		
	}
	
	
	@Override //덮어쓰기 (overwrite)
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
