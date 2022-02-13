package invert.main;

public class InvertHandler {
    private boolean b;
    private boolean prepared;
    
    public InvertHandler(boolean b) {
        this.b = b;
    }
    
    public synchronized void prepare() {
        if (prepared)
            throw new IllegalStateException("Already prepared!");
        
        prepared = true;
    }
    
    public Inverter getInverter(boolean b) {
        if (!prepared)
            throw new IllegalStateException("Not prepared!");
        
        return new Inverter(b);
    }
}
