/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexao.Conexao;
import Modelo.ClienteModelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author yuridomingos
 * Data    : 11 -05 - 2021
 * Objectivo : Construir o cliente DAO
 */
public class ClienteDAO {
    
    private Connection con;
    private PreparedStatement ps;
    private Conexao Conexao = new Conexao();
    private String query = "INSERT INTO tb_pessoa VALUES (?)";
    
    public void salvarCliente(ClienteModelo clienteM)
    {
        
        try {
            
            con = Conexao.abrirConexao();
            ps = con.prepareStatement(query);
            ps.setString(1, clienteM.getUsername());
            ps.executeUpdate();
            ps.close();
            con.close();
            System.out.println("Novo contacto adicionado ");
            
        }catch(SQLException ex)
        {
           ex.printStackTrace();
        }
    }
    
}
