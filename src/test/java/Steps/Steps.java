package Steps;

import javax.swing.text.Element;

import Elementos.Elementos;
import Metodos.Metodos;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	Metodos r = new Metodos();
	Elementos m = new Elementos();

	
	@Given("^dado que o usuario acesse a url \"([^\"]*)\"$")
	public void dado_que_o_usuario_acesse_a_url(String url) throws Throwable {
	    r.executarNavegador(url, "Abrindo navegador");
	}

	@Given("^selecione o botao abrir nova conta$")
	public void selecione_o_botao_abrir_nova_conta() throws Throwable {
      r.pausa(3000, "Pausa para carregar o botao abrir conta");
		r.click(m.getBtnAbrirConta(), "Selecionando botao abrir conta");
      

	}

	@Given("^selecionar o botao abrir conta para voce$")
	public void selecionar_o_botao_abrir_conta_para_voce() throws Throwable {
	    r.click(m.getBtnParaVoce(), "Selecionando botao abrir conta");
	}

	@When("^o usuario preencher o formulario$")
	public void o_usuario_preencher_o_formulario() throws Throwable {
	    r.preencher(m.getCampoNome(), "Flashcode", "Preechendo o campo nome");
	    r.preencher(m.getCelTelefone(), "11111111111", "Preenchendo campo telefone");
	    r.preencher(m.getEmail(), "Test@test.com.br", "Preenchendo campo email");
	    r.preencher(m.getCpf(), "86022073014", "Preenchendo campo cpf" );
	    
	}

	@When("^selecionar o botao quero ser cliente$")
	public void selecionar_o_botao_quero_ser_cliente() throws Throwable {
		r.click(m.getBtnQueroSerCliente(), "Selecionando botao quero ser cliente");
	}

	@Then("^valido o texto falta pouco$")
	public void valido_o_texto_falta_pouco() throws Throwable {
	   
	}
}
