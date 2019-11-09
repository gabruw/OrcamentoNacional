package Model;

public class Municipio {
    public String Nome;
    public int Populacao;
    public EClima Clima;
    public float Gastos;

    public Municipio() {
        
    }

    public Municipio(String Nome, int Populacao, EClima Clima, float Gastos) {
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