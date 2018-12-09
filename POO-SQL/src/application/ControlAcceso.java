package application;
import Usuarios.Usuarios;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ControlAcceso implements Initializable{
	@FXML private TextField txtCuenta;
	@FXML private TextField txtNombre;	
	@FXML private Button btnAcceder;
	@FXML private Button btnCancelar;
	@FXML private TextArea txtAResultado;
	private Main main;
	ArrayList<Usuarios> usuarios = new ArrayList<Usuarios>();
	Usuarios administrador = new Usuarios("Matamoros","1520");
	public ArrayList<Usuarios> getUsuerios() {
		return usuarios;
	}
	public void setUsuerios(ArrayList<Usuarios> usuerios) {
		this.usuarios = usuerios;
	}
	
	public void initialize(URL location, ResourceBundle arg1) {}
	@FXML
	public void salir() {
		System.exit(0);
	}
	@FXML
	public void ventanaControl(){
		
	}

	public Main getMain() {
		return main;
	}

	public void setMain(Main main) {
		this.main = main;
	}
	
	public boolean verificacionUsuario(TextField txtCuenta, TextField txtNombre){
		usuarios.add(administrador);
		for (int n=0;n==usuarios.size();n++) {
			if((txtNombre.getText().equals(usuarios.get(n).getNombre()))==true) {
				if(txtCuenta.getText().equals(usuarios.get(n).getCuenta())==true) {
					return true;
				}
			}
		}
		return false;
	}
}	
