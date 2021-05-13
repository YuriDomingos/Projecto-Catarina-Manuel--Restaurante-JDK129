<%-- 
    Document   : DashBoadr
    Created on : May 11, 2021, 9:58:58 AM
    Author     : yuridomingos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title></title>
    <link rel="stylesheet" href="fontawesome-free-5.15.3-web/css/all.css">
    <link rel="stylesheet" href="css/dash.css">
  </head>
  <body>

    <div class="container">

      <input type="checkbox" name="" id="check">

      <div class="top-bar">
        <label for="check">  <i class="fa fa-bars"></i> </label>

      </div>
      
   
          



      <!--SIDEBAR -->
          <div class="sidebar">

            <div class="header">
              <a href="#"> <i class="fa fa-home"></i>
              <span> Dashboard </span>
            </a>

          </div>


            <div class="contents">

              <ul>

                 <li>

                     <a href="Funcionario.jsp"> <i class="fa fa-users"></i>
                     <span> Funcionários </span>

                 </li>

                 <li>

                   <a href="#"> <i class="fa fa-comment"></i>
                        <span> Mensagens </span>

                 </li>

                 <li>

                   <a href="#"> <i class="fa fa-question-circle"></i>
                      <span> Perguntas</span>

                 </li>

                 <li>
                     <a href="#"> <i class="fa fa-cog"></i>
                       <span> Parametro</span>
                 </li>

                 <li>
                     <a href="#"> <i class="fa fa-sign-out-alt"></i>
                       <span> Documentação</span>
                 </li>

              </div>

          </div>
      
        <div class="workspace">
          
             
         <img src="imagens/log.png">
          
      </div>
      
      <form action="ClienteServelet" method="POST">
          
          <tr>
              <td> A instrução a ser introduzida </td>
              <td> <input type="text" name="txtField">
              <td> <input type="submit" value="Salvar"> </td>
          </tr>
      </form>
      
    </div>
   
    </body>
</html>
