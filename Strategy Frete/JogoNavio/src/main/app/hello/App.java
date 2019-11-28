package app.hello;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        GlockDeGelo glock = new GlockDeGelo();
        System.out.println(glock.getDano());
        Ak47DeFogo ak = new Ak47DeFogo();
        System.out.println(ak.getDano());
    }
}