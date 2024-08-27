import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setTitle("JFrame Title Goes Here"); //sets the title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit on close instead of hide on close
        this.setResizable(false); //stops resizing capability
        this.setSize(420, 420); //sets the x and y dimention of the frame
        this.setVisible(true); //make frame visible

        ImageIcon image = new ImageIcon("logo-trans.png"); //creates an Image Icon
        this.setIconImage(image.getImage()); //change icon in frame
        this.getContentPane().setBackground(new Color(0x123456)); //change bg color
    }
}
