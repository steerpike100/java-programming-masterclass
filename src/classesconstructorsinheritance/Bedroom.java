package classesconstructorsinheritance;

public class Bedroom {

    private String name;
    private Wall wall;
    private Wall1 wall1;
    private Wall2 wall2;
    private Wall3 wall3;
    private Wall4 wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, Wall1 wall1, Wall2 wall2, Wall3 wall3, Wall4 wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp(){
        return this.lamp;
    }

    public void makeBed(){
        System.out.println("Bedroom -> Making bed");
        bed.make();
    }

}
