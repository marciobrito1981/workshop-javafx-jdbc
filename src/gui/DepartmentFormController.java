package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.entities.Department;

public class DepartmentFormController implements Initializable {
	
	private Department entity;
	
	@FXML
	private TextField txtId;
	
	@FXML
	private TextField txtName;
	
	@FXML
	private Label labelErrorName;
	
	@FXML
	private Button btSave;
	
	@FXML
	private Button btCancel;
	
	
	public void setDepartment(Department entity) {
		this.entity = entity;
	}
	
	@FXML
	public void onBtSaveAction(){
		System.out.println("Botao Salvar Clicado");
		
	}
	
	@FXML
	public void onBtCancelAction(){
		System.out.println("Botao CAncelar clicado");
	}
	
	
	
	

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();;
		
		
	}
	
	private void initializeNodes() {
		Constraints.setTextFieldInteger(txtId); //só permitir numeros
		Constraints.setTextFieldMaxLength(txtName, 30); //limitar em 30 caracteres
	}
	
	public void updateFormData() {
		if(entity == null) {
			throw new IllegalStateException("Entidade está nula");
		}
		txtId.setText(String.valueOf(entity.getId()));
		txtName.setText(entity.getName());
	}
}
