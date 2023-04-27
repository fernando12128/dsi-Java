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
public class CarroDAO {
    private Connection con;
    
    public CarroDAO(Connection con){
        setCon(con);
    }
    
    public Connection getCon(){
        return con;
    }
    
    public void setCon(Connection con){
        this.con = con;
    }


public String inserir(CarroBean carro){
    String sql = "inset into carro(placa,cor,descricao)values(?,?,?)";

    try{
    PreparedStatement ps = getCon().prepareStatement(sql);
    ps.setString(1, carro.getPlaca());
    ps.setString(2, carro.getCor());
    ps.setString(3, carro.getDescricao());

    if(ps.executeUpdate() > 0){
        return "Inserido com sucesso.";
    }else{
        return"Erro ao Inserir!";
    }

    }catch (SQLException e){
        return e.getMessage();
    }
}

public String alterar (CarroBean carro){
    String sql = "update carro ser cor = ?, descricao = ?";
            
            sql += "where placa =?";
            
            try{
                PreparedStatement ps = getCon().prepareStatement(sql);
                    ps.setString(1, carro.getCor());
                    ps.setString(2, carro.getDescricao());
                    ps.setString(3, carro.getPlaca());
             if(ps.executeUpdate() > 0){
                return "Inserido com sucesso.";
            }else{
                return"Erro ao Inserir!";
            }

            }catch (SQLException e){
                return e.getMessage();
            }
}

public String excluir (CarroBean carro){
    String sql = "dele from carro where placa = ?";
            
            
            try{
                PreparedStatement ps = getCon().prepareStatement(sql);
                
                ps.setString(1, carro.getPlaca());
              
             if(ps.executeUpdate() > 0){
                return "Excluido com sucesso.";
            }else{
                return"Erro ao Excluir!";
            }

            }catch (SQLException e){
                return e.getMessage();
            }
}

public List<CarroBean> ListarTodos(){
    String sql = "select * from carro";
    
    List<CarroBean> listaCarro = new ArrayList<CarroBean>();
    
    try{
        PreparedStatement ps = getCon().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
    }
}

}

    

