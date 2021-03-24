package classesconstructorsinheritance;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "Dell", "240",dimensions);

        Monitor theMonitor = new Monitor("27 inch beast", "Acer", 27, new Resolution(2540,1440));

        Motherboard theMotherboard =  new Motherboard("BJ-200","Asus",4,6,"v2.44");

        PC thePc = new PC(theCase,theMonitor,theMotherboard);

        thePc.getMonitor().drawPixelAt(3,4,"red");
        thePc.getMotherboard().loadProgram("Windows 1.0");
        thePc.getTheCase().pressPowerButton();

        Office.OfficeBuilder myOffice = new Office("hello", 6, "blah");
        myOffice = new Office.OfficeBuilder().something("ssw");

    }
}
