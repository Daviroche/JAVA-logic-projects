public class Pessoa {
   
   private String nome;
   public String sobrenome;
   public String email;
   public String dataDeNascimento;
   
   public Pessoa() {
       this.nome = "";
       this.sobrenome = "";
       this.email = "";
       this.dataDeNascimento = "00/00/0000";
   }
   
   public String getNome() {
       return this.nome;
   }
   
   public void setNome(String nome) {
       this.nome = nome;
   }
   
   public String toString() {
       return "\nNome: " + this.nome
            + "\nSobrenome: " + this.sobrenome
            + "\nEmail: " + this.email
            + "\nData de nascimento: " + this.dataDeNascimento;
            
   }
   
   
}