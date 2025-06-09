public class MainStudentProgram {

    public static void main(String[] args) {
        // Агрегація — створення середовища окремо
        Frog.BiologyEnvironment env = new Frog.BiologyEnvironment();
        env.printInfo();

        // Створення об'єкта жаби
        Frog myFrog = new Frog("Зелена Жаба");

        // Асоціація — студент вивчає жабу
        StudentBio student = new StudentBio("Олег");
        student.learnAbout(myFrog);

        // Взаємодія
        myFrog.printDescription();
        myFrog.showStages();
    }

    // Асоціація — студент окремий, вивчає жабу
    public static class StudentBio {
        private String name;

        public StudentBio(String name) {
            this.name = name;
        }

        public void learnAbout(Frog frog) {
            System.out.println(name + " вивчає жабу: " + frog.getName());
        }
    }
}
