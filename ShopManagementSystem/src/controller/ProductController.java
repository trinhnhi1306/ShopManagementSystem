/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Image;
import java.io.IOException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.Product;
import output.ProductOutput;
import utils.ConnectAPI;

/**
 *
 * @author TRINH
 */
public class ProductController extends BaseController{  
    
    private String getProductInOnePage;
    private String getImage;
    
    public ProductController() {
        getOneByID = "/api/product/get-product?idProduct=";
        getAll = "/api/products/getAllProducts";
        addOne = "/api/products/addProduct";
        editOrDelete = "/api/products/";
        getProductInOnePage = "/api/product/";
        getImage = "/api/product/get-image/";
    }

    public Product getProductById(String id) {
        Product p = null;        
        try {
            String json = ConnectAPI.excuteHttpMethodHasAuthentication("", getOneByID + id, "GET");
            p = gson.fromJson(json, Product.class);
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return p;
    }
    
    public ProductOutput getProductInOnePage(int pageNo) {
        ProductOutput founderList= null;
        try {
            String json = ConnectAPI.excuteHttpMethodHasAuthentication("", getProductInOnePage + pageNo, "GET");
            founderList = gson.fromJson(json, ProductOutput.class);
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return founderList;
    }
    
    public String addProduct(Product p) {
        String response = "";
        try {
            String json = gson.toJson(p);
            response = ConnectAPI.excuteHttpMethod(json, addOne , "POST");
            //print in String
            System.out.println(response);
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return response;
    }
    
    public String updateProductByID(int id, Product p) {
        String response = "";
        try {            
            String json = gson.toJson(p);
            response = ConnectAPI.excuteHttpMethod(json, editOrDelete + id , "PUT");
            //print in String
            System.out.println(response);
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return response;
    }
    
    public String deleteProductByID(int id) {
        String response = "";
        try {  
            response = ConnectAPI.excuteHttpMethod("", editOrDelete + id , "DELETE");
            //print in String
            System.out.println(response);
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return response;
    }
    
    public void loadTable(List<Product> list, DefaultTableModel dtm) {
        dtm.setNumRows(0);
        Vector vt;
        for (Product p: list) {
            vt = new Vector();
            vt.add(p.getProductId());
            vt.add(p.getName());
            vt.add(p.getCategory().getName());
            vt.add(p.getBrand().getName());
            vt.add(p.getCalculationUnit());
            vt.add(p.getPrice());
            vt.add(p.getQuantity());
            dtm.addRow(vt);
        }
    }
    
    public Image getImage(String imageName) {
        Image img = null;
        try {
            img = ConnectAPI.getImageHasAuthentication(getImage + imageName);
        } catch (IOException ex) {
            Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return img;
    }
}
