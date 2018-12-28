/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.service;

import com.example.entity.Book;
import com.example.session.BookFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Admin
 */
@WebService(serviceName = "BookWebService")
public class BookWebService {

    @EJB
    private BookFacadeLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

//    @WebMethod(operationName = "create")
//    @Oneway
//    public void create(@WebParam(name = "book") Book book) {
//        ejbRef.create(book);
//    }
//
//    @WebMethod(operationName = "edit")
//    @Oneway
//    public void edit(@WebParam(name = "book") Book book) {
//        ejbRef.edit(book);
//    }
//
//    @WebMethod(operationName = "remove")
//    @Oneway
//    public void remove(@WebParam(name = "book") Book book) {
//        ejbRef.remove(book);
//    }
//
//    @WebMethod(operationName = "find")
//    public Book find(@WebParam(name = "id") Object id) {
//        return ejbRef.find(id);
//    }
//
//    @WebMethod(operationName = "findAll")
//    public List<Book> findAll() {
//        return ejbRef.findAll();
//    }
//
//    @WebMethod(operationName = "findRange")
//    public List<Book> findRange(@WebParam(name = "range") int[] range) {
//        return ejbRef.findRange(range);
//    }
//
//    @WebMethod(operationName = "count")
//    public int count() {
//        return ejbRef.count();
//    }

//    @WebMethod(operationName = "searchBook")
//    public List<Book> searchBook(@WebParam(name = "nameorid") String nameorid) {
//        return ejbRef.searchBook(nameorid);
//    }

    @WebMethod(operationName = "viewListBook")
    public List<Book> viewListBook() {
        return ejbRef.viewListBook();
    }
    
}
