package Model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Estado implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Column(name = "Id")
    @GeneratedValue(strategy= GenerationType.AUTO ) 
    @Id
    private Long Id;
    
    @Column(name = "Nome")
    private String Nome;
    
    @Column(name = "Sigla")
    private String Sigla;
    
    @Column(name = "DistritoFederal")
    private byte DistritoFederal;
    
    @Column(name = "OrcamentoTotal")
    private float OrcamentoTotal;
    
    @Column(name = "GastosTotais")
    private float GastosTotais;
    
    @OneToMany 
    private List<Cidade> cidades;

    public Estado() {
        
    }

    public Estado(Long Id, String Nome, String Sigla, byte DistritoFederal, float OrcamentoTotal, float GastosTotais, List<Cidade> cidades) {
        this.Nome = Nome;
        this.Sigla = Sigla;
        this.DistritoFederal = DistritoFederal;
        this.OrcamentoTotal = OrcamentoTotal;
        this.GastosTotais = GastosTotais;     
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
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

    public List<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(List<Cidade> cidades) {
        this.cidades = cidades;
    }

    @Override
    public String toString() {
        return this.Sigla;
    }
    
    public Float dividaEstado() {
        float dividaEstado = this.OrcamentoTotal - this.GastosTotais;
        return dividaEstado * (-1);        
    } 
}