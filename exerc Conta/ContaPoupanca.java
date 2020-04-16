public class ContaPoupanca extends Conta {
    
    public ContaPoupanca() {
    }
        
    public String gerarExtrato() {
        return "Extrato C/P: " + this.getSaldo();
    }
    
    public void sacar(double valor) {
//        this.saldo = this.saldo - valor;
        this.setSaldo(this.getSaldo() - valor);
    }
    
    public void depositar(double valor) {
//        this.saldo = this.saldo + valor; 
        this.setSaldo(this.getSaldo() + valor);
    }
    
    public String toString() {
        return "\nSaldo c/p: " + this.getSaldo();
    }
}