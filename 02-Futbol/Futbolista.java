import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Futbolista
 */
public class Futbolista extends Thread {

    private static final int NUM_JUGADORS = 11;
    private static final int NUM_TIRADES = 20;
    private static final float  PROBABILITAT = 0.5f;
    private int nGols;
    private int nTirades;

    public Futbolista(String nom) {
        super(nom);
        nTirades = 0;
        nGols = 0;
    }
 
    @Override
    public void run() {
        for (int i = 0; i < NUM_TIRADES; i++) {
            Random rnd = new Random();
            float valor = rnd.nextInt(1);

            if (valor >= PROBABILITAT) {
                nGols++;
            }
            nTirades++;
        }
    }

    public int getnGols() {
        return nGols;
    }

    public int getnTirades() {
        return nTirades;
    }

    public void setnGols(int nGols) {
        this.nGols = nGols;
    }

    public void setnTirades(int nTirades) {
        this.nTirades = nTirades;
    }

    @Override
    public String toString() {
        return super.toString();
    }


    public static void main(String[] args) throws InterruptedException {
        String[] noms = {
                            "Piqué", "Vinicius", "Torres", "Ramos", "Ronaldo", "Lewan",
                            "Belli", "Arnau", "Aspas", "Messi", "MBapé"
        };
        List<Futbolista> lf = new ArrayList<Futbolista>();

        for (int i = 0; i < NUM_JUGADORS; i++) {
            lf.add(new Futbolista("Futbolista " + (i + 1)));
        }

        if (noms.length != lf.size()) {
            throw new IllegalArgumentException("El número de nombres no coincideix");
        }

        for (Futbolista futbolista : lf) {
            futbolista.join();
        }

        for (Futbolista futbolista : lf) {
            System.out.println(futbolista);
        }
    }
    
}