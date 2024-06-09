package test;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Separator;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import project.componentes.BrMenu;
import project.componentes.MenuArchivo;
import project.componentes.MenuAyuda;
import project.componentes.MenuEditar;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
       //Crear o inicializar las clases o nodos. 
       BorderPane scena = new BorderPane();
       Scene root = new Scene(scena);
       BrMenu brMenu = new BrMenu();
       MenuArchivo menuArchivo = new MenuArchivo();
       MenuEditar menuEditar = new MenuEditar();
       MenuAyuda menuAyuda = new MenuAyuda();
       MenuBar menuBar = brMenu.getBdMenuPrincipal();

       //Modificar los nodos.
       scena.setPrefSize(420, 450);
       menuBar.getMenus().addAll(menuArchivo.getArchv(), menuEditar.getEdit(), menuAyuda.getayuda());
       scena.setTop(menuBar);
       // Crear una barra de menú
       
       //Mostrar scenario
       stage.setTitle("GUI-MENU BAR");
       stage.setScene(root);
       stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}