/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author  : yuridomingos
 * Data     : 11 - 05 - 2021
 * Objectivo : Construir as classes modelos 
 */
public class CategoriaModelo {
    
    private int idCategoria;
    private String nomeCategoria;

    public CategoriaModelo()
    {
        
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }
    
    
    
    
}
