/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psv;
import java.sql.*;
import java.util.*;
/**
 *
 * @author CAMARGO
 */
public class Teste {
   
    public static void main(String[] args) { 
        Connection con = Conexao.abrirConexao(); 
        CarroBean cb = new CarroBean(); 
        CarroDAO cd = new CarroDAO(con); 
        
 //Testando método inserir 
       /* cb.setPlaca("JKL2897"); 
        cb.setCor("Verde"); 
        cb.setDescricao("Carro 3"); 
        cb.setProprietario("Cara");
        cb.setMarca("tuyuta");
        cb.setTorque("10000");
        cb.setTamanho("muito grande");
        cb.setChassi("Abcdeamor");
        cb.setAcentos("4");
        cb.setTipo("Carro");
        cb.setAlugado("SIM");
        System.out.println(cd.inserir(cb));*/
        
 //Testando método alterar 
       /* cb.setPlaca("JKL2897"); 
        cb.setCor("Amarelo"); 
        cb.setDescricao("Carro 3");
        cb.setProprietario("Cara");
        cb.setMarca("tuyuta");
        cb.setTorque("10000");
        cb.setTamanho("muito grande");
        cb.setChassi("Abcdeamor");
        cb.setAcentos("4");
        cb.setTipo("Carro");
        cb.setAlugado("SIM");
        System.out.println(cd.alterar(cb)); */ 
 //Testando excluir 
         cb.setPlaca("JKL2897"); 
        System.out.println(cd.excluir(cb));
List<CarroBean> lista = cd.listarTodos(); 
    if(lista != null){ 
        for(CarroBean carro : lista){ 
        System.out.println("Placa: "+carro.getPlaca()); 
        System.out.println("Cor: "+carro.getCor()); 
        System.out.println("Descrição: "+carro.getDescricao());
        System.out.println("Proprietario: "+carro.getProprietario());
        System.out.println("Marca: "+carro.getMarca());
        System.out.println("Torque: "+carro.getTorque());
        System.out.println("Tamanho: "+carro.getTamanho());
        System.out.println("Chassi: "+carro.getChassi());
        System.out.println("Acentos: "+carro.getAcentos());
        System.out.println("Tipo de automovel: "+carro.getTipo());
        System.out.println("Alugado?: "+carro.getAlugado());
        } 
    }   
Conexao.fecharConexao(con); 
 }
    
    
    
}
