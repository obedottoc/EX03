/**
*EXPERIMENT-03 
*developed by Nithishkumar
*Saveetha Engineering College
*jpnithishkumar@gmail.com
*/
package PayRoll;
public class Payslip{ 

              public static void main (String[]args) {

                           Programmer pro;

                           Assistantprofessor AssPro;

                           AssociateProfessor AsoPro;

                           Professor Prof;

                           pro=new Programmer("Nithish",300001,"chennai","nithish@.com",9000001,600000);

                           AssPro=new Assistantprofessor ("Kumar",600001,"chennai","kumar@gmail.com",70000001,50000);

                           AsoPro=new AssociateProfessor("kala",8000001,"trichy","kala@gmail.com",700001,70000);

                           Prof=new Professor ("Reddy",9000001,"kadapa","reddy@gmail.com",2000001,900000);

                           pro.printAccount();

                           AssPro.printStatement();

                           AsoPro.printStatement();

                           Prof.printStatement();             

              }

             
}
