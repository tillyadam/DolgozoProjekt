public class Dolgozo {
    private String vezeteknev;
    private String keresztnev;
    private String nem;
    private int eletkor;
    private int fizetes;
    private String penznem;

    public Dolgozo(String vezeteknev, String keresztnev, String nem, int eletkor, int fizetes, String penznem) {
        this.vezeteknev = vezeteknev;
        this.keresztnev = keresztnev;
        this.nem = nem;
        this.eletkor = eletkor;
        this.fizetes = fizetes;
        this.penznem = penznem;
    }

    public String getVezeteknev() {
        return vezeteknev;
    }

    public String getKeresztnev() {
        return keresztnev;
    }

    public String getNem() {
        return nem;
    }

    public int getEletkor() {
        return eletkor;
    }

    public int getFizetes() {
        return fizetes;
    }

    public String getPenznem() {
        return penznem;
    }

    @Override
    public String toString() {
        return "Dolgozo{" +
                "vezeteknev='" + vezeteknev + '\'' +
                ", keresztnev='" + keresztnev + '\'' +
                ", nem='" + nem + '\'' +
                ", eletkor=" + eletkor +
                ", fizetes=" + fizetes +
                ", penznem='" + penznem + '\'' +
                '}';
    }
}
