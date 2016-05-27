package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.paint.Color;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class PieChartController implements Initializable {
	
	@FXML
	private PieChart pieChart;
	
	private ObservableList<PieChart.Data> pieCharData;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		pieCharData = FXCollections.observableArrayList(
					new PieChart.Data("Chambres vides", 13),
					new PieChart.Data("Chambres en maintenance", 25),
					new PieChart.Data("Chambres ocuppées", 10),
					new PieChart.Data("Chambre reservée non confirmée", 22),
					new PieChart.Data("Chambres neutes", 30)
				);
		pieChart.setLabelLineLength(30);
		//pieChart.setLegendSide(Side.LEFT);
		//pieChart.setClockwise(false);
		pieChart.setData(pieCharData);
		pieChart.setTitle("Statut des chambres");
		
		final Label caption = new Label("dfgsdfgdfgsgdf");
		caption.setTextFill(Color.DARKORANGE);
		caption.setStyle("-fx-font: 24 arial;");

		for (final PieChart.Data data : pieChart.getData()) {
		    data.getNode().addEventHandler(MouseEvent.MOUSE_PRESSED,
		        new EventHandler<MouseEvent>() {
		            @Override 
		            public void handle(MouseEvent e) {
		                caption.setTranslateX(e.getSceneX());
		                caption.setTranslateY(e.getSceneY());
		                System.out.println("X : "+e.getSceneX()+"  Y : "+e.getSceneY());
		                caption.setText(String.valueOf(data.getPieValue()) + "%");
		            }
		        });
		}

	}
	

}
