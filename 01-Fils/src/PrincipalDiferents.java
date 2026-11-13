public class PrincipalDiferents {
    public static void main(String[] args) {
        Fil filPepe = new Fil("Pepe");
        Fil filJuan = new Fil("Juan");

        filJuan.setPriority(Thread.MAX_PRIORITY);
        filPepe.setPriority(Thread.MIN_PRIORITY);

        filPepe.start();
        filJuan.start();
        
        System.out.println("Acaba el thread Main");
    }
}
