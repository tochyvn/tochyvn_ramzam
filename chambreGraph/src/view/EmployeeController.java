package view;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import composant.MonLabel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import model.Employee;

public class EmployeeController implements Initializable {
	
	@FXML
	private GridPane gridEmployee;
	
	private ObservableList<Employee> employees;
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		employees = FXCollections.observableArrayList();
		employees.addAll(getEmployees());
		int line = 1;
		for (Employee employee : employees) {
			gridEmployee.add(new Pane(new MonLabel(employee.getNom())), 0, line);
			gridEmployee.add(new Pane(new MonLabel(employee.getPoste())), 1, line);
			gridEmployee.add(new Pane(new MonLabel(employee.getAdresse())), 2, line);
			gridEmployee.add(new Pane(new MonLabel(employee.getSalaire()+"")), 3, line);
			gridEmployee.add(new Pane(new MonLabel("AJOUTER OU SUPPRIMER")), 4, line);
			line++;
		}
	}
	
	private ArrayList<Employee> getEmployees() {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("TOCH", "DIRECTION", "oejfkfjhjd", 2500.0));
		employees.add(new Employee("IMY", "RECEPTION", "oejfkfjhjd", 2500.0));
		employees.add(new Employee("TOM", "RECEPTION", "oejfkfjhjd", 2500.0));
		return employees;
	}

}
