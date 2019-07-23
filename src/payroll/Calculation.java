/*****
 * @author nikhilkumarreddybtech@gmail.com
 * to create a Calculation payroll()_
 */
package payroll;

public class Calculation {

public static void main(String[] args) {
   Programmer pro;
Assistantprofessor Asspro;
Associativeprofessor Asopro;
Professor prof;
pro=new Programmer("nikhil",300001,"Chennai","account@gmail.com",900000000l,60000);

Asspro=new Assistantprofessor("mani",600001,"Chennai","account@gmail.com",7000000001l,70000);

Asopro=new Associativeprofessor("vijay",800001,"Chennai","account@gmail.com",4000000001l,80000);

prof=new Professor("harsha",900001,"chennai","account@gmail.com",2000000001,100000);
pro.printStatement();
Asspro.printStatement();
Asopro.printStatement();
prof.printStatement();
}
}


