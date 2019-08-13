package Payroll;

public class Calculation {

public static void main(String[] args) {
   Proggrammer pro;
AssistantProfessor Asspro;
AssociateProfessor Asopro;
Professor prof;
pro=new Proggrammer("Raja",300001,"Chennai","account@gmail.com",900000000l,60000);

Asspro=new AssistantProfessor("Kamal",600001,"Chennai","account@gmail.com",7000000001l,70000);

Asopro=new AssociateProfessor("Kala",800001,"Chennai","account@gmail.com",4000000001l,80000);

prof=new Professor("nithin",900001,"chennai","account@gmail.com",2000000001,100000);
pro.printAccount();
Asspro.printStatement();
Asopro.printStatement();
prof.printStatement();
}

}


