package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By btnAbrirConta = By.cssSelector(
			"body > div.viewport-primary > nav.nav-desktop > div.right > div.nav-item.nav-item-nova-conta > a");
	private By btnParaVoce = By.id("bt1");

	public By getBtnParaVoce() {
		return btnParaVoce;
	}

	public By getCampoNome() {
		return campoNome;
	}

	public By getCelTelefone() {
		return celTelefone;
	}

	public By getEmail() {
		return email;
	}

	public By getCpf() {
		return cpf;
	}

	public By getBtnQueroSerCliente() {
		return btnQueroSerCliente;
	}

	public By getTextoFaltaPouco() {
		return textoFaltaPouco;
	}

	private By campoNome = By.id("nome");
	private By celTelefone = By.id("telefone");
	private By email = By.id("email");
	private By cpf = By.id("cpf");
	private By btnQueroSerCliente = By.id("btnEnviar");
	private By textoFaltaPouco = By.cssSelector("#pu-modalSucesso > div > div:nth-child(2) > p > span:nth-child(1)");

	public By getBtnAbrirConta() {
		return btnAbrirConta;
	}

}
