import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

private class CoordinatesListener implements MouseListener
{
    //--------------------------------------------------------------
// Adds the current point to the list of points and redraws
// the panel whenever the mouse button is pressed.
//--------------------------------------------------------------
    public void mousePressed(MouseEvent event)
    {
        x = event.getX();
        y = event.getY();
        repaint();
    }


    private class CoordinatesMouseMoveListener implements MouseMotionListener
    {
        public void mouseMoved(MouseEvent e)
        {
            currentMessage = "Mouse moved";
            repaint();
        }

        public void mouseDragged(MouseEvent e)
        {
            currentMessage = "Mouse dragged";
            repaint();
        }
    }
}
