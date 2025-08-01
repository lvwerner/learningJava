package com.vwerner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        String url = "jdbc:mysql://localhost:3306/poo";
        String user = "root";
        String password = "univille";
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Conectou!");
            Statement st = con.createStatement();
            String sql = "insert into pessoa(nome,cpf) values('Carrascal','44455566677');";
            System.out.println("Inseriu!");
            st.execute(sql);
        } catch(SQLException e){
            System.out.println("Deu erro!");
            e.printStackTrace();
        }
    }
}
