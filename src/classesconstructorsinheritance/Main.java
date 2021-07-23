package classesconstructorsinheritance;

public class Main {

    public static void main(String[] args) {
        Wall1 wall1 = new Wall1("West");
        Wall2 wall2 = new Wall2("East");
        Wall3 wall3 = new Wall3("North");
        Wall4 wall4 = new Wall4("South");
        Ceiling ceiling = new Ceiling(12,55);

        Bed bed = new Bed("Modern", 4,3,2,1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("Steve's", wall1, wall2, wall3, wall4, ceiling,bed,lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();

        

    }
}
