package window2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyAge {

	JFrame f;  //선언!(사용할 수 있는 범위)
	JLabel top, name, year, age, result;
	JButton confirm;
	JTextField n, y, a;
	
	public MyAge() {
		f = new JFrame();
		f.setSize(280, 200);
				
		top = new JLabel("<<<<<< 성인인증 프로그램입니다. >>>>>>");
		name = new JLabel("이름");
		year = new JLabel("생년");
		age = new JLabel("나이");
		confirm = new JButton("인증");
		result = new JLabel();
		n = new JTextField(20);
		y = new JTextField(20);
		a = new JTextField(20);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		f.add(top);
		f.add(name);
		f.add(n);
		f.add(year);
		f.add(y);
		f.add(age);
		f.add(a);
		f.add(confirm);
		f.add(result);

		result.setForeground(Color.blue);
		top.setForeground(Color.blue);
		confirm.setForeground(Color.GREEN);
		confirm.setBackground(Color.YELLOW);
		
		confirm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {  // 이벤트가 발생하면 actionperformed 아래 동작이 호출
				String name = n.getText();
				
				String year = y.getText();
				int yearInt = Integer.parseInt(year);        // year를 정수형태로 바꿔주는 기능
				
				int age = 2019 - yearInt + 1;
				a.setText(age+"");                        // ""를 넣어줌으로써 int -> String으로 변환
				
				if (age >= 19) {
					result.setText(name + "님은 성인");
				} else {
					result.setText(name + "님은 미성년자");
				}
			}
		});
			
		f.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		MyAge age = new MyAge();
		
	}

}
