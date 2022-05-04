/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wordlem306;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ltree
 */
@Stateless
public class Wordlist_1Facade extends AbstractFacade<Wordlist_1> {

    @PersistenceContext(unitName = "com.mycompany_WordleM306_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Wordlist_1Facade() {
        super(Wordlist_1.class);
    }
    
}
