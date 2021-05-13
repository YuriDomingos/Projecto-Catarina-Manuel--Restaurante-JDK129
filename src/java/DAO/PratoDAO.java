/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexao.Conexao;
import Modelo.PratoModelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author : yuridomingos
 * Data    : 11 - 05 - 2021
 * Objectivo : Construir um único cenario
 */
public class PratoDAO {
    
    private Connection con;
    private PreparedStatement ps;
    private Conexao conexao = new Conexao();
    private String inserir ="INSERT INTO tb_Pratos VALUES (null,?,?,?)";
    
    private String query = " select p.idPrato, p.nomePrato, p.preco, c.tipoCategoria "
                            + "from tb_Pratos p, tb_Categoria c "
                            + "WHERE p.categoria = c.idCategoria ORDER BY p.idPrato";
   private ResultSet rs = null;
    
    public PratoDAO()
    {
        
    }
    
    public void SalvarPrato(PratoModelo pratoModelo)
    {
        
        try {
            
              con =conexao.abrirConexao();
              ps = con.prepareStatement(inserir);
              ps.setString(1, pratoModelo.getNomePreco());
              ps.setFloat(2, pratoModelo.getPrecoPrato());
              ps.setInt(3, pratoModelo.getIdCategoria());
              ps.executeUpdate();
              ps.close();
              conexao.fecharConexao();
            
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        
    }
    
    public List<PratoModelo> lista_Pratos()
    {
        List<PratoModelo> listaPratos = new ArrayList<PratoModelo>();
        
        try {
             
             con = conexao.abrirConexao();
             ps = con.prepareStatement(query);
             rs = ps.executeQuery();
             
             while( rs.next())
             {
                 PratoModelo pratoModelo = new PratoModelo();
                 pratoModelo.setIdPrato(rs.getInt("idPrato"));
                 pratoModelo.setNomePrato(rs.getString("nomePrato"));
                 pratoModelo.setPrecoPrato(rs.getFloat("preco"));
                 pratoModelo.setTipoCategoria(rs.getString("tipoCategoria"));
                 listaPratos.add(pratoModelo);
             }
            
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        
        return listaPratos;
        
    }
    
    
    
    
}
