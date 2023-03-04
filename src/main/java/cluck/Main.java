package cluck;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import cluck.ui.MainWindow;

/**
 * A GUI for Duke using FXML.
 */
public class Main extends Application {

    private final Cluck cluck;
    public Main() {
        String currentDirectoryString;
        try {
            currentDirectoryString = new File(Main.class.getProtectionDomain().getCodeSource().getLocation()
                    .toURI()).getParentFile().getPath();
        } catch (URISyntaxException e) {
            currentDirectoryString = "";
        }
        cluck = new Cluck(currentDirectoryString + "/cluckData/CluckSave.txt");
    }

    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/MainWindow.fxml"));
            AnchorPane ap = fxmlLoader.load();
            Scene scene = new Scene(ap);
            stage.setScene(scene);
            fxmlLoader.<MainWindow>getController().setCluck(cluck);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
