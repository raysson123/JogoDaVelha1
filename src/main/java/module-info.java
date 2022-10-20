module br.edu.ifg.jogodavelha1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.edu.ifg.jogodavelha1 to javafx.fxml;
    exports br.edu.ifg.jogodavelha1;
}