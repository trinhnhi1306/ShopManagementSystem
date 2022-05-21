/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.awt.Image;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.Response;
import model.User;
import output.UserOutput;
import utils.ConnectAPI;

/**
 *
 * @author TRINH
 */
public class UserController extends BaseController {

    private final Gson gson = new Gson();
    private final String signIn = "/api/auth/signin";

    public UserController() {
        getOneByID = "/api/users/";
        getItemInOnePage = "/api/users?pageNo=%d&pageSize=20&sortField=id&sortDirection=desc";
        getImage = "/api/users/image/";
    }
    
    public User getUserById(String id) {
        User u = null;
        try {
            Response response = ConnectAPI.excuteHttpMethod("", getOneByID + id, "GET", true);
            u = gson.fromJson(response.getMessage(), User.class);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return u;
    }

    public List<User> signIn() {
        List<User> founderList = null;
        try {
            Response response = ConnectAPI.excuteHttpMethod("", signIn, "GET", false);
            Type typeOfT = new TypeToken<ArrayList<User>>() {
            }.getType();
            founderList = gson.fromJson(response.getMessage(), typeOfT);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        if (founderList.isEmpty()) {
            return null;
        }
        return founderList;
    }

    public UserOutput getUserInOnePage(int pageNo) {
        String str = String.format(getItemInOnePage, pageNo);
        System.out.println(str);
        UserOutput founderList = null;
        try {
            Response response = ConnectAPI.excuteHttpMethod("", str, "GET", true);
            founderList = gson.fromJson(response.getMessage(), UserOutput.class);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return founderList;
    }
    
    public void loadTable(List<User> list, DefaultTableModel dtm) {
        dtm.setNumRows(0);
        Vector vt;
        for (User u : list) {
            vt = new Vector();
            vt.add(u.getId());
            vt.add(u.getUsername());
            vt.add(u.getFirstName());
            vt.add(u.getLastName());
            vt.add(u.getEmail());
            vt.add(u.getPhone());
            dtm.addRow(vt);
        }
    }
    
    public Image getImage(String imageName) {
        Image img = null;
        try {
            img = ConnectAPI.getImageHasAuthentication(getImage + imageName);
        } catch (IOException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return img;
    }
}
