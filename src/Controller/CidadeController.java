package Controller;

import ConnectionFactory.ConnectionFactory;
import Model.Cidade;
import Model.EClima;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CidadeController {
    private Connection connect = null;

    public CidadeController() {
        this.connect = new ConnectionFactory().SQLConnect();
    }

    public void Include(Cidade object) {
        try {
            if (this.haveCidade(object)) {
                return;
            }

            String query = "INSERT INTO cidade(nome, clima, gastos, populacao) VALUES (?, ?, ?, ?)";

            try (PreparedStatement stmt = connect.prepareStatement(query)) {
                stmt.setString(1, object.getNome());
                stmt.setString(2, object.getClima().toString());
                stmt.setFloat(3, object.getGastos());
                stmt.setInt(4, object.getPopulacao());

                stmt.execute();
            }
        } catch (SQLException SqlEx) {
            throw new RuntimeException(SqlEx);
        }
    }

    public boolean haveCidade(Cidade object) {
        try {
            String query = "SELECT * FROM cidade C WHERE C.nome = ?";
            
            PreparedStatement stmt = connect.prepareStatement(query);
            stmt.setString(1, object.getNome());
            ResultSet result = stmt.executeQuery(query);

            Cidade cidade = new Cidade();
            cidade.setId((long) result.getLong("id"));
            cidade.setNome((String) result.getString("nome"));
            cidade.setClima((EClima) EClima.getClima(result.getInt("clima")));
            cidade.setGastos((float) result.getFloat("gastos"));
            cidade.setPopulacao((int) result.getInt("populacao"));
            
            if(cidade.getNome() != null){
                query = "UPDATE cidade C SET C.gastos = ? WHERE C.id = ?";
                
                stmt.setFloat(1, (cidade.getGastos() + object.getGastos()));
                stmt.setLong(2, cidade.getId());
                
                stmt.execute(query);         
            }else{
               return true;
            }
        } catch (SQLException SqlEx) {
            throw new RuntimeException(SqlEx);
        }
        
        return false;
    }

    public List<Cidade> GetAll() {
        List<Cidade> listCidade = new ArrayList<>();

        try {
            String query = "SELECT * FROM cidade";

            PreparedStatement stmt = connect.prepareStatement(query);
            ResultSet result = stmt.executeQuery(query);

            while (result.next()) {
                Cidade cidade = new Cidade();
                cidade.setId((long) result.getLong("id"));
                cidade.setNome((String) result.getString("nome"));
                cidade.setClima((EClima) EClima.getClima(result.getInt("clima")));
                cidade.setGastos((float) result.getFloat("gastos"));
                cidade.setPopulacao((int) result.getInt("populacao"));

                listCidade.add(cidade);
            }
        } catch (SQLException SqlEx) {
            throw new RuntimeException(SqlEx);
        }

        return listCidade;
    }
}
