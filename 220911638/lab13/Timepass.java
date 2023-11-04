import java.util.ArrayList;

import javax.swing.LayoutFocusTraversalPolicy;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.layout.*;
public class Timepass extends Application {
    public void start(Stage primaryStage)
    {
        ArrayList<String> user=new ArrayList<>();
        ArrayList<String> pass=new ArrayList<>();
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

        Button creat=new Button("Create account"), sig=new Button("Login in");
        GridPane.setConstraints(creat, 0, 0);
        GridPane.setConstraints(sig, 1, 0);
        GridPane.setConstraints(p, 1, 2);
        GridPane home=new GridPane();
        home.setAlignment(Pos.CENTER);
        home.getChildren().addAll(creat,sig);
        Scene s3=new Scene(home,500,300);
        primaryStage.setScene(s3);
        
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
        sig.setOnAction(e->{
            primaryStage.setScene(s);});
        creat.setOnAction(e->{
            Label us=new Label(),pa1=new Label(),pa2=new Label(),dis=new Label();
            us.setText("Enter username:");
            pa1.setText("Enter password:");
            pa2.setText("Reenter password:");
            GridPane.setConstraints(dis, 0, 3);
            
            GridPane.setConstraints(us, 0, 0);
            GridPane.setConstraints(pa1, 0, 1);
            GridPane.setConstraints(pa2, 0, 2);
            TextField t1=new TextField("Enter username");
            GridPane.setConstraints(t1, 1, 0);
            PasswordField pa3=new PasswordField();
            GridPane.setConstraints(pa3, 1, 1);
            PasswordField pa4=new PasswordField();
            GridPane.setConstraints(pa4, 1, 2);
            
            Button Creaq=new Button("Create account");
            GridPane.setConstraints(Creaq, 2, 3);
            Creaq.setOnAction(ev->{
                String pas1=pa4.getText(),pas2=pa4.getText();
                if(pas1.compareTo(pas2)!=0)
                {
                    dis.setText("Passwords don't match");
                }
                else if(pas1.compareTo(pas2)==0){
                    primaryStage.setScene(s3);
                    user.add(t1.getText());
                    pass.add(pas1);
                }
            });
            GridPane create=new GridPane();
            create.getChildren().addAll(us,dis,pa1,pa2,pa3,pa4,t1,Creaq);
            Scene m1=new Scene(create);
            primaryStage.setScene(m1);
        });
        
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
