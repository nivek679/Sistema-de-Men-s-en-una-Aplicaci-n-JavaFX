package project.componentes;

import javafx.scene.control.Button;

public class BotonP {
    private Button botonPrincipal;
    public BotonP() {
        botonPrincipal = new Button();

        botonPrincipal.setOnAction(e->{
            System.out.println("Presiono el boton.");
        });
    }
}
