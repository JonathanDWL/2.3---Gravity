class GravityCalculator{
    public static double CalculateFinalPosition(double gravity, double initialvelocity, double fallingtime, double initialposition){
        return 0.5 * gravity * fallingtime * fallingtime + initialvelocity * fallingtime + initialposition;
    }
}