public class Funcionario extends Pessoa {

    private int numeroDeRegistro;
    private double salarioFixo;
    
    public Funcionario() {
        super();
    }
    
    public int getNumeroDeRegistro() {
        return this.numeroDeRegistro;
    }
    
    public void setNumeroDeRegistro(int numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }
    
    public double getSalarioFixo() {
        return this.salarioFixo;
    }
    
    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
    
    public double calcularFGTS() {
        return this.salarioFixo * 0.08;
    }
    
    public String toString() {
       return "\nNome: " + this.getNome()
            + "\nSobrenome: " + this.sobrenome
            + "\nEmail: " + this.email
            + "\nData de nascimento: " + this.dataDeNascimento
            + "\nNumero de registro: " + this.numeroDeRegistro
            + "\nSalario: " + this.salarioFixo
            + "\nFGTS: " + this.calcularFGTS();
            
        }    
    
}