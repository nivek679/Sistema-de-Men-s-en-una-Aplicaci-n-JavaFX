package project.componentes;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;

public class MenuAyuda {
    private Menu mAyuda;

    public MenuAyuda(){
        mAyuda = new Menu("Editar");
        mAyuda.getItems().addAll(crearMenuItem());
    }

    private ArrayList<MenuItem> crearMenuItem(){
        /* 
        MenuItem Añadir = new MenuItem("Cambiar");
        MenuItem Eliminar = new MenuItem("Eliminar");
        */
        MenuItem preguntasF = new MenuItem("Preguntas frecuentes");
        preguntasF.setOnAction(e->{
            System.out.println("Como funciona?\nSimplemente mostrara en la terminal lo que el usuario realizará en el menú.");
        });
        MenuItem informacionA = new MenuItem("Información de la aplicación");
        informacionA.setOnAction(e->{
            System.out.println("Consta de un menu bar, el cual tiene tres menus y cada menu tiene por lo menos un menuItem.\nCada accion que realice el usuario sera mostrado en la terminal.");
        });
        SeparatorMenuItem separator1 = new SeparatorMenuItem();

        ArrayList<MenuItem> listaSubmenuEditar = new ArrayList<>();
        
        /*
        listaSubmenuEditar.add(Añadir);
        listaSubmenuEditar.add(Eliminar);
        */
        listaSubmenuEditar.add(preguntasF);
        listaSubmenuEditar.add(separator1);
        listaSubmenuEditar.add(informacionA);

        return listaSubmenuEditar;
    }

    public Menu getayuda() {
        return mAyuda;
    }
}