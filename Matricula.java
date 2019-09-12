
public class Matricula {
        private String nome;
        private String nascimento;
        private String endereço;
        
        public String getnome (){
            return nome;
        }
        public String getnascimento (){
            return nascimento;
        }
        public String getendereço (){
        return endereço;
        }
 public class Pessoa extends Matricula {
    private String telefone;
    private String cpf;
    private String email;
    
    public String gettelefone (){
        return telefone;
    }
    public String getcpf (){
        return cpf;
    }
    public String getemail (){
        return email;
    }
 public class Aluno extends Pessoa {
    private String nota1;
    private String nota2;
    private String nota3;
    private String nota4;
    
    public String getnota1(){
        return nota1;
    }
    public String getnota2(){
        return nota2;
    }
    public String getnota3(){
        return nota3;
    }
    public String getnota4(){
        return nota4;
    }
    }
 }
}



        


