public class studentGrades {
    public static void main(String[] args) {

        int subject1 = 70, subject2 = 86, subject3 = 92;
        int totalMarks = subject1+subject2+subject3;
        double avg = (double) totalMarks/3;

        System.out.println(totalMarks);
        System.out.println(avg);

        if (avg>=90) {
            System.out.println("Grade: A+");
        } else if (avg>=80) {
            System.out.println("Grade: A");
        } else if (avg>=70) {
            System.out.println("Grade: B");
        } else if (avg>=60) {
            System.out.println("Grade: C");
        } else if (avg>=50) {
            System.out.println("Grade: D");
        } else if (avg>=40) {
            System.out.println("Grade: E");
        } else if (avg<40) {
            System.out.println("Grade: F");
        }
    }
}