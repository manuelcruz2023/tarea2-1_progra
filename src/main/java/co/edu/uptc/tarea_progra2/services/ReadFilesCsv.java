package co.edu.uptc.tarea_progra2.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import co.edu.uptc.tarea_progra2.models.Person;

public class ReadFilesCsv {
    private String path;
    private BufferedReader br;

    public void setPath(String path) {
        this.path = path;
    }
    
    public List<String> readTxt() throws IOException {
        List<String> content = new ArrayList<>();
        br = new BufferedReader(new FileReader(path));
        String line = "";
        while ((line = br.readLine()) != null) {
            content.add(line);
        }
        content.remove(0);
        return content;
    }

    public int numberQuote(String string) throws IOException {
        int contQuote = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.substring(i, i + 1).equals(",")) {
                contQuote++;
            }
        }
        return contQuote;
    }

    public List<Person> createListPeople() throws IOException {
        List<String> content = readTxt();
        List<Person> people = new ArrayList<>();
        for (String string : content) {
            Person person = new Person();
            String[] data = string.split(",");
            person.setIndex(data[0]);
            person.setUserId(data[1]);
            person.setFirstName(data[2]);
            person.setLastName(data[3]);
            person.setSex(data[4]);
            person.setEmail(data[5]);
            person.setPhoneNumber(data[6]);
            person.setDateOfBirth(data[7]);
            person.setJobTitle(data[8]);
            if (numberQuote(string) == 9) {
                person.setJobTitle(data[8] + "," + data[9]);
            }
            people.add(person);
        }
        return people;
    }
}
