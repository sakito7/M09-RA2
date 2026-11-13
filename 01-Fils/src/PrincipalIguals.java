public class PrincipalIguals {
    public static void main(String[] args) {
        Fil filPepe = new Fil("Pepe", false);
        Fil filJuan = new Fil("Juan", false);

        filJuan.setPriority(Thread.MAX_PRIORITY);
        filPepe.setPriority(Thread.MAX_PRIORITY);

        filJuan.start();
        filPepe.start();

        System.out.println("Acaba el thread Main");
    }
}
