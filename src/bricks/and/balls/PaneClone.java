/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bricks.and.balls;

/**
 *
 * @author Threadcount
 */
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class PaneClone {

    private static final int pos = 120;
    private static final int w = 60;
    private static final int h = 10;
    private double x = 360.0D;
    private double dx = 0.0D;
    private BufferedImage b;
    private Game game;
    private Game2 g2;

    public PaneClone(Game game) {
        this.game = game;
        try {
            b = ImageIO.read(getClass().getResourceAsStream("/Resources/Pane.png"));
        } catch (Exception excptn) {
            excptn.printStackTrace();
        }
    }
    
    public PaneClone(Game2 g2) {
        this.g2 = g2;
        try {
            b = ImageIO.read(getClass().getResourceAsStream("/Resources/PaneClone.png"));
        } catch (Exception excptn) {
            excptn.printStackTrace();
        }
    }
    
    public PaneClone() {}

    /*public void move() {
        if (((x + dx) > 0) && ((x + dx) < (game.getWidth() - w))){
            x = x + dx;
        }
    }*/
    public void move() {
        if (((x + dx) > 0) && ((x + dx) < (800 - w))){
            x = x + dx;
        }
    }

    public void draw(Graphics2D grphcs) {
        grphcs.drawImage(b,(int)x,pos,null);
    }

    public void keyReleased(KeyEvent e) {
        dx = 0;
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_A) {
            dx = -2;
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            dx = 2;
        }
    }

    public Rectangle getBounds() {
        return new Rectangle((int)x, pos, w, h);
    }

    public int getPos() {
        return pos;
    }
}
/*public boolean Collide(Pane P)
  {
    Rectangle r1 = getBounds();
    Rectangle r2 = P.getBounds();
    return r1.intersects(r2);
  }*/
