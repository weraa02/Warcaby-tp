package org.example.gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


//nie uzywalamatego wczesniej, ale pojawilo sie jak chcialam zrobic javafx, wiec zostawiam poki co gdyby oitem jednak bylo konieczne
//FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//Scene scene = new Scene(fxmlLoader.load(), 320, 240);

//nazwa do zmiany
public class HelloApplication extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage){
        //Layouty - zrobilam takie cos, ale zawsze mozna zmienic
        VBox root = new VBox(); //pionowo

        HBox forbuttons = new HBox(); //poziomo

        Label welcome = new Label("\nWitamy w warcabach\n");
        Label choice = new Label("Prosze wybrać rodzaj gry:");
        Button option1 = new Button("Warcaby polskie");
        Button option2 = new Button("Warcaby dwuliniowe");
        Button option3 = new Button("Warcaby hiszpańskie");

        EventHandler<ActionEvent> oknoprobaEH = new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                GameWindow.display();
                stage.hide();

            }
        };
        option1.setOnAction(oknoprobaEH);
        option2.setOnAction(oknoprobaEH); //
        option3.setOnAction(oknoprobaEH); //

        forbuttons.getChildren().add(option1);
        forbuttons.getChildren().add(option2);
        forbuttons.getChildren().add(option3);

        root.getChildren().addAll(welcome,choice,forbuttons);

        //dzialanie okna
        stage.setTitle("Warcaby - wybor gry");
        stage.setScene(new Scene(root,600,300)); //WIELKOSC okna
        //stage.sizeToScene(); //dopasoeuje okno do zawartosci - moze sie przydac pozniej
        stage.show();
    }

}