public class Civitas extends Human {

    // atribut privat
    private String univ;
    private String email;

    // constructor
    public Civitas(String univ, String email) {
        this.univ = univ;
        this.email = email;
    }

    public Civitas() {
    }

    // getter setter
    public String getUniv() {
        return this.univ;
    }

    public void setUniv(String value) {
        this.univ = value;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String value) {
        this.email = value;
    }
}
