module cr.ac.ucr.progra_laboratorio10_paula_blanca {
    requires javafx.controls;
    requires javafx.fxml;


    opens cr.ac.ucr.progra_laboratorio10_paula_blanca to javafx.fxml;
    exports cr.ac.ucr.progra_laboratorio10_paula_blanca;
}