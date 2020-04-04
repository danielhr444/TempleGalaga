package Main;

import javax.swing.JPanel;

import javax.swing.JPanel;
import javax.swing.JFrame;

import java.awt.Graphics2D;
import java.awt.Graphics;

import java.awt.Color;
import java.awt.Font;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Rules extends JPanel implements KeyListener {
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    
    public static JFrame ruleFrame;

    public Rules()
    {
       // Main.state = GameState.Rules;
        ruleFrame = new JFrame();
        ruleFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //ruleFrame.setUndecorated(true);
        ruleFrame.setSize(Main.width, Main.height);
        ruleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //menu = new Menu();
        ruleFrame.add(this);
        //Main.gameFrame.setVisible(false);
        //ruleFrame.setVisible(true);
    }

    public void init()
    {
        //ruleFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //ruleFrame.setUndecorated(true);
        //ruleFrame.setSize(Main.width, Main.height);
        //ruleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //menu = new Menu();
        //ruleFrame.add(this);
        Main.gameFrame.setVisible(false);
        ruleFrame.setVisible(true);
    }
  
    protected void paintComponent(Graphics g)
    {
        if(Main.state == GameState.Rules)
        {
            super.paintComponent(g);
            // setBackground(Color.WHITE);
             g.setColor(Color.black);
             g.fillRect(0, 0, Main.width, Main.height);
             g.setFont(new Font("Times New Roman", 0, 48));
             g.setColor(Color.red);
             g.drawString("Rules. ESC to leave/quit", Main.width/2 - 75, Main.height/5);
             g.drawString("The Sandstorm: Use W, S, D to move", Main.width/5, Main.height/2);
             g.drawString("The Cubes: You move in a circular pattern. Arrow keys to move. Hold spacebar to fire", (Main.width/7) * 5, Main.height/2);
             //g.setColor(Color.white);
             //g.clearRect((int) width/5, (int) 7 * height/15, 150, 45);
             //g.setColor(Color.black);
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent e) {
       
        if(e.getKeyCode() == KeyEvent.VK_ESCAPE)
		{
			ruleFrame.setVisible(false);
			Main.gameFrame.setVisible(true);
			Main.state = GameState.Menu;
		}


    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }
}