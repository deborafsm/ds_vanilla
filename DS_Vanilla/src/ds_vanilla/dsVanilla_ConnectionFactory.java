/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_vanilla;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Débora
 */
public class dsVanilla_ConnectionFactory {

    public Statement stmt; //preparar e realizar pesquisa no banco de dados
    public Connection conn; // conexão com bd
    public ResultSet rs; // armazena resultado buscado na pesquisa
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/ds_vanilla";
    private static final String USER = "root";
    private static final String PASS = "";
//Pega a conexao

    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) { //Multicath para juntas as duas exceções 
            throw new RuntimeException("Erro na conexão: ", ex); //Mostra uma mensagem e a execeções 
        }
    }

    public void executaSql(Connection con, String sql) {
        try {
            stmt = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executaSql \n" + ex.getMessage());
        }
    }
//Fecha a conexao 

    public static void closeConnection(Connection conn) {
        if (conn != null) {
            try {
                //tem alguma coisa aberta
                conn.close();
            } catch (SQLException ex) {
                System.out.println("Erro" + ex);

            }
        }
    }
//Fecha a conexao e ps

    public static void closeConnection(Connection conn, PreparedStatement stmt) {
        if (stmt != null) {
            try {
                //tem alguma coisa aberta
                conn.close();
            } catch (SQLException ex) {
                System.out.println("Erro" + ex);

            }
        }
    }
//Fecha a conexao, ps e rs

    public static void closeConnection(Connection conn, PreparedStatement stmt, ResultSet rs) {
        if (rs != null) {
            try {
                //tem alguma coisa aberta
                conn.close();
            } catch (SQLException ex) {
                System.out.println("Erro" + ex);

            }
        }
    }

    public void conexao() {
        //conexao com banco de dados
        try {
            System.setProperty("jdbc.Drivers", DRIVER);
            conn = DriverManager.getConnection(URL, USER, PASS);
            //JOptionPane.showMessageDialog(null, "Conexão efetuada com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar com o banco de dados: \n" + ex.getMessage());
        }
    }
}
