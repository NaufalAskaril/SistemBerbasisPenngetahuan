public class ForwardChaining {
    public static void main(String[] args) {
        boolean A = true, B = false, E = true;
        boolean C = A && B; // R1
        boolean F = A && E; // R3
        boolean G = A; // R4
        boolean D = C || (F && G); // R2, R5
        boolean H = G && E; // R6
        boolean I = C && H; // R7
        boolean J = I && A || G; // R8, R9
        boolean K = J; // R10
        
        System.out.println("K = " + K); // Output: K = true
    }
}