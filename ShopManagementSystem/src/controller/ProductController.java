/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Image;
import java.io.IOException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.Product;
import model.Response;
import output.ProductOutput;
import utils.ConnectAPI;

/**
 *
 * @author TRINH
 */
public class ProductController extends BaseController {

    public ProductController() {
        getOneByID = "/api/product/";
        getAll = "/api/products/getAllProducts";
        addOne = "/api/product";
        editOrDelete = "/api/product/";
        getItemInOnePage = "/api/product?pageNo=%d&pageSize=20&sortField=productId&sortDirection=desc";
        getImage = "/api/product/image/";
    }

    public Product getProductById(String id) {
        Product p = null;
        try {
            Response response = ConnectAPI.excuteHttpMethod("", getOneByID + id, "GET", true);
            p = gson.fromJson(response.getMessage(), Product.class);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return p;
    }

    public ProductOutput getProductInOnePage(int pageNo) {
        String str = String.format(getItemInOnePage, pageNo);
        System.out.println(str);
        ProductOutput founderList = null;
        try {
            Response response = ConnectAPI.excuteHttpMethod("", str, "GET", true);
            founderList = gson.fromJson(response.getMessage(), ProductOutput.class);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return founderList;
    }

    public Response addProduct(Product p) {
        Response response = null;
        try {
            String json = gson.toJson(p);
            response = ConnectAPI.excuteHttpMethod(json, addOne, "POST", true);
            //print in String
            System.out.println(response.getMessage());

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return response;
    }

    public Response updateProductByID(int id, Product p) {
        Response response = null;
        try {
            String json = gson.toJson(p);
            response = ConnectAPI.excuteHttpMethod(json, editOrDelete + id, "PUT", true);
            //print in String
            System.out.println(response.getMessage());

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return response;
    }

    public Response deleteProductByID(String id) {
        Response response = null;
        try {
            response = ConnectAPI.excuteHttpMethod("", editOrDelete + id, "DELETE", true);
            //print in String
            System.out.println(response.getMessage());

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return response;
    }

    public void loadTable(List<Product> list, DefaultTableModel dtm) {
        dtm.setNumRows(0);
        Vector vt;
        for (Product p : list) {
            vt = new Vector();
            vt.add(p.getProductId());
            vt.add(p.getName());
            vt.add(p.getCategory().getName());
            vt.add(p.getBrand().getName());
            vt.add(p.getCalculationUnit());
            vt.add(p.getPrice());
            vt.add(p.getQuantity());
            dtm.addRow(vt);
        }
    }

    public Image getImage(String imageName) {
        Image img = null;
        try {
            img = ConnectAPI.getImageHasAuthentication(getImage + imageName);
        } catch (IOException ex) {
            Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return img;
    }
}
