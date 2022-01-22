
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;



import javax.swing.JButton;

import javax.swing.JCheckBox;

import javax.swing.JFileChooser;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JTextField;

import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileChooserDemo extends JFrame implements ActionListener {



    // Jlabel to show the files user selects

    static JLabel l;
    static JTextField path=null;
    static JCheckBox checkJPG=null;
    static JCheckBox checkBMP=null;
    static JCheckBox checkTXT=null;
    static JCheckBox checkDOC=null;


    public static void main(String args[])
    {
        // frame to contains GUI elements
        JFrame f = new JFrame("file chooser");

        // set the size of the frame
        f.setSize(400, 400);

        // set the frame's visibility
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        path=new JTextField(30);
        // button to open open dialog
        JButton button2 = new JButton("open");


        checkJPG=new JCheckBox("JPG");
        checkBMP=new JCheckBox("BMP");
        checkTXT=new JCheckBox("TXT");
        checkDOC=new JCheckBox("DOC");



        // make an object of the class filechooser
        FileChooserDemo f1 = new FileChooserDemo();
        // add action listener to the button to capture user

        // response on buttons
        button2.addActionListener(f1);
        // make a panel to add the buttons and labels
        JPanel p = new JPanel();
        //   p.setLayout(new GridLayout());
        // add buttons to the frame

        p.add(path);
        p.add(button2);
        p.add(checkJPG);
        p.add(checkBMP);
        p.add(checkTXT);
        p.add(checkDOC);
        // set the label to its initial value

        l = new JLabel("no file selected");
        // add panel to the frame

        p.add(l);
        f.add(p);
        f.show();
    }

    public void actionPerformed(ActionEvent evt)
    {
        // if the user presses the save button show the save dialog
        String com = evt.getActionCommand();

        JFileChooser j = new JFileChooser(path.getText());

        FileFilter docFilter = new FileNameExtensionFilter(".doc", "Microsoft Word Documents");

        FileFilter jpgFilter = new FileNameExtensionFilter(".jpg", "JPG file format");

        FileFilter bmpFilter = new FileNameExtensionFilter(".bmp", "BMP file format");

        FileFilter txtFilter = new FileNameExtensionFilter(".txt", "Text file format");



        if(checkJPG.isSelected()) {
            j.addChoosableFileFilter(jpgFilter);
        }
        if(checkBMP.isSelected()) {
            j.addChoosableFileFilter(bmpFilter);
        }
        if(checkTXT.isSelected()) {
            j.addChoosableFileFilter(txtFilter);
        }
        if(checkDOC.isSelected()) {
            j.addChoosableFileFilter(docFilter);
        }

        // invoke the showsOpenDialog function to show the save dialog
        int r = j.showOpenDialog(null);
        // if the user selects a file
        if (r == JFileChooser.APPROVE_OPTION)

        {
            // set the label to the path of the selected file\
            l.setText(j.getSelectedFile().getAbsolutePath());
        }
        // if the user cancelled the operation
        else
            l.setText("the user cancelled the operation");
    }

}