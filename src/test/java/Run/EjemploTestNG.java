package Run;

import java.applet.AudioClip;
import java.io.File;

import javax.sound.sampled.AudioInputStream;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Utilidades.ExcelUtilidades;
import com.Utilidades.GenerarReportePdf;
import com.Utilidades.GrabarAudio;

import ClaseBase.ClaseBaseFinalMobil;
import PagObjet.PagsObjectIngresarApp;
import PagObjet.PagsObjetCambioDireccion;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class EjemploTestNG

{	
	//INSTANCIA DE CLASES PRINCIPALES COMO EL PAGS OBJECT Y CLASE BASE
	PagsObjectIngresarApp selecObject;
	PagsObjetCambioDireccion certificados;
	String url = null;
	ClaseBaseFinalMobil claseBase;
	GrabarAudio audio;
	File rutaCarpeta = null;
	GenerarReportePdf generarReportepdf;
	String valor;
	//INSTANCIA DE APPIUM DRIVER
	private AppiumDriver<MobileElement> driver;
	//CAPABILITIES DE XML COMO PARAMETROS QUE SERAN UTILIZADOS y LAS ETIQUETAS BEFORE CLASS Y SUPPRESS WARNINGS  CUMPLEN FUNCIONES ESPECIFICAS(EVITAR ALERTAS y DETERMINAR UNAS PROPIEDADES)
	@SuppressWarnings("unchecked")
	@BeforeClass
	@Parameters({ 
		"rutaImagenReporte", 
		"rutaOutput", 
		"platformName", 
		"deviceName", 
		"platfotmVersion", 
		"appPackage",
		"appActivity", 
		"noReset", 
		"autoGrantPermissior" })

	//LLAMADO DE LAS CAPABILITIES 
	public void beforeClass(
			//A TENER EN CUENTA PORFAVOR, TANTO EL NO RESET COMO LOS QUE NO SON CAPABILITIES HAY QUE ENVIARLOS COMO STRINGS
			String rutaImagenReporte, 
			String rutaOutput,
			@Optional("default") String platformName, 
			@Optional("default") String deviceName,
			@Optional("default") String platfotmVersion, 
			@Optional("default") String appPackage,
			@Optional("default") String appActivity, 
			String noReset,
			String autoGrantPermissior) {

		try {
			
			driver = ClaseBaseFinalMobil.appiumDriverConection(platformName, deviceName, platfotmVersion, appPackage,
					appActivity, noReset, autoGrantPermissior);

		} catch (Exception e) {
			
			System.out.println(e);
			// TODO: handle exception
		} //SE LLAMA AL METODO DE CLASE BASE DE APPIUM CONECTION CON LAS CAPABILITIES ANTES LLAMADAS
		
		//INSTANCIA DE DRIVER EN CADA CLASE 
		claseBase = new ClaseBaseFinalMobil(driver);
		generarReportepdf = new GenerarReportePdf();
		audio= new GrabarAudio();
		selecObject = new PagsObjectIngresarApp(driver);
		certificados = new PagsObjetCambioDireccion(driver);
		generarReportepdf.setRutaImagen(rutaImagenReporte);
		claseBase.setrutaOutput(rutaOutput, driver);
	}

	@Test(dataProvider = "AppClaro", description = "Logueo")
	public void Ingresar_Direccion(String Ejecutar, String Evidencia, String Usuario, String Contrasena,String Documento,String Usuario1)
			throws Exception {
		if (Ejecutar.equals("SI")) {
			// OBTENER EL NOMBRE DEL M�TODO A EJECUTAR
			String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
			if (Evidencia.equals("SI")) {
				// CREAR CARPETA
				rutaCarpeta = claseBase.crearCarpeta(nomTest);
				// INICIA VIDEO
				 claseBase.iniVideo();
				// INICIA CREACI�N DE REPORTE PDF
				generarReportepdf.crearPlantilla(nomTest, rutaCarpeta);
				// INICIO DE ACCIONES
				// INICIO
				//certificados.Canalesdecontacto_569212(Documento, Evidencia, rutaCarpeta);
				
				//certificados.rentabilidades_576109(Documento, Evidencia, rutaCarpeta);
				certificados.Certificados_576099(Documento,  Evidencia, rutaCarpeta);
				//selecObject.ingresoexitoso_572160(Evidencia, Usuario, Contrasena, rutaCarpeta,Usuario1);
				//
				//certificados.Simuladores_568696(Documento, Evidencia, rutaCarpeta);
				//FIN VIDEO, FIN PDF
				 claseBase.finVideo(rutaCarpeta);
				generarReportepdf.cerrarPlantilla();
				
			} else {
				// INICIO
				certificados.Certificados_576099(Documento,  Evidencia, rutaCarpeta);
				//selecObject.ingresoexitoso_572160(Evidencia, Usuario, Contrasena, rutaCarpeta);
				
				
			}
		}
	}

	//LLAMA  A EL ARCHIVO DE EXCEL QUE CONTIENE EL USUARIO Y CONTRASEÑA
	@DataProvider(name = "AppClaro")
	public Object[][] primerPaso() throws Exception {
		Object[][] arreglo = ExcelUtilidades.getTableArray("./Data/Excel2.xlsx", "Hoja1");

		return arreglo;
	}

	@AfterClass
	public void afterClass() {
		// driver.quit();
	}
}
