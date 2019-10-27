import javax.swing.*;
import java.awt.*;

class TitleScreen extends JPanel{
    
    Image img;
    public TitleScreen(){
        super(new BorderLayout());
        img =Toolkit.getDefaultToolkit().createImage("/Pictures/titleScreen.png");

    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(img, 0, 0, null);
    }
}
