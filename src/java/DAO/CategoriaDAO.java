/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexao.Conexao;
import Modelo.CategoriaModelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yuridomingos
 */
public class CategoriaDAO {
    
    private Connection con;
    private PreparedStatement ps;
    private Conexao conexao = new Conexao();
    private ResultSet rs;
    private String query ="SELECT *FROM tb_Categoria";
    
    public CategoriaDAO()
    {
        
    }
    
    public List<CategoriaModelo> lista_categorias()
    {
        List<CategoriaModelo> lista = new ArrayList<CategoriaModelo>();
        
        try {
            
              con = conexao.abrirConexao();
              ps = con.prepareStatement(query);
              rs = ps.executeQuery();
              
              while( rs.next())
              {
                  CategoriaModelo categoria  = new CategoriaModelo();
                  
                  categoria.setIdCategoria(rs.getInt("idCategoria"));
                  categoria.setNomeCategoria(rs.getString("tipoCategoria"));
                  lista.add(categoria);
              }
              
              
            
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        
        return lista;
    }
    
    
}
