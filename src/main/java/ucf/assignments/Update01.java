/*
 *  UCF COP3330 Fall 2021 Assignment 4 Part 2 Solution
 *  Copyright 2021 Cody Kalczuk
 */

package ucf.assignments;


public class Update01 extends LocalItem01 {

    private String description;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Update01 (String description)
    {
        super();

        this.setDescription(description);

    }

    @Override
    public String toString(){
        return  this.getDescription();
    }

}