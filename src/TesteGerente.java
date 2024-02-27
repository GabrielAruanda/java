public class TesteGerente {

    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        gerente.setNome("Santana Aruanda");
        gerente.setCpf("235568413");
        gerente.setSalario(5000.0);
        gerente.setSenha(2222);
        boolean autentica = gerente.autentica(2222);
      
        System.out.println(gerente.toString());  
        System.out.println(autentica);
        
        

        
    }

    }
