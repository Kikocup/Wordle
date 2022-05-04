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

/**
 *
 * @author ltree
 */
@Entity
@Table(name = "wordlist")
@NamedQueries({
    @NamedQuery(name = "Wordlist_1.findAll", query = "SELECT w FROM Wordlist_1 w"),
    @NamedQuery(name = "Wordlist_1.findById", query = "SELECT w FROM Wordlist_1 w WHERE w.id = :id"),
    @NamedQuery(name = "Wordlist_1.findByWord", query = "SELECT w FROM Wordlist_1 w WHERE w.word = :word")})
public class Wordlist_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "word")
    private String word;

    public Wordlist_1() {
    }

    public Wordlist_1(Integer id) {
        this.id = id;
    }

    public Wordlist_1(Integer id, String word) {
        this.id = id;
        this.word = word;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
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
        if (!(object instanceof Wordlist_1)) {
            return false;
        }
        Wordlist_1 other = (Wordlist_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.wordlem306.Wordlist_1[ id=" + id + " ]";
    }
    
}
