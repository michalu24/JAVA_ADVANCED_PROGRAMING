package _5_Cwiczenie14;

public class Student {
    private String name;
    private String surName;
    private int age;
    private String university;
    private int yearCollege;
    private double averageGrades;
    private boolean status;

    public static class Builder{
        private String name;
        private String surName;
        private int age;
        private String university;
        private int yearCollege;
        private double averageGrades;
        private boolean status;

        public Builder() {
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withSurname(String surname) {
            this.surName = surname;
            return this;

        }

        public Builder withAge(int age) {
            this.age = age;
            return this;
        }

        public Builder withUniversity(String university) {
            this.university = university;
            return this;
        }

        public Builder withYearCollege(int yearCollege) {
            this.yearCollege = yearCollege;
            return this;
        }

        public Builder withAverageGrades(double averageGrades) {
            this.averageGrades = averageGrades;
            return this;
        }

        public Builder withStatus(boolean status) {
            this.status = status;
            return this;
        }

        public Student build() {
            Student student = new Student();
            student.name = this.name;
            student.surName = this.surName;
            student.age = this.age;
            student.university = this.university;
            student.yearCollege = this.yearCollege;
            student.averageGrades = this.averageGrades;
            student.status = this.status;
            return student;
        }



    }

    private Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", university='" + university + '\'' +
                ", yearCollege=" + yearCollege +
                ", averageGrades=" + averageGrades +
                ", status=" + status +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public String getUniversity() {
        return university;
    }

    public int getYearCollege() {
        return yearCollege;
    }

    public double getAverageGrades() {
        return averageGrades;
    }

    public boolean isStatus() {
        return status;
    }
}
