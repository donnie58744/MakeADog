import javax.swing.*;
import java.awt.*;

public class main extends JFrame{
    public static void main(String[] args) {
        doggyMaker Bob = new doggyMaker();
        drawDog Jerry;

        // DoggyMaker
        Bob.setDogName("Bob");
        System.out.print(Bob.getName());

        // DrawDog
        Jerry = new drawDog();
        Jerry.setDogName("Jerry");
        Jerry.setHairColor(Color.darkGray);
    }
}