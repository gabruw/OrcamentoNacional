package Model;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cidade implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private long Id;
    
    @Column(name = "Nome")
    private String Nome;
    
    @Column(name = "Populacao")
    private int Populacao;
    
    @Column(name = "Clima")
    private String Clima;
    
    @Column(name = "Gastos")
    private float Gastos;
    
    @ManyToOne
    private Estado estado;
    
    private long idEstado;

    public Cidade() {
        
    }

    public Cidade(long Id, String Nome, int Populacao, String Clima, float Gastos, Estado estado, long idEstado) {
        this.Id = Id;
        this.Nome = Nome;
        this.Populacao = Populacao;
        this.Clima = Clima;
        this.Gastos = Gastos;
        this.estado = estado;
        this.idEstado = idEstado;
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

    public int getPopulacao() {
        return Populacao;
    }

    public void setPopulacao(int Populacao) {
        this.Populacao = Populacao;
    }

    public String getClima() {
        return Clima;
    }

    public void setClima(String Clima) {
        this.Clima = Clima;
    }

    public float getGastos() {
        return Gastos;
    }

    public void setGastos(float Gastos) {
        this.Gastos = Gastos;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    public long getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(long idEstado) {
        this.idEstado = idEstado;
    }
    
    @Override
    public String toString() {
        return "Cidade: " + Nome + " - UF =" + estado + '}';
    }
}