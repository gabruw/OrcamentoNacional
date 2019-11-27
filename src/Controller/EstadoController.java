package Controller;

import ConnectionFactory.ConnectionFactory;
import Model.Estado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EstadoController {
     private Connection connect = null;

    public EstadoController() {
        this.connect = new ConnectionFactory().SQLConnect();
    }
    
    public void Include(Estado object) {
        try {
            String query = "INSERT INTO estado(nome, sigla, distritofederal, orcamentototal, gastostotais) VALUES (?, ?, ?, ?, ?)";

            try (PreparedStatement stmt = connect.prepareStatement(query)) {
                stmt.setString(1, object.getNome());
                stmt.setString(2, object.getSigla());
                stmt.setByte(3, object.getDistritoFederal());
                stmt.setFloat(4, object.getOrcamentoTotal());
                stmt.setFloat(5, object.getGastosTotais());

                stmt.execute();
            }

        } catch (SQLException SqlEx) {
            throw new RuntimeException(SqlEx);
        }
    }
    
    public boolean isGastoMaior(){
        return true;
    }
    
    public List<Estado> GetAll() {
        List<Estado> listEstado = new ArrayList<>();

        try {
            String query = "SELECT * FROM estado";

            PreparedStatement stmt = connect.prepareStatement(query);
            ResultSet result = stmt.executeQuery(query);

            while (result.next()) {
                Estado estado = new Estado();
                estado.setId((long) result.getLong("id"));
                estado.setNome((String) result.getString("nome"));
                estado.setSigla((String) result.getString("sigla"));
                estado.setDistritoFederal((byte) result.getByte("distritofederal"));
                estado.setOrcamentoTotal((float) result.getFloat("orcamentototal"));
                estado.setGastosTotais((float) result.getFloat("gastostotais"));

                listEstado.add(estado);
            }
        } catch (SQLException SqlEx) {
            throw new RuntimeException(SqlEx);
        }

        return listEstado;
    }
}
