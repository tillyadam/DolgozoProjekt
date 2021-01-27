import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Feladatok {
    private ArrayList<Dolgozo> dolgozokLista;

    public Feladatok() {
        beolvas("adatok.txt");
    }

    private void beolvas(String filenev) {
        dolgozokLista = new ArrayList<>();

        try {
            FileReader fr = new FileReader(filenev);
            BufferedReader br = new BufferedReader(fr);

            String sor = br.readLine();

            while (sor != null) {
                String[] tmp = sor.split("\\s+");
                String vezeteknev = tmp[0];
                String keresztnev = tmp[1];
                String nem = tmp[2];
                int eletkor = Integer.parseInt(tmp[3]);
                int fizetes = Integer.parseInt(tmp[4]);
                String penznem = tmp[5];
                Dolgozo dolgozo = new Dolgozo(vezeteknev, keresztnev, nem, eletkor, fizetes, penznem);

                dolgozokLista.add(dolgozo);
                sor=br.readLine();
            }

            fr.close();
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int HarmasFeladat() {
        return dolgozokLista.size();
    }

    public int NegyesFealdat() {
        int sum = 0;

        for (Dolgozo d : dolgozokLista) {
            if (d.getEletkor() < 25) {
                sum += d.getFizetes();
            }
        }

        return sum;
    }

    public String OtosFealdat() {
        int max = 0;
        String adatok = "";


        for (Dolgozo d : dolgozokLista) {
            if (d.getFizetes() > max) {
                max = d.getFizetes();
                adatok = "A dolgozó neve:" + d.getVezeteknev() + " " + d.getKeresztnev() + "\n Neme: " + d.getNem() + "\n Életkora: " + d.getEletkor() + "\n Fizetése: " + d.getFizetes() + " " + d.getPenznem();
            }
        }

        return adatok;
    }

    public boolean HatosFeladat(int osszeg) {
        boolean vanE = false;
        for (Dolgozo d : dolgozokLista) {
            if (d.getFizetes() > osszeg) {
                vanE = true;
            }
        }
        return vanE;
    }

}
