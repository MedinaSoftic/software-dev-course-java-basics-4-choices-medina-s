package org.example;

public class Main {
    public static void main(String[] args) {
        CollectionChoiceExercises exercises = new CollectionChoiceExercises();
        exercises.MakeColorCollection();

        CollectionChoiceExercises exercise1 = new CollectionChoiceExercises();
        exercise1.MakeStudentCollection();

        CollectionChoiceExercises exercise2 = new CollectionChoiceExercises();
        exercise2.MakeLoggedInUsersCollection();

        CollectionChoiceExercises exercise3 = new CollectionChoiceExercises();
        exercise3.MakeEmployeeAccessCodesCollection();
    }
}
