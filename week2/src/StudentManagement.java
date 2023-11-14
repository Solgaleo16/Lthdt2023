
import java.util.ArrayList;
import java.util.List;


public class StudentManagement {
    private final Student[] students;
    private int studentNumber = 0;

    public StudentManagement() {
        students = new Student[100];
    }

    /**
     * check Students in same group.
     * @param s1 std1
     * @param s2 std2
     * @return same or not
     */
    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * add student.
     * @param newStudent new std
     */
    public void addStudent(Student newStudent) {
        int same = 0;
        for (int i = 0; i < studentNumber; i++) {
            if (newStudent.getId().equals(students[i].getId())) {
                same = 1;
                break;
            }
        }
        if (same == 0) {
            students[studentNumber] = new Student(newStudent);
            studentNumber++;
        }
    }

    /**
     * arranging students by group.
     * @return arrangement
     */
    public String studentsByGroup() {
        if (students[0] == null) {
            return "";
        }

        int n = studentNumber;
        boolean[] used = new boolean[100];
        String ans = "";

        for (int i = 0; i < n; i++) {
            if (used[i] == true) {
                continue;
            }
            String tmpGroup = students[i].getGroup();
            ans = ans + tmpGroup + "\n";
            for (int j = i; j < n; j++) {
                if (students[j].getGroup().equals(tmpGroup)) {
                    used[j] = true;
                    ans = ans + students[j].getInfo() + "\n";
                }
            }
        }
        return ans;
    }

    /**
     * removing student.
     * @param id id
     */

    public void removeStudent(String id) {
        for (int i = 0; i < studentNumber; ++i) {
            if (students[i].getId().equals(id)) {
                for (int j = i; j < studentNumber - 1; ++j) {
                    students[j] = students[j + 1];
                }
                studentNumber--;
                return;
            }
        }
    }

    /**
     * main function.
     */
    public static void main(String[] args) {
        StudentManagement stu = new StudentManagement();
        Student std1 = new Student("Nguyen Van An", "17020001", "K62CC", "17020001@vnu.edu.vn");
        Student std2 = new Student("Nguyen Van B", "17020002", "K62CC", "17020002@vnu.edu.vn");
        Student std3 = new Student("Nguyen Van C", "17020003", "K62CB", "17020003@vnu.edu.vn");
        Student std4 = new Student("Nguyen Van D", "17020004", "K62CB", "17020004@vnu.edu.vn");
        stu.addStudent(std1);
        stu.addStudent(std2);
        stu.addStudent(std3);
        stu.addStudent(std4);
        System.out.println(stu.studentsByGroup());
    }
}
