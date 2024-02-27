public class Gerente extends Funcionario {


    private int senha;
    
    public double getBonificacao() {
        return super.getBonificacao();
    }
    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;}
        
        public String toString(){
            double novae = this.getSalario() + this.getBonificacao();
            return "O gerente: " + "\n" + this.getNome() + "\n"+ "do CPF: " + "\n" + this.getCpf() +"\n"+ "tem um salario de:" + "\n" + this.getSalario() + "\n" + "Seu novo salario é: " + novae + " com a sua bonificação!";
        }
        



   
}
