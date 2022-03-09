package objetos.util;

public class ConversaoMoeda {
    public static final double IOF = 0.06;

    public static Double conversor(double valDolar){
        return ((valDolar * 3.10) * IOF) + (valDolar* 3.10) ;
    }
}
