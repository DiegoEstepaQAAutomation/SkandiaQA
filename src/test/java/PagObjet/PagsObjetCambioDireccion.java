package PagObjet;

import java.io.File;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import MapsObjet.MapsObjectCambioDireccion;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PagsObjetCambioDireccion extends MapsObjectCambioDireccion

{
	//INSTANCIA DE DRIVER MOBIL
	public PagsObjetCambioDireccion(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	

	//METODO PARA ENTRAR A CERTIFICADOS Y VALIDAR  BOTONES
	public void Certificados_576099(String Documento, String Evidencia,File rutaCarpeta) throws Exception {
	
		//DEBE DARSE CLICK NO SOLO AL MODULO CERTIFICADOS SINO TAMBIEN AL CAMPO DE DOCUMENTO 
		tocarPantalla(90, 1386);
		click2(txtNumeroDocumento, 5, rutaCarpeta, Evidencia);
		click2(btntipoCC, 5, rutaCarpeta, Evidencia);
		sendkey2(Documento, txtNumeroDocumento, 5, rutaCarpeta, Evidencia);
		
		//Enviar a una variable de tipo booleano los botones para certificar que ya ingresa a certificados(botones aun no tienen desarrollada la funcionalidad)
		boolean afiliacion = validarElemento(btnAfiliacion, 5);
		ValidacionObjeto(afiliacion, "Caso certificados de afiliacion", rutaCarpeta, Evidencia, btnAfiliacion);
		
		boolean tributarios = validarElemento(btnTributarios, 5);
		ValidacionObjeto(tributarios, "Caso certificados", rutaCarpeta, Evidencia, btnAfiliacion);
		
		
		boolean extractos = validarElemento(btnAfiliacion, 5);
		ValidacionObjeto(extractos, "Caso certificados", rutaCarpeta, Evidencia, btnAfiliacion);
		//CLICKS
		
		//click en tipo de documento
		click2(btntipoCC, 5, rutaCarpeta, Evidencia);
		
		
		click2(btnback, 5, rutaCarpeta, Evidencia);
		
		//Se selecciona de forma random el tipo de documento
		//listRandom(btntipoCC);
		
	}
	
	public void ValidacionesCertificadoCC_595718(String Evidencia,File rutaCarpeta) throws Exception 
	
	{
		//DEBE DARSE CLICK NO SOLO AL MODULO CERTIFICADOS SINO TAMBIEN AL CAMPO DE DOCUMENTO 
				
				
				
				tiempoEspera(9000);
				tocarPantalla(90, 1386);
				click2(btntipoCC, 0, rutaCarpeta, Evidencia);
				click2(CCopcion, 0, rutaCarpeta, Evidencia);
				
				click3(txtNumeroDocumento, 5, rutaCarpeta, Evidencia, "Caso exitoso 595719");
				
				sendkey("19992832", txtNumeroDocumento, rutaCarpeta, Evidencia);		
				
				//Enviar a una variable de tipo booleano los botones para certificar que ya ingresa a certificados(botones aun no tienen desarrollada la funcionalidad)
				//boolean afiliacion = validarElemento(btnAfiliacion, 5);
				//ValidacionObjeto(afiliacion, "Caso certificados de afiliacion", rutaCarpeta, Evidencia, btnAfiliacion);
				
				click2(btnAfiliacion, 10, rutaCarpeta, Evidencia);
				
				click2(btnAceptar, 5, rutaCarpeta, Evidencia);
				
				//boolean tributarios = validarElemento(btnTributarios, 5);
				//ValidacionObjeto(tributarios, "Caso certificados", rutaCarpeta, Evidencia, btnAfiliacion);
				
				click2(btnTributarios, 10, rutaCarpeta, Evidencia);
				
				click2(btnAceptar, 5, rutaCarpeta, Evidencia);
				
				//boolean extractos = validarElemento(btnAfiliacion, 5);
				//ValidacionObjeto(extractos, "Caso certificados", rutaCarpeta, Evidencia, btnAfiliacion);
				
				click2(btnAfiliacion, 10, rutaCarpeta, Evidencia);
				
				
				click2(btnAceptar, 5, rutaCarpeta, Evidencia);
				//CLICKS
				
				
				click2(btnback, 5, rutaCarpeta, Evidencia);
			
		
		
				 
	} 
	
	
	
	//Metodo para ingresar al modulo de rentabilidades 
	public void rentabilidades_576109(String Documento, String Evidencia,File rutaCarpeta) throws Exception {
	
		tocarPantalla(692, 1025);
		tocarPantalla(346, 1026);
		//ingresa a rentabilidades pero debe esperar un poco porque la app carga algo lento
		click2(btnRentabilidades, 5, rutaCarpeta, Evidencia);
		tiempoEspera(7000);
		click2(menuCategoria, 5, rutaCarpeta, Evidencia);
		
		//Se envia a una variable booleana el objeto que se desea validar en este caso un elemento de el menu de categorias por cada subcategoria(fiduciaria,pensiones y cesantias,seguros de vida,valores)
		click2(btnBarrawidget1, 5, rutaCarpeta, Evidencia);
		
		
		boolean objetovalidacion1 = validarElemento(Objetovalidacionpensiones, 5);
		ValidacionObjeto(objetovalidacion1, "Caso certificados", rutaCarpeta, Evidencia, btnAfiliacion);
		//Se envia a una variable booleana el objeto que se desea validar en este caso un elemento de el menu de categorias por cada subcategoria(fiduciaria,pensiones y cesantias,seguros de vida,valores)
		click2(btnBarrawidget2, 5, rutaCarpeta, Evidencia);
		boolean objetovalidacion2 = validarElemento(Objetovalidacionesefectivo, 5);
		ValidacionObjeto(objetovalidacion2, "Caso certificados", rutaCarpeta, Evidencia, btnAfiliacion);
		//Se envia a una variable booleana el objeto que se desea validar en este caso un elemento de el menu de categorias por cada subcategoria(fiduciaria,pensiones y cesantias,seguros de vida,valores)
		click2(btnBarrawidget3, 5, rutaCarpeta, Evidencia);
		boolean objetovalidacion3 = validarElemento(Objetosegurodevida, 5);
		ValidacionObjeto(objetovalidacion3, "Caso certificados", rutaCarpeta, Evidencia, btnAfiliacion);
		
		click2(btnBarrawidget4, 5, rutaCarpeta, Evidencia);
		//Se envia a una variable booleana el objeto que se desea validar en este caso un elemento de el menu de categorias por cada subcategoria(fiduciaria,pensiones y cesantias,seguros de vida,valores)
		boolean objetovalidacion4 = validarElemento(ObjetovalidacionValores, 5);
		ValidacionObjeto(objetovalidacion4, "Caso certificados", rutaCarpeta, Evidencia, btnAfiliacion);
		
		//Click en devolverse
		click2(btnback, 5, rutaCarpeta, Evidencia);
		
		
		tocarPantalla(692, 1025);
		tocarPantalla(346, 1026);
	
}
	
	//Metodo para ingresar a canales de contacto
	
	public void Canalesdecontacto_569212(String Documento, String Evidencia,File rutaCarpeta) throws Exception 
	{
		
		//En este caso empleamos una aplicacion que nos permite iniciar una grabacion de voz describiemdo paso a paso esta automatizacion
		//tocarPantalla(692, 1025);
		//tiempoEspera(1000);
		//tocarPantalla(346, 1026);
		//tiempoEspera(1000);
		//ingresa a rentabilidades pero debe esperar un poco porque la app carga algo lento
		click2(btnCanalesContacto, 5, rutaCarpeta, Evidencia);
		tiempoEspera(9000);
		
		
		//Se crean variables booleanas que contienen los botones de llamada y correo porque a fecha de hoy 2/09/2022 aun no son funcionales
		boolean LineaNacional = validarElemento(telNacional, 5);
		ValidacionObjeto(LineaNacional, "Caso certificados", rutaCarpeta, Evidencia, telNacional);
		
		boolean telefonoBogota = validarElemento(LineaBogota, 5);
		ValidacionObjeto(telefonoBogota, "Caso certificados", rutaCarpeta, Evidencia, LineaBogota);
		
		boolean telefonoBogota2 = validarElemento(LineaBogotaFijo, 5);
		ValidacionObjeto(telefonoBogota2, "Caso certificados", rutaCarpeta, Evidencia, LineaBogotaFijo);
		
		
		//Se crean variables booleanas que contienen los botones de llamada y correo porque a fecha de hoy 2/09/2022 aun no son funcionales
		boolean correoelectronico = validarElemento(correoElectronico, 5);
		ValidacionObjeto(correoelectronico, "Caso certificados", rutaCarpeta, Evidencia, correoElectronico);
		
		boolean telefonoempresarial = validarElemento(LineaEmpresarial, 5);
		ValidacionObjeto(telefonoempresarial, "Caso certificados", rutaCarpeta, Evidencia, LineaEmpresarial);
		
		//Se crean variables booleanas que contienen los botones de llamada y correo porque a fecha de hoy 2/09/2022 aun no son funcionales
		boolean correoempresarial = validarElemento(CorreoEmpresarial, 5);
		ValidacionObjeto(correoempresarial, "Caso certificados", rutaCarpeta, Evidencia, CorreoEmpresarial);
		
		boolean Btntwiter = validarElemento(btnTwiter, 5);
		ValidacionObjeto(Btntwiter, "Caso certificados", rutaCarpeta, Evidencia, btnTwiter);
		
		boolean Btnfacebook = validarElemento(btnfacebook, 5);
		ValidacionObjeto(Btnfacebook, "Caso certificados", rutaCarpeta, Evidencia, btnfacebook);
		//Se crean variables booleanas que contienen los botones de llamada y correo porque a fecha de hoy 2/09/2022 aun no son funcionales
		
		boolean Btnyoutube = validarElemento(btnyoutube, 5);
		ValidacionObjeto(Btnyoutube, "Caso certificados", rutaCarpeta, Evidencia, btnyoutube);
		//Se crean variables booleanas que contienen los botones de llamada y correo porque a fecha de hoy 2/09/2022 aun no son funcionales
		boolean Btninstagram = validarElemento(btnInstagram, 5);
		ValidacionObjeto(Btninstagram, "Caso certificados", rutaCarpeta, Evidencia, btnInstagram);
		
		
		
		click2(ListCiudades, 5, rutaCarpeta, Evidencia);
		click2(btnBarranquilla, 5, rutaCarpeta, Evidencia);
		
		click2(btnLinkein, 5, rutaCarpeta, Evidencia);
		tocarPantalla(200, 700);
		
		click2(CorreoEmpresarial, 5, rutaCarpeta, Evidencia);
		tocarPantalla(200, 700);
		
		//232, 661
		scrollVertical1(rutaCarpeta, 643, 988, 743, 5, Evidencia);
		
		tocarPantalla(657, 1358);
		
		//232, 661
		scrollVertical1(rutaCarpeta, 643, 800, 980, 5, Evidencia);
		
		click2(telNacional, 5, rutaCarpeta, Evidencia);
		tocarPantalla(232, 661);
		
		
		
		
		//232,661
		//LineaBogotaFijo
		//click en devolverse
		//click2(btnback, 5, rutaCarpeta, Evidencia);
		
		//En este caso empleamos una aplicacion que nos permite iniciar una grabacion de voz describiemdo paso a paso esta automatizacion
		
		
		
	}
	
	//LineaEmpresarial

	//Metodo para ingresar a simuladores
	public void Simuladores_568696(String Documento, String Evidencia,File rutaCarpeta) throws Exception
	{
		// La automatizacion ingresa y muestra una pantalla de cada seccion, luego sale
		//284,859
		
		
		//Pensiones
		click2(txtModuloSimuladores, 5, rutaCarpeta, Evidencia);
		tiempoEspera(6000);
		tocarPantalla(284, 859);
		
		boolean elemento1 = validarElemento(txtCapitalDeseado, 5);
		ValidacionObjeto(elemento1, "CP01", rutaCarpeta, Evidencia, CorreoEmpresarial);
		
		tiempoEspera(6000);
		//click2(btnPensiones, 5, rutaCarpeta, Evidencia);
		click2(btnback, 5, rutaCarpeta, Evidencia);
		
		// La automatizacion ingresa y muestra una pantalla de cada seccion, luego sale
		//Ahorro Mensual 
		click2(txtModuloSimuladores, 5, rutaCarpeta, Evidencia);
		tiempoEspera(6000);
		tocarPantalla(305, 1105);
		boolean elemento2 = validarElemento(txtAporteunico, 5);
		ValidacionObjeto(elemento2, "CP01", rutaCarpeta, Evidencia, txtAporteunico);
		tiempoEspera(6000);
		//click2(btnPensiones, 5, rutaCarpeta, Evidencia);
		click2(btnback, 5, rutaCarpeta, Evidencia);
		
		// La automatizacion ingresa y muestra una pantalla de cada seccion, luego sale
		//Ahorro Capital Futuro  
		click2(txtModuloSimuladores, 5, rutaCarpeta, Evidencia);
		tiempoEspera(6000);
		tocarPantalla(258, 1295);
		boolean elemento3 = validarElemento(txtMensualidadFutura, 5);
		ValidacionObjeto(elemento3, "CP01", rutaCarpeta, Evidencia, txtMensualidadFutura);
		tiempoEspera(6000);
		//click2(btnPensiones, 5, rutaCarpeta, Evidencia);
		click2(btnback, 5, rutaCarpeta, Evidencia);
		
		
		
		// La automatizacion ingresa y muestra una pantalla de cada seccion, luego sale
		//capital necesario
		click2(txtModuloSimuladores, 5, rutaCarpeta, Evidencia);
		tiempoEspera(9000);
		scrollVertical1(rutaCarpeta, 643, 988, 643, 2, Evidencia);
		tocarPantalla(286, 511);
		boolean elemento4 = validarElemento(txtCapitalAhorrado, 5);
		ValidacionObjeto(elemento4, "CP01", rutaCarpeta, Evidencia, txtCapitalAhorrado);
		
		tiempoEspera(6000);
		//click2(btnPensiones, 5, rutaCarpeta, Evidencia);
		click2(btnback, 5, rutaCarpeta, Evidencia);
		
		// La automatizacion ingresa y muestra una pantalla de cada seccion, luego sale
		//comparativo rentabilidades
		click2(txtModuloSimuladores, 5, rutaCarpeta, Evidencia);
		tiempoEspera(9000);
		scrollVertical1(rutaCarpeta, 643, 988, 643, 2, Evidencia);
		tocarPantalla(281, 761);
		boolean elemento5 = validarElemento(btnCalculadora, 5);
		ValidacionObjeto(elemento5, "CP01", rutaCarpeta, Evidencia, btnCalculadora);
		tiempoEspera(6000);
		//click2(btnPensiones, 5, rutaCarpeta, Evidencia);
		click2(btnback, 5, rutaCarpeta, Evidencia);
		
		// La automatizacion ingresa y muestra una pantalla de cada seccion, luego sale
		//ahorro futuro   
		click2(txtModuloSimuladores, 5, rutaCarpeta, Evidencia);
		tiempoEspera(9000);
		scrollVertical1(rutaCarpeta, 643, 988, 643, 2, Evidencia);
		tocarPantalla(330, 1017);
		boolean elemento6 = validarElemento(btnEdadSelector, 5);
		ValidacionObjeto(elemento6, "CP01", rutaCarpeta, Evidencia, btnEdadSelector);
		tiempoEspera(6000);
		//click2(btnPensiones, 5, rutaCarpeta, Evidencia);
		click2(btnback, 5, rutaCarpeta, Evidencia);
		
		// La automatizacion ingresa y muestra una pantalla de cada seccion, luego sale
		//perfil de inversion 
		click2(txtModuloSimuladores, 5, rutaCarpeta, Evidencia);
		tiempoEspera(6000);
		scrollVertical1(rutaCarpeta, 643, 988, 643, 2, Evidencia);
		tocarPantalla(408, 988);
		boolean elemento7 = validarElemento(btnContinuarSfinanciera, 5);
		ValidacionObjeto(elemento7, "CP01", rutaCarpeta, Evidencia, btnContinuarSfinanciera);
		tiempoEspera(6000);
		//click2(btnPensiones, 5, rutaCarpeta, Evidencia);
		click2(btnback, 5, rutaCarpeta, Evidencia);
		
		// La automatizacion ingresa y muestra una pantalla de cada seccion, luego sale
		//Salud financiera
		click2(txtModuloSimuladores, 5, rutaCarpeta, Evidencia);
		tiempoEspera(9000);
		scrollVertical1(rutaCarpeta, 643, 988, 643, 2, Evidencia);
		tocarPantalla(330, 1239);
		boolean elemento8 = validarElemento(btnTiempoMensual, 5);
		ValidacionObjeto(elemento8, "CP01", rutaCarpeta, Evidencia, btnTiempoMensual);
		tiempoEspera(6000);
		//click2(btnPensiones, 5, rutaCarpeta, Evidencia);
		click2(btnback, 5, rutaCarpeta, Evidencia);
		
		
		// La automatizacion ingresa y muestra una pantalla de cada seccion, luego sale
		//Tiempo con renta mensual
		click2(txtModuloSimuladores, 5, rutaCarpeta, Evidencia);
		tiempoEspera(9000);
		scrollVertical1(rutaCarpeta, 643, 988, 643, 2, Evidencia);
		tocarPantalla(348, 1445);
		boolean elemento9 = validarElemento(btnTiempoEmpresas, 5);
		ValidacionObjeto(elemento9, "CP01", rutaCarpeta, Evidencia, btnTiempoEmpresas);
		tiempoEspera(6000);
		//click2(btnPensiones, 5, rutaCarpeta, Evidencia);
		click2(btnback, 5, rutaCarpeta, Evidencia);
		
		
		// La automatizacion ingresa y muestra una pantalla de cada seccion, luego sale
		//Tiempo con renta mensual
		click2(txtModuloSimuladores, 5, rutaCarpeta, Evidencia);
		tiempoEspera(9000);
		scrollVertical1(rutaCarpeta, 643, 988, 643, 4, Evidencia);
		tocarPantalla(286, 511);
		boolean elemento10 = validarElemento(btnCalcularSeguroPensiones, 5);
		ValidacionObjeto(elemento10, "CP01", rutaCarpeta, Evidencia, btnCalcularSeguroPensiones);
		tiempoEspera(6000);
		//click2(btnPensiones, 5, rutaCarpeta, Evidencia);
		click2(btnback, 5, rutaCarpeta, Evidencia);
		
		// La automatizacion ingresa y muestra una pantalla de cada seccion, luego sale
		//valor renta mensual
		click2(txtModuloSimuladores, 5, rutaCarpeta, Evidencia);
		tiempoEspera(9000);
		tocarPantalla(284, 859);
		boolean elemento11 = validarElemento(btnback, 5);
		ValidacionObjeto(elemento11, "CP01", rutaCarpeta, Evidencia, btnback);
		scrollVertical1(rutaCarpeta, 643, 988, 643, 4, Evidencia);
		tiempoEspera(6000);
		//click2(btnPensiones, 5, rutaCarpeta, Evidencia);
		click2(btnback, 5, rutaCarpeta, Evidencia);
		
		// La automatizacion ingresa y muestra una pantalla de cada seccion, luego sale
		//valor renta mensual
		click2(txtModuloSimuladores, 5, rutaCarpeta, Evidencia);
		tiempoEspera(9000);
		scrollVertical1(rutaCarpeta, 643, 988, 643, 4, Evidencia);
		tocarPantalla(284, 859);
		boolean elemento12 = validarElemento(btnback, 5);
		ValidacionObjeto(elemento12, "CP01", rutaCarpeta, Evidencia, btnback);
		tiempoEspera(6000);
		//click2(btnPensiones, 5, rutaCarpeta, Evidencia);
		click2(btnback, 5, rutaCarpeta, Evidencia);
		
		// La automatizacion ingresa y muestra una pantalla de cada seccion, luego sale
		//valor renta mensual
		click2(txtModuloSimuladores, 5, rutaCarpeta, Evidencia);
		tiempoEspera(9000);
		scrollVertical1(rutaCarpeta, 643, 988, 643, 4, Evidencia);
		tocarPantalla(284, 859);
		boolean elemento13 = validarElemento(btnback, 5);
		ValidacionObjeto(elemento13, "CP01", rutaCarpeta, Evidencia, btnback);
		tiempoEspera(6000);
		//click2(btnPensiones, 5, rutaCarpeta, Evidencia);
		click2(btnback, 5, rutaCarpeta, Evidencia);
		
		// La automatizacion ingresa y muestra una pantalla de cada seccion, luego sale
		//valor pensiones/seguro
		click2(txtModuloSimuladores, 5, rutaCarpeta, Evidencia);
		tiempoEspera(9000);
		scrollVertical1(rutaCarpeta, 643, 988, 643, 6, Evidencia);
		tocarPantalla(284, 859);
		boolean elemento14 = validarElemento(btnback, 5);
		ValidacionObjeto(elemento14, "CP01", rutaCarpeta, Evidencia, btnback);
		tiempoEspera(6000);
		//click2(btnPensiones, 5, rutaCarpeta, Evidencia);
		click2(btnback, 5, rutaCarpeta, Evidencia);
		
		// La automatizacion ingresa y muestra una pantalla de cada seccion, luego sale
		//valor pensiones/crea ahorro
		click2(txtModuloSimuladores, 5, rutaCarpeta, Evidencia);
		tiempoEspera(9000);
		scrollVertical1(rutaCarpeta, 643, 988, 643, 6, Evidencia);
		tocarPantalla(284, 859);
		boolean elemento15 = validarElemento(btnback, 5);
		ValidacionObjeto(elemento15, "CP01", rutaCarpeta, Evidencia, btnback);
		tiempoEspera(6000);
		//click2(btnPensiones, 5, rutaCarpeta, Evidencia);
		click2(btnback, 5, rutaCarpeta, Evidencia);
		
		
		// La automatizacion ingresa y muestra una pantalla de cada seccion, luego sale
		//valor pensiones/Incapacidad
		click2(txtModuloSimuladores, 5, rutaCarpeta, Evidencia);
		tiempoEspera(9000);
		scrollVertical1(rutaCarpeta, 643, 988, 643, 6, Evidencia);
		tocarPantalla(284, 859);
		boolean elemento16 = validarElemento(btnback, 5);
		ValidacionObjeto(elemento16, "CP01", rutaCarpeta, Evidencia, btnback);
		tiempoEspera(6000);
		//click2(btnPensiones, 5, rutaCarpeta, Evidencia);
		click2(btnback, 5, rutaCarpeta, Evidencia);
		
		
		// La automatizacion ingresa y muestra una pantalla de cada seccion, luego sale
		//valor pensiones/Incapacidad
		click2(txtModuloSimuladores, 5, rutaCarpeta, Evidencia);
		tiempoEspera(9000);
		scrollVertical1(rutaCarpeta, 643, 988, 643, 6, Evidencia);
		tocarPantalla(284, 859);
		boolean elemento17 = validarElemento(btnback, 5);
		ValidacionObjeto(elemento17, "CP01", rutaCarpeta, Evidencia, btnback);
		tiempoEspera(6000);
		//click2(btnPensiones, 5, rutaCarpeta, Evidencia);
		click2(btnback, 5, rutaCarpeta, Evidencia);
		
		
	}
	
	
	
	
	
	


}
