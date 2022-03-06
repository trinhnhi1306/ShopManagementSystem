/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author TRINH
 */
public class ConnectAPI {
    public static final String LOCALHOST = "http://localhost:44392";
    
    public static String excuteHttpMethod(String json, String link, String type) throws MalformedURLException, IOException{
        URL obj = new URL(LOCALHOST + link); // địa chỉ api
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        
        con.setRequestMethod(type); //type: POST, PUT, DELETE, GET
        
        //add request header if type is POST, PUT
        if(type.equals("POST") || type.equals("PUT")) {
            con.setDoOutput(true); // Truyền là true để biểu thị rằng connection sẽ được sử dụng cho output. Giá trị mặc định là false
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("Content-Length", String.valueOf(json.getBytes("UTF-8").length));
            con.getOutputStream().write(json.getBytes("UTF-8"));
        }
        int responseCode = con.getResponseCode();
        System.out.println("\nSending '" + type + "' request to URL : " + LOCALHOST + link);
        System.out.println("Response Code : " + responseCode);
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
           response.append(inputLine);
        }
        in.close();
        return response.toString();
    }
}
