public class Mahasiswa extends Civitas {

    private int nim;
    private String fakultas;
    private String prodi;

    public Mahasiswa(int nim, String fakultas, String prodi) {
        this.nim = nim;
        this.prodi = prodi;
    }

    public Mahasiswa() {
    }

    public int getNim() {
        return this.nim;
    }

    public void setNim(int value) {
        this.nim = value;
    }

    public String getFakultas() {
        return this.fakultas;
    }

    public void setFakultas(String value) {
        this.fakultas = value;
    }

    public String getProdi() {
        return this.prodi;
    }

    public void setProdi(String value) {
        this.prodi = value;
    }
}
