import javax.swing.*;

public class game{
    public static void main (String[] args)
    {
        new game();
    }
    public game()
    {
        JFrame frame = new JFrame("Tic-tac-toe");
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);

        JPanel panel = new JPanel();
        JButton button1 = new JButton("X");
        button1.setSize(100,100);
        panel.add(button1);

        frame.add(panel);
        frame.setVisible(true);
    }

}
