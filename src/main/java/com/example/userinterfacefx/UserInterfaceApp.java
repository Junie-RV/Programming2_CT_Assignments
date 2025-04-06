package com.example.userinterfacefx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.IOException;
import java.util.Random;

public class UserInterfaceApp extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("UserInterfaceApp");
        MenuItem menuItem1 = new MenuItem("Date & Time");
        MenuItem menuItem2 = new MenuItem("Write to File");
        MenuItem menuItem3 = new MenuItem("Change color");
        MenuItem menuItem4 = new MenuItem("Exit");

        TextField field = new TextField();

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        String formattedDate = dateTime.format(formatDate);

        MenuButton menuButton = new MenuButton("Options", null, menuItem1, menuItem2, menuItem3, menuItem4);
        GridPane gridPane = new GridPane();
        gridPane.setPrefSize(300, 300);
        gridPane.setVgap(50);
        gridPane.add(menuButton, 0, 0);
        gridPane.add(field, 1, 1);

        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.show();

        menuItem1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                field.setText(formattedDate);
            }
        });

        menuItem2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("log.txt", true)))) {
                    writer.println(field.getText());
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        menuItem3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Random rand = new Random();
                int green = 100 + rand.nextInt(155);
                int red = rand.nextInt(100);
                int blue = rand.nextInt(100);
                Color colorFx = Color.rgb(red, green, blue);

                String colorHex = String.format("#%02x%02x%02x", red, green, blue);

                gridPane.setBackground(new Background(new BackgroundFill(colorFx, null, null)));
                menuItem3.setText(colorHex);
            }
        });

        menuItem4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                primaryStage.close();
            }
        });
    }

    public static void main(String[] args) {
        launch();
    }
}