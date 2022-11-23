public class Pac extends Element {
    private int collected_keys;

    public Pac(Position p) {
        super(p);
        collected_keys=0;
    }

    public void addKey(){
        collected_keys+=1;
    }
}
