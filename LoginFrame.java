package gui;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginFrame extends FrameTemplete {

	private Container contentPane;

	public LoginFrame() {
		JPanel topPanel = new JPanel();
		JPanel mainPanel = new JPanel();
		JPanel mTopPanel = new JPanel();
		JPanel mMidPanel = new JPanel();
		
		JLabel title = new JLabel("SRL�� POSMachine");
		JLabel login = new JLabel("�α���");
		JLabel id = new JLabel("���̵� : ");
		JLabel password = new JLabel("�н����� : ");
		JTextField idTF = new JTextField(10);
		JTextField passwordTF = new JTextField(10);
	
		JButton loginBtn = new JButton("�α���");
		JButton regiBtn = new JButton("ȸ������");
		
		mainPanel.add(login);
		mainPanel.add(password);
		mainPanel.add(passwordTF);
		mainPanel.add(loginBtn);
		mainPanel.add(regiBtn);
		
		mainPanel.add(mTopPanel, BorderLayout.NORTH);
		mainPanel.add(mMidPanel, BorderLayout.SOUTH); 
		mTopPanel.add(id);
		mTopPanel.add(idTF);
		mMidPanel.add(password);
		mMidPanel.add(passwordTF);
		
		
		loginBtn.addActionListener( new ActionListener() {
			 
            public void actionPerformed(ActionEvent e) {
                    String id = "SLR";
                    String pass = "1234";
                        if(id.equals(idTF.getText()) &&  pass.equals(passwordTF.getText())) {

                                JOptionPane.showMessageDialog( null, "�α��� ����" );
                        } else {

                            JOptionPane.showMessageDialog( null , " �α��� ���� ");
                        }
            }
    } );
		
		add(mainPanel, BorderLayout.CENTER);
		topPanel.add(title);
		add(topPanel, BorderLayout.NORTH);
		


	}
	
public static void main(String[] args) {
		
		LoginFrame fr = new LoginFrame();
		fr.setSize(1000, 600);
		
	}
}