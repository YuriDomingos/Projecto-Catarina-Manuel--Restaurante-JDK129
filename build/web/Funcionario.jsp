<%-- 
    Document   : Funcionario
    Created on : May 11, 2021, 4:35:47 PM
    Author     : yuridomingos
--%>

<%@page import="Modelo.PratoModelo"%>
<%@page import="DAO.PratoDAO"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.CategoriaModelo"%>
<%@page import="DAO.CategoriaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/TabelaPratos.css">
        <title> Funcionario </title>
    </head>
    <body>
        
        <div class="welcomeTO">
            
            <h1>CADASTRO DE PRATOS NOVO!</h1>
            <img src="imagens/log.png"/>
        </div>
        
        <table>
            
            <form action="PratoServelet" method="POST"> 
            <tr>
                <td>Nome do Prato </td><td> <input type="text" name="txtField"></td>
            
            </tr>
            
            <tr>
                <td>Preço</td><td><input type="text" name="precoDoPrato" required=""></td>
            </tr>
            
            <tr>
                
                <td> Categoria </td><td><select name="Categoria"> 
                    
                        <option selected="selected"> Seleciona a categoria </option>
                        <%
                            CategoriaDAO categoria = new CategoriaDAO();
                            List<CategoriaModelo> lista = categoria.lista_categorias();
                             
                           for ( CategoriaModelo list : lista) {
                              
                            
                         %>
                         <option value=<%= list.getIdCategoria()%>><%=list.getNomeCategoria()%></option>
                         <%}

                           %>

                    
                    </select></td>
            </tr>
            
            <tr>
                <td><input type="submit" value="Salvar"></td>
                <td><input type="reset" value="Limpar"></td>
            </tr>
            
            </form>
                           
                           
        </table>
                           
            <table class="table" >
            <thead> 
            <tr>
                <th> Id Prato </th>
                <th> Nome Prato </th>
                <th> Preço      </th>
                <th> Categoria </th>
            </tr>
            </thead>
            
            <%
                PratoDAO pratoDAO = new PratoDAO();
                List<PratoModelo> pratos = pratoDAO.lista_Pratos();
                for ( PratoModelo prato : pratos)
                {
                    
                
            %>
            
            <tbody>
              
                <tr>
                    <td data-label="S.No"> <%= prato.getIdPrato()    %> </td>
                    <td data-label="Name"> <%= prato.getNomePrato()  %> </td>
                    <td data-label="Age"> <%= prato.getPrecoPrato() %> </td>
                    <td data-label="Age"> <%= prato.getTipoCategoria() %> </td>
                    
                    
                </tr>
                
            </tbody>
            
             <%}

               %>
            
        </table>
    </body>
</html>
