package Controller;

import ConnectionFactory.ConnectionFactory;
import Model.Cidade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CidadeController {

    private Connection connect = null;

    public CidadeController() {
        this.connect = new ConnectionFactory().SQLConnect();
    }

    public void Include(Cidade object) {
        try {
            String query = "INSERT INTO cidade(nome, clima, gastos, populacao, estado_id) VALUES (?, ?, ?, ?,?)";

            try (PreparedStatement stmt = connect.prepareStatement(query)) {
                stmt.setString(1, object.getNome());
                stmt.setString(2, object.getClima());
                stmt.setFloat(3, object.getGastos());
                stmt.setInt(4, object.getPopulacao());
                stmt.setLong(5, object.getIdEstado());
                stmt.execute();
            }
        } catch (SQLException SqlEx) {
            throw new RuntimeException(SqlEx);
        }
    }

    public void Update(Cidade object) {
        try {
            String query = "UPDATE cidade SET nome = ?, clima = ?, gastos = ?, populacao = ?, estado = ? WHERE id = ?";

            try (PreparedStatement stmt = connect.prepareStatement(query)) {
                stmt.setString(1, object.getNome());
                stmt.setString(2, object.getClima());
                stmt.setFloat(3, object.getGastos());
                stmt.setInt(4, object.getPopulacao());
                stmt.setLong(5, object.getId());
                stmt.setLong(5, object.getEstado().getId());
                stmt.execute();
            }
        } catch (SQLException SqlEx) {
            throw new RuntimeException(SqlEx);
        }
    }

    public void Delete(Cidade object) {
        try {
            String query = "DELETE FROM cidade WHERE id = ?";

            try (PreparedStatement stmt = connect.prepareStatement(query)) {
                stmt.setLong(1, object.getId());

                stmt.execute();
            }
        } catch (SQLException SqlEx) {
            throw new RuntimeException(SqlEx);
        }
    }

    public void addGastoToCidade(Cidade object) {
        try {
            // Update do gasto da Cidade
            String query = "UPDATE cidade SET gastos = ? WHERE id = ?";

            PreparedStatement stmt = connect.prepareStatement(query);
            stmt.setFloat(1, object.getGastos());
            stmt.setLong(2, object.getId());

            stmt.execute();

            // Recuperando o valor dos gastos de todas as Cidades
            query = "SELECT * FROM cidade C WHERE C.estado_id = ?";

            stmt = connect.prepareStatement(query);
            stmt.setLong(1, object.getIdEstado());

            ResultSet result = stmt.executeQuery();

            float gastos = 0;
            while (result.next()) {
                gastos += ((float) result.getFloat("gastos"));
            }

            // Update gastos do Estado
            query = "UPDATE estado SET gastostotais = ? WHERE id = ?";
            stmt = connect.prepareStatement(query);

            stmt.setFloat(1, gastos);
            stmt.setLong(2, object.getIdEstado());

            stmt.execute();
        } catch (SQLException SqlEx) {
            throw new RuntimeException(SqlEx);
        }
    }

    public Cidade GetCidade(String Nome) {
        return new Cidade();
    }

    public List<Cidade> GetAll() {
        List<Cidade> listCidade = new ArrayList<>();

        try {
            String query = "SELECT * FROM cidade ORDER BY nome";

            PreparedStatement stmt = connect.prepareStatement(query);
            ResultSet result = stmt.executeQuery();

            while (result.next()) {
                Cidade cidade = new Cidade();
                cidade.setId((long) result.getLong("id"));
                cidade.setNome((String) result.getString("nome"));
                cidade.setClima(result.getString("clima"));
                cidade.setGastos((float) result.getFloat("gastos"));
                cidade.setPopulacao((int) result.getInt("populacao"));
                cidade.setIdEstado((long) result.getLong("estado_Id"));

                listCidade.add(cidade);
            }
        } catch (SQLException SqlEx) {
            throw new RuntimeException(SqlEx);
        }

        return listCidade;
    }

    public List<Cidade> GetAllTable(DefaultTableModel tableModel) {
        try {
            CidadeController cidadeDAO = new CidadeController();
            List<Cidade> listaCidade = cidadeDAO.GetAll();

            DefaultTableModel model = tableModel;
            model.setNumRows(0);

            for (Cidade cidade : listaCidade) {
                model.addRow(new Object[]{
                    cidade.getNome(),
                    cidade.getPopulacao(),
                    cidade.getClima(),
                    cidade.getGastos(),}
                );
            }

            return listaCidade;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar as cidades!\n" + ex);
        }

        return null;
    }

    public List<Cidade> GetAllClima(String clima) {
        List<Cidade> listCidade = new ArrayList<>();

        try {
            String query = ("SELECT * FROM Cidade WHERE clima LIKE ?");

            PreparedStatement stmt = connect.prepareStatement(query);
            stmt.setString(1, clima);
            ResultSet result = stmt.executeQuery();

            while (result.next()) {
                Cidade cidade = new Cidade();

                cidade.setId((long) result.getLong("id"));
                cidade.setNome((String) result.getString("nome"));
                cidade.setClima(result.getString("clima"));
                cidade.setGastos((float) result.getFloat("gastos"));
                cidade.setPopulacao((int) result.getInt("populacao"));

                listCidade.add(cidade);
            }
        } catch (SQLException SqlEx) {
            throw new RuntimeException(SqlEx);
        }

        return listCidade;
    }

    public List<Cidade> GetAllCidadesFromEstado(Cidade object) {
        List<Cidade> listCidade = new ArrayList<>();
        
        try {
            String query = "SELECT * FROM cidade C INNER JOIN estado E ON C.estado_id = E.id WHERE C.estado_id = ?";

            PreparedStatement stmt = connect.prepareStatement(query);
            stmt.setLong(1, object.getIdEstado());
            ResultSet result = stmt.executeQuery();

            while(result.next()){
                Cidade cidade = new Cidade();
                
                cidade.setId((long) result.getLong("id"));
                cidade.setNome((String) result.getString("nome"));
                cidade.setClima(result.getString("clima"));
                cidade.setGastos((float) result.getFloat("gastos"));
                cidade.setPopulacao((int) result.getInt("populacao"));
                
                listCidade.add(cidade);
            }
            
            return listCidade;
        } catch (SQLException SqlEx) {
            throw new RuntimeException(SqlEx);
        }
    }
}
