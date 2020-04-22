public class Main {
    private static Employer[] employers = {
            new Employer("Vasiliy", "Manager", "a@a.a" , "+11111111111", 40000, 35),
            new Employer("Pyotr", "Administrator", "b@b.b" , "+2222222222", 28000, 24),
            new Employer("Andrew", "Guard", "c@c.c" , "+3333333333", 24000, 75),
            new Employer("Vasilisa", "assistant", "d@d.d" , "+4444444444", 65000, 52),
            new Employer("Alex", "manager", "e@e.e" , "+5555555555", 40000, 48),
    };

    public static void main(String[] args) {
        for (Employer employer : employers) {
            if (employer.getAge() > 40) {
                employer.info();
            }
        }
    }
    
}
