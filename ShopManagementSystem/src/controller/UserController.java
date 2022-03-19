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
import model.User;
import utils.ConnectAPI;

/**
 *
 * @author TRINH
 */
public class UserController {
    private final Gson gson = new Gson();
    private final String signIn = "/api/auth/signin";

    public UserController() {
    }
    
    public List<User> signIn() {
        List<User> founderList= null;
        try {
            String json = ConnectAPI.excuteHttpMethod("", signIn, "GET");
            Type typeOfT = new TypeToken<ArrayList<User>>(){}.getType();
            founderList = gson.fromJson(json, typeOfT);
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        if(founderList.isEmpty())
            return null;
        return founderList;
    }
}
