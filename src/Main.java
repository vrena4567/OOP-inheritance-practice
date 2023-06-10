// Importáljuk a package-ekbe rendezett classokat

public class Main {
    public static void main(String[] args) {
        // Ezt nyugodtan módosítsd!
        Staff staff = new Staff("Anna", "Balaton", "Zrínyi Miklós Ált Isk", 260.000);
        Student student = new Student("Zoli", "Gyál", "jóTanulóProgram", 3, 100.000);

        System.out.println(staff);
        System.out.println(student);
    }
}
