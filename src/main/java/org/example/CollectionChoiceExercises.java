package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

// For these exercises, you need to declare a single variable
// in each function that uses the appropriate collection type
// (Array, ArrayList, HashSet, HashMap)
//
// You do not need to populate this array or add any additional code.
// If you get stuck, refer to the java basics 4 (arrays and collections) curriculum
public class CollectionChoiceExercises {
    public void MakeColorCollection() {
        // EXAMPLE:
        // Create an appropriate variable for holding a collection
        // of three strings that are known ahead of time to be "Red", "Green" and "Blue"
        // and will not change during program execution.

        String[] colors = new String[3];
        colors[0] = "Red";
        colors[1] = "Green";
        colors[2] = "Blue";
        System.out.println(Arrays.toString(colors));
    }

    public void MakeStudentCollection() {
        // Create an appropriate collection variable for holding a list of student names
        // that will be added to and removed from during program execution.
        ArrayList<String> students = new ArrayList<>();
        students.add("Medina");
        System.out.println(students);
    }

    public void MakeLoggedInUsersCollection() {
        // Create an appropriate collection variable for holding a set of
        // unique logged in usernames where adding a username that's already
        // present is ignored and checking if a user is in the collection can
        // be done very quickly.
        HashSet<String> loggedIn = new HashSet<>();
        loggedIn.add("MellowMedusa");
        loggedIn.add("TheGoldenGamer");

        System.out.println("Is Medina logged in ? " + loggedIn.contains("MellowMedusa"));
        System.out.println("Logged in users: " + loggedIn );

    }

    public void MakeEmployeeAccessCodesCollection() {
        // Create an appropriate collection variable for holding a set of
        // key-value pairs where they key is an employee name (String) and the
        // value is an employee access code (String.)
        HashMap<String, String> employeeInfo = new HashMap<>();
        employeeInfo.put("Eth", "treat");
        employeeInfo.put("Medina", "pizza");
        System.out.println(employeeInfo);
        System.out.println(employeeInfo.keySet());
        System.out.println(employeeInfo.values());
    }
}
