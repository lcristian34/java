
package larac_lab9;

import java.text.DecimalFormat;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javax.swing.ImageIcon;

/**
 *
 * @author Christian
 */
public class Larac_lab9 extends Application implements EventHandler<ActionEvent> {
    //variables
    Double total = 0.00;
    Double antPrice = 0.10;
    Double flyPrice = 0.50;
    Double ratPrice = 2.00;
    
    //set buttons and labels
    Button btnCheck = new Button("Check Out");
    Button btnExit = new Button("Exit");
    Label lblPestStore = new Label("Pest Store");
    Label lblAnt = new Label ("Ant");
    Label lblFly = new Label ("Fly");
    Label lblRat = new Label ("Rat");
    Label lblAntInfo = new Label ("Ants will terrify and sting all people in the house");
    Label lblFlyInfo = new Label ("Flies will annoy everybody in the house");
    Label lblRatInfo = new Label ("Rats will probably transfer the black plague in the house");
    Label lblAntPrice = new Label ("$"+ antPrice);
    Label lblFlyPrice = new Label ("$"+ flyPrice);
    Label lblRatPrice= new Label ("$"+ ratPrice);
    TextField txtAntPrice = new TextField();
    TextField txtFlyPrice = new TextField();
    TextField txtRatPrice = new TextField();
    Label lblTotal = new Label ("Total:");
    Label lblTotalCost = new Label ("$" + total);
    Image pngAnt = new Image("file:ant.png");
    Image pngFly = new Image("file:fly.png");
    Image pngRat = new Image("file:rat.png");

    @Override
    public void start(Stage primaryStage) throws Exception {
       //sets images width and height
       ImageView antView = new ImageView(pngAnt);
       antView.setFitHeight(100);
       antView.setFitWidth(100);
       ImageView flyView = new ImageView(pngFly);
       flyView.setFitHeight(100);
       flyView.setFitWidth(100);
       ImageView ratView = new ImageView(pngRat);
       ratView.setFitHeight(100);
       ratView.setFitWidth(100);
       
       //sets fonts and max width to textboxes
       lblPestStore.setFont(Font.font("Tahoma", FontWeight.NORMAL, 30));
       lblAnt.setStyle("-fx-font-weight: bold;");
       lblFly.setStyle("-fx-font-weight: bold;");
       lblRat.setStyle("-fx-font-weight: bold;");
       txtAntPrice.setMaxWidth(40);
       txtFlyPrice.setMaxWidth(40);
       txtRatPrice.setMaxWidth(40);
       txtAntPrice.setPromptText("0");
       
       ///////////////////**********************Review this code in class
       txtAntPrice.setOnKeyReleased((ae) -> total += (antPrice * Double.parseDouble(txtAntPrice.getText())));
       txtFlyPrice.setPromptText("0");
       txtFlyPrice.setOnKeyReleased((ae) -> total += (flyPrice * Double.parseDouble(txtFlyPrice.getText())));
       txtRatPrice.setPromptText("0");
       txtRatPrice.setOnKeyReleased((ae) -> total += (ratPrice * Double.parseDouble(txtRatPrice.getText())));
       
      
       
       
       //cretes a grid pane
       GridPane layout = new GridPane();
       layout.setAlignment(Pos.CENTER);
       layout.setPadding(new Insets(5,5,5,5));
       layout.setVgap(5);
       layout.setHgap(5);
       
       //displays from title and logo
       primaryStage.setTitle("Pest Store");
       primaryStage.getIcons().add(new Image("file:logo.png"));
       
       //displays imagges
       layout.add(antView, 0, 5);
       layout.add(flyView, 0, 15);
       layout.add(ratView, 0, 25);
       
       //creating a grid
       setGrid();
       
       //add object to layout
       layout.getChildren().addAll(lblPestStore,btnCheck,btnExit,lblAnt,lblFly,lblRat);
       layout.getChildren().addAll(lblAntInfo,lblFlyInfo,lblRatInfo,lblAntPrice,lblFlyPrice,lblRatPrice);
       layout.getChildren().addAll(txtAntPrice,txtFlyPrice,txtRatPrice);
       layout.getChildren().addAll(lblTotal,lblTotalCost);
       
       //button actions
       btnCheck.setOnAction(this);
       btnExit.setOnAction(this);
       
       //creates a scene 
       Scene scene = new Scene(layout, 750, 600);
       primaryStage.setScene(scene);
       //displays form
       primaryStage.show();
    }
    
    @Override
    public void handle(ActionEvent event){
        //if btn check is pessed this runs
        if(event.getSource() == btnCheck)
        {
            lblTotalCost.setText("$" + new DecimalFormat("#0.00").format(total));
            //opnes receipt form
            Receipt.display(total);
        }
        //if btn exit is pessed this runs
        if(event.getSource() == btnExit)
        {
            //exist program
            System.exit(0);
        }
    }
    
    public void setGrid(){
        //creating a grid
    GridPane.setConstraints(lblPestStore,2,0);
    GridPane.setConstraints(btnCheck,0,35);
    GridPane.setConstraints(btnExit,1,35);
    GridPane.setConstraints(lblAnt,1,5);
    GridPane.setConstraints(lblFly,1,15);
    GridPane.setConstraints(lblRat,1,25);
    GridPane.setConstraints(lblAntInfo,2,5);
    GridPane.setConstraints(lblFlyInfo,2,15);
    GridPane.setConstraints(lblRatInfo,2,25);
    GridPane.setConstraints(lblAntPrice,9,5);
    GridPane.setConstraints(lblFlyPrice,9,15);
    GridPane.setConstraints(lblRatPrice,9,25);
    GridPane.setConstraints(txtAntPrice,10,5);
    GridPane.setConstraints(txtFlyPrice,10,15);
    GridPane.setConstraints(txtRatPrice,10,25);
    GridPane.setConstraints(lblTotal,9,35);
    GridPane.setConstraints(lblTotalCost,10,35);
        
    }
    
    //main functions
    public static void main(String[] args) {
        launch(args);
    }
    
}
