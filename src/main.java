public class main {
    public static void main(String[] args) {
        doggyMaker Bob = new doggyMaker();
        doggyMaker Jarvey = new doggyMaker();
        doggyMaker Berry = new doggyMaker();

        //Bob
        Bob.setName("Bob");
        Bob.setHairColor("White");
        Bob.setEyeColor("Green");
        Bob.setAge(7);

        //Jarvey

        Jarvey.setAll("Jarvey", "Brown", "Blue",7);

        //Make Berry Traits Randomly
        Berry.setMate(Bob.getHairColor(), Jarvey.getHairColor(), Bob.getEyeColor(), Jarvey.getEyeColor(), Berry.getName());

        //Berry
        Berry.setAll("Berry", Berry.getMateHairColor(), Berry.getMateEyeColor(), 1);

        Jarvey.draw();
        Bob.draw();
    }
}