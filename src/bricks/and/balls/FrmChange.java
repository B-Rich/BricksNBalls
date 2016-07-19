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
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import bricks.and.balls.Game;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FrmChange extends JFrame{

//private JPanel panel1 = new JPanel();
//private JPanel panel2 = new JPanel();
public Game game = new Game();
public Game2 g2 = new Game2();

public FrmChange(){
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    initMenu();
//    panel1.setBackground(Color.BLUE);
//    panel2.setBackground(Color.RED);
    setLayout(new BorderLayout());
}

private class MenuAction implements ActionListener {

    private JPanel panel;
    private MenuAction(JPanel pnl) {
        this.panel = pnl;
    }

    public void actionPerformed(ActionEvent e) {
        changePanel(panel);

    }

}

private void initMenu() {
    JMenuBar menubar = new JMenuBar();
    JMenu menu = new JMenu("Menu");
    JMenuItem menuItem1 = new JMenuItem("Single Player");
    JMenuItem menuItem2 = new JMenuItem("Multiplayer");
    JMenuItem menuItem3 = new JMenuItem("Bouncin'");
    menubar.add(menu);
    menu.add(menuItem1);
    menu.add(menuItem2);
    menu.add(menuItem3);
    setJMenuBar(menubar);
    menuItem1.addActionListener(new MenuAction(game));
    menuItem2.addActionListener(new MenuAction(g2));
    menuItem3.addActionListener(new MenuAction(g2));

}

private void changePanel(JPanel panel) {
    getContentPane().removeAll();
    getContentPane().add(panel, BorderLayout.CENTER);
    getContentPane().doLayout();
    update(getGraphics());
}

public static void main(String[] args) {
    FrmChange frame = new FrmChange();
    frame.setSize(800, 600);
    frame.setVisible(true);
    while(true){
    }

}
}
