import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class doggyMaker {

    public String nameStored;
    public String hairColorStored;
    public int ageStored;
    public String eyeColorStored;
    public String newDogNameStored;
    public int sizeStored;

    public String newHairColor;
    public String newEyeColor;

    // Set
    public String setDogName(String name) {
        nameStored = name;
        return nameStored;
    }

    public String setHairColor(String hairColor) {
        hairColorStored = hairColor;
        return hairColorStored;
    }

    public int setAge(int age) {
        ageStored = age;
        return ageStored;
    }

    public String setEyeColor(String eyeColor) {
        eyeColorStored = eyeColor;
        return eyeColorStored;
    }

    public int setSize(int size) {
        sizeStored = size;
        return sizeStored;
    }

    public void setMate(String hairColor1, String hairColor2, String eyeColor1, String eyeColor2, String newDogName) {

        // New Hair Color And Eye Color
        final String[] pickHairColor = { hairColor1, hairColor2 };
        Random randomHair = new Random();
        int randomHairIndex = randomHair.nextInt(pickHairColor.length);
        hairColorStored = pickHairColor[randomHairIndex];

        if (hairColorStored == hairColor1) {
            eyeColorStored = eyeColor2;
        }

        else if (hairColorStored == hairColor2) {
            eyeColorStored = eyeColor1;
        }

        //
    }

    public void setAll(String name, String hairColor, String eyeColor, int age) {
        nameStored = name;
        hairColorStored = hairColor;
        ageStored = age;
        eyeColorStored = eyeColor;
    }

    // Get
    public String getName() {
        return nameStored;
    }

    public String getHairColor() {
        return hairColorStored;
    }

    public int getAge() {
        return ageStored;
    }

    public String getMateHairColor() {
        return hairColorStored;
    }

    public String getMateEyeColor() {
        return eyeColorStored;
    }

    public String getEyeColor() {
        return eyeColorStored;
    }

    public void getAllInfo() {
        if (nameStored == null) {
            System.out.println("No Name");
        }

        else {
            System.out.println(nameStored);
        }

        if (hairColorStored == null) {
            System.out.println("No Hair Color");
        }

        else {
            System.out.println(hairColorStored);
        }

        if (ageStored == 0) {
            System.out.println("No Age");
        }

        else {
            System.out.println(ageStored);
        }

        if (eyeColorStored == null) {
            System.out.println("No Eye Color");
        }

        else {
            System.out.println(eyeColorStored);
        }
    }
}