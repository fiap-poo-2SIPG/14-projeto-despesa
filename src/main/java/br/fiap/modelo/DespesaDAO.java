package br.fiap.modelo;

import br.fiap.conexao.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DespesaDAO {
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;

    public void inserir(Despesa despesa) {
        sql = "insert into java_despesa values (?, ?, ?, ?, ?)";
        try(Connection connection = Conexao.conectar()) {
            ps = connection.prepareStatement(sql);

            ps.execute();
        }
        catch(SQLException e) {
            System.out.println("erro ao inserir no banco de dados\n" + e);
        }
    }

}
