public class PlayStation4 extends Pelikonsoli {

    public PlayStation4(Peli peli) {
        super(peli);
    }

    @Override
    public String valittuPelikonsoli() {
        return "pelikonsoli: PS4, " + peli.pelattavaPeli();
    }
}
