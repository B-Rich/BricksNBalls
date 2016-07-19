/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bricks.and.balls;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

/**
 *
 * @author Threadcount
 */
public class Bckgrnd {
    private BufferedImage b;
    private Game game;
    private Game2 g2;
    private GameS gS;
    
    public Bckgrnd(Game game){
        this.game = game;
    }
    
    public Bckgrnd(Game2 g2){
        this.g2 = g2;
    }
    
    public Bckgrnd(GameS gS){
        this.gS = gS;
    }
    
    public Bckgrnd() {}
    
    public void draw(Graphics2D grphcs) {
        try {
            b = ImageIO.read(getClass().getResourceAsStream("/Resources/bckgrnd.jpg"));
        } catch (Exception excptn) {
            excptn.printStackTrace();
        }
        grphcs.drawImage(b,0,0,null);
    }
}
