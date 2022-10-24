package PagObjet;

import java.io.File;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;

import MapsObjet.MapsObjetIngresarApp;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import ClaseBase.ClaseBaseFinalMobil;
import com.Utilidades.GenerarReportePdf;

public class PagsObjectIngresarApp extends MapsObjetIngresarApp {
	
	//INSTANCIA DE APPIUM DRIVER, SE  INSTANCIA EL DRIVER PERO EN VERSION MOBILE
	public PagsObjectIngresarApp(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver = driver;
	}
	
	//Metodo de login  
	
	public void ingresoexitoso_572160(String Evidencia,String Usuario,String Contrasena,File rutaCarpeta,String Usuario1) throws Exception {
			
		
		
			//tocarPantalla(550, 934);
			//click2(btnAceptar, 10, rutaCarpeta, Evidencia);
		
			click2(btnRecordarMiUsuario, 5, rutaCarpeta, Evidencia);
			click2(btnRecordarMiUsuario, 5, rutaCarpeta, Evidencia);			
			//toca pantalla en las coordenadas donde esta usuario
			//tocarPantalla(210, 342);
			click2(campollenar, 5, rutaCarpeta, Evidencia);
		
			
			//sendkey2(Usuario, campollenar, 5, rutaCarpeta, Evidencia);
			//toca pantalla en las coordenadas donde esta contraseña(dos veces porque no responde bien al primer tocar pantalla en la automatizacion porque manualmente si)
			
			click2(contrasena, 5, rutaCarpeta, Evidencia);
			
			sendkey2(Contrasena, contrasena, 5, rutaCarpeta, Evidencia);
			//click en iniciar sesion
			click2(btnIniciarSesion,10,rutaCarpeta,Evidencia);
			
			tiempoEspera(6000);
			
			click2(btnMenuGeneral, 5, rutaCarpeta, Evidencia);
			
			
			
			
			tocarPantalla(168, 1267);
			click2(btnSalirSeguro, 5, rutaCarpeta, Evidencia);
			
			click2(btnAceptarSalir, 5, rutaCarpeta, Evidencia);
			
			//toca pantalla en las coordenadas donde esta usuario
			//tocarPantalla(210, 342);
			click2(campollenar, 5, rutaCarpeta, Evidencia);
		
			sendkey2(Usuario1, campollenar, 5, rutaCarpeta, Evidencia);
			//toca pantalla en las coordenadas donde esta contraseña(dos veces porque no responde bien al primer tocar pantalla en la automatizacion porque manualmente si)
			
			click2(contrasena, 5, rutaCarpeta, Evidencia);
			
			sendkey2(Contrasena, contrasena, 5, rutaCarpeta, Evidencia);
			//click en iniciar sesion
			click2(btnIniciarSesion,10,rutaCarpeta,Evidencia);
			
			tiempoEspera(6000);
			
			//Enviar a una variable de tipo booleano los botones para certificar que ya ingresa a certificados(botones aun no tienen desarrollada la funcionalidad)
			boolean afiliacion = validarElemento(btnAceptar, 5);
			ValidacionObjeto(afiliacion, "Caso certificados de afiliacion", rutaCarpeta, Evidencia, btnAceptar);
			
			tiempoEspera(300000);
			
			click2(btnAceptar, 1, rutaCarpeta, "click en aceptar");
			
			boolean afiliacion2 = validarElemento(btnAceptar, 5);
			ValidacionObjeto(afiliacion2, "Caso certificados de afiliacion", rutaCarpeta, Evidencia, btnAceptar);
			
			//btnAceptar
			
     }	
	
	
	//Metodo de login con validaciones 
	
		public void ValidacionesLogueado_587966(String Evidencia,String Usuario,String Contrasena,File rutaCarpeta) throws Exception 
		
		{
			
			
			
			tocarPantalla(660, 318);
			
			//Validacion de campo detalle saldo
			boolean afiliacion = validarElemento(btnDetalleSaldo, 5);
			ValidacionObjeto(afiliacion, "Caso certificados de afiliacion", rutaCarpeta, Evidencia, btnDetalleSaldo);
			
			tocarPantalla(443, 443);
			
			tocarPantalla(660, 361);
			
			tiempoEspera(10000);
			
			//Validaciones de campos de caso
			boolean ContratoIdentifier = validarElemento(ContratoId, 5);
			ValidacionObjeto(ContratoIdentifier, "Caso certificados de afiliacion", rutaCarpeta, Evidencia, ContratoId);
			
			boolean ContratoEncabezado = validarElemento(ContratoCampo, 5);
			ValidacionObjeto(ContratoEncabezado, "Caso certificados de afiliacion", rutaCarpeta, Evidencia, ContratoCampo);
			
			boolean EncabezadoInformacion = validarElemento(InformacionContrato, 5);
			ValidacionObjeto(EncabezadoInformacion, "Caso certificados de afiliacion", rutaCarpeta, Evidencia, InformacionContrato);
			
			boolean EncabezadoResumen = validarElemento(ResumenSaldo, 5);
			ValidacionObjeto(EncabezadoResumen, "Caso certificados de afiliacion", rutaCarpeta, Evidencia, ResumenSaldo);
			
			click2(btnInformacionPortafolio, 2, rutaCarpeta, "click en extender informacion");
			
			boolean EncabezadoPortafolio = validarElemento(ResumenSaldo, 5);
			ValidacionObjeto(EncabezadoPortafolio, "Caso certificados de afiliacion,caso exitoso 587966,587967,587968,587969", rutaCarpeta, Evidencia, ResumenSaldo);
			
			//nos devolvemos y cerramos sesion
			click2(btnGoback, 1, rutaCarpeta, "click en devolverse");
			
			click2(btnGoback, 1, rutaCarpeta, "click en devolverse");
	
		
			
			
		}
		
		
		//Metodo de login con validaciones 
		
