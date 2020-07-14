

public class Student {
    private String name;
       private int group;
        private int[] academicPerformance = new int[5];

    public Student(String name, int group, int[] academicPerformance) {
        this.name = name;
        this.group = group;
        this.academicPerformance = academicPerformance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int[] getAcademicPerformance() {
        return academicPerformance;
    }

    public void setAcademicPerformance(int[] academicPerformance) {
        this.academicPerformance = academicPerformance;
    }

    public void print() {

        System.out.println(name+"   "+group);

    }
}
