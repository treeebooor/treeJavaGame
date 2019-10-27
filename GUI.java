import javax.swing.*;
import java.awt.*;

class GUI extends JFrame{
    private JPanel title;
    private JPanel gameScreen;
    private JPanel winScreen;
    private JPanel loseScreen;
    private JButton startButton;


    public GUI(){
        super("Tree Game");
        this.setSize(1280, 720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        title = new JPanel(new BorderLayout());
        startButton = new JButton("Start!");
        title.add(startButton, BorderLayout.CENTER);
        this.add(title);  
        
        
        
        
        title.revalidate();
        //title.repaint();
        title.setVisible(true);
        startButton.setVisible(true);
         
        
    }

}
