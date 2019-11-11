package Controller;

import ConnectionFactory.ConnectionFactory;
import Model.Cidade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CidadeController {
    private Connection connect = null;
    
    public CidadeController() {
	this.connect = new ConnectionFactory().SQLConnect();
    }
    
    public void Include(Cidade object){
        try{
            String query = "INSERT INTO cidade(nome, clima, gastos, populacao) VALUES (?, ?, ?, ?)";
            
            try (PreparedStatement stmt = connect.prepareStatement(query)) {
                stmt.setString(1, object.getNome());
                stmt.setString(2, object.getClima().toString());
                stmt.setFloat(3, object.getGastos());
                stmt.setInt(4, object.getPopulacao());
                
                stmt.execute();
            }
        }catch(SQLException SqlEx){
            throw new RuntimeException(SqlEx);
        }
    }
    
    public boolean isCidadeEqualEstado(){
        return false;
    }
}
