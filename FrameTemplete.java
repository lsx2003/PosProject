package gui;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class FrameTemplete extends JFrame {
	public FrameTemplete() {
        setLocationRelativeTo(null);
        this.setTitle("SLRÀÇ PosMachine");
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
