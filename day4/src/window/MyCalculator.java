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

public class MyCalculator implements ActionListener{

	static JLabel l1, l2, result;
	static JTextField t1, t2;
	static JButton plus, minus, mul, div;
		
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 계산기");
		f.setSize(270, 450);
		
		l1 = new JLabel("숫자1>> ");
		l2 = new JLabel("숫자2>> ");
		result = new JLabel("X");
		Font font = new Font("궁서", Font.BOLD, 150); //(글꼴,Bold,크기)
		result.setFont(font);
		
		
		t1 = new JTextField(15);   //10자리까지 입력해주세요
		t2 = new JTextField(15);
		
		t1.setBackground(Color.YELLOW); // 배경색깔 
		t2.setBackground(Color.ORANGE);
		
		plus = new JButton("<<<<< 더하기 >>>>>");  
		minus = new JButton("<<<<< 빼   기 >>>>>");  
		mul = new JButton("<<<<< 곱하기 >>>>>");  
		div = new JButton("<<<<< 나누기 >>>>>");  
		plus.setForeground(Color.blue); // 글짜 색깔
		plus.setBackground(Color.yellow); // background 색깔
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(plus);
		f.add(minus);
		f.add(mul);
		f.add(div);
		f.add(result);
		
		MyCalculator cal = new MyCalculator();
		plus.addActionListener(cal);
		minus.addActionListener(cal);
		mul.addActionListener(cal);
		div.addActionListener(cal);
		
		f.setVisible(true);
	}

	@Override //덮어쓰기 (overwrite)
	public void actionPerformed(ActionEvent e) {
		String n1 = t1.getText();
//		System.out.println("입력한 숫자 1은 "+ n1);
		String n2 = t2.getText();
//		System.out.println("입력한 숫자 2은 "+ n2);  //text로 인식
		int num1 = Integer.parseInt(n1);  // String을 정수로 바꿔주는 method
		int num2 = Integer.parseInt(n2);
		
		
		if (e.getSource() == plus) {
//			System.out.println("두 수의 합은 "+ (num1+num2));
			result.setText(num1+num2 + "");
		}
		if (e.getSource() == minus) {
//			System.out.println("두 수의 차은 "+ (num1-num2));
			result.setText(num1-num2 + "");
		}
		if (e.getSource() == mul) {
//			System.out.println("두 수의 곱은 "+ (num1*num2));
			result.setText(num1*num2 + "");
		}
		if (e.getSource() == div) {
//			System.out.println("두 수의 나눗셈은 "+ (num1/num2));
			result.setText(num1/num2 + "");
		}
		
		
		
	}

}
