package window;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Game implements ActionListener{

	static JButton s, r, p;
	static JFrame f;
	
	public static void main(String[] args) {
	
		f = new JFrame();
		f.setTitle("나의 가위바위보");
		f.setSize(400, 800);

		s = new JButton();
		r = new JButton();
		p = new JButton();
		
		ImageIcon icon1 = new ImageIcon("가위.PNG");
		ImageIcon icon2 = new ImageIcon("바위.PNG");
		ImageIcon icon3 = new ImageIcon("보.PNG");
		
		s.setIcon(icon1);
		r.setIcon(icon2);
		p.setIcon(icon3);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		f.add(s);
		f.add(r);
		f.add(p);
		
		Game game = new Game();
		s.addActionListener(game);
		r.addActionListener(game);
		p.addActionListener(game);
		
		f.setVisible(true);
		
	}
	
//	public static void main(String[] args) {
//		Game game = new Game();
//		
//	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Random random = new Random();
		int computer = random.nextInt(3);   // 0,1,2만 발생
		//0:가위, 1:바위, 2:보
		
		if (e.getSource() == s) {  //내가 가위 냈을 때
			if (computer == 0) {   //컴퓨터가 가위
				f.setTitle("비겼음");
			}
			if (computer == 1) {   //컴퓨터가 바위
				f.setTitle("컴퓨터 승");
			}
			if (computer == 2) {   //컴퓨터가 보
				f.setTitle("내가 승");
			}
		}

		if (e.getSource() == r) {   //내가 바위 냈을 때
			if (computer == 0) {   //컴퓨터가 가위
				f.setTitle("내가 승");
			}
			if (computer == 1) {   //컴퓨터가 바위
				f.setTitle("비겼음");
			}
			if (computer == 2) {   //컴퓨터가 보
				f.setTitle("컴퓨터 승");
			}
			
		}

		if (e.getSource() == p) {   //내가 보 냈을 때
			if (computer == 0) {   //컴퓨터가 가위
				f.setTitle("컴퓨터 승");
			}
			if (computer == 1) {   //컴퓨터가 바위
				f.setTitle("내가 승");
			}
			if (computer == 2) {   //컴퓨터가 보
				f.setTitle("비겼음");
			}
			
		}
		
	}

}
