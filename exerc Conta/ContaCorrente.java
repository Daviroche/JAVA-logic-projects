/**
 * adfadsfasdfasdfewqrqwerwqer
 * @author Thiago Cury
 * @version 1.0
 * @since 01/04/2020 - 14:30
 */
public class ContaCorrente extends Conta {

    private double taxa;
    
    /**
     * Construtor da classe ContaCorrente
     */
    public ContaCorrente() {
        this.taxa = 0.45;
    }
    
    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    
    /**
     * @return retorna o saldo(extrato) do usuário   
     */
    public String gerarExtrato() {
        return "Extrato C/C: " + this.getSaldo();
    }
    
    /**
     * @param recebe o valor para efetuar o saque
     */
    public void sacar(double valor) {
//        this.saldo = this.saldo - valor;
        this.setSaldo(this.getSaldo() - valor - this.taxa);
    }
    
    /**
     * @param recebe o valor para efetuar o depósito na conta
     */
    public void depositar(double valor) {
//        this.saldo = this.saldo + valor; 
        this.setSaldo(this.getSaldo() + valor - this.taxa);
    }
    
    /**
     * @param recebe x para ....
     * @param recebe y para ...
     * @return aheflhrg;lajkdva;jgalkgj
     */
    public String calcularXX(double x, double y) {
        return "asdfasdf";
    }
    
    public String toString() {
        return "\nSaldo c/c: " + this.getSaldo();
    }
}