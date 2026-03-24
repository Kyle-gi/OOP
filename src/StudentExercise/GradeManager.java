package StudentExercise;

public class GradeManager {

    private Student[] students;

    public GradeManager(){
        students = new Student[5];
    }

    public void addStudent(Student s){
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null){
                students[i] = s;
                return;
            }
        }
        System.out.println("The student is already added and cannot add" + s.getName());
    }
    
    public void listStudents(){
        for (int i = 0; i < students.length; i++) {
            if (students != null){
                System.out.println(students[i] + " ");
                return;
            }
        }
        System.out.println("There are no students!");
    }

    public double calculateAverage(){
        double sum = 0;
        int count = 0;

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null){
                sum += students[i].getGrade();
                count++;
            }
        }
        if (count == 0){
            return 0;
        }

        return sum / count;
    }
    
    public void findTopStudent(){
        Student top = null;

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null){
                if (top == null || students[i].getGrade() > top.getGrade()){
                    top = students[i];
                }
            }
        }

        if (top != null) {
            System.out.println("Top student: " + top);
        }
        else {
            System.out.println("No students found!");
        }
    }
}
