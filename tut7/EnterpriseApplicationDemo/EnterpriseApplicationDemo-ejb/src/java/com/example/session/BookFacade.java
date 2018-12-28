/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.session;

import com.example.entity.Book;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Admin
 */
@Stateless
public class BookFacade extends AbstractFacade<Book> implements BookFacadeLocal {

    @PersistenceContext(unitName = "EnterpriseApplicationDemo-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BookFacade() {
        super(Book.class);
    }

    @Override
    public List<Book> searchBook(String nameorid) {
Query query= em.createNamedQuery("Book.searchBook");
        query.getParameter(nameorid);
        try{
            List<Book> list= query.getResultList();
            return list;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;    }

    @Override
    public List<Book> viewListBook() {
 List<Book> list= new ArrayList<>();
         Query query= em.createNamedQuery("Book.viewListBook");
         try{
             return list= query.getResultList();
         }catch(Exception e){
         }
         return list;    }
    
}
