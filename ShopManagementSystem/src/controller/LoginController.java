/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;
import model.Login;
import utils.ConnectAPI;

/**
 *
 * @author TRINH
 */
public class LoginController extends BaseController{
    private String login;

    public LoginController() {
        login = "/api/auth/signin";
    }
    
    public Login login(String username, String password) {
        Login input = new Login();
        input.setUsername(username);
        input.setPassword(password);
        
        String json = gson.toJson(input);
        System.out.println("Json: " + json);
        Login output = null;        
        try {
            String json1 = ConnectAPI.excuteHttpMethod(json, login, "POST");
            output = gson.fromJson(json1, Login.class);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        return output;
    }
}
