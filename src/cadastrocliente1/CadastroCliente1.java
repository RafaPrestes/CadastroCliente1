
package cadastrocliente1;


public class CadastroCliente1 {

    
    public static void main(String[] args) {
       
        // Instanciando um Objeto
        UI_CadastroCliente formularioCadastro = new UI_CadastroCliente();
        Pessoa cliente = new Pessoa (formularioCadastro.nome,formularioCadastro.cpf, "Masculino",
                 formularioCadastro.endereco, formularioCadastro.cidade, formularioCadastro.estado);
       UI_CadastroCliente formulario = new UI_CadastroCliente();
        formulario.setVisible(true);

        
    }
    
}
