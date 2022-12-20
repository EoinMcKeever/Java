package com.sg.dvdlibary.dto;

public class DVD {

    private String title;
    private String releaseDate;
    private double mPAA;
    private String directorName;
    private String studio;
    private String userRating;


    public DVD(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getmPAA() {
        return mPAA;
    }

    public void setmPAA(double mPAA) {
        this.mPAA = mPAA;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getUserRating() {
        return userRating;
    }

    public void setUserRating(String userRating) {
        this.userRating = userRating;
    }
}
