package institution.interlink;

import person.Student;

public class Internship {
    private String name;
    public Internship(String name) {
        this.name = name;
        ArrayList<Student> intership = new ArrayList<>();
    }

    public void setStudent(Student student) {
        intership.add(student);
    }

    public String getStudents() {
        String studentList = "";
        for(Student student : intership)
            {studentList = studentList + student.getName + "/n";}
        return studentList
    }
}
