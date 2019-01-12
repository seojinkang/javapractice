package window;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyPicture implements ActionListener{                  //implements actionlistner -> method를 가져오도록 정의

	static JButton b1;
	static JButton b2;             // b1, b1는 메인이 아닌 클래스 밑에서 쓸거임
	
	public static void main(String[] args) {
		JFrame f = new JFrame();   //Frame(틀) 만드는 라이브러리
		// 세부적인 기능 삽입
		f.setTitle("나의 그래픽 프로그램");  //set을 누르면 세팅관련 기능이 뜸. title은 타이틀 달기. 괄호안에 타이틀 삽입
		f.setSize(700, 700);      // 프레임 사이즈 정하기(가로, 세로)
				
		
		JLabel l = new JLabel("나의 강아지");   // 글자(label)와 이미지 삽입하는  라이브러리
		JLabel b = new JLabel("이쁘지요?");   
		JLabel img = new JLabel();   
		ImageIcon icon = new ImageIcon("dog.PNG");  // 이미지 삽입
		FlowLayout flow = new FlowLayout();         // 가운데로 정렬하면서 글짜/이미지 삽입
		f.setLayout(flow);
		img.setIcon(icon);                // 이미지에 아이콘 삽입
		
		b1 = new JButton("나를 누르세요.");       // 버튼을 넣어주는 라이브러리
		b2 = new JButton("나를 또또 누르세요.");       // 버튼을 넣어주는 라이브러리
																
		f.add(l);                         // 프레임에 글자, 이미지 삽입
		f.add(img); 
		f.add(b);                         // add 순서대로 입력값이 들어감 l -> img -> b
		f.add(b1);
		f.add(b2);
		
		
		MyPicture pic = new MyPicture();
		b1.addActionListener(pic);          // 버튼 눌렀을 때 반응처리 implementation listener와 연결 
		b2.addActionListener(pic);           
		
		
		f.setVisible(true);               //프레임을 실행(visible)시켜주는 기능. true라고 집어넣어야 실행됨 -> 안드로이드 기본은 안보임. 보이도록 정의해줘야함
	}

	@Override
	public void actionPerformed(ActionEvent e) {       //버튼 눌렀을때 대괄호 안의 액션이 자동으로 실행
		if (e.getSource() == b1) {
			System.out.println("나를 눌렀군요...!!");
		}
		if (e.getSource() == b2) {
			System.out.println("나를 또또 눌렀군요...!!");
		}
			
		
		
	}

}
