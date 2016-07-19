/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package minidx;

 import java.awt.Graphics2D;
 import java.awt.Rectangle;
 import java.awt.event.KeyEvent;
 import java.awt.image.BufferedImage;
 import javax.imageio.ImageIO;

 /**
 *
 * @author Threadcount
 */
/*public class Tiles {

 private static final int w = 40;
 private static final int h = 10;
 int x = 70;
 int y = 50;
 private BufferedImage b;
 private Game game;

 public Tiles(Game game) {
 this.game = game;
 }

 public void draw(Graphics2D grphcs, int r, int c) {
 /*for (int i = 0; i < this.length; i++) {
 if (this[i] != null) {
 g.fill3DRect(this[i].x, this[i].y, this[i].width,
 this[i].height, true);*/
/*grphcs.fillRect(x*c, y*r, w, h);
 }*/
/*public Rectangle getBounds() {
 return new Rectangle(x, y, w, h);
 }*/
//}
/*public boolean Collide(Tiles P)
 {
 Rectangle r1 = getBounds();
 Rectangle r2 = P.getBounds();
 return r1.intersects(r2);
 }*/
package bricks.and.balls;

/**
 *
 * @author Threadcount
 */
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Tiles {

    private enum TileName {

        Tiles1, Tiles2, Tiles3, Tiles4, Tiles5, Tiles6
    };
    private static final int pos = 480;
    private static final int w = 60;
    private static final int h = 10;
    private double x;
    private double y;
    private BufferedImage a,b,c,d,e,f;
    //private BufferedImage b;
    private boolean shouldRemove = false;
    private Game game;
    private Game2 g2;
    private GameS gS;
    private static int tlCnt = 0;

    public Tiles(Game game, double x, double y) {
        this.game = game;
        this.x = x;
        this.y = y;
        tlCnt++;
        try {
            a = ImageIO.read(getClass().getResourceAsStream("/Resources/Tiles1.png"));
            b = ImageIO.read(getClass().getResourceAsStream("/Resources/Tiles2.png"));
            c = ImageIO.read(getClass().getResourceAsStream("/Resources/Tiles3.png"));
            d = ImageIO.read(getClass().getResourceAsStream("/Resources/Tiles4.png"));
            e = ImageIO.read(getClass().getResourceAsStream("/Resources/Tiles5.png"));
            f = ImageIO.read(getClass().getResourceAsStream("/Resources/Tiles6.png"));
        } catch (Exception excptn) {
            excptn.printStackTrace();
        }
    }
    
    public Tiles(Game2 g2,double x, double y) {
        this.g2 = g2;
        this.x = x;
        this.y = y;
        tlCnt++;
        try {
            a = ImageIO.read(getClass().getResourceAsStream("/Resources/Tiles1.png"));
            b = ImageIO.read(getClass().getResourceAsStream("/Resources/Tiles2.png"));
            c = ImageIO.read(getClass().getResourceAsStream("/Resources/Tiles3.png"));
            d = ImageIO.read(getClass().getResourceAsStream("/Resources/Tiles4.png"));
            e = ImageIO.read(getClass().getResourceAsStream("/Resources/Tiles5.png"));
            f = ImageIO.read(getClass().getResourceAsStream("/Resources/Tiles6.png"));
        } catch (Exception excptn) {
            excptn.printStackTrace();
        }
    }
    
    public Tiles(GameS gS,double x, double y) {
        this.gS = gS;
        this.x = x;
        this.y = y;
        tlCnt++;
        try {
            a = ImageIO.read(getClass().getResourceAsStream("/Resources/Tiles1.png"));
            b = ImageIO.read(getClass().getResourceAsStream("/Resources/Tiles2.png"));
            c = ImageIO.read(getClass().getResourceAsStream("/Resources/Tiles3.png"));
            d = ImageIO.read(getClass().getResourceAsStream("/Resources/Tiles4.png"));
            e = ImageIO.read(getClass().getResourceAsStream("/Resources/Tiles5.png"));
            f = ImageIO.read(getClass().getResourceAsStream("/Resources/Tiles6.png"));
        } catch (Exception excptn) {
            excptn.printStackTrace();
        }
    }
    
    public boolean Collide(Tiles T)
 {
   Rectangle r1 = game.bll.getBounds();
   Rectangle r2 = T.getBounds();
   return r1.intersects(r2);
 }
 
    /*private boolean collision() {
        return (game.as.getBounds().intersects(getBounds()) || 
                game.bs.getBounds().intersects(getBounds()) || 
                game.cs.getBounds().intersects(getBounds()) ||
                game.ds.getBounds().intersects(getBounds()) ||
                game.es.getBounds().intersects(getBounds()));
    }*/
    
    /*private boolean collision() {
        return game.bll.getBounds().intersects(getBounds());
    }*/

    /*
    }*/
    
    public void populateTiles(Tiles[] TA){
        for(int i = 0 ; i < TA.length ; i++){
            TA[i] = new Tiles(game, 200+(i*20), 200+(i*20));
        }
    }
    
    public void drawTiles(Tiles[] TA, Graphics2D grphcs){
        for(int i = 0 ; i < TA.length ; i++){
            if(i%6 == 1)
            TA[i].drawa(grphcs);
            if(i%6 == 2)
            TA[i].drawb(grphcs);
            if(i%6 == 3)
            TA[i].drawc(grphcs);
            if(i%6 == 4)
            TA[i].drawd(grphcs);
            if(i%6 == 5)
            TA[i].drawe(grphcs);
            if(i%6 == 0)
            TA[i].drawf(grphcs);
        }
    }
    
    
    public void drawa(Graphics2D grphcs) {
        if(this.shouldRemove == false)
        grphcs.drawImage(a, (int)this.getX(), (int)this.getY(), null);
    }
    public void drawb(Graphics2D grphcs) {
        if(this.shouldRemove == false)
        grphcs.drawImage(b, (int)this.getX(), (int)this.getY(), null);
    }
    public void drawc(Graphics2D grphcs) {
        if(this.shouldRemove == false)
        grphcs.drawImage(c, (int)this.getX(), (int)this.getY(), null);
    }
    public void drawd(Graphics2D grphcs) {
        if(this.shouldRemove == false)
        grphcs.drawImage(d, (int)this.getX(), (int)this.getY(), null);
    }
    public void drawe(Graphics2D grphcs) {
        if(this.shouldRemove == false)
        grphcs.drawImage(e, (int)this.getX(), (int)this.getY(), null);
    }
    public void drawf(Graphics2D grphcs) {
        if(this.shouldRemove == false)
        grphcs.drawImage(f, (int)this.getX(), (int)this.getY(), null);
    }



/*public void drawa(Graphics2D grphcs, int i, int j) {
        try {
            b = ImageIO.read(new File("/Resources/Tiles1.png"));
        } catch (Exception excptn) {
            excptn.printStackTrace();
        }
        if(this.shouldRemove == false)
        grphcs.drawImage(b, i, j, null);
    }

    public void drawb(Graphics2D grphcs, int i, int j) {
        try {
            b = ImageIO.read(new File("Resources/Tiles2.png"));
        } catch (Exception excptn) {
            excptn.printStackTrace();
        }
        if(this.shouldRemove == false){
        grphcs.drawImage(b, i, j, null);}
    }

    public void drawc(Graphics2D grphcs, int i, int j) {
        try {
            b = ImageIO.read(new File("/Resources/Tiles3.png"));
        } catch (Exception excptn) {
            excptn.printStackTrace();
        }
        if(this.shouldRemove == false)
        grphcs.drawImage(b, i, j, null);
    }

    public void drawd(Graphics2D grphcs, int i, int j) {
        try {
            b = ImageIO.read(new File("/Resources/Tiles4.png"));
        } catch (Exception excptn) {
            excptn.printStackTrace();
        }
        if(this.shouldRemove == false)
        grphcs.drawImage(b, i, j, null);
    }

    public void drawe(Graphics2D grphcs, int i, int j) {
        try {
            b = ImageIO.read(new File("/Resources/Tiles5.png"));
        } catch (Exception excptn) {
            excptn.printStackTrace();
        }
        if(this.shouldRemove == false)
        grphcs.drawImage(b, i, j, null);
    }

    public void drawf(Graphics2D grphcs, int i, int j) {
        try {
            b = ImageIO.read(new File("/Resources/Tiles6.png"));
        } catch (Exception excptn) {
            excptn.printStackTrace();
        }
        if(this.shouldRemove == false)
        grphcs.drawImage(b, i, j, null);
    }*/

    


    /*public void drawa(Graphics2D grphcs, int i, int j) {
        try {
            b = ImageIO.read(getClass().getResourceAsStream("/Resources/Tiles1.png"));
        } catch (Exception excptn) {
            excptn.printStackTrace();
        }
        if(this.shouldRemove == false)
        grphcs.drawImage(b, i, j, null);
    }

    public void drawb(Graphics2D grphcs, int i, int j) {
        try {
            b = ImageIO.read(getClass().getResourceAsStream("/Resources/Tiles2.png"));
        } catch (Exception excptn) {
            excptn.printStackTrace();
        }
        if(this.shouldRemove == false){
        grphcs.drawImage(b, i, j, null);}
    }

    public void drawc(Graphics2D grphcs, int i, int j) {
        try {
            b = ImageIO.read(getClass().getResourceAsStream("/Resources/Tiles3.png"));
        } catch (Exception excptn) {
            excptn.printStackTrace();
        }
        if(this.shouldRemove == false)
        grphcs.drawImage(b, i, j, null);
    }

    public void drawd(Graphics2D grphcs, int i, int j) {
        try {
            b = ImageIO.read(getClass().getResourceAsStream("/Resources/Tiles4.png"));
        } catch (Exception excptn) {
            excptn.printStackTrace();
        }
        if(this.shouldRemove == false)
        grphcs.drawImage(b, i, j, null);
    }

    public void drawe(Graphics2D grphcs, int i, int j) {
        try {
            b = ImageIO.read(getClass().getResourceAsStream("/Resources/Tiles5.png"));
        } catch (Exception excptn) {
            excptn.printStackTrace();
        }
        if(this.shouldRemove == false)
        grphcs.drawImage(b, i, j, null);
    }

    public void drawf(Graphics2D grphcs, int i, int j) {
        try {
            b = ImageIO.read(getClass().getResourceAsStream("/Resources/Tiles6.png"));
        } catch (Exception excptn) {
            excptn.printStackTrace();
        }
        if(this.shouldRemove == false)
        grphcs.drawImage(b, i, j, null);
    }*/

    public Rectangle getBounds() {
        return new Rectangle((int)this.getX(),(int)this.getY(), w, h);
    }

    public double getX() {
        return this.x;
    }
    
    public double getY() {
        return this.y;
    }
    
    public void shouldRemove(){
        this.shouldRemove = true;
        tlCnt--;
    }
    
    public static int getTileCount(){
        return tlCnt;
    }
    
//    public void tileStatus(Tiles T){
//    if(Collide(T)){
//            T.shouldRemove();
//            game.bll.setYspd(-1.0D);
//            game.bll.setYcrd(T.getY() - (30.0D));
//            T = new Tiles(game, 640, 480);
//            T.shouldRemove();
//        }
//    }
    
//    public void tileStatus(){
//    if(Collide(this)){
//            this.shouldRemove();
//            game.bll.setYspd(-1.0D);
//            game.bll.setYcrd(this.getY() - (30.0D));
//            this = new Tiles(game, 640, 480);
//            this.shouldRemove();
//        }
//    }
    
    
    
    /*public void SetDirection(Tiles T)
 {
   if(game.bll.getY() >= T.getY())

 }*/
    
}



