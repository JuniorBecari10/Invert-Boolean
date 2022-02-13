package invert.main;

public class BooleanInverter {
    public boolean invert(Inverter inverter) {
        InvertedBoolean inv = inverter.processInversion();
        
        return inv.turnToInverted();
    }
}
