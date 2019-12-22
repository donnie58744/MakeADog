import javax.swing.*;
import java.awt.*;
import javafx.scene.paint.Color;

public class main {
    public static void main(String[] args) {
        doggyMaker Bob = new doggyMaker();
        drawDog Jerry;

        // DoggyMaker
        Bob.setDogName("Bob");
        System.out.print(Bob.getName());

        // DrawDog
        Jerry = new drawDog();
        Jerry.setDogName("Jerry");
        Jerry.setHairColor(Color.BLUE);
        Jerry.setEyeColor(Color.GREEN);

        Jerry.main();
    }
}