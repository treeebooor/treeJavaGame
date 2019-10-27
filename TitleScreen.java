import javax.swing.*;
import java.awt.*;

class TitleScreen extends JPanel{
    
    public Image img;
    public TitleScreen(){
        super(new BorderLayout());
        img = Toolkit.getDefaultToolkit().createImage("Pictures/titleScreen.png");
        System.out.println("made image");
        System.out.println(img);
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(img, 0, 0, null);
    }
}
