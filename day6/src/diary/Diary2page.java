package diary;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class Diary2page extends JFrame {
	private JTextField noText;
	private JTextField titleText;

	public Diary2page() {
		getContentPane().setBackground(Color.GREEN);
		setTitle("일기 작성용 페이지입니다");
		setSize(400, 500);
		FlowLayout flow = new FlowLayout();
		getContentPane().setLayout(flow);

		JTextArea textArea = new JTextArea();
		textArea.setRows(1);
		textArea.setBackground(Color.PINK);
		textArea.setFont(new Font("Monospaced", Font.BOLD, 45));
		textArea.setText("  \uB098\uC758 \uC77C\uAE30\uC7A5  ");
		getContentPane().add(textArea);

		JLabel lblNewLabel = new JLabel(
				"<<<<<<<<<< \uC624\uB298\uC758 \uC77C\uAE30 \uC791\uC131\uC744 \uC2DC\uC791\uD569\uB2C8\uB2E4 >>>>>>>>>");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 13));
		getContentPane().add(lblNewLabel);

		JLabel no = new JLabel("\uBC88\uD638:");
		getContentPane().add(no);

		noText = new JTextField();
		getContentPane().add(noText);
		noText.setColumns(30);

		JLabel title = new JLabel("\uC81C\uBAA9:");
		getContentPane().add(title);

		titleText = new JTextField();
		getContentPane().add(titleText);
		titleText.setColumns(30);

		JLabel lblNewLabel_4 = new JLabel("\uB0B4\uC6A9:");
		getContentPane().add(lblNewLabel_4);

		JTextArea contentText = new JTextArea();
		contentText.setBackground(Color.WHITE);
		contentText.setRows(12);
		contentText.setColumns(30);
		getContentPane().add(contentText);

		JButton save = new JButton("\uC800\uC7A5");
		save.setFont(new Font("굴림", Font.BOLD, 20));
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String noT = noText.getText();
				String titleT = titleText.getText();
				String contentT = contentText.getText();

				try {
					
					
					FileWriter f = new FileWriter("c:/diary/" + noT + ".txt");
					f.write("번호: " + noT + "\r\n");
					f.write("제목: " + titleT + "\r\n");
					f.write("내용:" + contentT);
					f.flush();
					f.close();
					
					noText.setText("");
					titleText.setText("");
					contentText.setText("");
					
					JOptionPane.showMessageDialog(null,"파일로 저장 성공 ^^ 오예~");
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,"파일로 저장 실패 ㅠㅠ");
				}

			}
		});
		getContentPane().add(save);

		JButton read = new JButton("\uC77D\uAE30");
		read.setFont(new Font("굴림", Font.BOLD, 20));
		read.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String noT = noText.getText();
							
				try {
					FileReader f2 = new FileReader("C:/diary/" + noT + ".txt");
					BufferedReader reader = new BufferedReader(f2);
					String noR = reader.readLine();
					String titleR = reader.readLine();
					String contentR = reader.readLine();
					
					noText.setText(noR);
					titleText.setText(titleR);
					contentText.setText(contentR);
					
					noText.setForeground(Color.red);
					
					JOptionPane.showMessageDialog(null,"파일로 읽기 성공");
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null,"파일로 읽기 실패");
				}
					
				
			}
		});
		getContentPane().add(read);
		
		JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				noText.setText("");
				titleText.setText("");
				contentText.setText("");
			}
		});
		clear.setFont(new Font("굴림", Font.BOLD, 20));
		getContentPane().add(clear);

		setVisible(true);
	}

	public static void main(String[] args) {
		Diary2page name = new Diary2page();
	}

}
