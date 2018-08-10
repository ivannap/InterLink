package institution.main;

import institution.University;
import institution.interlink.Internship;
import person.Student;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        university.addStudent(new Student("Andrew Kostenko", 50));
        university.addStudent(new Student("Julia Veselkina", 60));
        university.addStudent(new Student("Maria Perechrest", 80));

        Internship internship = new Internship("Interlink");
        System.out.println("List of internship's students:");
        ArrayList<Students> = university.getStudentsList();
        for(Student student : university) {
        	if(student.getKnowledge > 50)
        		{internship.setStudent(student)}
        }
		System.out.println(internship.getStudents());
    }
}
