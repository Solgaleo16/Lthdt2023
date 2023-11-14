
public class Student {
    // TODO: khai bao cac thuoc tinh cho Student
    private String name;
    private String id;
    private String group;
    private String email;

    // TODO: khai bao cac phuong thuc getter, setter cho Student
    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return this.name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGroup() {
        return this.group;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    /**
     * Constructor 1.
     */

    public Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2.
     * @param name nameOfStudent
     * @param id idOfStudent
     * @param email emailOfStudent
     */

    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.group = "K62CB";
        this.email = email;
    }

    /**
     * Constructor 3.
     * @param s Student
     */

    public Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    /**
     * Constructor 4.
     * @param name name
     * @param id id
     * @param group group
     * @param email email
     */
    public Student(String name, String id, String group, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = group;
    }

    /**
     * get information.
     * @return text
     */
    public String getInfo() {
        return String.format("%s - %s - %s - %s", name, id, group, email);
    }

}
