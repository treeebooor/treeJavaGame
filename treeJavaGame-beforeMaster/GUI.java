import javax.swing.*;
import java.awt.*;

class GUI extends JFrame{
    //private JPanel title;
    private JPanel gameScreen;
    private JPanel winScreen;
    private JPanel loseScreen;
    private JButton startButton;
    private TitleScreen title;

    public GUI(){
        super("Tree Game");
        this.setSize(1080, 720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        title = new TitleScreen();
        startButton = new JButton("Start!");
        title.add(startButton, BorderLayout.SOUTH);
        this.add(title);  
        
        
        
        
        title.revalidate();
        title.repaint();
        title.setVisible(true);
        startButton.setVisible(true);
        title.revalidate();
        title.repaint();
        
    }

}
