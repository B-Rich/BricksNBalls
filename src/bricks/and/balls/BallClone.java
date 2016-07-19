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

public class BallClone {

    private double crdX = 360.0D;
    private double crdY = 400.0D; // Y-Coordinates
    private double rd = 15.0D; //radius
    //private Color clr;
    private double spdX = 1; // VelocitcrdY in X direction
    private double spdY = 1; // VelocitcrdY in Y direction
    private final double acc = 9.81D;
    private BufferedImage b;
    private Game game;
    private Game2 g2;
    /*private int crdX = 360; // X-Coordinates
     private int crdY = 400; // Y-Coordinates
     private int rd = 15; //radius
     //private Color clr;
     private int spdX = 1 ; // VelocitcrdY in X direction
     private int spdY = 1; // VelocitcrdY in Y direction
     private final int acc = 9;
     private BufferedImage b;
     private Game game;*/
    /*private static final int DIAMETER = 30;
     int x = 360;
     int y = 400;
     int xa = 1;
     int ya = 1;
     private Game game;
     private BufferedImage b;*/

    public BallClone(Game game) {
        this.game = game;
        try {
            b = ImageIO.read(getClass().getResourceAsStream("/Resources/Ball.png"));
        } catch (Exception excptn) {
            excptn.printStackTrace();
        }
    }
    
    public BallClone(Game2 g2) {
        this.g2 = g2;
        try {
            b = ImageIO.read(getClass().getResourceAsStream("/Resources/Ball.png"));
        } catch (Exception excptn) {
            excptn.printStackTrace();
        }
    }
    
    public BallClone() {}

 
    void move() {
        if ((crdX + spdX) < 0) {
            //spdX = setXVelocity();
            spdX = 1.0D;
        }
        if ((crdX + spdX) > 800 - (2 * rd)) {
            //spdX = -setXVelocity();
            spdX = -1.0D;
        }
        if ((crdY + spdY) < 0) {
            //spdY = setYVelocity();
            spdY = 1.0D;
        }
//        if ((crdY + spdY) > game.getHeight() - (2 * rd)) {
//            game.Lose();
//        }
        if (((crdY + spdY) > 600 - (2 * rd))) {
            g2.LoseMe();
        }
        
        if (((crdY + spdY) < (2 * rd))) {
            g2.LoseYou();
        }
        
        if((Tiles.getTileCount() == 0)){
            g2.Advent();
        }
        
//        if (collision() || Collide(game.as)) {
//            //spdY = setYVelocity();
//            spdY = -1.0D;
//            crdY = game.pn.getPos() - (2 * rd);
//        }
        if (collision()) {
            //spdY = setYVelocity();
            spdY = -1.0D;
            crdY = g2.pn.getPos() - (2 * rd);
        }
        if (collisionSec()) {
            //spdY = setYVelocity();
            spdY = 1.0D;
            crdY = g2.pnc.getPos() + (2 * rd);
        }
        tileStatus(g2.as);
        tileStatus(g2.bs);
        tileStatus(g2.cs);
        tileStatus(g2.ds);
        tileStatus(g2.es);
        tileStatus(g2.fs);
        tileStatus(g2.gs);
        tileStatus(g2.hs);
        tileStatus(g2.is);
        tileStatus(g2.js);
        tileStatus(g2.ks);
        tileStatus(g2.ls);
        tileStatus(g2.ms);
        tileStatus(g2.ns);
        tileStatus(g2.os);
        tileStatus(g2.ps);
        tileStatus(g2.qs);
        tileStatus(g2.rs);
         {

        }
        
        crdX = crdX + spdX;
        crdY = crdY + spdY;
        
    }
    
    public boolean Collide(Tiles T)
 {
   Rectangle r1 = g2.bll.getBounds();
   Rectangle r2 = T.getBounds();
   return r1.intersects(r2);
 }
    
    public void tileStatus(Tiles T){
    if(Collide(T)){
            T.shouldRemove();
            g2.bll.spdY = -1.0D;
            g2.bll.crdY = (T.getY() - (30.0D));
            T = new Tiles(g2, 800.0D, 600.0D);
            T.shouldRemove();
        }
    }

    public double setXVelocity() {
        //replace 320 and 240 with updated map values
        double s = Math.sqrt((Math.pow(Math.abs(400 - this.crdX), 2) + Math.pow(Math.abs(300 - this.crdY), 2)));
        double va = Math.sqrt(Math.pow(spdX, 2) + (2 * acc * s));
        double d = va * (Math.cos(45 * Math.random()));
        return d;

    }

    public double setYVelocity() {
        double s = Math.sqrt((Math.pow(Math.abs(400 - this.crdX), 2) + Math.pow(Math.abs(300 - this.crdY), 2)));
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

    private boolean collisionSec() {
        return g2.pnc.getBounds().intersects(getBounds());
    }
    
    /*private boolean collision() {
        return game.pn.getBounds().intersects(getBounds());
    }*/
    
    private boolean collision() {
        return g2.pn.getBounds().intersects(getBounds());
    }
    
    /*private boolean collisionSec() {
        return game.pn.getBounds().intersects(getBounds());
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
	/*private static final int DIAMETER = 30;
	int x = 0;
	int y = 0;
	int xa = 1;
	int ya = 1;
	private Game game;

	public Ball(Game game) {
		this.game= game;
	}

	void move() {
		if (x + xa < 0)
			xa = 1;
		if (x + xa > game.getWidth() - DIAMETER)
			xa = -1;
		if (y + ya < 0)
			ya = 1;
		if (y + ya > game.getHeight() - DIAMETER)
			game.gameOver();
		if (collision()){
			ya = -1;
			y = game.racquet.getTopY() - DIAMETER;
		}
		x = x + xa;
		y = y + ya;
	}

	private boolean collision() {
		return game.racquet.getBounds().intersects(getBounds());
	}

	public void paint(Graphics2D g) {
		g.fillOval(x, y, DIAMETER, DIAMETER);
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, DIAMETER, DIAMETER);
	}
}*/
