/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dvdlib.ui;

import com.mycompany.dvdlib.dto.Dvd;
import java.util.List;

/**
 *
 * @author Blaine
 */
public class DvdLibView {
    private UserIO io = new UserIOConsoleImpl();

    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. List the DVDs in the collection");
        io.print("2. Add a DVD to the collection");
        io.print("3. View a DVD by title");
        io.print("4. Remove a DVD");
        io.print("5. Edit DVD");
        io.print("6. Exit");

        return io.readInt("Please select from the above choices.", 1, 6);
    }
    public Dvd getNewDvdInfo() {
        String dvdId = io.readString("Please enter DVD ID");
        String title = io.readString("Please enter title");
        String releaseDate = io.readString("Please enter release date");
        String mpaaRating = io.readString("Please enter MPAA rating");
        String directorsName = io.readString("Please enter directors name");
        String studio = io.readString("Please enter studio");
        String note = io.readString("Please enter note");
        Dvd newDvd = new Dvd();
        newDvd.setDvdId(dvdId);
        newDvd.setTitle(title);
        newDvd.setReleaseDate(releaseDate);
        newDvd.setMpaaRating(mpaaRating);
        newDvd.setDirectorsName(directorsName);
        newDvd.setStudio(studio);
        newDvd.setNote(note);
        return newDvd;
    }
    public void displayCreateDvdBanner() {
        io.print("=== Create DVD ===");
    }
    public void displayCreateSuccessBanner() {
        io.readString(
            "DVD successfully created.  Please hit enter to continue");
    }
    public void displayDvdList(List<Dvd> dvdList) {
        for (Dvd newDvd : dvdList) {
            String dvdInfo = String.format("#%s : %s %s %s %s %s %s",
                newDvd.getDvdId(),
                newDvd.getTitle(),
                newDvd.getReleaseDate(),
                newDvd.getMpaaRating(),
                newDvd.getDirectorsName(),
                newDvd.getStudio(),
                newDvd.getNote()
              );
            io.print(dvdInfo);
        }
        io.readString("Please hit enter to continue.");
    }
    public void displayDisplayAllBanner() {
        io.print("=== Display All DVDs ===");
    }
    public void displayDisplayDvdBanner () {
    io.print("=== Display DVD ===");
    }
    public String getDvdTitleChoice() {
        return io.readString("Please enter the DVD title.");
    }
    public void displayDvd(Dvd dvd) {
    if (dvd != null) {
        io.print(dvd.getDvdId());
        io.print(dvd.getTitle());
        io.print(dvd.getReleaseDate());
        io.print(dvd.getMpaaRating());
        io.print(dvd.getDirectorsName());
        io.print(dvd.getStudio());
        io.print(dvd.getNote());
        io.print("");
    } else {
        io.print("No such DVD.");
        }
    io.readString("Please hit enter to continue.");
    }
    public void displayRemoveDvdBanner () {
    io.print("=== Remove DVD ===");
    }
    public void displayRemoveResult(Dvd dvdRecord) {
        if(dvdRecord != null){
          io.print("DVD successfully removed.");
        }else{
          io.print("No such DVD.");
        }
        io.readString("Please hit enter to continue.");
    }
    public void displayEditDvdBanner () {
        io.print("=== Edit DVD ===");
    }
    public void editDvd(Dvd dvd) {
        if (dvd != null) {
            String dvdId = io.readString("Please enter new DVD ID");
            String releaseDate = io.readString("Please enter new release date");
            String mpaaRating = io.readString("Please enter new MPAA rating");
            String directorsName = io.readString("Please enter new directors name");
            String studio = io.readString("Please enter new studio");
            String note = io.readString("Please enter new note");
            dvd.setDvdId(dvdId);
            dvd.setReleaseDate(releaseDate);
            dvd.setMpaaRating(mpaaRating);
            dvd.setDirectorsName(directorsName);
            dvd.setStudio(studio);
            dvd.setNote(note);
        } else {
            io.print("No such DVD.");
            }
        io.readString("DVD successfully edited. Please hit enter to continue.");
        }
}
