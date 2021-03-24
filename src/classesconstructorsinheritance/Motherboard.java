package classesconstructorsinheritance;

public class Motherboard {

    private String model;
    private String manufacturer;
    private int cardSlots;
    private int bios;
    private String version;

    public Motherboard(String model, String manufacturer, int cardSlots, int bios, String version) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.cardSlots = cardSlots;
        this.bios = bios;
        this.version = version;
    }

    public void loadProgram(String programName){
        System.out.println("Program " + programName + "is now loading");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public int getBios() {
        return bios;
    }
}
