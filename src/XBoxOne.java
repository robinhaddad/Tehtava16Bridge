public class XBoxOne extends Pelikonsoli {
    public XBoxOne(Peli peli) {
        super(peli);
    }

    @Override
    public String valittuPelikonsoli() {
        return "pelikonsoli: XBoxOne, " + peli.pelattavaPeli();
    }
}
