import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class drawDog extends Application {
    public static Color hairColorStored;
    public String nameStored;
    public int ageStored;
    public static Color eyeColorStored;
    public String newDogNameStored;
    public int sizeStored;

    public Color setHairColor(Color hairColor) {
        hairColorStored = hairColor;
        return hairColorStored;
    }

    public Color setEyeColor(Color eyeColor) {
        eyeColorStored = eyeColor;
        return eyeColorStored;
    }

    public String setDogName(String name) {
        nameStored = name;
        return nameStored;
    }

    @Override
    public void start(Stage stage) {
        // Head
        Circle head = new Circle();
        head.setCenterX(100.0f);
        head.setCenterY(135.0f);
        head.setRadius(40.0f);
        head.setFill(hairColorStored);

        // Left Eye
        Circle leftEye = new Circle();
        leftEye.setCenterX(80.0f);
        leftEye.setCenterY(130.0f);
        leftEye.setRadius(10.0f);
        leftEye.setFill(eyeColorStored);

        // Right Eye
        Circle rightEye = new Circle();
        rightEye.setCenterX(110.0f);
        rightEye.setCenterY(130.0f);
        rightEye.setRadius(10.0f);
        rightEye.setFill(eyeColorStored);

        // Body
        Rectangle body = new Rectangle();
        body.setX(135.0f);
        body.setY(115.0f);
        body.setWidth(180.0f);
        body.setHeight(35.0f);
        body.setFill(hairColorStored);

        // Left Leg
        Rectangle leftLeg = new Rectangle();
        leftLeg.setX(150.0f);
        leftLeg.setY(115.0f);
        leftLeg.setWidth(30.0f);
        leftLeg.setHeight(130.0f);
        leftLeg.setFill(hairColorStored);

        // Right Leg
        Rectangle rightLeg = new Rectangle();
        rightLeg.setX(285.0f);
        rightLeg.setY(115.0f);
        rightLeg.setWidth(30.0f);
        rightLeg.setHeight(130.0f);
        rightLeg.setFill(hairColorStored);

        // Tail
        Rectangle tail = new Rectangle();
        tail.setX(285.0f);
        tail.setY(130.0f);
        tail.setWidth(130.0f);
        tail.setHeight(15.0f);
        tail.setFill(hairColorStored);

        //Creating a Group object
        Group root = new Group(head,body,leftLeg,rightLeg,tail,leftEye,rightEye,mouth);

        //Creating a scene objectS
        Scene scene = new Scene(root, 450, 300);
        stage.setMinHeight(350.0);
        stage.setMinWidth(470.0);
        //Setting title to the Stage
        stage.setTitle("Dog");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }

    public static void main(){
        Application.launch();
    }

}
