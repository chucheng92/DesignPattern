package com.tinymood.designpattern.templatemethod.jframe;

import java.awt.Graphics;
import javax.swing.JFrame;

/**
 * 模版方法模式的应用2 - Swing的JFrame
 * @author taoxiaoran
 *
 */
public class MyFrame extends JFrame {
	public MyFrame(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,300);
		this.setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		String msg = "I rule.";
		g.drawString(msg, 100, 100);
	}
	
	public static void main(String[] args) {
		MyFrame myFrame = new MyFrame("Saber Design Patterns");
	}
}
