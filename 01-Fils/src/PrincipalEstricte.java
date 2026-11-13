public class PrincipalEstricte {
    public static void main(String[] args) {
        Fil filPepe = new Fil("Pepe");
        Fil filJuan = new Fil("Juan");

        filJuan.setPriority(Thread.NORM_PRIORITY);
        filPepe.setPriority(Thread.NORM_PRIORITY);

        filPepe.start();
        filJuan.start();
        
        System.out.println("Acaba el thread Main");
    }
}
