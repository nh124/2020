import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class game implements ActionListener {

    public static void main(String[] args)
    {
        new game();
    }

    public game()
    {
        // JFrame attributes
        JFrame frame = new JFrame("tik-tac-toe");
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setResizable(false);
        frame.setLayout(null);

        //row 1
        // button 1
        JButton num1= new JButton();
        num1.setSize(100,100);
        num1.setLocation(10,10);
        num1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1.append();
            }
        };


        //button2
        JButton num2= new JButton();
        num2.setSize(100,100);
        num2.setLocation(130,10);


        //button3
        JButton num3= new JButton();
        num3.setSize(100,100);
        num3.setLocation(250,10);


        // row 2
        // button 4
        JButton num4= new JButton();
        num4.setSize(100,100);
        num4.setLocation(10,120);

        // button 5
        JButton num5= new JButton();
        num5.setSize(100,100);
        num5.setLocation(130,120);

        // button 6
        JButton num6= new JButton();
        num6.setSize(100,100);
        num6.setLocation(250,120);


        // row 3
        //button 7
        JButton num7= new JButton();
        num7.setSize(100,100);
        num7.setLocation(10,230);


        //button 8
        JButton num8= new JButton();
        num8.setSize(100,100);
        num8.setLocation(130,230);

        // button 9
        JButton num9= new JButton();
        num9.setSize(100,100);
        num9.setLocation(250,230);







        // the numPad
        frame.add(num1);
        frame.add(num2);
        frame.add(num3);
        frame.add(num4);
        frame.add(num5);
        frame.add(num6);
        frame.add(num7);
        frame.add(num8);
        frame.add(num9);





        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
