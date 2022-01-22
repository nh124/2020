import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI implements ActionListener {
    int numOfClicks;
    JFrame frame;
    JButton button;
    JPanel panel;
    JLabel label;
    JButton ResetButton;
    public GUI(){
        frame = new JFrame("The Gui");
        button = new JButton("Clicks");
        panel = new JPanel();
        label = new JLabel("Number of clicks: 0");
        ResetButton = new JButton("Reset");
        button.addActionListener((ActionListener) this);
        ResetButton.addActionListener(this);
        label = new JLabel("Number of clicks " + 0);

        panel.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
        panel.setLayout(new GridLayout(2,1));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.add(button);
        panel.add(label);
        panel.add(ResetButton);
        frame.add(panel, BorderLayout.CENTER);

    }











    public static void main(String[] args){
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            numOfClicks++;
            label.setText("Number of clicks: " + numOfClicks);
        }else if(e.getSource() == ResetButton){
            numOfClicks = 0;
            label.setText("Number of Clicks: " + numOfClicks);
        }
    }
}
