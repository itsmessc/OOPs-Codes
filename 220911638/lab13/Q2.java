package lab13;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.layout.*;
public class Q2 extends Application {
    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("This is the first javafx application");
        Label l=new Label();
        l.setTextFill(Color.BLACK);
        TextField sd=new TextField("Enter number");
        Button button = new Button("Submit");
        button.setOnAction(event -> {
            String userInput = sd.getText();
            int number = Integer.parseInt(userInput);
            StringBuilder result = new StringBuilder();
            for (int i = 1; i <= number; i++) {
                result.append(i * 10).append(" ");
            }
            l.setText("Result: " + result.toString());
        });
        FlowPane root = new FlowPane(10 ,30);
        
        root.setAlignment(Pos.CENTER);
        root.getChildren().add(sd);
        root.getChildren().add(button);
        root.getChildren().add(l);

        Scene s=new Scene(root,500,200);
        primaryStage.setScene(s);
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
