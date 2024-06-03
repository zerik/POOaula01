public class ExpressoesRelacionais {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        boolean c = a == b;
        boolean d = a != b;
        boolean e = a >= b;
        boolean f = a <= b;

        double g1 = 0.1;
        double g2 = 0.2;
        double g3 = 0.3;
        double g4 = 0.1 + 0.2;
        double erro = 1e10;

        boolean g = Math.abs(g4 - g3) < erro;

        System.out.println(g);
    }
}
