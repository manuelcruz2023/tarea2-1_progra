package co.edu.uptc.tarea_progra2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import co.edu.uptc.tarea_progra2.controllers.ShowReadFilesCsvController;

@SpringBootApplication
public class TareaProgra2Application {

	public static void main(String[] args) {
		SpringApplication.run(TareaProgra2Application.class, args);
		ShowReadFilesCsvController showReadFilesCsvController = new ShowReadFilesCsvController();
		showReadFilesCsvController.showReadFilesCsv();
	}

}