			public void ValidacionesCertificado_588065(String Evidencia,File rutaCarpeta) throws Exception 
			
			{
				
				//Conversion de localizador a un booleano y validacion mediante el metodo validar objeto
				boolean Extractos = validarElemento(ExtractosSeccion, 5);
				ValidacionObjeto(Extractos, "Caso Extractos", rutaCarpeta, Evidencia, ExtractosSeccion);
			
				//Tocar pantalla en boton de extractos
				tocarPantalla(454, 1430);
				
				tiempoEspera(2000);
				
				boolean Pdf1 = validarElemento(UltimoPdf, 5);
				ValidacionObjeto(Pdf1, "Caso Extractos, Caso exitoso 588064,588065", rutaCarpeta, Evidencia, UltimoPdf);
				
				tocarPantalla(57, 356);
				
				tiempoEspera(14000);
				
				//Cerramos sesion
				escape();
				//tocarPantalla(155, 1546);
				
				//tiempoEspera(6000);
				
				//tocarPantalla(57, 356);
				
				//155,1546
			}
			
			
			
			
			
			
			
			//ValidacionesCertificado_588065
			
			
			
			
			//Metodo de login con validaciones 
			
			public void ValidacionesSimuladores_588077(String Evidencia,File rutaCarpeta) throws Exception 
			
			{
				
				//Validaciones rapidas de menu general
				
				click2(btnMenuGeneral, 5, rutaCarpeta, Evidencia);
				
				
				//Conversion de localizador a una variable booleana y validacion posterior
				boolean Simuladores = validarElemento(btnSimuladores, 5);
				ValidacionObjeto(Simuladores, "Caso Exitoso 588077", rutaCarpeta, Evidencia, btnSimuladores);
				
				
				boolean Rentabilidades = validarElemento(btnRentabilidad, 5);
				ValidacionObjeto(Rentabilidades, "Caso Exitoso 588075", rutaCarpeta, Evidencia, btnRentabilidad);
				
				boolean CanalesContactoLoguin = validarElemento(btnCanalesContactoLoguin, 5);
				ValidacionObjeto(CanalesContactoLoguin, "Caso Exitoso 588074,588076,", rutaCarpeta, Evidencia, btnCanalesContactoLoguin);
				
				tocarPantalla(679, 735);
				
				
				
				
				
			}
			
			
			
			
			
			
			
//Metodo de login con validaciones 
			
			public void ValidacionesCertificados_589706(String Evidencia,File rutaCarpeta) throws Exception 
			
			{
				
				
				//Validaciones rapidas de menu general
				
				
				
				boolean CertificadosTributarios = validarElemento(CertificadosTributariosLoguin, 5);
				ValidacionObjeto(CertificadosTributarios, "Caso Exitoso 588074,588076,", rutaCarpeta, Evidencia, CertificadosTributariosLoguin);
				
				tocarPantalla(268, 1430);
				
				tiempoEspera(10000);
				
				boolean UltimoCertificado = validarElemento(UltimoCertificadoTributario, 5);
				ValidacionObjeto(UltimoCertificado, "Caso Exitoso 588074,588076,", rutaCarpeta, Evidencia, UltimoCertificadoTributario);

				tocarPantalla(57, 436);
				
				tiempoEspera(18000);
				
				//Salimos de la pantalla actual
				escape();
				
				
				//intro(FramePantalla, rutaCarpeta, Evidencia);
				
				//tocarPantalla(160, 1546);
				
				//tocarPantalla(137, 1474);
				
				//tiempoEspera(5000);
				
				//tocarPantalla(330, 785);
				
				
				
				
			}
		
		//metodo de cerrar sesion
		public void CerrarSesion(File rutaCarpeta,String Evidencia) throws Exception 
		{
			
			click2(btnMenuGeneral, 5, rutaCarpeta, "click en menu general");
			
			tocarPantalla(168, 1267);
			
			
			click2(btnAceptarSalir, 5, rutaCarpeta, "Caso 587287,589703 exitoso");
			
			
			
		}
		
		
		public void ValidacionesRetiros_596754(String Evidencia,File rutaCarpeta,String Valor) throws Exception 
		
