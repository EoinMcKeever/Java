package com.sg.dvdlibary.dao;

import com.sg.dvdlibary.dto.DVD;

import java.util.List;

public interface DVDLibaryDao {

    DVD addDVD(String title, DVD DVD)
            throws DVDLibaryDaoException;


    List<DVD> getAllDVD()
            throws DVDLibaryDaoException;


    DVD getDVD(String title)
            throws DVDLibaryDaoException;


    DVD removeDVD(String title)
            throws DVDLibaryDaoException;

}



