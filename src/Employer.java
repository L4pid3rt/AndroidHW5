public class Employer {
    private String name;
    private String position;
    private String email;
    private String mobilePhone;
    private int salary;
    private int age;

    public Employer(String name, String position, String email, String mobilePhone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.mobilePhone = mobilePhone;
        this.salary = salary;
        this.age = age;
    }

    public void info () {
        System.out.printf("Emploer %s\nposition %s\nContacts %s %s\nSalary %s\nAge %s\n",name, position,email,
                mobilePhone, salary, age);
        System.out.println();
    }

    public int getAge() {
        return age;
    }
}
