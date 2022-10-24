package Run;


import java.io.File;
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
	
	//LLAMA  A EL ARCHIVO DE EXCEL QUE CONTIENE EL USUARIO Y CONTRASEÑA
	@DataProvider(name = "AppClaro")
	public Object[][] primerPaso() throws Exception {
		Object[][] arreglo = ExcelUtilidades.getTableArray("./Data/Excel2.xlsx", "Hoja1");

		return arreglo;
	}

	@Test(dataProvider = "AppClaro", description = "Logueo",priority= 1)
	public void Ingresar_Direccion3(String Ejecutar, String Evidencia, String Usuario, String Contrasena,String Documento,String Usuario1,String Valor)
			throws Exception {
		try {
			if (Ejecutar.equals("SI")) {
				//inicio ejecuion 
				// OBTENER EL NOMBRE DEL M�TODO A EJECUTAR
				String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
				if (Evidencia.equals("SI")) {
					//esta tomando evidencia
					// CREAR CARPETA
					
					
					
					rutaCarpeta = claseBase.crearCarpeta(nomTest, Evidencia);
					// INICIA VIDEO
					 //claseBase.iniVideo();
					// INICIA CREACI�N DE REPORTE PDF
					generarReportepdf.crearPlantilla(nomTest, rutaCarpeta,Evidencia);
					// INICIO DE ACCIONES
					//Validaciones de certificados y de saldos asi como menu lateral 
					
					selecObject.LoguinUsuario(Evidencia, Usuario, Contrasena, rutaCarpeta);
					
					
					//selecObject.ValidacionesRetiros_596754(Evidencia, rutaCarpeta, Valor);
					
					selecObject.CerrarSesion(rutaCarpeta, Evidencia);
					
					//certificados.ValidacionesCertificadoCC_595718(Evidencia, rutaCarpeta);
				
					//FIN VIDEO, FIN PDF
					 claseBase.finVideo(rutaCarpeta);
					 
					 //Cerramos plantilla donde guardamos el informe 
					generarReportepdf.cerrarPlantilla();
					
				} 
				
				else {
					
					
					rutaCarpeta = claseBase.crearCarpeta(nomTest,Evidencia);
					// INICIA VIDEO
					 //claseBase.iniVideo();
					// INICIA CREACI�N DE REPORTE PDF
					generarReportepdf.crearPlantilla(nomTest, rutaCarpeta,Evidencia);
					// INICIO DE ACCIONES
					
					//inicio ejecuion sin evidencia
					selecObject.LoguinUsuario(Evidencia, Usuario, Contrasena, rutaCarpeta);
					//Ejecucion sin creacion de evidencia 
					
					//selecObject.ValidacionesRetiros_596754(Evidencia, rutaCarpeta, Valor);
					
					
					selecObject.CerrarSesion(rutaCarpeta, Evidencia);
					
					//FIN VIDEO, FIN PDF
					// claseBase.finVideo(rutaCarpeta);
					 
					 //Cerramos plantilla donde guardamos el informe 
					generarReportepdf.cerrarPlantilla();
					
				}
			} 
			else 
			{
				
				System.out.println("Caso no ejecutado");
				
				
			}
		
			
		} 
		catch (Exception e) 
		{
			System.out.println(e);// TODO: handle exception
		}
		
		}
	
	//LLAMA  A EL ARCHIVO DE EXCEL QUE CONTIENE EL USUARIO Y CONTRASEÑA
	@DataProvider(name = "AppClaro2")
	public Object[][] segundoPaso() throws Exception {
	Object[][] arreglo = ExcelUtilidades.getTableArray("./Data/Excel2.xlsx", "Hoja2");

	return arreglo;
	}
			
	
	@Test(dataProvider = "AppClaro2", description = "Logueo",priority= 2)
	public void Ingresar_Direccion(String Ejecutar1, String Evidencia1, String Usuario, String Contrasena)
			throws Exception {
		if (Ejecutar1.equals("NO")) {
			// OBTENER EL NOMBRE DEL M�TODO A EJECUTAR
			String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
			if (Evidencia1.equals("NO")) {
				// CREAR CARPETA
				rutaCarpeta = claseBase.crearCarpeta(nomTest,Evidencia1);
				// INICIA VIDEO
				 claseBase.iniVideo();
				// INICIA CREACI�N DE REPORTE PDF
				generarReportepdf.crearPlantilla(nomTest, rutaCarpeta,Evidencia1);
				// INICIO DE ACCIONES
				// INICIO
				selecObject.LoguinUsuario(Evidencia1, Usuario, Contrasena, rutaCarpeta);
				
				//Validaciones de certificados y de saldos asi como menu lateral 
				selecObject.ValidacionesLogueado_587966(Evidencia1, Usuario, Contrasena, rutaCarpeta);
				
				selecObject.ValidacionesCertificado_588065(Evidencia1,  rutaCarpeta);
				
				selecObject.ValidacionesCertificados_589706(Evidencia1, rutaCarpeta);
				
				selecObject.ValidacionesSimuladores_588077(Evidencia1, rutaCarpeta);
				
				selecObject.CerrarSesion(rutaCarpeta, Evidencia1);
				//certificados.Canalesdecontacto_569212(Documento, Evidencia, rutaCarpeta);
				
				//certificados.rentabilidades_576109(Documento, Evidencia, rutaCarpeta);
				//certificados.Certificados_576099(Documento,  Evidencia, rutaCarpeta);
				//selecObject.ingresoexitoso_572160(Evidencia, Usuario, Contrasena, rutaCarpeta,Usuario1);
				//
				//certificados.Simuladores_568696(Documento, Evidencia, rutaCarpeta);
				//FIN VIDEO, FIN PDF
				 claseBase.finVideo(rutaCarpeta);
				 
				 //Cerramos plantilla donde guardamos el informe 
				generarReportepdf.cerrarPlantilla();
				
			} else {
				
				
				selecObject.LoguinUsuario(Evidencia1, Usuario, Contrasena, rutaCarpeta);
				
				selecObject.ValidacionesLogueado_587966(Evidencia1, Usuario, Contrasena, rutaCarpeta);
				
				selecObject.ValidacionesCertificado_588065(Evidencia1,  rutaCarpeta);
				
				selecObject.ValidacionesCertificados_589706(Evidencia1, rutaCarpeta);
				
				selecObject.ValidacionesSimuladores_588077(Evidencia1, rutaCarpeta);
				
				selecObject.CerrarSesion(rutaCarpeta, Evidencia1);
			
				
				// INICIO
				//certificados.Certificados_576099(Documento,  Evidencia, rutaCarpeta);
				//selecObject.ingresoexitoso_572160(Evidencia, Usuario, Contrasena, rutaCarpeta);
				
				
			}
		} else 
		{
			
			System.out.println("Caso no ejecutado");
			
		}
	}
	
	
	
	//LLAMA  A EL ARCHIVO DE EXCEL QUE CONTIENE EL USUARIO Y CONTRASEÑA
	@DataProvider(name = "AppClaro3")
	public Object[][] terceroPaso() throws Exception {
		Object[][] arreglo = ExcelUtilidades.getTableArray("./Data/Excel2.xlsx", "Hoja3");

		return arreglo;
	}
	
	
	@Test(dataProvider = "AppClaro3", description = "Logueo",priority= 3)
	public void Ingresar_Direccion2(String Ejecutar2, String Evidencia2, String Usuario, String Contrasena,String Documento,String Usuario1)
			throws Exception {
		if (Ejecutar2.equals("NO")) {
			// OBTENER EL NOMBRE DEL M�TODO A EJECUTAR
			String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
			if (Evidencia2.equals("NO")) {
				// CREAR CARPETA
				rutaCarpeta = claseBase.crearCarpeta(nomTest,Evidencia2);
				// INICIA VIDEO
				 claseBase.iniVideo();
				// INICIA CREACI�N DE REPORTE PDF
				generarReportepdf.crearPlantilla(nomTest, rutaCarpeta,Evidencia2);
				// INICIO DE ACCIONES
				// INICIO
				selecObject.LoguinUsuario(Evidencia2, Usuario, Contrasena, rutaCarpeta);
				
				//Validaciones de certificados y de saldos asi como menu lateral 
				
				
				selecObject.LoguinUsuario(Evidencia2, Usuario, Contrasena, rutaCarpeta);
				
				certificados.Canalesdecontacto_569212(Documento, Evidencia2, rutaCarpeta);
				
				certificados.rentabilidades_576109(Documento, Evidencia2, rutaCarpeta);
				certificados.Certificados_576099(Documento,  Evidencia2, rutaCarpeta);
				selecObject.ingresoexitoso_572160(Evidencia2, Usuario, Contrasena, rutaCarpeta,Usuario1);
				
				selecObject.CerrarSesion(rutaCarpeta, Evidencia2);
				//
				//certificados.Simuladores_568696(Documento, Evidencia, rutaCarpeta);
				//FIN VIDEO, FIN PDF
				 claseBase.finVideo(rutaCarpeta);
				 
				 //Cerramos plantilla donde guardamos el informe 
				generarReportepdf.cerrarPlantilla();
				
			} else {
				
				
				selecObject.LoguinUsuario(Evidencia2, Usuario, Contrasena, rutaCarpeta);
				
				selecObject.ValidacionesLogueado_587966(Evidencia2, Usuario, Contrasena, rutaCarpeta);
				
				selecObject.ValidacionesCertificado_588065(Evidencia2,  rutaCarpeta);
				
				selecObject.ValidacionesCertificados_589706(Evidencia2, rutaCarpeta);
				
				selecObject.ValidacionesSimuladores_588077(Evidencia2, rutaCarpeta);
				
				selecObject.CerrarSesion(rutaCarpeta, Evidencia2);
			
				
				// INICIO
				//certificados.Certificados_576099(Documento,  Evidencia, rutaCarpeta);
				//selecObject.ingresoexitoso_572160(Evidencia, Usuario, Contrasena, rutaCarpeta);
				
				
			}
		}else 
		{
			
			System.out.println("Caso no ejecutado");
			
		}
	}
	


	
	
	


	
	
	
		
		
	
	

	@AfterClass
	public void afterClass() {
		// driver.quit();
	}
}
