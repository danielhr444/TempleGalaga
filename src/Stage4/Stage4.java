package Stage4;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import Main.*;

public class Stage4 {
    public static JFrame gameFrame = new JFrame();
    GamePanel gp = new GamePanel();
    static int width = Toolkit.getDefaultToolkit().getScreenSize().width;
    static int height = Toolkit.getDefaultToolkit().getScreenSize().height;
    //static int height = 600;
    /*
    public static void main(String[] args) {
       Stage4 s4 = new Stage4();
       s4.setup();
    }
    */
    public void setup() {
        gameFrame.add(gp);
        gameFrame.setPreferredSize(new Dimension(width, height));
        gameFrame.pack();
        gameFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //gameFrame.setUndecorated(true);
        gameFrame.setVisible(true);
        gameFrame.setSize(width, height);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.add(gp);
        gp.startGame();
        gameFrame.addKeyListener(gp);
    }

}