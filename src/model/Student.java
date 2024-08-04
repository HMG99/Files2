package model;

public class Student implements Comparable<Student> {
    private String name;
    private String surname;
    private int year;
    private double mark;

    public Student(String name, String surname, int year, double mark) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mark = mark;
    }

    public Student(String line) {
        String[] split = line.split(",");
        setName(split[0]);
        setSurname(split[1]);
        setYear(Integer.parseInt(split[2]));
        setMark(Double.parseDouble(split[3]));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + year + " " + mark;
    }

    @Override
    public int compareTo(Student o) {
        return year - o.getYear();
    }
}
