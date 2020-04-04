package Main;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class MouseInput extends MouseAdapter
{
	public MouseInput()
	{
		
	}
	
	public void mouseClicked(MouseEvent e)
	{
        
        if(Main.state == GameState.Menu)
        {
			//System.out.println(e.getLocationOnScreen());
			//System.out.println(e.getX() > Main.width/5 + " and " + );
            if(e.getX() > Main.width/5 && e.getX() < 2 * Main.width/5 && e.getY() > Main.height/15 && e.getY() < 7 * Main.height/15 + 100)
			{
				//System.out.println(e.getX() + " yo " + e.getY());
				Main.state = GameState.Stage3;
				Main.gameFrame.setVisible(false);
				Main.three.init();
			}
			
			if(e.getX() > (Main.width/7) * 5 && e.getX() < (Main.width/8) * 7 && e.getY() > Main.height/15 && e.getY() < 7 * Main.height/15 + 100)
			{
				//System.out.println(e.getX() + " yo " + e.getY());
				Main.state = GameState.Stage4;
				Main.gameFrame.setVisible(false);
				Main.four.setup();
			}
        }
        
    }
	

}