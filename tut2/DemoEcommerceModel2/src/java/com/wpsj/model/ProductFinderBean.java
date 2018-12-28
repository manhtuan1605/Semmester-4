/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wpsj.model;

import com.wpsj.da.ProductDataAccess;
import com.wpsj.entity.Product;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ProductFinderBean {
    private String keyword;
    public void setKeyword(String keyword){
    this.keyword= keyword;
    }
    public List<Product> getProducts(){
    return new ProductDataAccess().getProductByName(keyword);
    }
}
