package com.sg.dvdlibary.dao;

import com.sg.dvdlibary.dto.DVD;

import java.io.*;
import java.util.*;

public class DVDLibaryDaoFileImpl implements DVDLibaryDao  {

    public static final String ROSTER_FILE = "DVD.txt";
    public static final String DELIMITER = "::";

    private Map<String, DVD> dvds = new HashMap<>();

    @Override
    public DVD addDVD(String title, DVD dvd)
            throws DVDLibaryDaoException {
        loadRoster();
        DVD newDVD = dvds.put(title, dvd);
        writeRoster();
        return newDVD;
    }

    @Override
    public List<DVD> getAllDVD()
                    throws DVDLibaryDaoException {
            loadRoster();
            return new ArrayList(dvds.values());
    }

    @Override
    public DVD getDVD(String title)
            throws DVDLibaryDaoException {
        loadRoster();
        return dvds.get(title);
    }

    @Override
    public DVD removeDVD(String title)
            throws DVDLibaryDaoException {
        loadRoster();
        DVD removedDVD = dvds.remove(title);
        writeRoster();
        return removedDVD;
    }


    private DVD unmarshallStudent(String dvdAsText){

        String[] studentTokens = dvdAsText.split(DELIMITER);

        String title = studentTokens[0];

        DVD dvdFromFile = new DVD(title);

        dvdFromFile.setReleaseDate(studentTokens[1]);

        dvdFromFile.setmPAA(Double.parseDouble(studentTokens[2]));   // may be an error here if data is not a double. Implement a checker

        dvdFromFile.setDirectorName(studentTokens[3]);

        dvdFromFile.setStudio(studentTokens[4]);

        dvdFromFile.setUserRating(studentTokens[5]);

        return dvdFromFile;
    }

    private void loadRoster() throws DVDLibaryDaoException {
        Scanner scanner;

        try {
            scanner = new Scanner(
                    new BufferedReader(
                            new FileReader(ROSTER_FILE)));
        } catch (FileNotFoundException e) {
            throw new DVDLibaryDaoException(
                    "-_- Could not load roster data into memory.", e);
        }

        String currentLine;

        DVD currentDVD;

        while (scanner.hasNextLine()) {

            currentLine = scanner.nextLine();

            currentDVD = unmarshallStudent(currentLine);

            dvds.put(currentDVD.getTitle(), currentDVD);
        }
        scanner.close();
    }

    private String marshallStudent(DVD aDVD){

        String dvdAsText = aDVD.getTitle() + DELIMITER;

        dvdAsText += aDVD.getReleaseDate() + DELIMITER;

        dvdAsText += aDVD.getmPAA() + DELIMITER;

        dvdAsText += aDVD.getDirectorName() + DELIMITER;

        dvdAsText += aDVD.getStudio() + DELIMITER;

        dvdAsText += aDVD.getUserRating();

        return dvdAsText;

    }

    /**
     * Writes all DVDs in the roster out to a ROSTER_FILE.  See loadRoster
     * for file format.
     *
     * @throws DVDLibaryDaoException if an error occurs writing to the file
     */
    private void writeRoster() throws DVDLibaryDaoException {

        PrintWriter out;

        try {
            out = new PrintWriter(new FileWriter(ROSTER_FILE));
        } catch (IOException e) {
            throw new DVDLibaryDaoException(
                    "Could not save DVD data.", e);
        }

        String dvdAsText;
        List<DVD> dvdList = this.getAllDVD();
        for (DVD currentDVD : dvdList) {
            dvdAsText = marshallStudent(currentDVD);
            out.println(dvdAsText);
            out.flush();
        }
        out.close();
    }
}
