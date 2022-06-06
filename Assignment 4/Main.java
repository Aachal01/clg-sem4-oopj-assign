public class Main {
    public static void main(String[] args) {
        System.out.print("**Assistant Professor**\n");
        AssistantProfessor assiP = new AssistantProfessor();
        assiP.printSalarySlip();

        System.out.print("**Associate Professor**\n");
        AssociateProfessor assoP = new AssociateProfessor();
        assoP.printSalarySlip();

        System.out.print("**Programmer**\n");
        Programmer pro = new Programmer();
        pro.printSalarySlip();
    }
}