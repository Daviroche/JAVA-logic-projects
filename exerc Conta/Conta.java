/**
 * lajdfslajdfaldfjak
 * @author Thiago Cury
 * @version 1.0
 * @since 01/04/2020 - 14:10
 */
public abstract class Conta {
    
    private String titular;
    private int numero;
    private int agencia;
    private double saldo;
    
    public String getTitular() {
        return this.titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int getAgencia() {
        return this.agencia;
    }
    
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    /**
     * asdfasdfasdf
     */
    public void setSaldo(double saldo){
        if(saldo > 0) {
            this.saldo = saldo;
        } else {
            this.saldo = 0.0;
        } 
    }
    
    /**
     * adsfafadfs
     */
    public void asdfadfa() {
    }
    
    /**
     * @param sdadfaf
     */
    public abstract void sacar(double valor);
    
    /**
     * @param sdadfafkajflekgjklegj
     */    
    public abstract void depositar(double valor);    

}