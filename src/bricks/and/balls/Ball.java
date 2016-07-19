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

public class Ball {

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

    public Ball(Game game) {
        this.game = game;
        try {
            b = ImageIO.read(getClass().getResourceAsStream("/Resources/Ball.png"));
        } catch (Exception excptn) {
            excptn.printStackTrace();
        }
    }
    
    public Ball(Game2 g2) {
        this.g2 = g2;
        try {
            b = ImageIO.read(getClass().getResourceAsStream("/Resources/Ball.png"));
        } catch (Exception excptn) {
            excptn.printStackTrace();
        }
    }
    
    public Ball() {}

//    void move() {
//        if ((crdX + spdX) < 0) {
//            //spdX = setXVelocity();
//            spdX = 1.0D;
//        }
//        if ((crdX + spdX) > game.getWidth() - (2 * rd)) {
//            //spdX = -setXVelocity();
//            spdX = -1.0D;
//        }
//        if ((crdY + spdY) < 0) {
//            //spdY = setYVelocity();
//            spdY = 1.0D;
//        }
//        if ((crdY + spdY) > game.getHeight() - (2 * rd)) {
//            game.Lose();
//        }
////        if (collision() || Collide(game.as)) {
////            //spdY = setYVelocity();
////            spdY = -1.0D;
////            crdY = game.pn.getPos() - (2 * rd);
////        }
//        if (collision()) {
//            //spdY = setYVelocity();
//            spdY = -1.0D;
//            crdY = game.pn.getPos() - (2 * rd);
//        }
//        if(Collide(game.as)){
//            game.as.shouldRemove();
//            spdY = -1.0D;
//            crdY = game.as.getY() - (2 * rd);
//            game.as = new Tiles(game, 640, 480);
//            game.as.shouldRemove();
//        }
//        if(Collide(game.bs)){
//            game.bs.shouldRemove();
//            spdY = -1.0D;
//            crdY = game.bs.getY() - (2 * rd);
//            game.bs = new Tiles(game, 640, 480);
//            game.bs.shouldRemove();
//        }
//        if(Collide(game.cs)){
//            game.cs.shouldRemove();
//            spdY = -1.0D;
//            crdY = game.cs.getY() - (2 * rd);
//            game.cs = new Tiles(game, 640, 480);
//            game.cs.shouldRemove();
//        }
//        if(Collide(game.es)){                        
//            game.es.shouldRemove();
//            spdY = -1.0D;
//            crdY = game.es.getY() - (2 * rd);
//            game.es = new Tiles(game, 640, 480);
//            game.es.shouldRemove();
//        }
//        if(Collide(game.ds)){
//            game.ds.shouldRemove();
//            spdY = -1.0D;
//            crdY = game.ds.getY() - (2 * rd);
//            game.ds = new Tiles(game, 640, 480);
//            game.ds.shouldRemove();
//        }
//        if(Collide(game.fs)){
//            game.fs.shouldRemove();
//            spdY = -1.0D;
//            crdY = game.fs.getY() - (2 * rd);
//            game.fs = new Tiles(game, 640, 480);
//            game.fs.shouldRemove();
//        }
//        if(Collide(game.gs)){
//            game.gs.shouldRemove();
//            game.gs = new Tiles(game, 640, 480);
//            spdY = -1.0D;
//            crdY = game.gs.getY() - (2 * rd);
//            game.gs.shouldRemove();
//        }
//        if(Collide(game.ks)){
//            game.ks.shouldRemove();
//            spdY = -1.0D;
//            crdY = game.ks.getY() - (2 * rd);
//            game.ks = new Tiles(game, 640, 480);
//            game.ks.shouldRemove();
//        }
//        if(Collide(game.hs)){
//            game.hs.shouldRemove();
//            spdY = -1.0D;
//            crdY = game.hs.getY() - (2 * rd);
//            game.hs = new Tiles(game, 640, 480);
//            game.hs.shouldRemove();
//        }
//        if(Collide(game.is)){
//            game.is.shouldRemove();
//            spdY = -1.0D;
//            crdY = game.is.getY() - (2 * rd);
//            game.is = new Tiles(game, 640, 480);
//            game.is.shouldRemove();
//        }
//        
//        crdX = crdX + spdX;
//        crdY = crdY + spdY;
//        
//    }
    
//    void move() {
//        if ((crdX + spdX) < 0) {
//            //spdX = setXVelocity();
//            spdX = 1.0D;
//        }
//        if ((crdX + spdX) > game.getWidth() - (2 * rd)) {
//            //spdX = -setXVelocity();
//            spdX = -1.0D;
//        }
//        if ((crdY + spdY) < 0) {
//            //spdY = setYVelocity();
//            spdY = 1.0D;
//        }
////        if ((crdY + spdY) > game.getHeight() - (2 * rd)) {
////            game.Lose();
////        }
//        if (((crdY + spdY) > game.getHeight() - (2 * rd))) {
//            game.Lose();
//        }
//        
//        if((Tiles.getTileCount() == 0)){
//            game.Advent();
//        }
//        
////        if (collision() || Collide(game.as)) {
////            //spdY = setYVelocity();
////            spdY = -1.0D;
////            crdY = game.pn.getPos() - (2 * rd);
////        }
//        if (collision()) {
//            //spdY = setYVelocity();
//            spdY = -1.0D;
//            crdY = game.pn.getPos() - (2 * rd);
//        }
//        /*if (collisionSec()) {
//            //spdY = setYVelocity();
//            spdY = -1.0D;
//            crdY = game.pn2.getPos() - (2 * rd);
//        }*/
//        tileStatus(game.as);
//        tileStatus(game.bs);
//        tileStatus(game.cs);
//        tileStatus(game.ds);
//        tileStatus(game.es);
//        tileStatus(game.fs);
//        tileStatus(game.gs);
//        tileStatus(game.hs);
//        tileStatus(game.is);
//        tileStatus(game.js);
//        tileStatus(game.ks);
//         {
//
//        }
//        
//        crdX = crdX + spdX;
//        crdY = crdY + spdY;
//        
//    }
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
            game.Lose();
        }
        
        if((Tiles.getTileCount() == 0)){
            Timer T = new Timer(100, null);
            T.start();
            game.Advent();
        }
        
