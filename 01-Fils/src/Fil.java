public class Fil extends Thread {
    private boolean esticte;

    public Fil (String nom, boolean esticte) {
        super(nom);
        this.esticte = esticte;
    }

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j <= 1000; j++) {
                
            }

            System.out.println(getName() + " " + i);
            if (esticte) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException ex) {
                    System.getLogger(Fil.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                }
            }
        }

        System.out.println("Acaba el fil" + getName());
    }
}
