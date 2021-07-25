package sprint_2_Inherintance_Polymorphism.task_3;

public class Worker extends Person{
    private String workPosition;
    private int experienceYears;

    public Worker(String name, String workPosition, int experienceYears){
        super(name);
        this.workPosition = workPosition;
        this.experienceYears = experienceYears;
    }

    public String getWorkPosition(){
        return this.workPosition;
    }

    public int getExperienceYears(){
        return this.experienceYears;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Worker worker = (Worker) o;

        if (experienceYears != worker.experienceYears) return false;
        return workPosition != null ? workPosition.equals(worker.workPosition) : worker.workPosition == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (workPosition != null ? workPosition.hashCode() : 0);
        result = 31 * result + experienceYears;
        return result;
    }

    @Override
    public String toString() {
        return String.format("Worker [%s, workPosition=%s, experienceYears=%d]", super.toString(), workPosition, experienceYears);
    }
}
