import java.util.Scanner;
public class Principal {

    public static void main(String args[]) {
    
        System.out.println("\f");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println();
        
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setTaxa(1);
        contaCorrente.setSaldo(1000);
        contaCorrente.sacar(20);
        contaCorrente.depositar(30);        
        System.out.println(contaCorrente);
        
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setSaldo(1000);
        contaPoupanca.sacar(20);
        contaPoupanca.depositar(30);        
        System.out.println(contaPoupanca);
        
    }
}