package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.PropertyManager;
import com.crowdar.examples.services.HomeService;
import com.crowdar.examples.services.LoginService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomeSteps extends PageSteps {
    @Given("el usuario esta logeado")
    public void elUsuarioEstaLogeado(){
        LoginService.doLogin(PropertyManager.getProperty("email"), PropertyManager.getProperty("password"));
    }

    @When("El usuario hace click en el boton +")
    public void elUsuarioHaceClickEnElBoton() {
        HomeService.clickEntryAdd();
    }

    @And("El usuario hace click en el boton de entrada de fecha")
    public void elUsuarioHaceClickEnElBotonDeEntradaDeFecha() {
        HomeService.clickMenuFechas();
    }

    @And("el usuario ingresa el inicio (.*) del trabajo")
    public void elUsuarioIngresaLaHoraDeInicioDelTrabajo(String horaDeInicio) {
        HomeService.inputHoraInicio(horaDeInicio);
    }

    @And("el usuario hace click en el boton End")
    public void elUsuarioHaceClickEnElBotonEnd() {
        HomeService.clickHoraFin();
    }

    @And("el usuario ingresa el fin (.*) del trabajo")
    public void elUsuarioIngresaLaHoraDeFinDelTrabajo(String E_Hora) {
        HomeService.inputHoraFin(E_Hora);
    }
}

