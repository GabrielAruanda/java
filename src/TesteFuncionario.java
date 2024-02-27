public class TesteFuncionario {
    public static void main(String[]args){
        Funcionario funcionario = new Funcionario();
        EditorVideo EditorVideo = new EditorVideo();
        Designer Designer = new Designer();

        funcionario.setNome("Gabriel Aruanda");
        funcionario.setCpf("879.050.350-34");
        funcionario.setSalario(3500.00);
        
        System.out.println(funcionario.toString());

        EditorVideo.setNome("Luis Gustavo");
        EditorVideo.setCpf("505.655.452-35");
        EditorVideo.setSalario(4000.00);

        System.out.println(EditorVideo.toString());
        
        
        
        Designer.setNome("Bruno gonçalves");
        Designer.setCpf("831.655.991-35");
        Designer.setSalario(3500.00);

        System.out.println(Designer.toString());

        

      


    }
}
 