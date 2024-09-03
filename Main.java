public class Main{
    public static void main(String[] args) {
        double gravity = -9.8;
        double initialvelocity = 23.4;
        double fallingtime = 5;
        double initialposition = 10.2;

        double finalposition = GravityCalculator.CalculateFinalPosition(gravity, initialvelocity, fallingtime, initialposition);

        System.out.println("Object's final position after falling for " + fallingtime + " seconds: " + finalposition + " meters");
    }
}