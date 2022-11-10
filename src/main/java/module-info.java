module uz.bakhromjon.javafxgetinputvalue {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens uz.bakhromjon.javafxgetinputvalue to javafx.fxml;
    exports uz.bakhromjon.javafxgetinputvalue;
}