import javax.swing.*;
import java.awt.*;

public class drawDog extends JFrame {
    public Color hairColorStored;
    public String nameStored;
    public int ageStored;
    public String eyeColorStored;
    public String newDogNameStored;
    public int sizeStored;

    public drawDog() {
        JLabel s = new JLabel();
        s.setText("HHHHH");
        add(s);

        setMinimumSize(new Dimension(300, 500));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        // Head
        g.setColor(hairColorStored);
        g.fillOval(35, 55, 80, 80);

        // Body
        g.setColor(hairColorStored);
        g.fillRect(110,80,150,30);

        // Left Leg
        g.setColor(hairColorStored);
        g.fillRect(130,110,30,100);

        // Right Leg
        g.setColor(hairColorStored);
        g.fillRect(230,110,30,100);

        // Name Tag
        g.setColor(Color.BLACK);
        g.drawString("Name: " + nameStored,200,250);
    }

    public Color setHairColor(Color hairColor) {
        hairColorStored = hairColor;
        return hairColor;
    }

    public String setDogName(String name) {
        nameStored = name;
        return nameStored;
    }

}
