public class EditorVideo {
        String nome;
        String cpf;
        double salario;
        
        public double getBonificacao() {
            return this.salario * 0.3;
        }
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getCpf() {
            return cpf;
        }
        public void setCpf(String cpf) {
            this.cpf = cpf;
        }
        public double getSalario() {
            return salario;
        }
        public void setSalario(double salario) {
            this.salario = salario;
        }
        public String toString(){
            double novae = this.getSalario() + this.getBonificacao();
            return "O funcionario: " + "\n" + this.getNome() + "\n"+ "do CPF: " + "\n" + this.getCpf() +"\n"+ "tem um salario de:" + "\n" + this.getSalario() + "\n" + "Seu novo salario é: " + novae + " com a sua bonificação!" + "\n"+"==================================================="+ "\n";
        }
    
        
    
    }
    

