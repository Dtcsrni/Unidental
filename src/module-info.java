module Unidental {

    requires javafx.fxml;
    requires java.logging;
    requires javafx.controls;
    requires javafx.graphics;
    requires java.sql;
    //requires java.sql;


    opens dao;
    opens main;
    opens modelo;
    opens resources;
    opens view;
    opens controler;


}