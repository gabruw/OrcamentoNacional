package Model;

public class Estado {
    public String Nome;
    public String Sigla;
    public byte DistritoFederal;
    public float OrcamentoTotal;
    public float GastosTotais;

    public Estado() {
        
    }

    public Estado(String Nome, String Sigla, byte DistritoFederal, float OrcamentoTotal, float GastosTotais) {
        this.Nome = Nome;
        this.Sigla = Sigla;
        this.DistritoFederal = DistritoFederal;
        this.OrcamentoTotal = OrcamentoTotal;
        this.GastosTotais = GastosTotais;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSigla() {
        return Sigla;
    }

    public void setSigla(String Sigla) {
        this.Sigla = Sigla;
    }

    public byte getDistritoFederal() {
        return DistritoFederal;
    }

    public void setDistritoFederal(byte DistritoFederal) {
        this.DistritoFederal = DistritoFederal;
    }

    public float getOrcamentoTotal() {
        return OrcamentoTotal;
    }

    public void setOrcamentoTotal(float OrcamentoTotal) {
        this.OrcamentoTotal = OrcamentoTotal;
    }

    public float getGastosTotais() {
        return GastosTotais;
    }

    public void setGastosTotais(float GastosTotais) {
        this.GastosTotais = GastosTotais;
    }
}