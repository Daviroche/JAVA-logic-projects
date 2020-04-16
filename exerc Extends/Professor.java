public class Professor extends Pessoa {

    public int numeroDeRegistro;
    public int numeroDeHorasTrabalhadas;
    public double valorHora;
    
    public Professor() {
        super();
    }
    
    public double calcularSalarioBruto() {
        return this.numeroDeHorasTrabalhadas * this.valorHora;
    }
    
    public double calcularFGTS() {
        return this.calcularSalarioBruto() * 0.08;
    }
    
    public String toString() {
       return "\nNome: " + this.getNome()
            + "\nSobrenome: " + this.sobrenome
            + "\nEmail: " + this.email
            + "\nData de nascimento: " + this.dataDeNascimento
            + "\nNumero de registro: " + this.numeroDeRegistro
            + "\nNumero de horas trabalhdas: " + this.numeroDeHorasTrabalhadas
            + "\nSalario: " + this.calcularSalarioBruto()
            + "\nFGTS: " + this.calcularFGTS();
            
        }    
    
}