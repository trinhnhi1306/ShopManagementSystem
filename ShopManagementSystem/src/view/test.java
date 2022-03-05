/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import model.Product;
import utils.Environment;

/**
 *
 * @author TRINH
 */
public class test {
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url = new URL(Environment.localhost + "/api/products/getProductsById/2");
        URLConnection conn = url.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String json = in.readLine();
        Gson gson = new Gson();
        Type productList = new TypeToken<ArrayList<Product>>(){}.getType();
        List<Product> founderList = gson.fromJson(json, productList);  
        for (Product p : founderList) {
            System.out.println(p.getBrand());
            System.out.println(p.getCategory());
            System.out.println(p.getProduct_id());
            System.out.println(p.getName());
            System.out.println(p.getPrice());
            System.out.println(p.getQuantity());
        }
    }
}
