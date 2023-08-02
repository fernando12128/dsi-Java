/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psv;
import java.sql.*;

/**
 *
 * @author CAMARGO
 */
public class Conexao {

    
    
 public static Connection abrirConexao() { 
    Connection con = null; //método para iniciar a variavel
    try { 
 
Class.forName("com.mysql.jdbc.Driver").newInstance(); //iniciar o driver para as conexões do banco de dados
        String url = ""; // aqui começa a conexão do banco endereço e login
        url += "jdbc:mysql://127.0.0.1/estacionamento?"; // endereço
        url += "user=root&password="; // login
        
        con = DriverManager.getConnection(url);  // chama a conexão do banco de dados e "abre" o banco
        System.out.println("Conexão aberta."); // avisa que a conexão deu certo
    } catch (SQLException e) { 
        System.out.println(e.getMessage()); // aviso para caso haja alguma exceção na conexão do banco de dados 
    } catch (ClassNotFoundException e) { 
        System.out.println(e.getMessage()); //aviso para exceção no processo de registro do banco de dados
    } catch (Exception e) { 
        System.out.println(e.getMessage()); // aviso para qualquer outra exceção que ocorrer
    } return con;  //retorna a solicitação
        
 } 
 public static void fecharConexao(Connection con) { 
    try { 
        con.close(); //método para fechar a conexão com o banco de dados
        System.out.println("Conexão fechada."); //avisa que a conexão foi fechada com sucesso
    } catch (SQLException e) { 
        System.out.println(e.getMessage()); // aviso para caso haja alguma exceção no fechamento da conexão do banco de dados 
    } catch (Exception e) { 
        System.out.println(e.getMessage()); // aviso para qualquer outra exceção que ocorrer
    } 
 }
    
    
    
}
