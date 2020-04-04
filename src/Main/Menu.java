package Main;

import javax.swing.JPanel;
import javax.swing.JFrame;

import java.awt.Graphics2D;
import java.awt.Graphics;

import java.awt.Color;
import java.awt.Font;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Menu extends JPanel implements KeyListener{
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public Menu()
    {
        Main.gameFrame.addMouseListener(new MouseInput());
        Main.state = GameState.Menu;
    }

    protected void paintComponent(Graphics g)
    {
        if(Main.state == GameState.Menu)
        {
            super.paintComponent(g);
            // setBackground(Color.WHITE);
             g.setColor(Color.black);
             g.fillRect(0, 0, Main.width, Main.height);
             g.setFont(new Font("Times New Roman", 0, 48));
             g.setColor(Color.red);
             g.drawString("Escape...", Main.width/2 - 75, Main.height/5);
             g.drawString("The Sandstorm", Main.width/5, Main.height/2);
             g.drawString("The Cubes", (Main.width/7) * 5, Main.height/2);
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
        // TODO Auto-generated method stub
        if(e.getKeyCode() == KeyEvent.VK_ESCAPE)
		{
            Main.state = GameState.Rules;
            Main.rules.init();
		}
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }

}