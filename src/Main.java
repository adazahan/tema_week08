import domain.Student;
import validation.ValidationException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        addStudent();
        deleteStudent();
        retrieveAllStudentsWithACertainAge();
    }


    public static String verifyFirstName(String firstName) throws ValidationException {
        if (firstName == null || firstName == "") {
            throw new ValidationException("invalid first name");
        } else
            return firstName;
    }

    public static String verifyLastName(String lastName) throws ValidationException {
        if (lastName == null || lastName == "") {
            throw new ValidationException("invalid last name");
        } else
            return lastName;
    }

    public static int verifyDateOfBirth(int yearOfBirth) throws ValidationException {
        if (yearOfBirth < 1900 || yearOfBirth > 2019) {
            throw new ValidationException("invalid year of birth");
        } else
            return yearOfBirth;
    }

    public static String verifyGender(String gender) throws ValidationException {
        if (gender.equals("FEMALE") || gender.equals("MALE") || gender.equals("female") || gender.equals("male") || gender.equals("M") || gender.equals("F")) {
            return gender;
        } else
            throw new ValidationException("invalid gender");
    }

    public static int verifyAge(int yearOfBirth) throws ValidationException {
        int age = 2019 - yearOfBirth;
        if (age < 0) {
            throw new ValidationException("invalid age");
        } else return age;
    }

    public static int verifyId(int id) throws ValidationException {
        if (id == 0) {
            throw new ValidationException("id is empty - student doesn't exist");
        } else return id;
    }


    private static void addStudent() {
        List<Student> studentsListBeforeValidation = new ArrayList<>();

        Student s1 = new Student(1, "Ana", "Pop", "Fg", "2912103811313", 2020, 12, 10);
        Student s2 = new Student(2, "Ana", "Pop", "F", "2912103811313", 1991, 12, 10);

        studentsListBeforeValidation.add(s1);
        studentsListBeforeValidation.add(s2);


        List<Student> studentsListAfterValidation = new ArrayList<>();

        for (int i = 0; i < studentsListBeforeValidation.size(); i++) {
            int ok = 1;
            try {
                verifyFirstName(studentsListBeforeValidation.get(i).getFirstName());
            } catch (ValidationException e) {
                System.out.println("invalid name: " + e.getMessage());
                ok = 0;

            }
            try {
                verifyLastName(studentsListBeforeValidation.get(i).getLastName());
            } catch (ValidationException e) {
                System.out.println("invalid date of birth: " + e.getMessage());
                ok = 0;
            }
            try {
                verifyDateOfBirth(studentsListBeforeValidation.get(i).getYearOfBirth());
            } catch (ValidationException e) {
                System.out.println("invalid name: " + e.getMessage());
                ok = 0;
            }

            try {
                verifyGender(studentsListBeforeValidation.get(i).getGender());
            } catch (ValidationException e) {
                System.out.println("invalid gender: " + e.getMessage());
                ok = 0;
            }
            try {
                verifyAge(studentsListBeforeValidation.get(i).getYearOfBirth());
            } catch (ValidationException e) {
                System.out.println("invalid age: " + e.getMessage());
                ok = 0;
            }


            if (ok == 1) {
                studentsListAfterValidation.add(studentsListBeforeValidation.get(i));
            }
        }

        System.out.println("Add Students: ");
        System.out.println(studentsListAfterValidation);
    }

    private static void deleteStudent() {
        List<Student> studentsList = new ArrayList<>();

        Student s1 = new Student(1, "Ana", "Pop", "Fg", "2912103811313", 2020, 12, 10);
        Student s2 = new Student(2, "Ana", "Pop", "F", "2912103811313", 1991, 12, 10);
        Student s3 = new Student(3, "Ana", "Pop", "F", "", 1991, 12, 10);

        studentsList.add(s1);
        studentsList.add(s2);
        studentsList.add(s3);

        System.out.println("Delete Student by id: ");
        try {
            int idToDelete = 2;
            verifyId(idToDelete);
            studentsList.remove(studentsList.get(idToDelete));
        } catch (ValidationException e) {
            System.out.println("invalid name: " + e.getMessage());
        }

        try {
            int idToDelete = 0;
            verifyId(idToDelete);
            studentsList.remove(studentsList.get(idToDelete));
        } catch (ValidationException e) {
            System.out.println("invalid name: " + e.getMessage());
        }

        System.out.println(studentsList);

    }

    private static void retrieveAllStudentsWithACertainAge() {
        List<Student> studentsList = new ArrayList<>();

        Student s1 = new Student(1, "Ana", "Pop", "Fg", "2912103811313", 1964, 12, 10);
        Student s2 = new Student(2, "Ana", "Popescu", "F", "2912103811313", 1991, 12, 10);
        Student s3 = new Student(3, "Ana", "Popovici", "F", "3141441", 1991, 12, 10);
        Student s4 = new Student(3, "Ana", "Popovici", "F", "3141441", 2020, 12, 10);

        studentsList.add(s1);
        studentsList.add(s2);
        studentsList.add(s3);
        studentsList.add(s4);


        int ageX = 28;

        System.out.println("Retrieve all students with age " + ageX);

        for (int i = 0; i < studentsList.size(); i++) {
            try {
                verifyAge(studentsList.get(i).getYearOfBirth());
                if (2019 - studentsList.get(i).getYearOfBirth() == ageX) {
                    System.out.println(studentsList.get(i).getLastName());
                }
            } catch (ValidationException e) {
                System.out.println("invalid age: " + e.getMessage());
            }
        }

    }
}




