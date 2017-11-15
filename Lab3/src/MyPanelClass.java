import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JPanel;
import java.awt.Polygon;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width+1, height+1);
                        
                        //Draw a border
                        g.setColor(Color.BLACK);
                        g.drawRect(x1, y1, width, height);
                        
//                        //Draw a 2nd border
//                        g.setColor(Color.WHITE);
//                        g.drawRect(x1+5, y1+5, width-10, height-10);
                        
                        //Draw Line
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, y1+30, x2, 30);
                        
                        
                        //Draw Line
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, y1+90, x2, 30);
                        
                      //Draw Triangle
                      Polygon triangle = new Polygon();
                      triangle.addPoint(x1, y1);
                      triangle.addPoint(x1 + 115, y1 + 75);
                      triangle.addPoint(x1, y2);
                      g.setColor(Color.BLUE);
                      g.fillPolygon(triangle);
                      
//                        //Draw Oval
//                        g.setColor(Color.LIGHT_GRAY);
//                        g.fillOval(x1, y1, 55, 55);
//                       
//                        
//                          Polygon p = new Polygon();
//                          p.addPoint(x1 + 5, y1 + 25);
//                          p.addPoint(x1 + 20, y1 + 10);
//                          p.addPoint(x1 + 35, y1 + 25);
//                          p.addPoint(x1 + 25, y1 + 25);
//                          p.addPoint(x1 + 25, y1 + 45);
//                          p.addPoint(x1 + 15, y1 + 45);
//                          p.addPoint(x1 + 15, y1 + 25);
//                          g.setColor(Color.YELLOW);
//                          g.drawPolygon(p);
                          
                          //Draw Star
                          Polygon star = new Polygon();
                          star.addPoint(x1 + 15, y1 + 68);
                          star.addPoint(x1 + 31, y1 + 68);
                          star.addPoint(x1 + 37, y1 + 55);
                          star.addPoint(x1 + 43, y1 + 68);
                          star.addPoint(x1 + 59, y1 + 68);
                          star.addPoint(x1 + 46, y1 + 78);
                          star.addPoint(x1 + 51, y1 + 93);
                          star.addPoint(x1 + 37, y1 + 83);
                          star.addPoint(x1 + 24, y1 + 93);
                          star.addPoint(x1 + 28, y1 + 78);
                          g.setColor(Color.WHITE);
                          g.fillPolygon(star);
                          
                          
            }
}