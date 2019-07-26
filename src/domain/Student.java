package domain;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String gender;
    private String cnp;
    private int yearOfBirth;
    private int monthOFBirth;
    private int dayOfBirth;

    public Student(int id, String firstName, String lastName, String gender, String cnp, int yearOfBirth, int monthOFBirth, int dayOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.cnp = cnp;
        this.yearOfBirth = yearOfBirth;
        this.monthOFBirth = monthOFBirth;
        this.dayOfBirth = dayOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getMonthOFBirth() {
        return monthOFBirth;
    }

    public void setMonthOFBirth(int monthOFBirth) {
        this.monthOFBirth = monthOFBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", cnp='" + cnp + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", monthOFBirth=" + monthOFBirth +
                ", dayOfBirth=" + dayOfBirth +
                '}';
    }

}
