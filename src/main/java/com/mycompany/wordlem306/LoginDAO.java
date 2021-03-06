/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wordlem306;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ltree
 */
public class LoginDAO {
    public static boolean validate(String user, String password) {
                
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = AdminloginBean.getConnection();
			ps = con.prepareStatement("Select username, password from Adminlogin where username = ? and password = ?");
			ps.setString(1, user);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				//result found, means valid inputs
				return true;
			}
		} catch (SQLException ex) {
			System.out.println("Login error -->" + ex.getMessage());
			return false;
		} finally {
			AdminloginBean.close(con);
		}
		return false;
}}
