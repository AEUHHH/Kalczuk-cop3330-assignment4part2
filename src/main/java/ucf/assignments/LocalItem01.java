/*
 *  UCF COP3330 Fall 2021 Assignment 4 Part 2 Solution
 *  Copyright 2021 Cody Kalczuk
 */

package ucf.assignments;


import java.time.LocalDate;

public class LocalItem01
    {
    private String description;
    private LocalDate date;

        public LocalItem01() {

        }

        public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalItem01 (LocalDate date, String description){

        this.setDate(date);
        this.setDescription(description);
    }

    @Override
    public String toString(){
        return  this.getDescription() + ", " +this.getDate();
    }

}