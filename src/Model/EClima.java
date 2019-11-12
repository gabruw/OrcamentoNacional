package Model;

public enum EClima {
    EQUATORIAL(0), TROPICAL(1), SUBTROPICAL(2), SEMIÁRIDO(3);
    
    private final int Index;
    
    private EClima(int index) {
        this.Index = index;
    }
    
    public static EClima getClima(int index){
        for(EClima clima : EClima.values()){
            if(clima.Index == index){
                return clima;
            }
        }
        
        return EClima.EQUATORIAL;
    }
}