import java.awt.*;
import java.applet.*;

public class AppletTest extends Applet
{
	public void paint(Graphics g)
	{
		g.drawLine(0,0,800,600);
		g.drawLine(0,600,800,0);
		g.drawLine(100,300,700,300);
		g.drawLine(400,100,400,500);
	}
}
