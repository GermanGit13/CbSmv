package domain;

import static util.Constants.QUOTA;

public class Clothing {

    private String name;
    private String serigraphy;
    private int number;
    private String size;
    private String dni;

    public Clothing(String name, String dni, String serigraphy, int number, String size, float quota) {
        this.name = name;
        this.dni = dni;
        this.serigraphy = serigraphy;
        this.number = number;
        this.size = size;
        quota = QUOTA;
    }

    public String getName() {
        return name;
    }

    public String getDni() {
        return dni;
    }

    public String getSerigraphy() {
        return serigraphy;
    }

    public int getNumber() {
        return number;
    }

    public String getSize() {
        return size;
    }

    public float getQuota() {
        return QUOTA;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setSerigraphy(String serigraphy) {
        this.serigraphy = serigraphy;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
