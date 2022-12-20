package com.sg.dvdlibary.ui;

import com.sg.dvdlibary.dto.DVD;

import java.util.List;

public class DVDLibaryView {

    private UserIO io;

    public DVDLibaryView(UserIO io) {
        this.io = io;
    }


    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. List DVDS");
        io.print("2. Create New DVD");
        io.print("3. View a DVD");
        io.print("4. Remove a DVD");
        io.print("5. Edit a DVD");
        io.print("6. Exit");

        return io.readInt("Please select from the above choices.", 1, 6);
    }

    public DVD getNewDVDInfo() {
        String title = io.readString("Please enter title");
        String releaseDate = io.readString("Please enter release date");
        double mPAA = io.readDouble("Please enter MPAA rating", 0, 10);
        String directorName = io.readString("Please enter director's name");
        String studio = io.readString("Please enter studio");
        String userRating = io.readString("Please enter user feedback");

        DVD currentDVD = new DVD(title);
        currentDVD.setReleaseDate(releaseDate);
        currentDVD.setmPAA(mPAA);
        currentDVD.setDirectorName(directorName);
        currentDVD.setStudio(studio);
        currentDVD.setUserRating(userRating);

        return currentDVD;
    }

    public void displayEditMessage() {
        io.print("Enter DVD details with your edited details");
    }

    public void displayCreateDVDBanner() {
        io.print("=== Create DVD ===");
    }

    public void displayCreateSuccessBanner() {
        io.readString(
                "DVD successfully created.  Please hit enter to continue");
    }

    public void displayEditSuccessBanner() {
        io.readString(
                "DVD successfully edited.  Please hit enter to continue");
    }

    public void displayDisplayAllBanner() {
        io.print("=== Display All DVDs ===");
    }

    public void displayDisplayDVDBanner() {
        io.print("=== Display DVD ===");
    }

    public void displayRemoveDVDBanner() {
        io.print("=== Remove DVD ===");
    }

    public void displayEditDVDBanner() {
        io.print("=== Edit DVD ===");
    }

    public String getDVDTitleChoice() {
        return io.readString("Please enter the title.");
    }

    public void displayDVD(DVD dvd) {
        if (dvd != null) {
            io.print(dvd.getTitle());
            io.print(dvd.getReleaseDate());
            io.print(dvd.getmPAA()); // infinite loop if char entered
            io.print(dvd.getDirectorName());
            io.print(dvd.getStudio());
            io.print(dvd.getUserRating());
            io.print("");
        } else {
            io.print("No such DVD.");

        }
        io.readString("Please hit enter to continue.");
    }

    public void displayDVDList(List<DVD> dvdList) {
        for (DVD currentDVD : dvdList) {
            String DVDInfo = String.format("#%s : %s %s",
                    currentDVD.getTitle(),
                    currentDVD.getDirectorName(),
                    currentDVD.getmPAA() + " MPPA rating");
            io.print(DVDInfo);
        }
        io.readString("Please hit enter to continue.");
    }

    public void displayRemoveResult(DVD dvdRecord) {
        if (dvdRecord != null) {
            io.print("DVD successfully removed.");
        } else {
            io.print("No such DVD.");
        }
        io.readString("Please hit enter to continue.");
    }

    public void displayExitBanner() {
        io.print("Good Bye!!!");
    }

    public void displayUnknownCommandBanner() {
        io.print("Unknown Command!!!");
    }

    public void displayErrorMessage(String errorMsg) {
        io.print("=== ERROR ===");
        io.print(errorMsg);
    }
}


