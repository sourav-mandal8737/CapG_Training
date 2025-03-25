package Encapsulation;

public class Student {
    private String name;
    private int age;
    private String gender;
    private String branch;
    private String email;
    private String password;

    public Student(String name, int age, String gender, String branch, String email, String password) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.branch = branch;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean updateDetails(String email, String password, String newName, int newAge, String newGender, String newBranch) {
        if (this.email.equals(email) && this.password.equals(password)) {
            this.name = newName;
            this.age = newAge;
            this.gender = newGender;
            this.branch = newBranch;
            System.out.println("Details updated successfully.");
            return true;
        } else {
            System.out.println("Invalid email or password.");
            return false;
        }
    }

    public boolean updatePassword(String email, String oldPassword, String newPassword, String retypedPassword) {
        if (this.email.equals(email) && this.password.equals(oldPassword)) {
            if (newPassword.equals(retypedPassword)) {
                this.password = newPassword;
                System.out.println("Password updated successfully.");
                return true;
            } else {
                System.out.println("New password and retyped password do not match.");
                return false;
            }
        } else {
            System.out.println("Invalid email or password.");
            return false;
        }
    }

    public void fetchDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
        System.out.println("Branch: " + this.branch);
        System.out.println("Email: " + this.email);
    }
}