		{
			
			
			//Validaciones rapidas de menu general
			
			
			
			boolean Retiros = validarElemento(btnRetiros, 5);
			ValidacionObjeto(Retiros, "Caso Exitoso 596750 ,", rutaCarpeta, Evidencia, btnRetiros);
			
			tocarPantalla(632, 1437);
			
			click2(btnEntendido, 5, rutaCarpeta, Evidencia);			
			//Salimos de la pantalla actual
			
			
			
			boolean ContratoDisponible = validarElemento(btnContratoDisponibleRetiro, 5);
			ValidacionObjeto(ContratoDisponible, "Caso Exitoso 596751 ,", rutaCarpeta, Evidencia, btnContratoDisponibleRetiro);
			
			tocarPantalla(657, 354);
			
			boolean ContratoDisponibleRetiro = validarElemento(btnContratoDisponibleRetiro, 5);
			ValidacionObjeto(ContratoDisponibleRetiro, "Caso Exitoso 596751 ,", rutaCarpeta, Evidencia, btnContratoDisponibleRetiro);
			
			boolean MontoAceptar = validarElemento(btnEntendidoMonto, 5);
			ValidacionObjeto(MontoAceptar, "Caso Exitoso 596752 ,", rutaCarpeta, Evidencia, btnEntendidoMonto);
			
			click2(btnEntendidoMonto, 5, rutaCarpeta, Evidencia);
			
			tiempoEspera(7000);
			
			click2(btnSaldoDisponible, 5, rutaCarpeta, Evidencia);
			
			tiempoEspera(7000);
			
			boolean Idcontrato = validarElemento(IDContrato, 5);
			ValidacionObjeto(Idcontrato, "Caso Exitoso 596753 ,", rutaCarpeta, Evidencia, IDContrato);
			
			//boolean SaldoTotal = validarElemento(CampoSaldoTotal, 5);
			//ValidacionObjeto(SaldoTotal, "Caso Exitoso 596753 ,", rutaCarpeta, Evidencia, CampoSaldoTotal);
			
			
			
			//boolean AporteSincertificar = validarElemento(AporteSinCertificar, 5);
			//ValidacionObjeto(AporteSincertificar, "Caso Exitoso 596753 ,", rutaCarpeta, Evidencia, AporteSinCertificar);
			
			//boolean SaldoLiquidez = validarElemento(SaldosEnLiquidez, 5);
			//ValidacionObjeto(SaldoLiquidez, "Caso Exitoso 596753 ,", rutaCarpeta, Evidencia, SaldosEnLiquidez);
			
			click2(btnGoback, 1, rutaCarpeta, Evidencia);
			
			
			
			click2(txtMontoAretirar, 5, rutaCarpeta, Evidencia);
			
			sendkey2(Valor, txtMontoAretirar, 5, rutaCarpeta, Evidencia);
			
			click2(btnConfirmar, 5, rutaCarpeta, Evidencia);
			
			tiempoEspera(8000);
			
			
			click2(btnRetiroExpress, 5, rutaCarpeta, Evidencia);
			tiempoEspera(9000);
			click2(btnCancelarRetiro, 5, rutaCarpeta, Evidencia);
			
			
			click2(btnRetiroParcial, 5, rutaCarpeta, Evidencia);
			tiempoEspera(9000);
			click2(btnCancelarRetiro, 5, rutaCarpeta, Evidencia);
			
			//btnCancelarRetiro
			
			//boolean RetiroExpress = validarElemento(btnRetiroExpress, 5);
			//ValidacionObjeto(RetiroExpress, "Caso Exitoso 596754 ,", rutaCarpeta, Evidencia, btnRetiroExpress);
			
			//boolean RetiroParcial = validarElemento(btnRetiroParcial, 5);
			//ValidacionObjeto(RetiroParcial, "Caso Exitoso 596754 ,", rutaCarpeta, Evidencia, btnRetiroParcial);
			
			tocarPantalla(657, 354);
			tiempoEspera(8000);
			
			tocarPantalla(41, 93);
			
			
			
			
			
		}
		
		
		//Metodo de login  
		
		public void LoguinUsuario(String Evidencia,String Usuario,String Contrasena,File rutaCarpeta) throws Exception {
				
			
			
				
						
				
				click2(campollenar, 5, rutaCarpeta, Evidencia);
				sendkey2(Usuario, campollenar, 5, rutaCarpeta, Evidencia);
				//toca pantalla en las coordenadas donde esta contraseña(dos veces porque no responde bien al primer tocar pantalla en la automatizacion porque manualmente si)
				
				click2(contrasena, 5, rutaCarpeta, Evidencia);
				
				sendkey2(Contrasena, contrasena, 5, rutaCarpeta, Evidencia);
				//click en iniciar sesion
				click2(btnIniciarSesion,10,rutaCarpeta,Evidencia);
				
				tiempoEspera(6000);
				
				
				//uno en cada metodo de pasos
				
				
				
				
	     }	
		
}
