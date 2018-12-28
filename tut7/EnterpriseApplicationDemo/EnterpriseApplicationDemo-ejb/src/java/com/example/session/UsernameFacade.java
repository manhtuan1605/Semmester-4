/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.session;

import com.example.entity.Username;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Admin
 */
@Stateless
public class UsernameFacade extends AbstractFacade<Username> implements UsernameFacadeLocal {

    @PersistenceContext(unitName = "EnterpriseApplicationDemo-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsernameFacade() {
        super(Username.class);
    }

    @Override
    public boolean checkLogin(String username, String password) {
        Query query= em.createNamedQuery("Username.checkLogin");
        query.setParameter("username", username);
        query.setParameter("password", password);
        try{
            query.getSingleResult();
            return true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
    
}
