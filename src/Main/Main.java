package Main;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Toolkit;

import java.awt.Graphics2D;
import java.awt.Graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Stage3.*;
import Stage4.Stage4;

public class Main extends JPanel {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public static JFrame gameFrame = new JFrame();
    public static int width = Toolkit.getDefaultToolkit().getScreenSize().width;
    public static int height = Toolkit.getDefaultToolkit().getScreenSize().height;
    public static GameState state;

    public static Stage3 three = new Stage3();
    public static Stage4 four = new Stage4();
    public static Menu menu = new Menu();
    public static Rules rules = new Rules();


    public static void main(String[] args) {

        gameFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //gameFrame.setUndecorated(true);
        gameFrame.setSize(Main.width, Main.height);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //menu = new Menu();
        gameFrame.add(menu);
        gameFrame.setVisible(true);
       // System.out.println("hello");
    }

    public Main()
    {
       
    }


   
}