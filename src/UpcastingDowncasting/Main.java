package UpcastingDowncasting;

import UpcastingDowncasting.Entities.Account;
import UpcastingDowncasting.Entities.BusinessAccount;
import UpcastingDowncasting.Entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Account acc = new Account(545, "Jhordan", 0.0);
        BusinessAccount bacc = new BusinessAccount(762, "Vaz", 0.0, 500.0);

        // Treinando o UPCASTING

        //Instanciando uma nova account e dando herança de bacc
        Account acc1 = bacc;
        //Atribuindo uma objeto da sub classe para super classe
        Account acc2 = new BusinessAccount(939, "Saulo", 0.0, 300.0);
        Account acc3 = new SavingsAccount(556, "Lucas", 0.0, 0.50);

        //Downcasting : converter um objeto da super classe para sub classe

        //Conversão não é natural, é obrigatório um casting manual dizendo o tipo da classe
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

       // BusinessAccount acc5 = (BusinessAccount) acc3;
       if (acc3 instanceof BusinessAccount) {
           BusinessAccount acc5 = (BusinessAccount) acc3;
           acc5.loan(250.0);
           System.out.println("Loan!");
       }
       if (acc3 instanceof SavingsAccount) {
           SavingsAccount acc5 = (SavingsAccount) acc3;
           System.out.println("Update!");
       }
    }
}
