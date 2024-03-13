package ch16.lecture.p1lambda.exercise.p08;

public class p09 {
    private static Student[] students = {
            new Student("홍길동", 90, 96),
            new Student("신용권", 95, 93)
    };

    public static void main(String[] args) {
        double englishAvg = avg(Student::getEnglishScore);
        System.out.println("englishAvg = " + englishAvg);

        double mathAvg = avg(Student::getMathScore);
        System.out.println("mathAvg = " + mathAvg);
    }

    private static double avg(Function<Student> function) {
        double sum = 0.0;

        for (Student student : students) {
//            sum += student.getEnglishScore();
            sum += function.apply(student);
        }

        return sum / students.length;
    }
}
