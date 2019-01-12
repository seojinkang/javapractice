package menu;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//컨트롤+쉬프트+o(영문)

public class ChinaFood extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	int count = 0;
	final int price = 5000; // final붙으면 변경불가
	JLabel lblNewLabel;
	
	public ChinaFood() {
		getContentPane().setBackground(Color.YELLOW);
		setSize(600, 450);
		setTitle("주문하세요");
		
		ImageIcon icon = new ImageIcon("중국집.png");
		
				
		FlowLayout flow = new FlowLayout();
		getContentPane().setLayout(flow);
		
		JButton btnNewButton = new JButton("\uC9DC\uC7A5\uBA74");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				textField.setText(count+"");
				textField_1.setText(count*price+"");
				ImageIcon icon1 = new ImageIcon("짜장면.png");
				lblNewLabel.setIcon(icon1);
			}
		});
		btnNewButton.setFont(new Font("HY신명조", Font.BOLD, 12));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setToolTipText("\uC9DC\uC7A5\uBA74 \uD558\uB098\uAC00 \uCD94\uAC00\uB428");
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC6B0\uB3D9");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				textField.setText(count+"");
				textField_1.setText(count*price+"");
				ImageIcon icon2 = new ImageIcon("우동.png");
				lblNewLabel.setIcon(icon2);
			}
		});
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setFont(new Font("HY신명조", Font.BOLD, 12));
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uC9EC\uBF55");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				textField.setText(count+"");
				textField_1.setText(count*price+"");
				ImageIcon icon3 = new ImageIcon("짬뽕.png");
				lblNewLabel.setIcon(icon3);
			}
		});
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.setFont(new Font("HY신명조", Font.BOLD, 12));
		getContentPane().add(btnNewButton_2);
		
		JLabel label = new JLabel("\uAC1C\uC218");
		getContentPane().add(label);
		
		textField = new JTextField();
		textField.setForeground(Color.BLUE);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("\uAE08\uC561");
		getContentPane().add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.BLUE);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel = new JLabel("");
		getContentPane().add(lblNewLabel);
		
		lblNewLabel.setIcon(icon);
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		ChinaFood china = new ChinaFood();
		
		
	}

}
