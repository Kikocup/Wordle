/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wordlem306;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author ltree
 */
@Named(value = "loginBean")
@ManagedBean
@SessionScoped
public class LoginBean implements Serializable{
  private String username;
  private String password;
  private boolean login;
  private boolean alert;

    public boolean isAlert() {
        return alert;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
  
    public String doLoginNow(){
        login = LoginDAO.validate(username, password);
        if(login){
            return "wordlist_1/List";
        }
        else{
            alert = true;
            return "login";
        }
    }
}
