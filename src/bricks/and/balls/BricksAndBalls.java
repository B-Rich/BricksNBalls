/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bricks.and.balls;


import javax.swing.JFrame;
/**
 *
 * @author ThreadCount
 */
public class BricksAndBalls {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame dsplwndw = new JFrame("Bricks and Balls");
        dsplwndw.add(new GamePane());
        dsplwndw.setDefaultCloseOperation(3);
        dsplwndw.setResizable(false);
        dsplwndw.pack();
        dsplwndw.setLocationRelativeTo(null);
        dsplwndw.setVisible(true);
    }
    
}
