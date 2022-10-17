package chapterFiveSix;

public class SonOfDetergent extends Detergent {
    @Override
    public void scrub() {
        append("SonOfDetergent.scrub()");
        super.scrub();
    }

    public void sterilize() {
        System.out.println("Method sterilize has been called.");
    }
}
