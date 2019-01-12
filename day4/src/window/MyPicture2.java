package window;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyPicture2 implements ActionListener{                  //implements actionlistner -> method를 가져오도록 정의

	static JButton b1;
	static JButton b2;             // b1, b1는 메인이 아닌 클래스 밑에서 쓸거임(global 하게씀)
	static JLabel img;
	static ImageIcon icon;
	
	public static void main(String[] args) {
		JFrame f = new JFrame();  
		f.setTitle("나의 그래픽 프로그램");  
		f.setSize(700, 700);      
				
		
		JLabel l = new JLabel("나의 강아지");   
		JLabel b = new JLabel("이쁘지요?");   
		
		img = new JLabel();   
		icon = new ImageIcon("dog.PNG");  
		FlowLayout flow = new FlowLayout();         
		f.setLayout(flow);
		img.setIcon(icon);               
		
		// 버튼을 눌렀을 때 그림 바뀌게 만들기.
		b1 = new JButton("다른 강아지로");      
		b2 = new JButton("원래 강아지로");      
																
		f.add(l);                    
		f.add(img); 
		f.add(b);                    
		f.add(b1);
		f.add(b2);
		
		
		MyPicture2 pic = new MyPicture2();
		b1.addActionListener(pic);           
		b2.addActionListener(pic);           
		
		
		f.setVisible(true);              
	}

	@Override
	public void actionPerformed(ActionEvent e) {       //버튼 눌렀을때 대괄호 안의 액션이 자동으로 실행
		if (e.getSource() == b1) {
			ImageIcon icon2 = new ImageIcon("dog1.PNG");
			img.setIcon(icon2);
		}
		if (e.getSource() == b2) {
			img.setIcon(icon);
		}
			
		
		
	}

}
