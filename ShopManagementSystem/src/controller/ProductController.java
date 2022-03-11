/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Product;
import utils.ConnectAPI;

/**
 *
 * @author TRINH
 */
public class ProductController {
    
    private final Gson gson = new Gson();
    private final String getProductByID = "/api/products/getProductsById/";
    private final String getAllProducts = "/api/products/getAllProducts";
    private final String addProduct = "/api/products/addProduct";
    private final String editOrDeleteProduct = "/api/products/";
    public ProductController() {
    }
    
    public Product getProductsById(int id) {
        List<Product> founderList = null;        
        try {
            String json = ConnectAPI.excuteHttpMethod("", getProductByID + id, "GET");
            Type typeOfT = new TypeToken<ArrayList<Product>>(){}.getType();
            founderList = gson.fromJson(json, typeOfT);
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        if(founderList.isEmpty())
            return null;
        return founderList.get(0);
    }
    
    public List<Product> getAllProducts() {
        List<Product> founderList= null;
        try {
            String json = ConnectAPI.excuteHttpMethod("", getAllProducts, "GET");
            Type typeOfT = new TypeToken<ArrayList<Product>>(){}.getType();
            founderList = gson.fromJson(json, typeOfT);
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        if(founderList.isEmpty())
            return null;
        return founderList;
    }
    
    public String addProduct(Product p) {
        String response = "";
        try {
            String json = gson.toJson(p);
            response = ConnectAPI.excuteHttpMethod(json, addProduct , "POST");
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
            response = ConnectAPI.excuteHttpMethod(json, editOrDeleteProduct + id , "PUT");
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
            response = ConnectAPI.excuteHttpMethod("", editOrDeleteProduct + id , "DELETE");
            //print in String
            System.out.println(response);
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return response;
    }
}
