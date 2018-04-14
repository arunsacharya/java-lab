/* 9. Traffic signal control is a vital problem and it matters our work life and business. Write a java program that simulates a traffic signal light. ((hint: use SWING, APPLET, EVENT HANDLING)
a. The program allows the user to select one of three color for the traffic light: red, yellow, or green with radio buttons. (Manual signal control)
b. Modify the program to display appropriate messages like “stop” or “ready” or “go” to appear above the buttons in a selected color. Initially there is no message shown.
c. Automate the Traffic Signal to change Traffic Light periodically. */

/*Manual Signal Control*/

package lab_programs;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class pgm9manual extends Applet implements MouseListener {
	String color;    
	public void init() {
	// TODO start asynchronous download of heavy resources
	color="red";
	addMouseListener(this);
}

@Override
public void mouseClicked(MouseEvent e) {
	if(color=="red")
	{
		color="green";
	}
	else{
		color="red";
	}
	repaint();
}

@Override
public void paint(Graphics g) {
	if(color=="red")
	{
		g.setColor(Color.red);
		g.fillOval(100, 100, 100, 100);
	}
	else{
		g.setColor(Color.green);
		g.fillOval(100, 100, 100, 100);
	}
}
    
	@Override
	public void mousePressed(MouseEvent e) {    }
	@Override
	public void mouseReleased(MouseEvent e) {    }
	@Override
	public void mouseEntered(MouseEvent e) {    }
	@Override
	public void mouseExited(MouseEvent e) {    }
}
