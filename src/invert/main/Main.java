package invert.main;

public class Main {
    
    public static void main(String[] args) {
        boolean b = true;
        
        InvertHandler handler = new InvertHandler(b);
        handler.prepare();
        
        b = new BooleanInverter().invert(handler.getInverter(b));
        
        System.out.println(b);
    }
}
