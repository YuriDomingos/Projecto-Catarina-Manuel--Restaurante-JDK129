<%-- 
    Document   : TabelaPratos
    Created on : May 12, 2021, 3:10:42 AM
    Author     : yuridomingos
--%>

<%@page import="java.util.List"%>
<%@page import="Modelo.PratoModelo"%>
<%@page import="DAO.PratoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <table>
            <thead> 
            <tr>
                <td> Id Prato </td>
                <td> Nome Prato </td>
                <td> Preço      </td>
                <td> Categoria </td>
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
                    <td> <%= prato.getIdPrato()    %> </td>
                    <td> <%= prato.getNomePrato()  %> </td>
                    <td> <%= prato.getPrecoPrato() %> </td>
                    <td> <%= prato.getTipoCategoria() %> </td>
                    
                    
                </tr>
                
            </tbody>
            
             <%}

               %>
            
        </table>
    </body>
</html>
