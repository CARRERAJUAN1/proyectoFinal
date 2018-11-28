/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jcarrera.modelo;

/**
 *
 * @author PC
 */
public class Serie {
    private int id;
    private String title;
    private String genre;
    private String creator;
    private int duration;
    private short year;
    private boolean viewed;
    private int sessionQuantity;
    private Chapter chapters;

    public Serie() {
    }

    public Serie(int id, String title, String genre, String creator, int duration, short year, boolean viewed, int sessionQuantity, Chapter chapters) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.creator = creator;
        this.duration = duration;
        this.year = year;
        this.viewed = viewed;
        this.sessionQuantity = sessionQuantity;
        this.chapters = chapters;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return the creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     * @param creator the creator to set
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * @return the duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * @return the year
     */
    public short getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(short year) {
        this.year = year;
    }

    /**
     * @return the viewed
     */
    public boolean isViewed() {
        return viewed;
    }

    /**
     * @param viewed the viewed to set
     */
    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    /**
     * @return the sessionQuantity
     */
    public int getSessionQuantity() {
        return sessionQuantity;
    }

    /**
     * @param sessionQuantity the sessionQuantity to set
     */
    public void setSessionQuantity(int sessionQuantity) {
        this.sessionQuantity = sessionQuantity;
    }

    /**
     * @return the chapters
     */
    public Chapter getChapters() {
        return chapters;
    }

    /**
     * @param chapters the chapters to set
     */
    public void setChapters(Chapter chapters) {
        this.chapters = chapters;
    }
    
    
}
