public class Main {
    public static void main(String[] args) {
        Pelikonsoli playStation4 = new PlayStation4(new CallOfDutyModernWarfare());
        System.out.println(playStation4.valittuPelikonsoli());

        Pelikonsoli xBoxone = new XBoxOne(new DevilMayCry5());
        System.out.println(xBoxone.valittuPelikonsoli());
    }
}
