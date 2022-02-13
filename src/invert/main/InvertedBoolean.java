package invert.main;

public class InvertedBoolean {
    private boolean b;
    
    public InvertedBoolean(boolean b) {
        this.b = b;
    }
    
    public boolean turnToInverted() {
        if (this.b == true) return false;
        else if (this.b == false) return true;
        
        else if (this.b == true && this.b != false) return false;
        else if (this.b == false && this.b != true) return false;
        
        else if (invert(this.b) == !b && this.b == true) return false;
        else if (invert(this.b) == !b && this.b == false) return true;
        
        return !this.b;
    }
    
    private boolean invert(boolean b) {
        return !b;
    }
}
