/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.google.gson.Gson;
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
public class CategoryController {
    private final Gson gson = new Gson();
    private final String getAllCategories = "/api/categories";
    private final String addCategory = "/api/categories/addCategory";

    public CategoryController() {
    }
    
    public List<Category> getAllCategories() {
        List<Category> founderList = null;
        try {
            String json = ConnectAPI.excuteHttpMethod("", getAllCategories, "GET");
            Type typeOfT = new TypeToken<ArrayList<Category>>(){}.getType();
            founderList = gson.fromJson(json, typeOfT);
        } catch (IOException ex) {
            Logger.getLogger(CategoryController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return founderList;
    }
    
    public String addCategory(Category p) {
        String response = "";
        try {
            String json = gson.toJson(p);
            response = ConnectAPI.excuteHttpMethod(json, addCategory , "POST");
            //print in String
            System.out.println(response);
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return response;
    }
}
