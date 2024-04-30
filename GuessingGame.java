import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.stage.*;
import java.util.*;
import java.util.Random;

public class GuessingGame extends Application {

   private int randomNum;
   private int attempts;

   @Override
    public void start(Stage primaryStage) {
        // Generate a random number between 1 and 100
      Random random = new Random();
      randomNum = random.nextInt(100) + 1;
      attempts = 0;
   
      Label msg = new Label("Guess the number (Think of a number between 1 and 100):");
      TextField guessField = new TextField();
      guessField.setMaxWidth(250);
      Label result = new Label();
      Button submit = new Button("Guess");
   
        // Event handler for the guess button
      submit.setOnAction(
         event -> {
            String input = guessField.getText();
            try {
               int userNum = Integer.parseInt(input);
               attempts++;
               if (userNum == randomNum) {
                  result.setText("Congratulations! You guessed the number.\n "+ attempts + " attempts." );
                  result.setText( attempts + " attempts.");
                 
               } 
               else if (userNum < randomNum) {
                  result.setText("Too low! Try a higher number. "+ attempts + " attempts.");
               
               } 
               else {
                  result.setText("Too high! Try a lower number. "+ attempts + " attempts.");
               }
            } 
            catch (NumberFormatException e) {
               result.setText("Please enter a valid number.");
            }
         });
   
        
      VBox root = new VBox();
      root.setSpacing(10);
      root.setAlignment(Pos.CENTER);
      root.getChildren().addAll(msg, guessField, submit, result);
        
      Scene scene = new Scene(root, 400, 200);
   
      primaryStage.setScene(scene);
      primaryStage.setTitle("Guessing Game");
      primaryStage.show();
   }

   public static void main(String[] args) {
      launch(args);
   }
}  