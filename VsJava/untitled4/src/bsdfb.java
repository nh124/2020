import javax.swing.*;
import java.awt.*;

public class CoordinatesPanel extends JPanel
{
    private final int SIZE = 6; // diameter of dot
    private int x = 50, y = 50; // coordinates of mouse press
    private String currentMessage = "";
    //-----------------------------------------------------------------
// Constructor: Sets up this panel to listen for mouse events.
//-----------------------------------------------------------------
    public CoordinatesPanel()
    {
        addMouseListener(new CoordinatesListener());
        addMouseMotionListener(new CoordinatesMouseMoveListener());
        setBackground(Color.black);
        setPreferredSize(new Dimension(300, 200));
    }

    //-----------------------------------------------------------------
// Draws all of the dots stored in the list.
//-----------------------------------------------------------------
    public void paintComponent(Graphics page)
    {
        super.paintComponent(page);
        page.setColor(Color.green);
        page.fillOval(x, y, SIZE, SIZE);
        page.drawString(currentMessage, 5, 15);
    }
    //*****************************************************************
// Represents the listener for mouse events.
//*****************************************************************
