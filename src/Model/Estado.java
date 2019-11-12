package Model;

public class Estado {
    private long Id;
    private String Nome;
    private String Sigla;
    private byte DistritoFederal;
    private float OrcamentoTotal;
    private float GastosTotais;

    public Estado() {
        
    }

    public Estado(long Id, String Nome, String Sigla, byte DistritoFederal, float OrcamentoTotal, float GastosTotais) {
        this.Id = Id;
        this.Nome = Nome;
        this.Sigla = Sigla;
        this.DistritoFederal = DistritoFederal;
        this.OrcamentoTotal = OrcamentoTotal;
        this.GastosTotais = GastosTotais;
    }

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
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