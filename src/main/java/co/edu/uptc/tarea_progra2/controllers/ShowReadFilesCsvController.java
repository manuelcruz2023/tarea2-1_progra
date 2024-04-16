package co.edu.uptc.tarea_progra2.controllers;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uptc.tarea_progra2.models.Person;
import co.edu.uptc.tarea_progra2.services.ReadFilesCsv;
@RestController
@RequestMapping("person")
public class ShowReadFilesCsvController {
    @GetMapping("/test")
    public List<Person> showReadFilesCsv() {
        ReadFilesCsv readFilesCsv = new ReadFilesCsv();
        readFilesCsv.setPath("C://Users//FAMILIA CRUZ//OneDrive//Documentos//progra2//tarea_progra2//src//main//resources//content.csv");
        try {
            return readFilesCsv.createListPeople();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
