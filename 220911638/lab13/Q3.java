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
        TextField sd=new TextField("Enter number1");
        TextField sd2=new TextField("Enter number2");
        Button button = new Button("Submit");
        button.setOnAction(event -> {
            String userInput = sd.getText(),lol=sd2.getText();
            int num1 = Integer.parseInt(userInput);
            int num2 = Integer.parseInt(lol);
            StringBuilder result = new StringBuilder();
            int gcd = 1;
            for (int i = 1; i <= num1 && i <= num2; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    gcd = i;
                }
            }
            l.setText("gcd=" + gcd);
        });
        FlowPane root = new FlowPane(10 ,30);
        
        root.setAlignment(Pos.CENTER);
        root.getChildren().add(sd);
        root.getChildren().add(sd2);
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
