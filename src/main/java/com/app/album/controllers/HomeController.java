package com.app.album.controllers;

import com.app.album.App;
import com.app.album.models.AlbumDigital;
import com.app.album.models.AlbumFisico;
import com.app.album.models.Cancion;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;
import java.util.Calendar;

public class HomeController {

    @FXML
    private ComboBox<String> comboAlbum;

    @FXML
    private Button verCancionesBtn;

    @FXML
    private Button compraBtn;

    @FXML
    private Button fisicosBtn;

    @FXML
    private Button digitalesBtn;

    @FXML
    void actionComboAlbum(ActionEvent event) {

    }

    @FXML
    void onClickVerButton(MouseEvent event) {
        if (comboAlbum.getValue() == null){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Precaución");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, elija un álbum");
            alert.showAndWait();
        } else {
            if (comboAlbum.getValue().equals("Caifanes")) {
                ArrayList<Cancion> cancions = App.getBiblioteca().getCaifanes().getAlbumCaifanes();
                StringBuilder contenido = new StringBuilder("Canciones:\n");
                for (int i = 0; i < App.getBiblioteca().getCaifanes().getAlbumCaifanes().size(); i++) {
                    contenido.append(i+1).append(".- ").append(App.getBiblioteca().getCaifanes().getAlbumCaifanes().get(i)).append("\n");
                }
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Canciones del album Caifanes");
                alert.setHeaderText(null);
                alert.setContentText(contenido.toString());
                alert.showAndWait();
            } else if (comboAlbum.getValue().equals("Las mujeres no lloran")) {
                ArrayList<Cancion> cancions = App.getBiblioteca().getShakira().getAlbumShakira();
                StringBuilder contenido = new StringBuilder("Canciones:\n");
                for (int i = 0; i < App.getBiblioteca().getShakira().getAlbumShakira().size(); i++) {
                    contenido.append(i+1).append(".- ").append(App.getBiblioteca().getShakira().getAlbumShakira().get(i)).append("\n");
                }
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Canciones del album Las Mujeres no Lloran");
                alert.setHeaderText(null);
                alert.setContentText(contenido.toString());
                alert.showAndWait();
            } else if (comboAlbum.getValue().equals("MTV Unplugged")){
                ArrayList<Cancion> cancions = App.getBiblioteca().getZoe().getAlbumZoe();
                StringBuilder contenido = new StringBuilder("Reservaciones:\n");
                for (int i = 0; i < App.getBiblioteca().getZoe().getAlbumZoe().size(); i++) {
                    contenido.append(i+1).append(".- ").append(App.getBiblioteca().getZoe().getAlbumZoe().get(i)).append("\n");
                }
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Canciones Albúm Zoé");
                alert.setHeaderText(null);
                alert.setContentText(contenido.toString());
                alert.showAndWait();
            }
        }
    }

    @FXML
    void onClickDigitalesBtn(MouseEvent event) {
        ArrayList<AlbumDigital> cancions = App.getBiblioteca().getAlbumDigitals();
        StringBuilder contenido = new StringBuilder("Nuestros Albumes digitales:\n");
        for (int i = 0; i < App.getBiblioteca().getAlbumFisicos().size(); i++) {
            contenido.append(i+1).append(".- ").append(App.getBiblioteca().getAlbumDigitals().get(i)).append("\n");
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Albumes Digitales");
        alert.setHeaderText(null);
        alert.setContentText(contenido.toString());
        alert.showAndWait();
    }

    @FXML
    void onClickCompraBtn(MouseEvent event) {
        if (!(comboAlbum.getValue() == null)) {
            if (App.getBiblioteca().comprarAlbum(comboAlbum.getValue())) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Operación Exitosa");
                alert.setHeaderText(null);
                alert.setContentText("Album Comprado");
                alert.showAndWait();
            } else {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Precaución");
                alert.setHeaderText(null);
                alert.setContentText("No tenemos existencias disponibles");
                alert.showAndWait();
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Precaución");
            alert.setHeaderText(null);
            alert.setContentText("Escoja un album para esta operacion");
            alert.showAndWait();
        }
    }

    @FXML
    void onClickFisicosBtn(MouseEvent event) {
        ArrayList<AlbumFisico> cancions = App.getBiblioteca().getAlbumFisicos();
        StringBuilder contenido = new StringBuilder("Nuestros Albumes fisicos:\n");
        for (int i = 0; i < App.getBiblioteca().getAlbumFisicos().size(); i++) {
            contenido.append(i+1).append(".- ").append(App.getBiblioteca().getAlbumFisicos().get(i)).append("\n");
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Albumes Físicos");
        alert.setHeaderText(null);
        alert.setContentText(contenido.toString());
        alert.showAndWait();
    }

    public void initialize(){
        ObservableList<String> list = FXCollections.observableArrayList("Caifanes", "Las mujeres no lloran",  "MTV Unplugged");
        comboAlbum.setItems(list);
        App.getBiblioteca().initData();
        App.getBiblioteca().init();
    }

}
