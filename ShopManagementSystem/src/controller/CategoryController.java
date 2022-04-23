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
import model.Response;
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
            Response reponse = ConnectAPI.excuteHttpMethod("", getAll, "GET", true);
            Type typeOfT = new TypeToken<ArrayList<Category>>(){}.getType();
            founderList = gson.fromJson(reponse.getMessage(), typeOfT);
        } catch (IOException ex) {
            Logger.getLogger(CategoryController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return founderList;
    }
    
    public Response addCategory(Category c) {
        Response response = null;
        try {
            String json = gson.toJson(c);
            response = ConnectAPI.excuteHttpMethod(json, addOne , "POST", true);
            //print in String
            System.out.println(response.getMessage());
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return response;
    }
}
