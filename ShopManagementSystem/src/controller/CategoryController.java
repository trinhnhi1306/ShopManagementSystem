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
import model.Category;
import utils.ConnectAPI;

/**
 *
 * @author TRINH
 */
public class CategoryController extends BaseController{
    
    public CategoryController() {
        getAll = "/api/category";
    }
    
    public List<Category> getAllCategories() {
        List<Category> founderList = null;
        try {
            String json = ConnectAPI.excuteHttpMethodHasAuthentication("", getAll, "GET");
            Type typeOfT = new TypeToken<ArrayList<Category>>(){}.getType();
            founderList = gson.fromJson(json, typeOfT);
        } catch (IOException ex) {
            Logger.getLogger(CategoryController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return founderList;
    }
    
    public String addCategory(Category c) {
        String response = "";
        try {
            String json = gson.toJson(c);
            response = ConnectAPI.excuteHttpMethod(json, addOne , "POST");
            //print in String
            System.out.println(response);
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return response;
    }
}
