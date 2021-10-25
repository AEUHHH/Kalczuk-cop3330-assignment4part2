package ucf.assignments;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Cody Kalczuk
 */

public class Controller01 {

    @FXML
    private TableView tableView;

    @FXML
    private TextField title;

    @FXML
    public void loadClicked(ActionEvent actionEvent) {
        loadList();
    }

    @FXML
    public void saveClicked(ActionEvent actionEvent) {
        saveList();
    }

    @FXML
    public void addItemClicked(ActionEvent actionEvent) {
        addItem();
    }

    @FXML
    public void addListClicked(ActionEvent actionEvent) {
        addList();
    }

    @FXML
    public void removeItemClicked(ActionEvent actionEvent) {
        removeItem();
    }

    @FXML
    public void removeListClicked(ActionEvent actionEvent) {
        removeList();
    }

    @FXML
    public void incompleteClicked(ActionEvent actionEvent) {
        displayIncompleteItems();
    }

    @FXML
    public void completedClicked(ActionEvent actionEvent) {
        displayCompleteItems();
    }

    public void loadList(){
        //open file explorer for user to choose file
        //read the file
        //values from file are shown in the List
    }

    public void saveList(){
        //open up file explorer to choose directory of choosing
        //save file into chosen directory with chosen filename
    }

    public void addItem(){
        //get value from description text field and calendar
        //add value to list
        //then add checkbox next to items
    }

    public void addList(){
        //open a new list in a new window
        //recall application launch everytime button "New List" is clicked and handles exception
    }

    public void removeItem(){
        //assign an id to each row of text within table for accessing
        //Access and remove row of item from table with id
    }

    public void removeList(){
        //delete To Do list page
        //if only one page, delete all items within that page
    }

    public void displayIncompleteItems(){
        //check all items that don't have a complete status
        //hide complete items
    }

    public void displayCompleteItems(){
        //check all that items have a complete status
        //hide incomplete items
    }

}