/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bricks.and.balls;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import javax.imageio.ImageIO;

/**
 *
 * @author Threadcount
 */
public class ModeMenu extends GameMode {

    private BufferedImage h;
    private int crrnt = 0;
    private String[] optns = {"Single Player", "Multiplayer"};
    private Color c;
    private Font F;
    private Font f1;
    private Font f2;
    private BufferedImage bk;

    public ModeMenu(ModeManager MM) {
        super(MM);
        try {
            this.h = ImageIO.read(getClass().getResourceAsStream("/Resources/CrystalBallLD.png"));
            this.c = Color.WHITE;
            this.F = new Font("Calibri", 0, 20);
            this.f1 = new Font("Arial", 0, 14);
            this.f2 = new Font("Arial", 0, 10);
        } catch (Exception expctn) {
            expctn.printStackTrace();
        }
    }

    public void init() {
    }

    public void update() {
        ModeHandler();
    }

    public void draw(Graphics2D grphcs) {
        grphcs.setColor(java.awt.Color.BLACK);
        grphcs.fillRect(0, 0, 256, 192);
        grphcs.setColor(java.awt.Color.WHITE);
        grphcs.setFont(this.F);
        //grphcs.drawImage(this.bk, 70, 20, null);
        grphcs.drawString("Bricks and Balls", 100, 90);
        grphcs.drawString("Normal", 105, 165);
        grphcs.drawString("Ballsanity", 105, 185);
        //grphcs.drawString("Exit", 105, 205);

        if (this.crrnt == 0) {
            grphcs.drawImage(this.h, 85, 154, null);
        } else if (this.crrnt == 1) {
            grphcs.drawImage(this.h, 85, 174, null);
        }
        grphcs.setFont(this.f2);
        grphcs.drawString("O.N.O. Studios © ", 10, 232);
    }

    public void select() {
        if (this.crrnt == 0) {
            //Save.init();
            this.MdMngr.setMode(2);
        } else if (this.crrnt == 1) {
            this.MdMngr.setMode(5);
        }
    }

    public void ModeHandler() {
        if (Keys.isPressed(Keys.Enter)) {
            select();
        }
        if ((Keys.isPressed(Keys.Up)) && (this.crrnt > 0)) {
            this.crrnt -= 1;
        }
        if ((Keys.isPressed(Keys.Dwn)) && (this.crrnt < this.optns.length - 1)) {
            this.crrnt += 1;
        }

    }
    
}
