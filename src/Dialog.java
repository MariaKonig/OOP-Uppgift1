import javax.swing.*;
import java.util.ArrayList;

public class Dialog {
    public Dialog() {
        lista.add(new Kaktus("igge"));
        lista.add(new Palm("Laura", 5));
        lista.add(new KöttätandeVäxt("Meatloaf", 0.7));
        lista.add(new Palm("Olof", 1));
    }
    ArrayList<Växt> lista = new ArrayList<>();
    private final ImageIcon icon = new ImageIcon("./sprint1/Uppgift_1/src/icons8-plant-64.png");

    public void run(){

        while(true){
            String namn = frågaOmVäxt();
            if(namn != null) {
                berättaOmVäxt(namn);
            }else return;
        }
    }

    private String frågaOmVäxt() {

        String namn = (String) JOptionPane.showInputDialog(
                    null,
                    "Vilken växt ska få vätska?",
                    "Greenest",
                    JOptionPane.QUESTION_MESSAGE,
                    icon,
                    null,
                    null
        );
        return namn;
    }

    private void berättaOmVäxt(String namn) {

        for (Växt v : lista) {

            if (v.getNamn().equalsIgnoreCase(namn)) {
                //Polymorfism->Samma referens och metodanrop(mängdVätskaPerDag), kör olika metoder i olika klasser
                String utskrift = String.format("%.2f liter ", v.mängdVätskaPerDag()) + v.getNäringsvätska();

                JOptionPane.showMessageDialog(
                        null,
                        utskrift,
                        "Greenest",
                        JOptionPane.INFORMATION_MESSAGE,
                        icon
                );
            }
        }
    }
}