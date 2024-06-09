package project.componentes;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

public class MenuEditar {
    private Menu edit;

    public MenuEditar(){
        edit = new Menu("Editar");
        edit.getItems().addAll(crearMenuItem());
    }

    private ArrayList<MenuItem> crearMenuItem(){
        /* 
        MenuItem Añadir = new MenuItem("Cambiar");
        MenuItem Eliminar = new MenuItem("Eliminar");
        */
        MenuItem Modificar = new MenuItem("Modificar");
        Modificar.setOnAction(e->{
            System.out.println("El usuario modificara el archivo: ...");
        });

        ArrayList<MenuItem> listaSubmenuEditar = new ArrayList<>();
        
        /*
        listaSubmenuEditar.add(Añadir);
        listaSubmenuEditar.add(Eliminar);
        */
        listaSubmenuEditar.add(Modificar);

        return listaSubmenuEditar;
    }

    public Menu getEdit() {
        return edit;
    }
}
