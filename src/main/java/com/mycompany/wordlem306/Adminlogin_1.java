/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wordlem306;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ltree
 */
@Entity
@Table(name = "adminlogin")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Adminlogin_1.findAll", query = "SELECT a FROM Adminlogin_1 a"),
    @NamedQuery(name = "Adminlogin_1.findById", query = "SELECT a FROM Adminlogin_1 a WHERE a.id = :id"),
    @NamedQuery(name = "Adminlogin_1.findByUsername", query = "SELECT a FROM Adminlogin_1 a WHERE a.username = :username"),
    @NamedQuery(name = "Adminlogin_1.findByPassword", query = "SELECT a FROM Adminlogin_1 a WHERE a.password = :password")})
public class Adminlogin_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "password")
    private String password;

    public Adminlogin_1() {
    }

    public Adminlogin_1(Integer id) {
        this.id = id;
    }

    public Adminlogin_1(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Adminlogin_1)) {
            return false;
        }
        Adminlogin_1 other = (Adminlogin_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.wordlem306.Adminlogin_1[ id=" + id + " ]";
    }
    
}
