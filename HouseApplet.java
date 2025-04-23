import java.applet.*; 
import java.awt.*; 
import java.awt.event.*; 
 
/* <applet code="HouseApplet.class" width="400" height="400"></applet> */ 
 
public class HouseApplet extends Applet implements MouseListener  
{ 
    private Color doorColor = Color.BLUE;   // Initial door color 
    public void init()  
    {      addMouseListener(this); // Register mouse listener   
            } 
    public void paint(Graphics g)  
    { 
        // Draw the house body 
        g.setColor(Color.YELLOW); 
        g.fillRect(100, 150, 200, 150); // House body 
 
        // Draw the roof 
        g.setColor(Color.RED); 
        int[] xPoints = {100, 200, 300}; // Triangle X coordinates 
        int[] yPoints = {150, 50, 150};  // Triangle Y coordinates 
        g.fillPolygon(xPoints, yPoints, 3); 
 
        // Draw windows 
        g.setColor(Color.WHITE); 
        g.fillRect(120, 170, 40, 40); // Left window 
        g.fillRect(240, 170, 40, 40); // Right window 
 
        // Draw the door 
        g.setColor(doorColor); 
        g.fillRect(180, 220, 40, 80); // Door 
        // Draw the door knob 
        g.setColor(Color.BLACK); 
        g.fillOval(215, 260, 5, 5); 
    } 
    public void mouseClicked(MouseEvent e)  // Change door color on click 
     { 
        doorColor = (doorColor == Color.BLUE) ? Color.RED : Color.BLUE; 
        repaint(); // Redraw the applet 
    } 
    // Unused mouse event methods (must be implemented) 
    public void mousePressed(MouseEvent e) { } 
    public void mouseReleased(MouseEvent e) { } 
    public void mouseEntered(MouseEvent e) { } 
    public void mouseExited(MouseEvent e) { } 
} 
