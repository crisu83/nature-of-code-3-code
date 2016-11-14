package org.arcada.noc3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Person[] arrayOfPersons = new Person[5];
        Person person;
        String name;
        int age;

        for (int i = 0; i < arrayOfPersons.length; i++) {
            System.out.println("Ange ditt namn: ");
            name = reader.readLine();

            System.out.println("Ange din ålder: ");
            age = Integer.parseInt(reader.readLine());

//            person = new Person();
//            person.setName(name);
//            person.setAge(age);

            if (i % 2 == 0) {
                arrayOfPersons[i] = new Person(name, age);
            } else {
                arrayOfPersons[i] = new Person(age, name);
            }

            // Eller så kan vi också skriva:
            //
            // arrayOfPersons[i] = i % 2 == 0 ? new Person(name, age) : new Person(age, name);
        }

        for (int i = arrayOfPersons.length - 1; i >= 0; i--) {
            person = arrayOfPersons[i];
            System.out.println("Personen på position " + (i + 1) + " heter " + person.getName() + " och är " + person.getAge() + " år.");
        }

        System.out.println("Vi skapade personer " + Person.timesConstructedWithNameAndAge + " gånger med konstruktor 1.");
    }
}
