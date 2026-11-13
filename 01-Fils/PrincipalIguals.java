public class PrincipalIguals {
    public static void main(String[] args) {
        Fil filPepe = new Fil("Pepe");
        Fil filJuan = new Fil("Juan");

        filJuan.setPriority(Thread.MAX_PRIORITY);
        filPepe.setPriority(Thread.MAX_PRIORITY);

        filJuan.start();
        filPepe.start();

        System.out.println("Acaba el thread Main");
    }
}
