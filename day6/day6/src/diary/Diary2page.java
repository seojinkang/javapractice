package diary;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JButton;

public class Diary2page extends JFrame{
	private JTextField noText;
	private JTextField dateText;
	private JTextField titleText;
		
	public Diary2page() {
		getContentPane().setBackground(Color.GREEN);
		setTitle("일기 작성용 페이지입니다");
		setSize(400, 550);
		FlowLayout flow = new FlowLayout();
		getContentPane().setLayout(flow);
		
		JTextArea textArea = new JTextArea();
		textArea.setRows(1);
		textArea.setBackground(Color.PINK);
		textArea.setFont(new Font("Monospaced", Font.BOLD, 45));
		textArea.setText("  \uB098\uC758 \uC77C\uAE30\uC7A5  ");
		getContentPane().add(textArea);
		
		JLabel lblNewLabel = new JLabel("<<<<<<<<<< \uC624\uB298\uC758 \uC77C\uAE30 \uC791\uC131\uC744 \uC2DC\uC791\uD569\uB2C8\uB2E4 >>>>>>>>>");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 13));
		getContentPane().add(lblNewLabel);
		
		JLabel no = new JLabel("\uBC88\uD638:");
		getContentPane().add(no);
		
		noText = new JTextField();
		getContentPane().add(noText);
		noText.setColumns(30);
		
		JLabel date = new JLabel("\uB0A0\uC9DC:");
		getContentPane().add(date);
		
		dateText = new JTextField();
		getContentPane().add(dateText);
		dateText.setColumns(30);
		
		JLabel title = new JLabel("\uC81C\uBAA9:");
		getContentPane().add(title);
		
		titleText = new JTextField();
		getContentPane().add(titleText);
		titleText.setColumns(30);
		
		JLabel lblNewLabel_4 = new JLabel("\uB0B4\uC6A9:");
		getContentPane().add(lblNewLabel_4);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBackground(Color.PINK);
		textArea_1.setRows(12);
		textArea_1.setColumns(30);
		getContentPane().add(textArea_1);
		
		JButton save = new JButton("\uC800\uC7A5");
		getContentPane().add(save);
		
		JButton read = new JButton("\uC77D\uAE30");
		getContentPane().add(read);
		
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Diary2page name = new Diary2page();
	}

}
