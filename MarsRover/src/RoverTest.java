public class RoverTest {
    public static final Integer N = 1;
    public static final Integer E = 2;
    public static final Integer S = 3;
    public static final Integer W = 4;


    public static void main(String args[]) {
        Rover rover = new Rover(0, 0, N);
        rover.setPosition(1, 2, N);
        rover.process("LMLMLMLMM");
        rover.printLocation();
        rover.setPosition(3, 3, E);
        rover.process("MMRMMRMRRM");
        rover.printLocation();
    }
}
