/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dvdlib.controller;

import com.mycompany.dvdlib.dao.DvdLibDaoFileImpl;
import com.mycompany.dvdlib.dao.dvdLibDao;
import com.mycompany.dvdlib.dto.Dvd;
import com.mycompany.dvdlib.ui.DvdLibView;
import com.mycompany.dvdlib.ui.UserIO;
import com.mycompany.dvdlib.ui.UserIOConsoleImpl;
import java.util.List;

/**
 *
 * @author Blaine
 */
public class DvdLibController {
    
    private DvdLibView view = new DvdLibView();
    private UserIO io = new UserIOConsoleImpl();
    private dvdLibDao dao = new DvdLibDaoFileImpl();

    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        while (keepGoing) {

            menuSelection = getMenuSelection();
                   

            switch (menuSelection) {
                case 1:
                    listDvds();
                    break;
                case 2:
                    createDvd();
                    break;
                case 3:
                    viewDvd();
                    break;
                case 4:
                    removeDvd();
                    break;
                case 5:
                    editDvd();
                    break;
                case 6:
                    keepGoing = false;
                    break;
                default:
                    io.print("UNKNOWN COMMAND");
            }

        }
        io.print("GOOD BYE");
    }
    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }
    private void createDvd() {
        view.displayCreateDvdBanner();
        Dvd newDvd = view.getNewDvdInfo();
        dao.addDvd(newDvd.getTitle(), newDvd);
        view.displayCreateSuccessBanner();
    }
    private void listDvds() {
        view.displayDisplayAllBanner();
        List<Dvd> dvdList = dao.getAllDvds();
        view.displayDvdList(dvdList);
    }
    private void viewDvd() {
        view.displayDisplayDvdBanner();
        String title = view.getDvdTitleChoice();
        Dvd dvd = dao.getDvd(title);
        view.displayDvd(dvd);
    }
    private void removeDvd() {
        view.displayRemoveDvdBanner();
        String title = view.getDvdTitleChoice();
        Dvd removedDvd = dao.removeDvd(title);
        view.displayRemoveResult(removedDvd);
    }
    private void editDvd() {
        view.displayEditDvdBanner();
        String title = view.getDvdTitleChoice();
        Dvd edDvd = dao.getDvd(title);
        view.editDvd(edDvd);
    }
}
