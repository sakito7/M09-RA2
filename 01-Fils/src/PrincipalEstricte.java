public class PrincipalEstricte {
    public static void main(String[] args) {
        Fil filPepe = new Fil("Pepe", true);
        Fil filJuan = new Fil("Juan", true);

        filJuan.setPriority(Thread.NORM_PRIORITY);
        filPepe.setPriority(Thread.NORM_PRIORITY);

        filPepe.start();
        filJuan.start();
        
        System.out.println("Acaba el thread Main");
    }
}
