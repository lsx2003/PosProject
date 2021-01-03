package gui;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginFrame extends FrameTemplete {
	
	static Color ElectronBlue = new Color(9, 132, 227);
	static Color OrangeVille = new Color(225, 112, 85);
	static Font font1 = new Font("맑은 고딕",Font.BOLD, 40);
	static Font font2 = new Font("맑은 고딕",Font.PLAIN, 15);
	static Font font3 = new Font("맑은 고딕",Font.BOLD, 13);
	
	static JPanel mainPanel = new JPanel();
	static JPanel northPanel = new JPanel();
	static JPanel northTop = new JPanel();
	static JPanel northCen = new JPanel();
	static JPanel northBot = new JPanel();
	static JPanel northLeft = new JPanel();
	static JPanel northRight = new JPanel();
	
	
	static JPanel southPanel = new JPanel();
	static JPanel westPanel = new JPanel();
	static JPanel eastPanel = new JPanel();
	static JPanel mTopPanel = new JPanel();
	static JPanel mCenPanel = new JPanel();
	static JPanel mBotPanel = new JPanel();
	
	
	static JLabel title = new JLabel("SRL의 POSMachine");
	static JLabel id = new JLabel("아 이 디  : ");  
	static JLabel password = new JLabel("패스워드 : ");
	static JTextField idTF = new JTextField(10);
	static JTextField passwordTF = new JTextField(10);

	static JButton loginBtn = new JButton("로그인");
	static JButton regiBtn = new JButton("회원가입");	
	static JButton exitBtn = new JButton("종 료");	

	public LoginFrame() {
	
		loginBtn.addActionListener( new ActionListener() {
			 
	        public void actionPerformed(ActionEvent e) {
	                String id = "SLR";
	                String pass = "1234";
	                    if(id.equals(idTF.getText()) &&  pass.equals(passwordTF.getText())) {

	                            JOptionPane.showMessageDialog( null, "로그인 성공" );
	                    } else {

	                        JOptionPane.showMessageDialog( null , " 로그인 실패 ");
	                    }
		
            }
    } );
		

	}
	
public static void main(String[] args) {
		
		LoginFrame fr = new LoginFrame();
		fr.setSize(1000, 600);
		fr.setLayout(new BorderLayout());
		
		Container cp = fr.getContentPane();
		cp.add(northPanel, BorderLayout.NORTH);
		cp.add(mainPanel, BorderLayout.CENTER);
		cp.add(eastPanel, BorderLayout.EAST);
		cp.add(westPanel, BorderLayout.WEST);
		cp.add(southPanel, BorderLayout.SOUTH);
		// 프레 위쪽패널 
		northPanel.add(northTop, BorderLayout.NORTH);
		northTop.setPreferredSize(new Dimension(1000, 5));

		northPanel.add(northBot, BorderLayout.SOUTH);
		northBot.setPreferredSize(new Dimension(1000, 5));

		northPanel.add(northLeft, BorderLayout.EAST);
		northLeft.setPreferredSize(new Dimension(100, 60));
		
		
		northPanel.add(northCen, BorderLayout.CENTER);
		northCen.setBackground(OrangeVille);
		northCen.setPreferredSize(new Dimension(750, 60));
		northCen.add(title);
		northCen.setBackground(OrangeVille);
		title.setFont(font1);
		
		northPanel.add(northRight, BorderLayout.WEST);
		northRight.setPreferredSize(new Dimension(100, 60));
		northRight.add(exitBtn);
		exitBtn.setPreferredSize(new Dimension(70, 40));
		exitBtn.setFont(font3);


		northPanel.setPreferredSize(new Dimension(1000, 250));
		westPanel.setPreferredSize(new Dimension(300, 600));
		eastPanel.setPreferredSize(new Dimension(300, 600));
		southPanel.setPreferredSize(new Dimension(1000, 210));
		mainPanel.setBackground(ElectronBlue);

	// mainPanel 구성 
		mainPanel.add(mTopPanel);
		mTopPanel.add(id);
		mTopPanel.add(idTF);
		id.setFont(font2);
		mTopPanel.setPreferredSize(new Dimension(250, 30));
		mTopPanel.setBackground(ElectronBlue);

		mainPanel.add(mCenPanel);
		mCenPanel.add(password);
		password.setFont(font2);
		mCenPanel.add(passwordTF);
		mCenPanel.setPreferredSize(new Dimension(250, 30));
		mCenPanel.setBackground(ElectronBlue);

		
		mainPanel.add(mBotPanel);
		mBotPanel.add(loginBtn);
		mBotPanel.add(regiBtn);
		mBotPanel.setPreferredSize(new Dimension(250, 30));
		mBotPanel.setBackground(ElectronBlue);

		
		
	}
}