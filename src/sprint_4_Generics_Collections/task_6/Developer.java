package sprint_4_Generics_Collections.task_6;

public class Developer extends Employee {

    private Level level;

    public Developer(String name, int age, double salary, Level level) {
        super(name, age, salary);
        this.level = level;
    }

    public Level getLevel(){
        return level;
    }

    public String toString(){
        return super.toString() + ", Level: " + level.name();
   }
}