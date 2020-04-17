package gui.util;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

public class Utils {
	
	
	//Receber o Stage onde o controle que recebeu o evento  está
	public static Stage currentStage(ActionEvent event) {
		return (Stage)((Node)event.getSource()).getScene().getWindow();
		
	}
	
	//Tenta converter para inteiro, caso contrario retorna nulo
	public static Integer tryParseToInt(String str) {
		try {
		return Integer.parseInt(str);
		}
		catch (NumberFormatException e) {
			return null;
		}
	}

}
