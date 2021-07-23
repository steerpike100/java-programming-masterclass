package classesconstructorsinheritance;

import lombok.Builder;
import lombok.Data;


public class Office {

    private String size;
    private int length;
    private String name;
    private String something;

    public Office(String size, int length, String name, String something) {
        this.size = size;
        this.length = length;
        this.name = name;
        this.something = something;
    }

    public String getSomething() {
        return something;
    }

    public void setSomething(String something) {
        this.something = something;
    }
}
