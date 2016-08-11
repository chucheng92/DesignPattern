package com.tinymood.designpattern.templatemethod.applet;

import java.applet.Applet;
import java.awt.Graphics;

/**
 * 模版方法模式的应用3 - Applet
 * @author taoxiaoran
 *
 */
public class MyApplet extends Applet {
	private static final long serialVersionUID = 2L;
    String message;
 
    public void init() {
        message = "Hello World, I'm alive!";
        repaint();
    }
 
    public void start() {
        message = "Now I'm starting up...";
        repaint();
    }
 
    public void stop() {
        message = "Oh, now I'm being stopped...";
        repaint();
    }
 
    public void destroy() {
        message = "Goodbye, cruel world";
        repaint();
    }
 
    public void paint(Graphics g) {
        g.drawString(message, 5, 15);
    }
}

