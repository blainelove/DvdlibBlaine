/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dvdlib;

import com.mycompany.dvdlib.controller.DvdLibController;
import com.mycompany.dvdlib.dao.DvdLibDaoFileImpl;
import com.mycompany.dvdlib.dao.dvdLibDao;
import com.mycompany.dvdlib.ui.DvdLibView;
import com.mycompany.dvdlib.ui.UserIO;
import com.mycompany.dvdlib.ui.UserIOConsoleImpl;

/**
 *
 * @author Blaine
 */
public class App {
    public static void main(String[] args){
        DvdLibController controller = new DvdLibController();
    controller.run();
    }
//    dvdLibUserIO myIo = new dvdLibUserIOConsoleImpl();
//    DvdLibView myView = new DvdLibView(myIo);
//    dvdLibDao myDao = new DvdLibDaoFileImpl();
    
}
