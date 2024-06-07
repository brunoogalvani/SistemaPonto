/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaponto;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author bthez
 */
public class UsuarioDAO {
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public ResultSet entrar(Usuario user) {
        String sql = "SELECT * FROM usuario WHERE usuario=? and senha=?;";
        
        try {
            ConnectionFactory cf = new ConnectionFactory();
            conexao = cf.obtemConexao();
        
            pst = conexao.prepareStatement(sql);
            pst.setString(1, user.getUsuario());
            pst.setString(2, user.getSenha());

            rs = pst.executeQuery();
            return rs;
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
                return null;
            }
    }
    
    public boolean existe(Usuario user) throws Exception{
        String sql = "SELECT * FROM usuario WHERE usuario=? and senha=?;";
        
        ConnectionFactory cf = new ConnectionFactory();
        
        try (Connection conn = cf.obtemConexao()){
            pst = conn.prepareStatement(sql);
            pst.setString(1, user.getUsuario());
            pst.setString(2, user.getSenha());
            
            try (ResultSet rs = pst.executeQuery()){
                return rs.next();
            }
        }
    }
}