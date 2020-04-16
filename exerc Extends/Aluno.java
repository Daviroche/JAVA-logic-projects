

public class Aluno extends Pessoa {

    public double nota1;
    public double nota2;
    
    public Aluno() {
        super();
    }
    
    public double calcularMediaAritmetica() {
        return (this.nota1 + this.nota2) / 2;
    }
    
    public String toString() {
       return "\nNome: " + this.getNome()
            + "\nSobrenome: " + this.sobrenome
            + "\nEmail: " + this.email
            + "\nData de nascimento: " + this.dataDeNascimento
            + "\nNota1: " + this.nota1
            + "\nNota2: " + this.nota2
            + "\nMédia Aritmética: " + this.calcularMediaAritmetica();
            
        }    
    
}