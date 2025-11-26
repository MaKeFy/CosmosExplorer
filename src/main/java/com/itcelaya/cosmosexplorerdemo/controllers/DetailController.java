package com.itcelaya.cosmosexplorerdemo.controllers;

import com.itcelaya.cosmosexplorerdemo.DTO.SolarSystemDto;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class DetailController {

    @FXML private Label lblName;
    @FXML private Label lblType;
    @FXML private Label lblGravity;
    @FXML private Label lblRadius;
    @FXML private Label lblDensity;
    @FXML private Label lblDiscovery;
    @FXML private Label lblDate;
    @FXML private ImageView imgPlanet;

    public void setPlanetData(SolarSystemDto.Body body) {

        lblName.setText(body.getEnglishName());
        lblType.setText(body.getBodyType());
        lblGravity.setText(body.getGravity() + " m/s²");


        lblRadius.setText(body.getMeanRadius() != null ? body.getMeanRadius() + " km" : "N/D");
        lblDensity.setText(body.getDensity() != null ? body.getDensity() + " g/cm³" : "N/D");
        lblDiscovery.setText(body.getDiscoveredBy() != null && !body.getDiscoveredBy().isEmpty() ? body.getDiscoveredBy() : "Antigüedad");
        lblDate.setText(body.getDiscoveryDate() != null && !body.getDiscoveryDate().isEmpty() ? body.getDiscoveryDate() : "-");

        String imagePath = "/com/itcelaya/cosmosexplorerdemo/images/SolarSystem/" + body.getId().toLowerCase() + ".png";

        java.io.InputStream stream = getClass().getResourceAsStream(imagePath);

        if (stream != null) {
            imgPlanet.setImage(new Image(stream));
        } else {
            System.out.println("⚠️ No se encontró la imagen: " + imagePath);
             imgPlanet.setImage(new Image(getClass().getResourceAsStream("/com/itcelaya/cosmosexplorerdemo/images/SolarSystem/default.jpg")));
        }
    }


    @FXML
    void closeWindow() {
        // Obtiene la escena actual (la ventana) y la cierra
        if (lblName.getScene() != null) {
            Stage stage = (Stage) lblName.getScene().getWindow();
            stage.close();
        }
    }
}