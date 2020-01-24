package com.company;

import java.util.Scanner;
import java.util.Date;

public class StudentDataCreator {


    public  Student studentList[]=new Student[270];
    public  String rollno;
    public  String branch;
    public  String section;
    public  int years[]={2,3,4};
    public int year;
    Date d=new Date();
    int currentYear=d.getYear()-100;
    public String branches[]={"cse","civil","mech","eee","it","ece"};

            ;




    public StudentDataCreator()  {
        int counterTemp=0;
        for(int y=0;y<years.length;y++) {
            year = years[y];

            for (int b = 0; b < branches.length; b++)
            {
                branch=branches[b];
                //System.out.println(currentYear);
                String start=(currentYear-year)+"911A"+getBranchCode(branch);//2020-4
                //System.out.println("Enter the starting rollno:");
                //String start=sc.nextLine();
                // System.out.println("Enter the branch:");
                //branch=sc.nextLine();
                //System.out.println("Enter the year:");
                //year=sc.nextInt();


                char c, sec;
            int i, j = 0, z = 0;
            for (i = 0, c = 'A', sec = 'A'; i < 15&& (c <= 'Z'); i++) {
                Student s = new Student();

                if (j < 10) {
                    rollno = start + c + j;
                    section = "" + sec;
                     //    System.out.println(rollno+" "+branch+" "+section+" "+year);
                    s.setRollno(rollno);
                    s.setBranch(branch);
                    s.setSection(section);
                    s.setYear(year);
                   // System.out.println(s);
                    studentList[counterTemp] = s;
                    counterTemp++;
                  // System.out.println(studentList[z]+"  "+counterTemp+" "+j);
                               j++;
                } else {
                    ++c;
                    j = 0;
                }

                if (i % 60 == 0 && i > 2) {
                    sec++;

                }

            }
        }

            //System.out.println(i);
        }
    }

    private String getBranchCode(String branch) {

        switch (branch)
        {
            case "civil": return "01";
            case "eee": return "02";
            case "mech": return "03";
            case "ece": return "04";
            case "cse": return "05";
            case "it": return "12";
            default: return "null";


        }
    }

    public void printStudentData()
    {


        int i=0;
        System.out.println("[");
        for (Student s:studentList)
        {
            if(s!=null) {
                String str1="{" +
                        "\"year\":" + s.getYear() + ",\n" +
                        "\"section\":" +"\""+ s.getSection()+"\"" + "," +
                        "\"branch\":" +"\""+ s.getBranch() +"\""+ "," +
                        "\"rollno\":" +"\""+ s.getRollno() +"\""+ "" +
                        "},";
                System.out.print(str1);
                i++;
            }

            else
            {
                continue;
            }
        }
        System.out.println("]");
        //System.out.println(i);

    }



}
