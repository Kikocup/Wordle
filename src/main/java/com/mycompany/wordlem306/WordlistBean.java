/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wordlem306;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.Dependent;
import javax.inject.Named;



/**
 *
 * @author ltree
 */
@Named(value = "wordlistBean")
@Dependent
public class WordlistBean{
    public WordlistBean() {
    }
    public static Connection getConnection() {

        Connection connect = null;
        String url = "jdbc:mysql://localhost:3306/m306";
        String username = "root";
        String password = "";
        try {
          //Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection(url, username, password);
         } catch (SQLException ex) {
          Logger.getLogger(WordlistBean.class.getName()).log(Level.SEVERE, null, ex);
         }
        return connect;
    }
    public static void close(Connection connection) {
		try {
			connection.close();
		} catch (Exception ex) {
		}
	}

    //connect to DB and get customer list
    public List<Wordlist> getWordlistList() throws SQLException {

        //get database connection
        Connection con = this.getConnection();

        if (con == null) {
            throw new SQLException("Can't get database connection");
        }

        PreparedStatement ps
                = con.prepareStatement(
                        "select id, word from wordlist ORDER BY RAND()");

        //get customer data from database
        ResultSet result = ps.executeQuery();

        List<Wordlist> list = new ArrayList<>();

        while (result.next()) {
            Wordlist cust = new Wordlist();

            cust.setId(result.getInt("id"));
            cust.setWord(result.getString("word"));
            //store all data into a List
            list.add(cust);
        }

        return list;
    }
    public String word() throws SQLException{
        Connection con = this.getConnection();
        if (con == null) {
            throw new SQLException("Can't get database connection");
        }

        PreparedStatement ps
                = con.prepareStatement(
                        "select word from wordlist ORDER BY RAND() LIMIT 1");

        ResultSet result = ps.executeQuery();
                result.next();
        String word = result.getString("word");
        return word;
    }
}
