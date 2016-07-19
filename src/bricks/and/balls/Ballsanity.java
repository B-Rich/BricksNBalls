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
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.Timer;

public class Ballsanity {

    private double crdX = 360.0D;
    private double crdY = 400.0D; // Y-Coordinates
    private double rd = 15.0D; //radius
    private double spdX = 5.0D; // VelocitcrdY in X direction
    private double spdY = 5.0D; // VelocitcrdY in Y direction
    private final double acc = 9.81D;
    private BufferedImage b;
    private GameS gS;


    
    public Ballsanity(GameS gS) {
        this.gS = gS;
        try {
            b = ImageIO.read(getClass().getResourceAsStream("/Resources/Ball.png"));
        } catch (Exception excptn) {
            excptn.printStackTrace();
        }
    }
    
    public Ballsanity() {}

    void move() {
        if ((crdX + spdX) < 0) {
            //spdX = setXVelocity();
            spdX = gS.bll.setXVelocity();
        }
        if ((crdX + spdX) > 800 - (2 * rd)) {
            //spdX = -setXVelocity();
            spdX = -gS.bll.setXVelocity();
        }
        if ((crdY + spdY) < 0) {
            //spdY = setYVelocity();
            spdY = gS.bll.setYVelocity();
        }
//        if ((crdY + spdY) > gS.getHeight() - (2 * rd)) {
//            gS.Lose();
//        }
        if (((crdY + spdY) > 600 - (2 * rd))) {
            gS.Lose();
        }
        
        if((Tiles.getTileCount() == 0)){
            Timer T = new Timer(100, null);
            T.start();
            gS.Advent();
        }
        

        if (collision()) {
            //spdY = setYVelocity();
            spdY = -gS.bll.setYVelocity();;
            crdY = gS.pn.getPos() - (2 * rd);
        }
        /*if (collisionSec()) {
            //spdY = setYVelocity();
            spdY = -1.0D;
            crdY = g2.pnc.getPos() - (2 * rd);
        }*/
        tileStatus(gS.as);
        tileStatus(gS.bs);
        tileStatus(gS.cs);
        tileStatus(gS.ds);
        tileStatus(gS.es);
        tileStatus(gS.fs);
        tileStatus(gS.gs);
        tileStatus(gS.hs);
        tileStatus(gS.is);
        tileStatus(gS.js);
        tileStatus(gS.ks);
        tileStatus(gS.ls);
        tileStatus(gS.ms);
        tileStatus(gS.ns);
        tileStatus(gS.os);
        tileStatus(gS.ps);
        tileStatus(gS.qs);
        tileStatus(gS.rs);
         {

        }
        
        crdX = crdX + (spdX%100);
        crdY = crdY + (spdY%100);
        
    }
    
    public boolean Collide(Tiles T)
 {
   Rectangle r1 = gS.bll.getBounds();
   Rectangle r2 = T.getBounds();
   return r1.intersects(r2);
 }
    
    public void tileStatus(Tiles T){
    if(Collide(T)){
            T.shouldRemove();
            gS.bll.spdY = -1.0D;
            gS.bll.crdY = (T.getY() - (30.0D));
            T = new Tiles(gS, 800, 600);
            T.shouldRemove();
        }
    }

    /*void move() {
     if (x + xa < 0)
     xa = 1;
     if (x + xa > gS.getWidth() - DIAMETER)
     xa = -1;
     if (y + ya < 0)
     ya = 1;
     if (y + ya > gS.getHeight() - DIAMETER)
     gS.gameOver();
     if (collision()){
     ya = -1;
     y = gS.pn.getPos() - DIAMETER;
     }
     x = x + xa;
     y = y + ya;
     }*/
    public double setXVelocity() {
        //replace 320 and 240 with updated map values
        double s = Math.sqrt((Math.pow(Math.abs(800 - this.crdX), 2) + Math.pow(Math.abs(600 - this.crdY), 2)));
        double va = Math.sqrt(Math.pow(spdX, 2) + (2 * acc * s));
        double d = va * (Math.cos(45 * Math.random()));
        return d;

    }

    public double setYVelocity() {
        double s = Math.sqrt((Math.pow(Math.abs(800 - this.crdX), 2) + Math.pow(Math.abs(600 - this.crdY), 2)));
        double va = Math.sqrt(Math.pow(spdX, 2) + (2 * acc * s));
        double d = va * (Math.sin(45 * Math.random()));
        return d;
    }

    public double setVelocity() {
        double i = setXVelocity();
        double j = setYVelocity();
        double r = Math.sqrt((Math.pow(i, 2) + Math.pow(j, 2)));
        return r;
    }

    /*private boolean collisionSec() {
        return g2.pnc.getBounds().intersects(getBounds());
    }*/
    
    /*private boolean collision() {
        return gS.pn.getBounds().intersects(getBounds());
    }*/
    
    private boolean collision() {
        return gS.pn.getBounds().intersects(getBounds());
    }
    
    /*private boolean collisionSec() {
        return gS.pn.getBounds().intersects(getBounds());
    }*/

    public void draw(Graphics2D grphcs) {
        grphcs.drawImage(b, (int) (this.crdX), (int) (this.crdY), null);
        //grphcs.drawImage(b,(int)(2*rd),(int)(2*rd),null);
    }

    public Rectangle getBounds() {
        //return new Rectangle(x,y,30,30);
        return new Rectangle((int) crdX, (int) crdY, (int) (2 * rd), (int) (2 * rd));
    }
    
    public double getX(){
        return crdX;
    }
    
    public double getY(){
        return crdY;
    }
    
    public void setYcrd(double d){
        this.crdY = d;
    }
    
    public void setYspd(double d){
        this.spdY = d;
    }

    
}

