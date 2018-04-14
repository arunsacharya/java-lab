/* 8. Design a scrolling banner for our Institute, which should display collage name in the scrolling fashion. You should able to scroll the institute name either from left to right or from right to left. */

package lab_programs;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
public class pgm8 extends Applet implements Runnable{
    String msg; 
    int x;
    public void init() {
        msg="Nitte Meenakshi Institute of Technology";
        x=500;
    new Thread(this).start();
    }
    public void paint(Graphics g) {
    g.drawString(msg, x, 100);
    }

    public void run() {
while(true){
    if(x<=0)    
    x=500;
        else
           x-=10;
        repaint();
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(pgm8.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    }
}
