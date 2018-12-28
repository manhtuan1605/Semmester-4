/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.session;

import com.example.entity.Username;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Admin
 */
@Local
public interface UsernameFacadeLocal {

    void create(Username username);

    void edit(Username username);

    void remove(Username username);

    Username find(Object id);

    List<Username> findAll();

    List<Username> findRange(int[] range);

    int count();
    
    boolean checkLogin(String username, String password);
    
}
