package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class Controller {
    @FXML
    BorderPane marco;

    public void btPri_accion(){
        Stage secondaryStage = new Stage();
        secondaryStage.setTitle("Principiante");
        Buscaminas b = new Buscaminas();
        try {

            AnchorPane buscaminas = FXMLLoader
                    .load((getClass().getResource("buscaminas.fxml")));
            b.initialize(buscaminas,8,8, 10);
            secondaryStage.setScene(new Scene(buscaminas,500,500));
            secondaryStage.show();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public void btInt_accion(){
        Stage secondaryStage = new Stage();
        secondaryStage.setTitle("Intermedio");
        Buscaminas b = new Buscaminas();
        try {

            AnchorPane buscaminas = FXMLLoader
                    .load((getClass().getResource("buscaminas.fxml")));
            b.initialize(buscaminas,16,16, 40);
            secondaryStage.setScene(new Scene(buscaminas,1000,800));
            secondaryStage.show();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public void btExt_accion(){
        Stage secondaryStage = new Stage();
        secondaryStage.setTitle("Experto");
        Buscaminas b = new Buscaminas();
        try {

            AnchorPane buscaminas = FXMLLoader
                    .load((getClass().getResource("buscaminas.fxml")));
            b.initialize(buscaminas,16,30, 99);
            secondaryStage.setScene(new Scene(buscaminas,1500,800));
            secondaryStage.show();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public void btPer_accion(){
            Stage secondaryStage = new Stage();
            secondaryStage.setTitle("Personalizado");
            int m = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de casillas verticales a tener"));
            int n = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de casillas horizontales a tener"));
            int min =Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de minas a colocar"));
            Buscaminas b = new Buscaminas();
            try {

                AnchorPane buscaminas = FXMLLoader
                        .load((getClass().getResource("buscaminas.fxml")));
                b.initialize(buscaminas,m,n,min);
                secondaryStage.setScene(new Scene(buscaminas,1500,800));
                secondaryStage.show();
            }catch (IOException e){
                e.printStackTrace();
            }

        }






}
