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
public class PratoModelo {
    
    private int idPrato, idCategoria;
    private String nomePrato, tipoCategoria;
    private float precoPrato;

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNomePrato() {
        return nomePrato;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    public String getTipoCategoria() {
        return tipoCategoria;
    }

    public void setTipoCategoria(String tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }
    
   
    

    public PratoModelo() {
    }

    public int getIdPrato() {
        return idPrato;
    }

    public void setIdPrato(int idPrato) {
        this.idPrato = idPrato;
    }

    public String getNomePreco() {
        return nomePrato;
    }

    public void setNomePreco(String nomePreco) {
        this.nomePrato = nomePreco;
    }

    public float getPrecoPrato() {
        return precoPrato;
    }

    public void setPrecoPrato(float precoPrato) {
        this.precoPrato = precoPrato;
    }

   
    
    
    
   
    
}
