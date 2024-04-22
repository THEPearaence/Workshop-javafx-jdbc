package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DepartmentFormController implements Initializable{

	
	@FXML
	private TextField txtid;
	
	@FXML
	private TextField txtName;
	
	@FXML
	private Label labelErrorName;
	
	@FXML
	private Button btSave;
	
	@FXML
	private Button btCancel;
	
	@FXML
	public void onBtSaveAction() {
		System.out.println("onBtAction");
	}
	
	@FXML
	public void onBtcancelAction() {
		System.out.println("onBtActionCancel");
	}
	
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
			inicializebleNodes();
	}

	private void inicializebleNodes() {
		Constraints.setTextFieldInteger(txtid);
		Constraints.setTextFieldMaxLength(txtName, 30);
	}
	
}
