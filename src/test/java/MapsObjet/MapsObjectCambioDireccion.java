package MapsObjet;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ClaseBase.ClaseBaseFinalMobil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MapsObjectCambioDireccion extends ClaseBaseFinalMobil

{
	public MapsObjectCambioDireccion(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//generales
	protected By btnlogo = By.xpath("//android.widget.ImageView[@resource-id='com.clarocolombia.miclaro.debug:id/imgPerfil']");
	protected By btnpersona = By.xpath("//android.widget.ImageView[@resource-id='com.clarocolombia.miclaro.debug:id/imgPerfil']");
	protected By btncerrarsesion = By.xpath("//android.widget.TextView[@resource-id='com.clarocolombia.miclaro.debug:id/tvCerrarSesion']");
	protected By btnsalir = By.xpath("//android.widget.Button[@resource-id='com.clarocolombia.miclaro.debug:id/btn_aceptar']");
	protected By btnCertificado = By.xpath("//android.view.View[@content-desc='Pestaña 1 de 4']/android.widget.ImageView");
	protected By txtNumeroDocumento = By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText");
	protected By btnAceptar = By.xpath("//android.widget.Button[@content-desc='Aceptar']");
	
	//Certificados
	protected By btnAfiliacion = By.xpath("//android.widget.Button[@content-desc='AFILIACIÓN']");
	protected By btnTributarios = By.xpath("//android.widget.Button[@content-desc='TRIBUTARIOS']");
	protected By btnExtractos = By.xpath("//android.widget.Button[@content-desc='EXTRATOS']");
	protected By btntipoCC = By.xpath("//android.view.View[@content-desc='Tipo de id']");
	
	//Rentabilidades
	protected By menuCategoria = By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.widget.Button[1]");
	protected By btnBarrawidget1 = By.xpath( "//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.TextView[2]");
	protected By btnBarrawidget2 = By.xpath( "//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.TextView[2]");
	protected By btnBarrawidget3 = By.xpath( "//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[1]/android.widget.TextView[2]");
	protected By btnBarrawidget4 = By.xpath( "//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View[1]/android.widget.TextView[2]");
	protected By radiobtn1 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[3]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.widget.RadioButton");
	protected By radiobtn2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[3]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.widget.RadioButton");
	
	//612,441, 600, 238 coordenadas de scroll hacia tabla 
	
	protected By Encabezadoportafoliosimple = By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.widget.TextView");
	protected By Encabezadoportafolioamedida = By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View[3]/android.widget.TextView");
	protected By Encabezadoportafolioespecial = By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[9]/android.widget.TextView[6]");
	protected By btnRentabilidades = By.xpath("//android.view.View[@content-desc='Pestaña 2 de 4']/android.widget.ImageView");
	protected By btnCanalesContacto = By.xpath("//android.view.View[@content-desc='Pestaña 3 de 4']/android.widget.ImageView");
	protected By Objetovalidacionpensiones = By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.widget.ListView/android.view.View[1]");
	protected By Objetovalidacionesefectivo = By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.widget.ListView/android.view.View[1]");
	protected By Objetosegurodevida = By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.widget.ListView/android.view.View");
	protected By ObjetovalidacionValores = By.xpath( "//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.widget.ListView/android.view.View");
	protected By btnback = By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
	
	//Canales de contacto 
	
	protected By telNacional = By.xpath("//android.view.View[@content-desc='018000517526']");
	protected By btnPermitir = By.xpath("//android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]");
	protected By btnnoPermitir = By.xpath("//android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[2]");
	protected By btnAccept = By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button");
	protected By LineaBogota = By.xpath("//android.view.View[@content-desc='Bogotá (601) 6584000']");
	protected By LineaBogotaFijo = By.xpath("//android.view.View[@content-desc='Bogotá (601) 4841300']");
	protected By correoElectronico = By.xpath("//android.view.View[@content-desc='cliente@skandia.com.co']");
	protected By LineaEmpresarial = By.xpath("//android.view.View[@content-desc='Bogotá (601) 6584123']");
	protected By CorreoEmpresarial = By.xpath("//android.view.View[@content-desc='servicioempresa@skandia.com.co']");
	protected By btnTwiter = By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[19]/android.widget.ImageView[1]");
	protected By btnfacebook = By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[19]/android.widget.ImageView[2]");
	protected By btnyoutube = By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[19]/android.widget.ImageView[3]");
	protected By btnInstagram = By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[19]/android.widget.ImageView[4]");
	protected By btnLinkein = By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[19]/android.widget.ImageView[5]");
	
	protected By ListCiudades = By.xpath("//android.widget.Button[@content-desc='Bogotá']");
	protected By btnBarranquilla = By.xpath("//android.view.View[@content-desc='Barranquilla']");
	
	//Simuladores 
	
	protected By btnPensiones = By.xpath("//android.view.View[@content-desc='Simulador de Jubilación  Obtenga una proyección de su pensión dependiendo del fondo administrador (Skandia / Colpensiones).']/android.view.View[2]/android.widget.TextView[2]");
	protected By btnAhorroMensual = By.xpath("//android.view.View[@content-desc='ahorro mensual necesario  Conozca el valor periódico a ahorrar para llegar a cumplir con un capital esperado.']/android.view.View[2]/android.widget.TextView[2]");
	protected By btnCapitalFuturo = By.xpath("//android.view.View[@content-desc='capital futuro  Calcule cuánto puede generar un capital en plazo determinado.']/android.view.View[2]");
	protected By btnCapitalNecesario = By.xpath("//android.view.View[@content-desc='capital necesario  Identifique cuál es el capital con el que debe contar hoy para recibir una mensualidad determinada.']/android.view.View[2]/android.widget.TextView[2]");
	protected By btnComparativoRentabilidades = By.xpath("//android.view.View[@content-desc='comparativo de rentabilidades  Estime y compare el valor de su inversión a cinco, diez y veinte años en Skandia y en otra entidad.']/android.view.View[2]/android.widget.TextView[2]");
	protected By btnAhorroFuturo = By.xpath("//android.view.View[@content-desc='mi ahorro a futuro  Basado en un aporte mensual, conozca cuánto puede generar dicho capital en un plazo determinado.']/android.view.View[2]/android.widget.TextView[2]");
	protected By btnPerfilInversion = By.xpath("//android.view.View[@content-desc='perfil de inversion  Como persona, conozca su perfil de inversión y un portafolio de referencia adecuado a éste.']/android.view.View[2]/android.widget.TextView[2]");
	protected By btnSaludFinanciera = By.xpath("//android.view.View[@content-desc='salud financiera  Conozca el estado de su salud financiera ya que de esta podrán depender algunas decisiones que tome a futuro.']/android.view.View[2]/android.widget.TextView[2]");
	protected By btnTiempoRentaMensual = By.xpath("//android.view.View[@content-desc='tiempo con renta mensual  Calcule durante cuánto tiempo podrá disponer de un capital, teniendo en cuenta la renta que quiere recibir mensualmente.']/android.view.View[2]/android.widget.TextView[2]");
	protected By btnRentaMensual = By.xpath("//android.view.View[@content-desc='valor de renta mensual  Simule el valor de renta que recibirá, teniendo en cuenta un capital determinado.']/android.view.View[2]/android.widget.TextView[2]");
	protected By btnPerfilEmpresas = By.xpath("//android.view.View[@content-desc='Perfil de Inversión  Como empresa, conozca su perfil de inversión y un portafolio de referencia adecuado a éste.']/android.view.View[2]/android.widget.TextView[2]");
	protected By btnPensionesSeguro = By.xpath("/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.ListView/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.TextView[2]");
	protected By btnCreaAhorro = By.xpath("//android.view.View[@content-desc='Seguro de Vida con Ahorro Skandia Crea Ahorro  Establezca el valor de su objetivo de ahorro y encuentre cómo Seguro de Vida con Ahorro Skandia Crea Ahorro lo acompañará para cumplirlo.']/android.view.View[2]/android.widget.TextView[2]");
	protected By btnIncapacidad = By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.ListView/android.view.View[3]/android.view.View/android.view.View[2]/android.widget.TextView[2]");
	protected By btnCreditos = By.xpath("//android.view.View[@content-desc='Skandia Créditos  Estime el monto máximo para solicitar créditos garantizados con los recursos invertidos en Skandia Multifund (desde $10,000,000).']/android.view.View[2]/android.widget.TextView[2]");
	
	//--simulador 
	protected By ProcesoGrid = By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Image");
	protected By txtCapitalDeseado = By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.widget.EditText");
	protected By txtAporteunico = By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.widget.EditText");
	protected By txtMensualidadFutura = By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.widget.EditText");
	protected By txtCapitalAhorrado = By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.widget.EditText");
	protected By btnCalculadora = By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View/android.view.View[7]/android.widget.Button");
	protected By btnEdadSelector = By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]");
	protected By btnContinuarSfinanciera = By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[6]/android.widget.TextView");
	protected By btnTiempoMensual = By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View/android.view.View[7]/android.widget.Button");
	protected By btnTiempoEmpresas = By.xpath("protected By btnTiempoMensual = By.xpath(\"//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View/android.view.View[7]/android.widget.Button\");");
	protected By btnCalcularSeguroPensiones = By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[5]/android.widget.TextView");
	protected By btnSegurodeVida = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[3]/android.widget.TextView[2]");
	protected By txtModuloSimuladores = By.xpath("//android.view.View[@content-desc='Pestaña 4 de 4']/android.widget.ImageView");
	
	
	
	
	
}
