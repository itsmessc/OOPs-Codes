import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.layout.*;
public class App extends Application {
    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("JavaFx Welcome");
        Label l=new Label(),m=new Label(),u=new Label(),p1=new Label();
        l.setText("Welcome");
        GridPane.setConstraints(l, 0, 0);
        u.setText("Username:");
        GridPane.setConstraints(u, 0, 1);
        p1.setText("Password:");
         GridPane.setConstraints(p1, 0, 2);
        l.setTextFill(Color.BLACK);
        TextField t=new TextField("Enter username");
         GridPane.setConstraints(t, 1, 1);
        PasswordField p=new PasswordField();
         GridPane.setConstraints(p, 1, 2);
        Button b=new Button("Sign in");
        b.setOnAction(e -> { 
            FlowPane op=new FlowPane();
            String s2=p.getText();
            if(s2.compareTo("firstjavafx123")==0){
            m.setText("Welcome "+t.getText());
            op.getChildren().add(m);
            op.setAlignment(Pos.CENTER);
            Scene s1=new Scene(op,500,200);
            primaryStage.setScene(s1);}
            else
            {
                m.setText("Wrong Password");
            
            }});
        Button b1=new Button("Create account");
         GridPane.setConstraints(m, 1, 3);
          GridPane.setConstraints(b, 2, 3); 
        GridPane root=new GridPane();
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(l,u,p1,t,p,m,b);
        Scene s=new Scene(root,500,200);
        primaryStage.setScene(s);
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
