package Controller;

import ConnectionFactory.ConnectionFactory;
import Model.Estado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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

    public void Update(Estado object) {
        try {
            String query = "UPDATE estado C SET nome = ?, sigla = ?, distritofederal = ?, orcamentototal = ?, gastostotais = ? WHERE id = ?";

            try (PreparedStatement stmt = connect.prepareStatement(query)) {
                stmt.setString(1, object.getNome());
                stmt.setString(2, object.getSigla());
                stmt.setByte(3, object.getDistritoFederal());
                stmt.setFloat(4, object.getOrcamentoTotal());
                stmt.setFloat(5, object.getGastosTotais());
                stmt.setLong(6, object.getId());

                stmt.execute();
            }
        } catch (SQLException SqlEx) {
            throw new RuntimeException(SqlEx);
        }
    }

    public void Delete(Estado object) {
        try {
            String query = "DELETE FROM estado WHERE id = ?";

            try (PreparedStatement stmt = connect.prepareStatement(query)) {
                stmt.setLong(1, object.getId());

                stmt.execute();
            }
        } catch (SQLException SqlEx) {
            throw new RuntimeException(SqlEx);
        }
    }

    public List<Estado> GetAll() {
        List<Estado> listEstado = new ArrayList<>();
        
        try {
            String query = "SELECT * FROM Estado";
            
            PreparedStatement stmt = connect.prepareStatement(query);
            ResultSet result = stmt.executeQuery();

            while (result.next()) {
                Estado estado = new Estado();
                
                estado.setId((long) result.getLong("Id"));
                estado.setNome((String) result.getString("Nome"));
                estado.setSigla((String) result.getString("Sigla"));
                estado.setDistritoFederal((byte) result.getByte("DistritoFederal"));
                estado.setOrcamentoTotal((float) result.getFloat("OrcamentoTotal"));
                estado.setGastosTotais((float) result.getFloat("GastosTotais"));
                
                listEstado.add(estado);
            }
        } catch (SQLException SqlEx) {
            throw new RuntimeException(SqlEx);
        }
        
        return listEstado;
    }

    public List<Estado> GetAllTable(DefaultTableModel tabelaEstado) {
        try {
            EstadoController EstadoDAO = new EstadoController();
            List<Estado> listaEstado = EstadoDAO.GetAll();
            DefaultTableModel model = tabelaEstado;
            model.setNumRows(0);

            for (Estado estado : listaEstado) {
                model.addRow(new Object[]{
                    estado.getNome(),
                    estado.getSigla(),
                    estado.getDistritoFederal(),
                    estado.getOrcamentoTotal(),
                    estado.getGastosTotais()
                });
            }

            return listaEstado;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar os estados!\n" + ex);
        }

        return null;
    }

    public List<Estado> GetAllDevedor() {
        List<Estado> listEstado = new ArrayList<>();

        try {
            String query = "SELECT * FROM estado E WHERE E.gastostotais > E.orcamentototal";
            PreparedStatement stmt = connect.prepareStatement(query);
            ResultSet result = stmt.executeQuery();

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

    public List<Estado> GetAllTableDevedor(DefaultTableModel tabelaEstado) {
        try {
            EstadoController EstadoDAO = new EstadoController();
            List<Estado> listaEstado = EstadoDAO.GetAllDevedor();
            DefaultTableModel model = tabelaEstado;
            model.setNumRows(0);

            for (Estado estado : listaEstado) {
                model.addRow(new Object[]{
                    estado.getNome(),
                    estado.getSigla(),
                    estado.getDistritoFederal(),
                    estado.dividaEstado()
                });
            }

            return listaEstado;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar os estados!\n" + ex);
        }

        return null;
    }
}
