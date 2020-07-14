public class StudentLogic {
    public void findGoodAcademicPerformance(Student student) {
        boolean flag = true;

        for (int i = 0; i < student.getAcademicPerformance().length; i++) {

            if (student.getAcademicPerformance()[i] < 9) {

                flag = false;
            }
        }

        if (flag) {

            student.print();
        }
    }
}
