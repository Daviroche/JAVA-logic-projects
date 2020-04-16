public class Principal {

    public static void main(String args[]) {
    
        
        System.out.println("\f");
                
        System.out.println("Olá " + args[0] + " " + args[1]);
        
        Aluno aluno = new Aluno();
        aluno.setNome("Ze");
        aluno.sobrenome = "da Silva";
        aluno.email = "ze.dasilva@gmail.com";
        aluno.dataDeNascimento = "10/05/1990";
        aluno.nota1 = 9.5;
        aluno.nota2 = 8.5;
        System.out.println(aluno); //aluno
        
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Pedro");
        funcionario.sobrenome = "da Silva Mendes";
        funcionario.email = "pedro.dasilva@ig.com.br";
        funcionario.dataDeNascimento = "10/07/1980";
        funcionario.setSalarioFixo(1600.90);
        funcionario.setNumeroDeRegistro(909089);
        System.out.println(funcionario); //funcionario
        
        Professor professor = new Professor();
        professor.setNome("Jose");
        professor.sobrenome = "Pereira";
        professor.email = "jose.pereira@yahoo.com.br";
        professor.dataDeNascimento = "10/05/1983";
        System.out.println(professor); //professor
        
        
    
    }
}