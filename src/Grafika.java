import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Grafika extends JFrame implements ActionListener {
    JPanel panel;
    JLabel lbl_harmadik, lbl_harmadikEredmeny;
    JLabel lbl_negyedik, lbl_negyedikEredmeny;
    JLabel lbl_otodik, lbl_otodikEredmeny;
    JLabel lbl_hatodik, lbl_hatodikEredmeny;
    JTextField tf_hatodik;
    JButton btn_hatodik;
    Feladatok f;

    public Grafika() {
        init();
        f = new Feladatok();
    }

    private void init() {
        this.setTitle("Dolgozók");
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.panel = (JPanel) (this.getContentPane());
        this.panel.setLayout(null);

        //3
        lbl_harmadik = new JLabel();
        lbl_harmadik.setText("3. Feladat:");
        lbl_harmadik.setBounds(10, 10, 50, 20);
        panel.add(lbl_harmadik);
        lbl_harmadikEredmeny = new JLabel();
        lbl_harmadikEredmeny.setText("A dolgozók száma: " + f.HarmasFeladat() + "");
        lbl_harmadikEredmeny.setBounds(70, 10, 100, 20);
        panel.add(lbl_harmadikEredmeny);

        //4
        lbl_negyedik = new JLabel();
        lbl_negyedik.setText("4. Feladat:");
        lbl_negyedik.setBounds(10, 40, 50, 20);
        panel.add(lbl_negyedik);
        lbl_negyedikEredmeny = new JLabel();
        lbl_negyedikEredmeny.setText("25 év alattiak összfizetése: " + f.NegyesFealdat() + "");
        lbl_negyedikEredmeny.setBounds(70, 40, 100, 20);
        panel.add(lbl_negyedikEredmeny);

        //5
        lbl_otodik = new JLabel();
        lbl_otodik.setText("5. Feladat:");
        lbl_otodik.setBounds(10, 70, 50, 20);
        panel.add(lbl_otodik);
        lbl_otodikEredmeny = new JLabel();
        lbl_otodikEredmeny.setText("A legnagyobb fizetésű dolgozó adatai: " + f.OtosFealdat() + "");
        lbl_otodikEredmeny.setBounds(70, 70, 200, 200);
        panel.add(lbl_otodikEredmeny);

        //6
        lbl_hatodik = new JLabel();
        lbl_hatodik.setText("6. Feladat:");
        lbl_hatodik.setBounds(10, 300, 50, 20);
        panel.add(lbl_hatodik);
        tf_hatodik = new JTextField();
        tf_hatodik.setBounds(70, 300, 50, 20);
        panel.add(tf_hatodik);
        btn_hatodik = new JButton();
        btn_hatodik.setText("Keresés");
        btn_hatodik.setBounds(130, 300, 50, 20);
        panel.add(btn_hatodik);
        lbl_hatodik.setBounds(10, 300, 50, 20);
        btn_hatodik.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (f.HatosFeladat(Integer.parseInt(tf_hatodik.getText()))){
                    lbl_hatodikEredmeny = new JLabel();
                    lbl_hatodikEredmeny.setText("Van olyan dolgozó, akinek a fizetése "+Integer.parseInt(tf_hatodik.getText())+" Ft felett van");
                    lbl_hatodikEredmeny.setBounds(200, 300, 200, 20);
                    panel.add(lbl_hatodikEredmeny);
                }else {
                    lbl_hatodikEredmeny = new JLabel();
                    lbl_hatodikEredmeny.setText("Nincs olyan dolgozó, akinek a fizetése "+Integer.parseInt(tf_hatodik.getText())+" Ft felett van");
                    lbl_hatodikEredmeny.setBounds(200, 300, 200, 20);
                    panel.add(lbl_hatodikEredmeny);
                }
            }
        });


        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
