import java.util.Observable;

public class Model extends Observable{

    private double valutaUSD;
    private double valutaEURO;
    private double valutaGBP;
    private double valutaBYN;

    public Model() {
        valutaUSD = 0.0;
        valutaEURO = 0.0;
        valutaGBP = 0.0;
        valutaBYN = 0.0;
    }

    public double getUSD() { return valutaUSD; }
    public double getEURO() { return valutaEURO; }
    public double getGBP() { return valutaGBP; }
    public double getBYN() { return valutaBYN; }


    public void setValuta(int valuta) {
        valutaUSD = valuta * 0.16187;
        valutaEURO = valuta * 0.13447;
        valutaGBP = valuta * 0.11631;
        valutaBYN = valuta * 0.42405;

        setChanged();
        notifyObservers();
    }
    
}