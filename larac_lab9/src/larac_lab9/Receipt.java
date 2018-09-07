
package larac_lab9;

/**
 *
 * @author Christian
 */

import java.text.DecimalFormat;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.scene.image.Image;

import javafx.stage.Modality;


public class Receipt {
    //displays the receipt form
    public static void display(double total){
        //sets the stage
        Stage window = new Stage();
        //the application will be modal
        window.initModality(Modality.APPLICATION_MODAL);
        //sets form title
        window.setTitle("Reciept");
        //sets the icon of the form
        window.getIcons().add(new Image("file:logo.png"));
        
        //creates a label
        Label lblResponse = new Label();
        if (total <= 0)
            {
                //if total is 0 this will be displayed
                lblResponse.setText("The cart is Empty!");
            }
            else
            {
                //if total is more than 0 this will be displayed
                lblResponse.setText("Thanks for shopping at Pest Store\nYour account has been charged: $" 
                        + new DecimalFormat("#0.00").format(total)); 
            }
        //displays button
        Button btnClose = new Button("Close");
        //assigns action to button
        btnClose.setOnAction(e -> window.close());
        
        //creates a vbox layout
        VBox layout = new VBox(10);
        //adds the label and the nutton
        layout.getChildren().addAll(lblResponse, btnClose);
        layout.setAlignment(Pos.CENTER);
        
        //creates new scene
        Scene scene = new Scene(layout, 300, 100);
        //displays the form
        window.setScene(scene);
        window.showAndWait();
    }
}
