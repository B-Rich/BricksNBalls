///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package minidx;
//
///**
// *
// * @author Threadcount
// */
//import java.awt.Color;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.Rectangle;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//
//public class Game extends GameMode {
//
//    Ball bll = new Ball(this);
//    Pane pn = new Pane(this);
//    Bckgrnd bk = new Bckgrnd(this);
//    Tiles[] ts = new Tiles[5];
//    Tiles as = new Tiles(this, 280.0D, 200.0D);
//    Tiles bs = new Tiles(this, 320.0D, 200.0D);
//    Tiles cs = new Tiles(this, 360.0D, 200.0D);
//    Tiles ds = new Tiles(this, 400.0D, 200.0D);
//    Tiles es = new Tiles(this, 440.0D, 200.0D);
//    Tiles fs = new Tiles(this, 480.0D, 200.0D);
//    Tiles gs = new Tiles(this, 520.0D, 200.0D);
//    Tiles hs = new Tiles(this, 320.0D, 220.0D);
//    Tiles is = new Tiles(this, 360.0D, 220.0D);
//    Tiles js = new Tiles(this, 400.0D, 220.0D);
//    Tiles ks = new Tiles(this, 440.0D, 220.0D);
//    /*ts[0] = new Tiles(this);
//    ts[1] = new Tiles(this);
//    ts[2] = new Tiles(this);
//    ts[3] = new Tiles(this);
//    ts[4] = new Tiles(this);*/
//    
//    //Rectangle[] ts = new Rectangle[12];
//
//    public Game() {
//        super(MM);
//        addKeyListener(new KeyListener() {
//
//            public void keyTyped(KeyEvent e) {
//            }
//
//            public void keyReleased(KeyEvent e) {
//                pn.keyReleased(e);
//            }
//
//            public void keyPressed(KeyEvent e) {
//                pn.keyPressed(e);
//            }
//        });
//        setFocusable(true);
//    }
//    
//  /*public void PopulateTiles(){
//    Tiles as = new Tiles(this);
//    Tiles bs = new Tiles(this);
//    Tiles cs = new Tiles(this);
//    Tiles ds = new Tiles(this);
//    Tiles es = new Tiles(this);
//    Tiles fs = new Tiles(this);
//    Tiles gs = new Tiles(this);
//    Tiles hs = new Tiles(this);
//    Tiles is = new Tiles(this);
//    Tiles js = new Tiles(this);
//    Tiles ks = new Tiles(this);
//    }*/
//
//    private void move() {
//        bll.move();
//        pn.move();
//        /*as.move();
//        bs.move();
//        cs.move();
//        ds.move();
//        es.move();
//        fs.move();
//        gs.move();
//        hs.move();
//        is.move();
//        js.move();
//        ks.move();*/
//    }
//    
////    public void init(){
////        Graphics2D grphcs = (Graphics2D) this.getGraphics();
////        as.drawa(grphcs, 280, 200);
////        bs.drawb(grphcs, 320, 200);
////        cs.drawc(grphcs, 360, 200);
////        ds.drawd(grphcs, 400, 200);
////        es.drawe(grphcs, 440, 200);
////        fs.drawf(grphcs, 480, 200);
////        js.drawe(grphcs, 520, 200);
////        gs.drawe(grphcs, 320, 220);
////        hs.drawd(grphcs, 360, 220);
////        is.drawc(grphcs, 400, 220);
////        js.drawb(grphcs, 440, 220);
////        ks.drawa(grphcs, 480, 220);
////    }
//    
//
//    public void paint(Graphics g) {
//        super.paint(g);
//        Graphics2D grphcs = (Graphics2D) g;
//        bk.draw(grphcs);
//        bll.draw(grphcs);
//        pn.draw(grphcs);
//        as.drawa(grphcs, 280, 200);
//        bs.drawb(grphcs, 320, 200);
//        cs.drawc(grphcs, 360, 200);
//        ds.drawd(grphcs, 400, 200);
//        es.drawe(grphcs, 440, 200);
//        fs.drawf(grphcs, 480, 200);
//        js.drawe(grphcs, 520, 200);
//        gs.drawe(grphcs, 320, 220);
//        hs.drawd(grphcs, 360, 220);
//        is.drawc(grphcs, 400, 220);
//        js.drawb(grphcs, 440, 220);
//        ks.drawa(grphcs, 480, 220);
//        /*for (int i = 0; i < ts.length; i++) {
//            if (ts[i] != null) {
//                ts[i].draw(grphcs,50+(i*50),50+(i*50));
//            }
//        }*/
//    }
//
//    public void Lose() {
//        System.exit(0);
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//        JFrame frame = new JFrame("Bricks and Balls");
//        Game game = new Game();
//        frame.add(game);
//        frame.setBackground(Color.BLACK);
//        frame.setSize(800, 600);
//        frame.setVisible(true);
//        frame.setResizable(false);
//        frame.setLocationRelativeTo(null);
//        frame.setDefaultCloseOperation(3);
//        //AePlayWave aw = new AePlayWave("E:\\mario_01.wav");
//        //aw.start();
//
//        while (true) {
//            game.move();
//            game.repaint();
//            Thread.sleep(10);
//        }
//    }
//    
//}
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
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Game2 extends JPanel{

    private BufferedImage img;
    private Graphics2D grphc;
    //private ModeManager MM;
    private boolean rcrdng = false;
    private int rcrdngcnt = 0;
    private boolean scrnsht;
    BallClone bll = new BallClone(this);
    Pane pn = new Pane(this);
    PaneClone pnc = new PaneClone(this);
    Bckgrnd bk = new Bckgrnd(this);
    Tiles[] ts = new Tiles[36];
    Tiles as = new Tiles(this, 280.0D, 200.0D);
    Tiles bs = new Tiles(this, 320.0D, 200.0D);
    Tiles cs = new Tiles(this, 360.0D, 200.0D);
    Tiles ds = new Tiles(this, 400.0D, 200.0D);
    Tiles es = new Tiles(this, 440.0D, 200.0D);
    Tiles fs = new Tiles(this, 480.0D, 200.0D);
    Tiles gs = new Tiles(this, 520.0D, 200.0D);
    Tiles hs = new Tiles(this, 320.0D, 220.0D);
    Tiles is = new Tiles(this, 360.0D, 220.0D);
    Tiles js = new Tiles(this, 400.0D, 220.0D);
    Tiles ks = new Tiles(this, 440.0D, 220.0D);
    Tiles ls = new Tiles(this, 480.0D, 220.0D);
    Tiles ms = new Tiles(this, 520.0D, 220.0D);
    Tiles ns = new Tiles(this, 280.0D, 240.0D);
    Tiles os = new Tiles(this, 320.0D, 240.0D);
    Tiles ps = new Tiles(this, 360.0D, 240.0D);
    Tiles qs = new Tiles(this, 400.0D, 240.0D);
    Tiles rs = new Tiles(this, 440.0D, 240.0D); 
    private Graphics2D b;
    /*ts[1] = new Tiles(this);
    ts[2] = new Tiles(this);
    ts[3] = new Tiles(this);
    ts[4] = new Tiles(this);*/
    
    //Rectangle[] ts = new Rectangle[12];

    public Game2() {
        
        
        addKeyListener(new KeyListener() {

            public void keyTyped(KeyEvent e) {
            }

            public void keyReleased(KeyEvent e) {
                pn.keyReleased(e);
                pnc.keyReleased(e);
            }

            public void keyPressed(KeyEvent e) {
                pn.keyPressed(e);
                pnc.keyPressed(e);
            }
        });
        
        setFocusable(true);
    }
    
  /*public void PopulateTiles(){
    Tiles as = new Tiles(this);
    Tiles bs = new Tiles(this);
    Tiles cs = new Tiles(this);
    Tiles ds = new Tiles(this);
    Tiles es = new Tiles(this);
    Tiles fs = new Tiles(this);
    Tiles gs = new Tiles(this);
    Tiles hs = new Tiles(this);
    Tiles is = new Tiles(this);
    Tiles js = new Tiles(this);
    Tiles ks = new Tiles(this);
    }*/
    
    public void populateTiles(Tiles[] TA){
        for(int i = 0 ; i < TA.length ; i++){
            TA[i] = new Tiles(this, 200+(i*20), 200+(i*20));
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

    public void move() {
        bll.move();
        pn.move();
        pnc.move();
    }
    
//    public void draw(){
//        as.drawa(this.b, 280, 200);
//        bs.drawb(this.b, 320, 200);
//        cs.drawc(this.b, 360, 200);
//        ds.drawd(this.b, 400, 200);
//        es.drawe(this.b, 440, 200);
//        fs.drawf(this.b, 480, 200);
//        js.drawe(this.b, 520, 200);
//        gs.drawe(this.b, 320, 220);
//        hs.drawd(this.b, 360, 220);
//        is.drawc(this.b, 400, 220);
//        js.drawb(this.b, 440, 220);
//        ks.drawa(this.b, 480, 220);
//    }
    

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D grphcs = (Graphics2D) g;
        bk.draw(grphcs);
        bll.draw(grphcs);
        pn.draw(grphcs);
        pnc.draw(grphcs);
        as.drawa(grphcs);
        bs.drawb(grphcs);
        cs.drawc(grphcs);
        ds.drawd(grphcs);
        es.drawe(grphcs);
        fs.drawf(grphcs);
//        js.drawe(grphcs, 520, 200);
        gs.drawe(grphcs);
        hs.drawd(grphcs);
        is.drawc(grphcs);
        js.drawb(grphcs);
        ks.drawa(grphcs);
        ls.drawe(grphcs);
        ms.drawd(grphcs);
        ns.drawc(grphcs);
        os.drawb(grphcs);
        ps.drawa(grphcs);
        qs.drawe(grphcs);
        rs.drawd(grphcs);
        /*for (int i = 0; i < ts.length; i++) {
            if (ts[i] != null) {
                ts[i].draw(grphcs,50+(i*50),50+(i*50));
            }
        }*/
    }
    
    public void drawToScreen(){
        Graphics g = getGraphics();
        g.drawImage(this.img, 0, 0, 800, 600, null);
        g.dispose();
        if(this.scrnsht){
            this.scrnsht = false;
            try{
                File o = new File("ScreenShot" + System.nanoTime() + ".jpg");
                ImageIO.write(this.img, "jpg", o);
            }
            catch(Exception expctn){}
            if(!this.rcrdng)
                return;
            try{
                File o = new File("C:\\o\\vd" + this.rcrdngcnt + ".jpg");
                ImageIO.write(this.img, "jpg", o);
                this.rcrdngcnt++;
            }
            catch(Exception expctn){}
        }
    }

    public void LoseMe() {
        JOptionPane.showMessageDialog(this, "Player 1 missed! Game over! Try again.");
        System.exit(0);
    }
    
    public void LoseYou() {
        JOptionPane.showMessageDialog(this, "Player 2 missed! Game over! Try again.");
        System.exit(0);
    }
    
    public void Advent() {
        JOptionPane.showMessageDialog(this, "Stage Cleared");
        Ball bll = new Ball();
        Pane pn = new Pane(this);
        PaneClone pnc = new PaneClone(this);
        Bckgrnd bk = new Bckgrnd(this);
        as = new Tiles(this, 280.0D, 200.0D);
        bs = new Tiles(this, 320.0D, 200.0D);
        cs = new Tiles(this, 360.0D, 200.0D);
        ds = new Tiles(this, 400.0D, 200.0D);
        es = new Tiles(this, 440.0D, 200.0D);
        fs = new Tiles(this, 480.0D, 200.0D);
        gs = new Tiles(this, 520.0D, 200.0D);
        hs = new Tiles(this, 320.0D, 220.0D);
        is = new Tiles(this, 360.0D, 220.0D);
        js = new Tiles(this, 400.0D, 220.0D);
        ks = new Tiles(this, 440.0D, 220.0D);
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Bricks and Balls");
        Game2 g2 = new Game2();
        frame.add(g2);
        frame.setBackground(Color.BLACK);
        frame.setSize(800, 600);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(3);
        //AePlayWave aw = new AePlayWave("E:\\mario_01.wav");
        //aw.start();

        while (true) {
            g2.move();
            g2.repaint();
            Thread.sleep(10);
        }
    }
    
}

