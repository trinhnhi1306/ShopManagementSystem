/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.google.gson.Gson;

/**
 *
 * @author TRINH
 */
public abstract class BaseController {
    public Gson gson= new Gson();
    public String getOneByID;
    public String getAll;
    public String addOne;
    public String editOrDelete;

}
