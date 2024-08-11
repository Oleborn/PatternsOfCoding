package structuralPatterns.facade;

public class Boss {
    public static void main(String[] args) {
        OrganizeJobDepartment organizeJobDepartment = new OrganizeJobDepartment();
        organizeJobDepartment.startJobProcess();
        organizeJobDepartment.finishJobProcess();
    }
}
