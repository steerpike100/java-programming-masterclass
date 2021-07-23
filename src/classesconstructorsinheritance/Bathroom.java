package classesconstructorsinheritance;

public class Bathroom {

    private String washBasin;
    private String toilet;
    private String bath;
    private BathroomFurniture bathroomFurniture;


    public Bathroom(String washBasin, String toilet, String bath, BathroomFurniture bathroomFurniture) {
        this.washBasin = washBasin;
        this.toilet = toilet;
        this.bath = bath;
        this.bathroomFurniture = bathroomFurniture;
    }

    public String getBath() {
        return bath;
    }

    public String getBathroomFurniture(){
       return bathroomFurniture.getToiletMake();
    }

}
