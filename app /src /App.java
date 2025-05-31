class Toroida {
    private int a;
    private int N;
    private int I;
    
    public Toroida(int a, int N, int I) {
        this.a = a;
        this.N = N;
        this.I = I;
    }
    
    public void info() {
        System.out.println("\n--- KONSEP KAWAT TOROIDA ---");
        System.out.println("Kawat toroida adalah kumparan berbentuk seperti donat/cincin yang dililit oleh kawat.");
        System.out.println("Dimana ketika dialiri oleh arus listrik, toroida menghasilkan medan magnet.");

        System.out.println("\n--- RUMUS MEDAN MAGNET KAWAT TOROIDA ---");
        System.out.println("B = (mu0*N*I)/(2*pi*r)");
        System.out.println("Keterangan:");
        System.out.println("B = medan magnet (Tesla)");
        System.out.println("mu0 = 4*pi*10^-7 T·m/A (konstanta permeabilitas)");
        System.out.println("N = jumlah lilitan kawat");
        System.out.println("I = kuat arus (Ampere)");
        System.out.println("a = jari-jari (meter)");
    }
    
    public void input() {
        System.out.println("\n--- MASUKKAN ---");
        System.out.println("Jari-jari toroida : " + a + " m");
        System.out.println("Jumlah lilitan kawat : " + N);
        System.out.println("Kuat arus : " + I + " A");
    }

    public double hitung() {
        double mu0 = 4 * 3.14 / 10000000;
        return (mu0 * N * I) / (2 * 3.14 * a);
    }
    
    public void hasil() {
        double B = hitung();
        System.out.println("\n--- HASIL ---");
        System.out.println("Besar medan magnet toroida : " + B + " T");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Toroida toroida = new Toroida(4, 200, 5);
        toroida.info();
        toroida.input();
        toroida.hasil();
    }
}
