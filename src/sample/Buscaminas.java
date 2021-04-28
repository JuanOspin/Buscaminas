package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class Buscaminas {

    Button[][] listab;

    public void initialize(AnchorPane pane,int m, int n, int minas){
        int i , acum = 0, acum2 = 0, ti, tj;
        matrizEnTripletas a;
        tripleta t;
        ComproMinas c = new ComproMinas(m,n);
        listab = new Button[m][n];
        c.RellenoMinas(minas);
        c.compNumeros();
        matriz M = c.getMatriz();
        a = M.construyeMatrizEnTripletas(m,n);
        int F = (int) a.retornaNroTripletas();
        int col = a.retornaNroColumnas();
        for(i = 1; i <= F; i++){
            t =  a.retornaTripleta(i);
            ti = t.getFila();
            tj = t.getColumna();
            listab[ti][tj] = new Button(String.format("*"));
            listab[ti][tj].setId(""+ti+tj);
            listab[ti][tj].setPrefSize(40,40);
            int finalI = ti;
            int finalJ = tj;
            EventHandler<MouseEvent> mouseEvent = new EventHandler<MouseEvent>(){
                public void handle(MouseEvent e){
                    establecerLimites(M,finalI,finalJ);
                    compVictoria(M,minas,finalI,finalJ);
                }
            };
            listab[ti][tj].addEventFilter(MouseEvent.MOUSE_CLICKED, mouseEvent);

            pane.getChildren().add(listab[ti][tj]);

        }


        for(i = 1; i <= F ; i++){
            t = a.retornaTripleta(i);
            ti = t.getFila();
            tj = t.getColumna();
            listab[ti][tj].setLayoutX(0 + acum);
            listab[ti][tj].setLayoutY(acum2);
            acum = acum + 40;
            if(tj == col - 1){
                acum = 0;
                acum2 = acum2 + 40;
            }
        }


    }

    public void establecerLimites(matriz M, int finalI, int finalJ){
        Stage stage = (Stage) listab[finalI][finalJ].getScene().getWindow();
        if(M.retornaDatoObj(finalI,finalJ) == null){
            listab[finalI][finalJ].setText("");
            for(int i = -1; i<= 1; i++){
                for(int j = -1; j <= 1; j++){
                    if((i != 0) || (j != 0 )){
                        if(finalI+i >= 0 && finalJ+j >= 0 && finalI+i < M.getFila() && finalJ+j < M.getColumna()){
                            if(M.retornaDatoObj(finalI+i,finalJ+j) == null) {
                                if(listab[finalI + i][finalJ + j].getText() != "") {
                                    listab[finalI + i][finalJ + j].setText("");
                                    establecerLimites(M, finalI + i, finalJ + j);
                                }
                            } else {
                                listab[finalI + i][finalJ + j].setText(String.format("" +M.retornaDato(finalI + i,finalJ + j)));
                            }
                        }
                    }
                }
            }
        } else {
            if(M.retornaDato(finalI,finalJ) != 0) {
                listab[finalI][finalJ].setText(String.format("" + M.retornaDato(finalI, finalJ)));
            } else {
                listab[finalI][finalJ].setText(String.format("" + M.retornaDato(finalI, finalJ)));
                JOptionPane.showMessageDialog(null,"Usted ha perdido","Derrota",JOptionPane.WARNING_MESSAGE);
                stage.close();

            }
        }
    }

    public void compVictoria(matriz m, int minas,int finalI, int finalJ){
        int cont = 0;
        Stage stage = (Stage) listab[finalI][finalJ].getScene().getWindow();
        for(int i = 0; i < m.getFila(); i++){
            for(int j = 0; j < m.getColumna(); j++){
                if(listab[i][j].getText().equals("*")){
                    cont = cont + 1;
                }
            }
        }
        if(cont == minas){
            JOptionPane.showMessageDialog(null,"Felicidades!! Usted ha ganado","Victoria",JOptionPane.WARNING_MESSAGE);
            stage.close();
        }
    }

}
