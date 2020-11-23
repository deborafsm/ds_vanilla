package ds_vanilla;


import java.sql.*;
import javax.swing.JOptionPane;



public class ConexaoBD {
    public Statement stm; //preparar e realizar pesquisa no banco de dados
    public ResultSet rs; // armazena resultado buscado na pesquisa
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/ds_vanilla";
    private static final String USER = "root";
    private static final String PASS = "";
    public Connection con; // conexão com bd
    
    public void conexao (){
        //conexao com banco de dados
       try {
            System.setProperty("jdbc.Drivers", DRIVER);
            con = DriverManager.getConnection(URL,USER,PASS);
            //JOptionPane.showMessageDialog(null, "Conexão efetuada com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar com o banco de dados: \n"+ ex.getMessage());
        }
    }
    
    public void executaSql (String sql){
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executaSql \n"+ ex.getMessage());
        }
    }
    
    public void desconecta (){
        try {
            con.close();
            //JOptionPane.showMessageDialog(null, "Desconectado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexao com banco de dados:\n"+ ex.getMessage());
        }
    }
    
}
