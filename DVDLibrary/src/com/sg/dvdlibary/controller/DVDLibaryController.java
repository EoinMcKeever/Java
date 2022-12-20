package com.sg.dvdlibary.controller;

import com.sg.dvdlibary.dao.DVDLibaryDao;
import com.sg.dvdlibary.dao.DVDLibaryDaoException;
import com.sg.dvdlibary.dto.DVD;
import com.sg.dvdlibary.ui.DVDLibaryView;

import java.util.List;

public class DVDLibaryController {

    private DVDLibaryView view;
    private DVDLibaryDao dao;

    public DVDLibaryController(DVDLibaryDao dao, DVDLibaryView view) {
        this.dao = dao;
        this.view = view;
    }

    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        try {
            while (keepGoing) {

                menuSelection = getMenuSelection();

                switch (menuSelection) {
                    case 1:
                        listDVDs();
                        break;
                    case 2:
                        createDVD();
                        break;
                    case 3:
                        viewDVD();
                        break;
                    case 4:
                        removeDVD();
                        break;
                    case 5:
                        editDVD();
                        break;
                    case 6:
                        keepGoing = false;
                        break;
                    default:
                        unknownCommand();
                }

            }
            exitMessage();
        } catch (DVDLibaryDaoException e) {
            view.displayErrorMessage(e.getMessage());
        }
    }

    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }



    private void createDVD() throws DVDLibaryDaoException {
        view.displayCreateDVDBanner();
        DVD newDVD = view.getNewDVDInfo();
        dao.addDVD(newDVD.getTitle(), newDVD);
        view.displayCreateSuccessBanner();
    }

    private void listDVDs() throws DVDLibaryDaoException {
        view.displayDisplayAllBanner();
        List<DVD> dvdList = dao.getAllDVD();
        view.displayDVDList(dvdList);
    }

    private void viewDVD() throws DVDLibaryDaoException {
        view.displayDisplayDVDBanner();
        String title = view.getDVDTitleChoice();
        DVD dvd = dao.getDVD(title);
        view.displayDVD(dvd);
    }

    private void removeDVD() throws DVDLibaryDaoException {
        view.displayRemoveDVDBanner();
        String title = view.getDVDTitleChoice();
        DVD removedDVD = dao.removeDVD(title);
        view.displayRemoveResult(removedDVD);
    }

    private void editDVD() throws DVDLibaryDaoException {
        view.displayEditDVDBanner();
        String title = view.getDVDTitleChoice();
        editMessage();
        DVD removedDVD = dao.removeDVD(title);
        DVD newDVD = view.getNewDVDInfo();
        dao.addDVD(title, newDVD);
        view.displayEditSuccessBanner();
    }

    private void editMessage(){
        view.displayEditMessage();
    }

    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }

    private void exitMessage() {
        view.displayExitBanner();
    }

}
