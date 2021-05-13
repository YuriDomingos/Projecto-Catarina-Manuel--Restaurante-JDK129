/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author : yuridomingos
 * Data    : 11 - 05 - 2021
 * Objectivo : Construir a nossa class de conexão
 */
public class Conexao {
    
    private Connection conexao;
    private  String driver ="com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/login";
    private String username = "yuri";
    private String password ="Outbox@2021";
    
    
    public Connection  abrirConexao()
    {
        
        try {
            
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, username, password);
            if ( conexao != null)
                System.out.println("Conectado com sucesso");
            
            return conexao;
            
            
        }catch(SQLException ex)
        {
          ex.printStackTrace();
           return null;
        }
        catch(ClassNotFoundException ex)
        {
           ex.printStackTrace();
           return null;
        }
    
    }
    
    public void fecharConexao()
    {
        
        try {
            
            conexao.close();
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Erro ao fechar a base de dados ");
        }
    }
    
    
}