//        if (collision() || Collide(game.as)) {
//            //spdY = setYVelocity();
//            spdY = -1.0D;
//            crdY = game.pn.getPos() - (2 * rd);
//        }
        if (collision()) {
            //spdY = setYVelocity();
            spdY = -1.0D;
            crdY = game.pn.getPos() - (2 * rd);
        }
        /*if (collisionSec()) {
            //spdY = setYVelocity();
            spdY = -1.0D;
            crdY = g2.pnc.getPos() - (2 * rd);
        }*/
        tileStatus(game.as);
        tileStatus(game.bs);
        tileStatus(game.cs);
        tileStatus(game.ds);
        tileStatus(game.es);
        tileStatus(game.fs);
        tileStatus(game.gs);
        tileStatus(game.hs);
        tileStatus(game.is);
        tileStatus(game.js);
        tileStatus(game.ks);
        tileStatus(game.ls);
        tileStatus(game.ms);
        tileStatus(game.ns);
        tileStatus(game.os);
        tileStatus(game.ps);
        tileStatus(game.qs);
        tileStatus(game.rs);
         {

        }
        
        crdX = crdX + spdX;
        crdY = crdY + spdY;
        
    }
    
    public boolean Collide(Tiles T)
 {
   Rectangle r1 = game.bll.getBounds();
   Rectangle r2 = T.getBounds();
   return r1.intersects(r2);
 }
    
    public void tileStatus(Tiles T){
    if(Collide(T)){
            T.shouldRemove();
            game.bll.spdY = -1.0D;
            game.bll.crdY = (T.getY() - (30.0D));
            T = new Tiles(game, 800, 600);
            T.shouldRemove();
        }
    }

    /*void move() {
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
     y = game.pn.getPos() - DIAMETER;
     }
     x = x + xa;
     y = y + ya;
     }*/
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

    /*private boolean collisionSec() {
        return g2.pnc.getBounds().intersects(getBounds());
    }*/
    
    /*private boolean collision() {
        return game.pn.getBounds().intersects(getBounds());
    }*/
    
    private boolean collision() {
        return game.pn.getBounds().intersects(getBounds());
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
