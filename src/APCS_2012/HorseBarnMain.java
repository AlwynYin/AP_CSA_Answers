package APCS_2012;

public class HorseBarnMain {
    public static void main(String[] args) {
        Horse[] horses = {
                new Horse("Trigger", 1340),
                null,
                new Horse("Silver", 1210),
                new Horse("Lady", 1575),
                null,
                new Horse("Patches", 1350),
                new Horse("Duke", 1410)
        };

        HorseBarn horseBarn = new HorseBarn(horses);
        System.out.println(horseBarn);
        System.out.println(horseBarn.findHorseSpace("Trigger"));
        System.out.println(horseBarn.findHorseSpace("Silver"));
        System.out.println(horseBarn.findHorseSpace("Coco"));
        horseBarn.consolidate();
        System.out.println(horseBarn);

    }
}
