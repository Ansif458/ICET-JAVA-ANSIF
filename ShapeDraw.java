import java.awt.*; 
import java.awt.event.*; 
public class ShapeDraw extends Frame implements ItemListener  
{ 
    Choice shapeChoice; 
    Canvas canvas; 
    public ShapeDraw ( )  
    { 
        setTitle("Shape Draw"); 
        setSize(500, 500); 
        setLayout(new BorderLayout()); 
        // Creating choice component 
        shapeChoice = new Choice();             
        shapeChoice.add("Rectangle"); 
        shapeChoice.add("Triangle");             
        shapeChoice.add("Square"); 
        shapeChoice.add("Circle"); 
        shapeChoice.addItemListener(this);       
        add (shapeChoice, BorderLayout.NORTH); // Adding choice component to top        
        canvas = new Canvas()      // Creating canvas for drawing 
        { 
            public void paint(Graphics g)  
            { 
                drawShape(g, shapeChoice.getSelectedItem ( ) ); 
            } 
        }; 
        canvas.setBackground(Color.WHITE);  add(canvas, BorderLayout.CENTER);   
        // Closing event 
        addWindowListener ( new WindowAdapter ( )  
        { 
            public void windowClosing(WindowEvent e)  
            {           
                             dispose();            
             } 
        }  ); 
        setVisible(true); 
    } 
    public void itemStateChanged(ItemEvent e)  
    {           
             canvas.repaint(); 
    } 
    private void drawShape(Graphics g, String shape)  
    { 
        g.setColor(Color.BLUE); 
 
 
 
        switch (shape)  
        {   case "Rectangle": g.drawRect(100, 100, 200, 100); 
                                     break; 
            case "Triangle":    int[] x = {150, 250, 350};    
                                       int[] y = {200, 100, 200}; 
                                       g.drawPolygon(x, y, 3); 
                                       break; 
            case "Square":     g.drawRect(150, 100, 100, 100); 
                                       break; 
            case "Circle":       g.drawOval(150, 100, 100, 100); 
                                       break; 
        } 
    } 
    public static void main(String[] args)  
    { 
        new ShapeDraw(); 
    } 
} 