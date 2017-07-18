package kurs.java.fx.controller;

import java.awt.event.ActionEvent;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class PaneWindowController
{

	public PaneWindowController()
	{
		System.out.println("Jestem controllerem");

	}

	@FXML
	private Button przycisk; // musi byc to id co wpisane w scene builder

	@FXML
	public void initialize()
	{
		przycisk.setText("Witaj!");

	
		EventHandler<MouseEvent> mouseEnteredHandler = new EventHandler<MouseEvent>()
		{

			@Override
			public void handle(MouseEvent event)
			{
				przycisk.setText("Najechano mysz¹");

			}
		};
		przycisk.addEventHandler(MouseEvent.MOUSE_ENTERED, mouseEnteredHandler);

		
		EventHandler<MouseEvent> mouseExitedLambdaHandler = e->{
			przycisk.setText("Przycisk");
			
		};
		przycisk.addEventHandler(MouseEvent.MOUSE_EXITED, mouseExitedLambdaHandler);
		
		/*przycisk.setOnAction(e ->
		{
			przycisk.setText("Wcisnieto");

		});*/			//to mozna tylko raz
	}
	
	@FXML
	 public void onActionButton()
	 {
		 System.out.println("COs sie stalo");
	 }

}
