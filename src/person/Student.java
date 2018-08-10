package institution.person;

import person.consciousness.Knowledge;

public class Student {
	private String name;
	private Knowledge knowledge;
    public Student(String name, int level) {
        this.name = name;
        setKnowledge(new Knowledge(level));
    }

    public void setKnowledge(Knowledge knowledge) {
        this. knowledge = knowledge;
    }

    public int getKnowledge() {
    	return knowledge.getLevel();
    }

    public String getName(){
    	return this.name;
    }
}
