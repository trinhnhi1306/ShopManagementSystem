/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Brand;
import utils.ConnectAPI;

/**
 *
 * @author TRINH
 */
public class BrandController extends BaseController{

    public BrandController() {
        getAll = "/api/brand";
    }
    
    public List<Brand> getAllBrands() {
        List<Brand> founderList = null;
        try {
            String json = ConnectAPI.excuteHttpMethodHasAuthentication("", getAll, "GET");
            Type typeOfT = new TypeToken<ArrayList<Brand>>(){}.getType();
            founderList = gson.fromJson(json, typeOfT);
        } catch (IOException ex) {
            Logger.getLogger(BrandController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return founderList;
    }
    
    public String addBrand(Brand b) {
        String response = "";
        try {
            String json = gson.toJson(b);
            response = ConnectAPI.excuteHttpMethod(json, addOne , "POST");
            //print in String
            System.out.println(response);
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return response;
    }
}
