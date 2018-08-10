package institution.interlink;

import person.Student;

public class University {
	private String name;
    public University(String name) {
        this.name = name;
        ArrayList<Student> university = new ArrayList<>();
        createFile();
    }
private void createFile()
    {
    	try{
    	FileOutputStream fos = new FileOutputStream(this.name + ".txt");
    	ObjectOutputStream oos = new ObjectOutputStream(fos);
    }catch (EOFExeption e) {
    	break;
    }
}    	
public void setStudent(Student student) {
        for (Student student : student){
             oos.writeObject(student);	
        }
        oos.flush();
        oos.close();
    }    
    public void addStudent(Student student) {
        university.add(student);
    }
    public void getStudents(){
    	while (true){
    		try {
    			students.add((Student) oin.readObject());
    		}catch (EOFExeption e) {
    			break;
    		}	
    	}
    	fis.close();
	}

	public ArrayList getStudentsList()
	{
		return university;
	}
}	