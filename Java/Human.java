public class Human {

    // atribut privat
    private int nik;
    private String name;
    private String gender;

    // constructor
    public Human(int nik, String name, String gender) {
        this.nik = nik;
        this.name = name;
        this.gender = gender;
    }

    public Human() {
    }

    // getter setter
    public int getNik() {
        return this.nik;
    }

    public void setNik(int value) {
        this.nik = value;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String value) {
        this.gender = value;
    }
}
