package com.company;

public class Student {

    public  String rollno="";
    public  String branch="";
    public  String section="";
    public int year=0;

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "{" +
                "rollno='" + rollno + '\'' +
                ", branch='" + branch + '\'' +
                ", section='" + section + '\'' +
                ", year=" + year +
                '}';
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
