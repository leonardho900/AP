import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import static java.lang.System.in;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javax.swing.JComboBox;

public class MyGreeting extends Stage {

    private TextField txtName, txtName2, txtName3;

    public MyGreeting() {
        this.setTitle("Entry Form");

        Label labName1 = new Label("Enter your first name");
        txtName = new TextField();
        Label labName2 = new Label("Enter your last name");
        txtName2 = new TextField();
        Label labName3 = new Label("Select your country");
        //combo box to pick country?
        
        Button btnDone = new Button("Done");
        
        btnDone.setOnAction(e -> {
            MyParam.setName2(txtName2.getText());
            this.hide();
        });

        VBox myVBox = new VBox(labName1, txtName, labName2, txtName2, labName3, btnDone);
        myVBox.setAlignment(Pos.TOP_CENTER);
        this.setScene(new Scene(myVBox, 400, 300));
        this.show();
    }

    public String getName() {
        return txtName.getText();
    }
}