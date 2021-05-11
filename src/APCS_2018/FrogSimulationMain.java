package APCS_2018;

public class FrogSimulationMain {
    public static void main(String[] args) {
        FrogSimulation sim = new FrogSimulation(24, 5);
        for (int i = 0; i < 100; i++) {
            System.out.println(sim.simulate());
        }
        System.out.println(sim.runSimulations(114514));
    }
}
