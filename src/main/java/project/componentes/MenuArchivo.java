package project.componentes;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;

public class MenuArchivo {
    private Menu archv;

    public MenuArchivo(){
        archv = new Menu("Archivo");
        archv.getItems().addAll(crearMenuItem());
    }

    private ArrayList<MenuItem> crearMenuItem(){
        
        MenuItem Añadir = new MenuItem("Abrir");
        Añadir.setOnAction(e->{
            System.out.println("El usuario esta por abrir un archivo.");
        });
        MenuItem Eliminar = new MenuItem("Eliminar");
        Eliminar.setOnAction(e->{
            System.out.println("El usuario esta por eliminar el archivo: "+ "...");
        });
        MenuItem Modificar = new MenuItem("Cerrar");
        Modificar.setOnAction(e->{
            System.out.println("El usuario cerrara el archivo.");
        });
        SeparatorMenuItem separator1 = new SeparatorMenuItem();
        SeparatorMenuItem separator2 = new SeparatorMenuItem();

        ArrayList<MenuItem> listaSubmenuArchivo = new ArrayList<>();
        listaSubmenuArchivo.add(Añadir);
        listaSubmenuArchivo.add(separator1);
        listaSubmenuArchivo.add(Eliminar);
        listaSubmenuArchivo.add(separator2);
        listaSubmenuArchivo.add(Modificar);

        return listaSubmenuArchivo;
    }

    public Menu getArchv() {
        return archv;
    }
}
