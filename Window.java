package TowerDefense;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private String title;
    private int positionX;
    private int positionY;
    private Dimension dim = new Dimension();
    public Window(int positionX, int positionY){
        new JFrame();
        this.setSize(positionX,positionY);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public void afficage(){
        JPanel pan = new JPanel();


    }
}
