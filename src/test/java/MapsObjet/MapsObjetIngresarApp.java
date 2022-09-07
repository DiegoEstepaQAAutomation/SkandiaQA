package MapsObjet;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ClaseBase.ClaseBaseFinalMobil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MapsObjetIngresarApp extends ClaseBaseFinalMobil 
{
	//INSTANCIA DE WEBDRIVER MOBILE
	public MapsObjetIngresarApp (AppiumDriver<MobileElement> driver) 
	{
		super(driver);
		this.driver = driver;
		
	}
	
	//ELEMENTOS DE LOGIN
	protected By campollenar = By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView/android.widget.EditText[1]");
	protected By btnIniciarSesion = By.xpath("//android.widget.Button[@content-desc='INICIAR SESIÓN']");
	protected By btnRecordarMiUsuario = By.xpath("//android.widget.CheckBox[@content-desc='Recordar mi usuario']");
	protected By btnOlvideClave = By.xpath("//android.view.View[@content-desc='¿Olvidé mi clave?']");
	protected By btnSalirSeguro = By.xpath("//android.widget.ImageView[@content-desc='Salida Segura']");
	protected By btnAceptarSalir = By.xpath("//android.widget.Button[@content-desc='Aceptar']");
	protected By btnMenuGeneral = By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.Button");
	
	
	
	//ELEMENTOS DE MODULOS
	protected By btnusucon = By.xpath("//android.widget.Button[@resource-id='com.clarocolombia.miclaro.debug:id/btnLoginEmail']");
	protected By btncorreo = By.xpath("//android.widget.TextView[@text='Correo electrónico']");
	protected By correo = By.xpath("//android.widget.EditText[@resource-id='com.clarocolombia.miclaro.debug:id/edUsuario']");
	protected By contrasena = By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView/android.widget.EditText[2]");
	protected By btniniciar = By.xpath("//android.widget.Button[@resource-id='com.clarocolombia.miclaro.debug:id/btnLoginUsPass']");
	protected By cancelar = By.xpath("//android.widget.Button[@resource-id='com.clarocolombia.miclaro.debug:id/btn31']");
	protected By txtNumeroDocumento = By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText");
	
	
	//ELEMENTOS DE LOGUIN Y VALIDACION 
	protected By Cuerpo = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View");
	protected By btnAceptar = By.xpath("//android.widget.Button[@content-desc='Aceptar']");
	
	
	protected By btnCertificado = By.xpath("//android.view.View[@content-desc='Pestaña 1 de 4']/android.widget.ImageView");
	protected By btnRentabilidades = By.xpath("//android.view.View[@content-desc='Pestaña 2 de 4']/android.widget.ImageView");
	protected By btnCanalesContacto = By.xpath("//android.view.View[@content-desc='Pestaña 3 de 4']/android.widget.ImageView");
	protected By btntipoDocumento= By.xpath("//android.view.View[@content-desc='Tipo de id']");
	protected By txtNDocumento = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText");
	protected By btnAfiliacion = By.xpath("//android.widget.Button[@content-desc='AFILIACIÓN']");
	protected By btnTributarios = By.xpath("//android.widget.Button[@content-desc='TRIBUTARIOS']");
	protected By btnExtractos = By.xpath("//android.widget.Button[@content-desc='EXTRATOS']");
	protected By btntipoCC = By.xpath("//android.view.View[@content-desc='Tipo de id']");
	protected By btnback = By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
	protected By txtNombre = By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.widget.EditText");
	protected By txtFechaNacimiento = By.xpath( "//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[7]/android.view.View/android.widget.EditText");
	
	
	
	
	
}
