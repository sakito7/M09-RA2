import java.util.Random;

public class DormAleatori extends Thread {
    private String name;
    private static int totalMS = 0;

    public DormAleatori(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            Random rnd = new Random();
            int ms = rnd.nextInt(1000); // 0 a 999 ms

            System.out.println(super.getName() + "(" + i + ") a dormir " + ms + " total " + );
        }
    }


    public static void main(String[] args) {
        DormAleatori joan = new DormAleatori("Joan");
        DormAleatori pep = new DormAleatori("Pep");

        joan.run();
        pep.run();

        System.out.println("----------- Final main -----------");
    }
}
