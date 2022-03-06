/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.CategoryController;
import controller.ProductController;
import java.io.IOException;
import model.Brand;
import model.Category;
import model.Product;



/**
 *
 * @author TRINH
 */
public class test {
    public static void main(String[] args) throws IOException {
        ProductController pc = new ProductController();
        CategoryController cc = new CategoryController();
        Product p = pc.getProductsById(11);
        if(p != null) {
            System.out.println(p.getBrand());
            System.out.println(p.getCategory());
            System.out.println(p.getName());
            System.out.println(p.getProduct_id());
            System.out.println(p.getCalculation_unit());
        }
        
        for (Product pp : pc.getAllProducts()) {
            System.out.println(pp.getBrand());
            System.out.println(pp.getCategory());
            System.out.println(pp.getName());
            System.out.println(pp.getProduct_id());
            System.out.println(pp.getCalculation_unit());
        }
    }
}
