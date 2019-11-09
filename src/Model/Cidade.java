package Model;

public class Cidade {
    private String Nome;
    private int Populacao;
    private EClima Clima;
    private float Gastos;

    public Cidade() {
        
    }

    public Cidade(String Nome, int Populacao, EClima Clima, float Gastos) {
        this.Nome = Nome;
        this.Populacao = Populacao;
        this.Clima = Clima;
        this.Gastos = Gastos;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getPopulacao() {
        return Populacao;
    }

    public void setPopulacao(int Populacao) {
        this.Populacao = Populacao;
    }

    public EClima getClima() {
        return Clima;
    }

    public void setClima(EClima Clima) {
        this.Clima = Clima;
    }

    public float getGastos() {
        return Gastos;
    }

    public void setGastos(float Gastos) {
        this.Gastos = Gastos;
    }
}