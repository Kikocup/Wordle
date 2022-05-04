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
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author ltree
 */
@Named(value = "adminloginBean")
@RequestScoped
public class AdminloginBean {

     private String inputUsername, inputPassword;


    public AdminloginBean(String inputUsername, String inputPassword) {
        this.inputUsername = inputUsername;
        this.inputPassword = inputPassword;
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
          Logger.getLogger(AdminloginBean.class.getName()).log(Level.SEVERE, null, ex);
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
    public List<Adminlogin> getAdminloginList() throws SQLException {

        //get database connection
        Connection con = this.getConnection();

        if (con == null) {
            throw new SQLException("Can't get database connection");
        }

        PreparedStatement ps
                = con.prepareStatement(
                        "select id, username, password from adminlogin");

        //get customer data from database
        ResultSet result = ps.executeQuery();

        List<Adminlogin> list = new ArrayList<>();

        while (result.next()) {
            Adminlogin cust = new Adminlogin();

            cust.setId(result.getInt("id"));
            cust.setUsername(result.getString("username"));
            cust.setPassword(result.getString("password"));

            //store all data into a List
            list.add(cust);
        }

        return list;
    }
}
