/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Response;
/**
 *
 * @author TRINH
 */
public class ConnectAPI {
    public static final String LOCALHOST = "http://localhost:8080";
    public static String tokenType;
    public static String accessToken;
    private static final String EOL = "\r\n";
    
    public static Response excuteHttpMethod(String json, String link, String type, boolean authentication) throws MalformedURLException, IOException{
        URL url = new URL(LOCALHOST + link); // địa chỉ api
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        
        con.setRequestMethod(type); //type: POST, PUT, DELETE, GET
        
        if(authentication == true)
            con.setRequestProperty("Authorization", tokenType + " " + accessToken);
        
        //add request header if type is POST, PUT
        if(type.equals("POST") || type.equals("PUT")) {
            con.setDoOutput(true); // Truyền là true để biểu thị rằng connection sẽ được sử dụng cho output. Giá trị mặc định là false
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("Content-Length", String.valueOf(json.getBytes("UTF-8").length));
            con.getOutputStream().write(json.getBytes("UTF-8"));
        }
        int responseCode = con.getResponseCode();
        con.getErrorStream();
        System.out.println("\nSending '" + type + "' request to URL: " + LOCALHOST + link);
        System.out.println("Response Code: " + responseCode);
        BufferedReader in = null;
        if((responseCode >= 200) && (responseCode <= 202))
            in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        else 
            in = new BufferedReader(new InputStreamReader(con.getErrorStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
           response.append(inputLine);
        }
        in.close();
        return new Response(responseCode, response.toString());
    }
    
    public static int uploadImage(File logFileToUpload, String url, String method, boolean authentication) throws IOException {
        URL serverUrl = new URL(url);
        HttpURLConnection urlConnection = (HttpURLConnection) serverUrl.openConnection();

        String boundaryString = "----SomeRandomText";

        // Indicate that we want to write to the HTTP request body
        urlConnection.setDoOutput(true);
        urlConnection.setRequestMethod("POST");
        
        if(authentication == true)
            urlConnection.setRequestProperty("Authorization", tokenType + " " + accessToken);
        
        urlConnection.addRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundaryString);

        OutputStream outputStreamToRequestBody = urlConnection.getOutputStream();
        BufferedWriter httpRequestBodyWriter =
            new BufferedWriter(new OutputStreamWriter(outputStreamToRequestBody));

        // Include value from the myFileDescription text area in the post data
        httpRequestBodyWriter.write("\n\n--" + boundaryString + "\n");
        httpRequestBodyWriter.write("Content-Disposition: form-data; name=\"file\"");
        httpRequestBodyWriter.write("\n\n");
        httpRequestBodyWriter.write("Log file for 20150208");

        // Include the section to describe the file
        httpRequestBodyWriter.write("\n--" + boundaryString + "\n");
        httpRequestBodyWriter.write("Content-Disposition: form-data;"
                + "name=\"file\";"
                + "filename=\""+ logFileToUpload.getName() +"\""
                + "\nContent-Type: text/plain\n\n");
        httpRequestBodyWriter.flush();

        // Write the actual file contents
        FileInputStream inputStreamToLogFile = new FileInputStream(logFileToUpload);

        int bytesRead;
        byte[] dataBuffer = new byte[1024];
        while((bytesRead = inputStreamToLogFile.read(dataBuffer)) != -1) {
            outputStreamToRequestBody.write(dataBuffer, 0, bytesRead);
        }

        outputStreamToRequestBody.flush();

        // Mark the end of the multipart http request
        httpRequestBodyWriter.write("\n--" + boundaryString + "--\n");
        httpRequestBodyWriter.flush();

        // Close the streams
        outputStreamToRequestBody.close();
        httpRequestBodyWriter.close();
        
        // Read response from web server, which will trigger the multipart HTTP request to be sent.
        BufferedReader httpResponseReader =
            new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        String lineRead;
        while((lineRead = httpResponseReader.readLine()) != null) {
            System.out.println(lineRead);
        }
        return urlConnection.getResponseCode();
    }
    
    public static Image getImageHasAuthentication(String link) throws MalformedURLException, IOException{
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        
        // Absolute URL -
        URL url = new URL(LOCALHOST + link);
        Image monaImage = toolkit.getImage(url);
        return monaImage;
    }
}
