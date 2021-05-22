package APCS_2012;

public class ClimbingClubMain {
    public static void main(String[] args) {
        ClimbInfo[] infos = {
                new ClimbInfo("Monadnock", 274),
                new ClimbInfo("Whiteface", 301),
                new ClimbInfo("Algonquin", 225)
        };
        ClimbingClub club1 = new ClimbingClub(infos);
        System.out.println(club1);
        club1.addClimb("Monadnock", 344);
        System.out.println(club1);

        ClimbingClub club2 = new ClimbingClub(infos);
        club2.addClimbAlpha("Monadnock", 344);
        System.out.println(club2);
    }
}
