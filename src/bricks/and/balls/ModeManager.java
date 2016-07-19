/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bricks.and.balls;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Threadcount
 */
public class ModeManager {

    private GameMode[] Modes;
    private int crrnt;
    private Pause p;
    private boolean Paused;
    public static final int States = 16;
    public static final int Menu = 0;
    public static final int Sector_1 = 2;
    public static final int Sector_2 = 3;
    public static final int Sector_3 = 4;
    public static final int Freeze = 15;

    public void LoadMode(int M) {
        if (M == 0) {
            this.Modes[M] = new Menu(this);
        } else if (M == 1) {
            this.Modes[M] = new SubMenu(this);
        } else if (M == 2) {
            JFrame frame = new JFrame("Bricks and Balls");
            Game game = new Game();
            frame.add(game);
            frame.setBackground(Color.BLACK);
            frame.setSize(800, 600);
            frame.setVisible(true);
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(3);
        //AePlayWave aw = new AePlayWave("E:\\mario_01.wav");
            //aw.start();

            while (true) {
                game.move();
                game.repaint();
                try {
                    Thread.sleep(10);
                } catch (Exception ex) {
                }
            }
        } else if (M == 3) {

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
                try {
                    Thread.sleep(10);
                } catch (Exception ex) {
                }
            }
        }  else if (M == 15) {
            this.Modes[M] = new Freeze(this);
            
        }else if (M == 6) {
            this.Modes[M] = new ModeMenu(this);
            
        } else if (M == 4) {
            JFrame frame = new JFrame();
            Retro game = new Retro();
            JButton button = new JButton("Restart");
            frame.setSize(350, 450);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.add(game);
            frame.add(button, BorderLayout.SOUTH);
            frame.setLocationRelativeTo(null);
            frame.setResizable(false);
            frame.setVisible(true);
            button.addActionListener(game);
            
        }else if (M == 5) {
            JFrame frame = new JFrame("Bricks and Balls");
            GameS gS = new GameS();
            frame.add(gS);
            frame.setBackground(Color.BLACK);
            frame.setSize(800, 600);
            frame.setVisible(true);
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(3);
        //AePlayWave aw = new AePlayWave("E:\\mario_01.wav");
            //aw.start();

            while (true) {
                gS.move();
                gS.repaint();
                try {
                    Thread.sleep(10);
                } catch (Exception ex) {
                }
            }
    }}

    public void ClearMode(int M) {
        this.Modes[M] = null;
    }

    public void setMode(int M) {
        ClearMode(this.crrnt);
        this.crrnt = M;
        LoadMode(this.crrnt);
    }

    public void Pawzd(boolean b) {
        this.Paused = b;
    }

    public void update() {
        if (this.Paused) {
            this.p.update();
            return;
        }
        if (this.Modes[this.crrnt] != null) {
            this.Modes[this.crrnt].update();
        }
    }

    public void draw(Graphics2D grphcs) {
        if (this.Paused) {
            this.p.draw(grphcs);
            return;
        }
        if (this.Modes[this.crrnt] != null) {
            this.Modes[this.crrnt].draw(grphcs);
        } else {
            grphcs.setColor(Color.GRAY);
            grphcs.fillRect(0, 0, 256, 192);
        }
    }

    public ModeManager() {
        this.Modes = new GameMode[16];
        this.p = new Pause(this);
        this.Paused = false;
        this.crrnt = 0;
        LoadMode(this.crrnt);
    }

}
