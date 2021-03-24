package classesconstructorsinheritance;

public class AnimalHouseMain {

    public static void main(String[] args) {
//        Animal  animal = new Animal("Animal", 1, 1,5,5);
//
//        Dog dog = new Dog("Yorkie", 8,20,2,4,1,20,"long silky");

//        dog.eat();

//        dog.walk();
//
//        dog.run();

        House blueHouse = new House("blue");
        House anotherHouse = blueHouse;

        System.out.println(blueHouse.getColour());
        System.out.println(anotherHouse.getColour());

        anotherHouse.setColour("yellow");
        System.out.println(blueHouse.getColour());
        System.out.println(anotherHouse.getColour());

        House greenHouse = new House("green");
        anotherHouse = greenHouse;

        System.out.println(blueHouse.getColour());
        System.out.println(greenHouse.getColour());
        System.out.println(anotherHouse.getColour());
    }
}
