public class HorseRunner {
    public static void main(String[] args)
    {
        Horse horse1 = new Mustang("Secretariat", 12000);
        Horse horse2 = new Mustang("Dusty Trail", 22000);
        Horse horse3 = new Mustang("Silver", 12000);

        Horse[] horses = new Horse[6];

        horse[1] = horse1;
        horse[3] = horse2;
        horse[5] = horse3;
        HorseBarn barn = new HorseBarn(horses);

        System.out.println(barn);
        System.out.println("Dusty Trail is in space" + barn.findHorseSpace{"Dusty Trail"));

        barn.consolidate();
        System.out.println(barn);
        System.out.println(" Dusty Trail is now in space:" + barn.findHorseSpace("Dusty Trail"));
    }
}