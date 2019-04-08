/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;

/**
 *
 * @author Himanshu.Parwani
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TableView<PersonTableData> table;
    
    private ObservableList<PersonTableData> data = FXCollections
			.observableArrayList();
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       table.setItems(data);
       populate(retrieveData());
    }
    private void populate(final List<Person> people) 
    {
	people.forEach(p -> data.add(new PersonTableData(p)));
    }
    private List<Person> retrieveData() {
        
        
        return Arrays.asList(
                new Person("Himanshu", "himanshu.parwani@gmail.com",
                        81144317,
                        "E53,Sector27", "Noida UP"),
                new Person("Himanshu", "himanshu.parwani@gmail.com",
                        81144317,
                        "E53,Sector27", "Noida UP"),
                new Person("Himanshu", "himanshu.parwani@gmail.com",
                        81144317,
                        "E53,Sector27", "Noida UP"),
                new Person("Himanshu", "himanshu.parwani@gmail.com",
                        81144317,
                        "E53,Sector27", "Noida UP"),
                new Person("Himanshu", "himanshu.parwani@gmail.com",
                        81144317,
                        "E53,Sector27", "Noida UP"),
                new Person("Himanshu", "himanshu.parwani@gmail.com",
                        81144317,
                        "E53,Sector27", "Noida UP"),
                new Person("Himanshu", "himanshu.parwani@gmail.com",
                        81144317,
                        "E53,Sector27", "Noida UP"),
                new Person("Himanshu", "himanshu.parwani@gmail.com",
                        81144317,
                        "E53,Sector27", "Noida UP"),
                new Person("Himanshu", "himanshu.parwani@gmail.com",
                        81144317,
                        "E53,Sector27", "Noida UP"),
                new Person("Himanshu", "himanshu.parwani@gmail.com",
                        81144317,
                        "E53,Sector27", "Noida UP"),
                new Person("Himanshu", "himanshu.parwani@gmail.com",
                        81144317,
                        "E53,Sector27", "Noida UP"),
                new Person("Himanshu", "himanshu.parwani@gmail.com",
                        81144317,
                        "E53,Sector27", "Noida UP"),
                new Person("Himanshu", "himanshu.parwani@gmail.com",
                        81144317,
                        "E53,Sector27", "Noida UP"),
                new Person("Himanshu", "himanshu.parwani@gmail.com",
                        81144317,
                        "E53,Sector27", "Noida UP"),
                new Person("Himanshu", "himanshu.parwani@gmail.com",
                        81144317,
                        "E53,Sector27", "Noida UP"),
                new Person("Himanshu", "himanshu.parwani@gmail.com",
                        81144317,
                        "E53,Sector27", "Noida UP"),
                new Person("Himanshu", "himanshu.parwani@gmail.com",
                        81144317,
                        "E53,Sector27", "Noida UP"),
                new Person("Himanshu", "himanshu.parwani@gmail.com",
                        81144317,
                        "E53,Sector27", "Noida UP"),
                new Person("Himanshu", "himanshu.parwani@gmail.com",
                        81144317,
                        "E53,Sector27", "Noida UP"),
                new Person("Himanshu", "himanshu.parwani@gmail.com",
                        81144317,
                        "E53,Sector27", "Noida UP"),
                new Person("Himanshu", "himanshu.parwani@gmail.com",
                        81144317,
                        "E53,Sector27", "Noida UP"),
                new Person("Himanshu", "himanshu.parwani@gmail.com",
                        81144317,
                        "E53,Sector27", "Noida UP"),
                new Person("Himanshu", "himanshu.parwani@gmail.com",
                        81144317,
                        "E53,Sector27", "Noida UP"),
                new Person("Himanshu", "himanshu.parwani@gmail.com",
                        81144317,
                        "E53,Sector27", "Noida UP"),
                new Person("Himanshu", "himanshu.parwani@gmail.com",
                        81144317,
                        "E53,Sector27", "Noida UP"),
                new Person("Himanshu", "himanshu.parwani@gmail.com",
                        81144313,
                        "E53,Sector27", "Noida UP"),
                new Person("Himanshu", "himanshu.parwani@gmail.com",
                        81144315,
                        "E53,Sector27", "Noida UP"),
                new Person("Himanshu", "himanshu.parwani@gmail.com",
                        81144317,
                        "E53,Sector27", "Noida UP"),
                new Person("Himanshu", "himanshu.parwani@gmail.com",
                        81144319,
                        "E53,Sector27", "Noida UP"),
                new Person("Himanshu", "himanshu.parwani@gmail.com",
                        81144317,
                        "E53,Sector27", "Noida UP"),
                new Person("Himanshu", "himanshu.parwani@gmail.com",
                        81144317,
                        "E53,Sector27", "Noida UP"),
                new Person("Himanshu", "himanshu.parwani@gmail.com",
                        81144317,
                        "E53,Sector27", "Noida UP"),
                new Person("Himanshu", "himanshu.parwani@gmail.com",
                        81144317,
                        "E53,Sector27", "Noida UP"),
                new Person("Himanshu", "himanshu.parwani@gmail.com",
                        81144317,
                        "E53,Sector27", "Noida UP"),
                new Person("Himanshu", "himanshu.parwani@gmail.com",
                        81144317,
                        "E53,Sector27", "Noida UP"),
                new Person("Himanshu", "himanshu.parwani@gmail.com",
                        81144317,
                        "E53,Sector27", "Noida UP"));
		
	}
    
    
    
    
}
