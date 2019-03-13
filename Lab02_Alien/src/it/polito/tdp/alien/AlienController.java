
package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtWord;

    @FXML
    private Button btnTranslate;

    @FXML
    private TextArea txtArea;

    @FXML
    private Button btnClear;
    
    private AlienDictionary dizionario ;
   

    @FXML
    void doReset(ActionEvent event) {

    }

    @FXML
    void doTranslate(ActionEvent event) {
    	
    	String parola = txtWord.getText();
    	String[] s = parola.split(" ");
    	
   	
    	if(parola.contains(" ")==true) {
    		txtWord.clear();
    		dizionario.addWord(s[0], s[1]);
    		
    		
    	}else {
    		String ss=dizionario.translateWord(s[0]);
    		txtWord.clear();
    		txtArea.appendText(ss);
    		
    	}

    }

    @FXML
    void initialize() {
        assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
        assert txtArea != null : "fx:id=\"txtArea\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'Alien.fxml'.";

    }
}
