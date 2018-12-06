package application;
import java.util.ArrayList;

import Usuarios.Usuarios;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;
public class Main extends Application {
	public void start(Stage primaryStage) {
		try {
			Stage acceso = new Stage();
			acceso.initStyle(StageStyle.UNDECORATED); 
			AnchorPane accesoUsuario = (AnchorPane)FXMLLoader.load(getClass().getResource("Acceso.fxml"));
			Scene accesoPas = new Scene(accesoUsuario,300,130);
			accesoPas.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			acceso.setScene(accesoPas);
			acceso.show();
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Scene.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		primaryStage.setTitle("SQL-POO");
	}
	public static void main(String[] args) {
		launch(args);
	}
	ArrayList<Usuarios> usuarios = new ArrayList<Usuarios>();
	Usuarios administrador= new Usuarios(null, 0);	
	
}
