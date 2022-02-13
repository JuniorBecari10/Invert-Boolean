package invert.main;

public class Inverter {
    public boolean b;
    
    public Inverter(boolean b) {
        this.b = b;
    }
    
    public InvertedBoolean processInversion() {
        return new InvertedBoolean(b);
    }
}
