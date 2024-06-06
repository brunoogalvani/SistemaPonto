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
public class ConnectionFactory {
    private String usuario = "root";
    private String senha = "bruno";
    private String host = "localhost";
    private String porta = "3306";
    private String bd = "sistemaponto";
    Connection c = null;
    
    public Connection obtemConexao (){
        try{
            Connection c = DriverManager.getConnection(
                "jdbc:mysql://" + host + ":" + porta + "/" + bd,
                usuario,
                senha
            );
            return c;
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
