import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
	
       Scanner teclado = new Scanner(System.in);
       boolean salir = false;
       int opcion; //Guardaremos la opcion del usuario
	   int codigo;
	   int codigoEquipo1, codigoEquipo2, codigoCancha, codigoAsignacion = 0;
	   int operador1 = 2;
	   int operador2 = 2;
	   int operador3 = 2;
	   int operador4 = 2;
	   int p = 2;
	   Date fecha, dateTime;
	   String texto;
	   int fin = 0;
	   boolean codigoVal = false;
	   boolean codigoProdVal = false;
	   boolean modificado = false;
	   boolean condicion = false;
	   boolean canchaHabilitada = false;
	   ArrayList<Equipo> equipos = new ArrayList<Equipo>();
	   ArrayList<Cancha> canchas = new ArrayList<Cancha>();
	   ArrayList<Asignacion> asignaciones = new ArrayList<Asignacion>();
	   String nombre, nombreCapitan, nombreCancha, estado, nombreEquipo1, nombreEquipo2, fechaComoTexto;
	   Equipo equipo;
	   Cancha cancha;
	   Asignacion asignacion;
	      
		public Menu(){
			
		}
		
		public void menuPrincipal(){
			while(fin == 0){
				System.out.println( "Bienvenido al sistema al control de canchas");
				System.out.println( "Seleccione una opcion");
				System.out.println( "1. Equipo");
				System.out.println( "2. Canchas");
				System.out.println( "3. Asignacion");
				System.out.println( "4. Generar Reporte");
				System.out.println( "5. Salir de la aplicacion");
			   
				opcion = teclado.nextInt();
				
				switch(opcion){ 
				
/* ----------------- Entra al menu para equipos ------------------------------*/
					case 1:
					fin = 1;
						while(fin == 1){
							 System.out.println( "1. Ingresar equipo ");
							 System.out.println( "2. Modificacion ");
							 System.out.println( "3. Eliminacion ");
							 System.out.println( "4. Regresar ");
							 
							 opcion = teclado.nextInt();
							 
							 switch(opcion){
								 /* ----------------- Entra a ingresar un equipo ------------------------------*/
								 case 1:
									fin = 2;
									while(fin == 2){
										System.out.println("");
										System.out.println( "Ingrese el nombre del equipo");
										nombre = teclado.nextLine();
										nombre = teclado.nextLine();
										
										System.out.println("");
										System.out.println( "Ingrese el nombre del Capitan");
										nombreCapitan = teclado.nextLine();
										
										codigo = (int)(Math.random()*1000+1);
										System.out.println("El codigo del equipo " + nombre + " es: " + codigo);
										equipo = new Equipo (codigo, nombre, nombreCapitan);
										
										equipos.add(equipo);
										System.out.println( "----------------------------------------------");
										System.out.println("Equipo guardado con exito");
										System.out.println( "----------------------------------------------");
										System.out.println("¿Desea ingresar otra Equipo?");
										System.out.println("1. Si");
										System.out.println("2. No");
										System.out.println("");
										opcion = teclado.nextInt();
										switch(opcion){
											case 1:
											System.out.println("");
											System.out.println("Regresando ...");
											System.out.println("");

											break;
											case 2:
											fin = 1;
											break;
										}
									}
									

									
								 break;
								 
								 /* ----------------- Modifica los datos de un equipo ------------------------------*/
								 case 2:
									if(equipos.size() == 0){
										System.out.println("");
										System.out.println("No hay equipos ingresados en el sistema");
										System.out.println(" ");
										
									} else {
										do{
											System.out.println("");
											System.out.println("Ingrese el codigo del equipo que desea modificar");
											codigo = teclado.nextInt();
											teclado.nextLine();
											
											for(int i=0; i<equipos.size(); i++){
												if(equipos.get(i).getCodigo() == codigo){
													codigoVal = true;
													System.out.println( "----------------------------------------------");
													System.out.println("Seleccione el dato que desea modificar.");
													System.out.println("1. Nombre del Equipo");
													System.out.println("2. Nombre del Capitan");
													System.out.println( "----------------------------------------------");
													opcion = teclado.nextInt();
													teclado.nextLine();
													
													switch(opcion){
														case 1:
															System.out.println("");
															System.out.println("Ingrese el nombre del equipo");
															System.out.println("");
															nombre = teclado.nextLine();
															equipo = new Equipo(equipos.get(i).getCodigo(), nombre, equipos.get(i).getNombreCapitan());
															equipos.set(i, equipo);
															modificado = true;
														break;

														case 2:
															System.out.println("");
															System.out.println("Ingrese el nombre del capitan del equipo");
															System.out.println("");
															nombreCapitan = teclado.nextLine();
															teclado.nextLine();
															equipo = new Equipo(equipos.get(i).getCodigo(), equipos.get(i).getNombreEquipo(), nombreCapitan);
															equipos.set(i, equipo);
															modificado = true;
														break;
														
														default:
														operador3 = 1;
														modificado = false;
														System.out.println( "----------------------------------------------");
														System.out.println("Debe seleccionar una opcion valida.");
														System.out.println( "----------------------------------------------");
														break;
													}
														if(modificado == true){
															codigoVal = true;
															System.out.println("Equipo modificado con exito");
															System.out.println(" ");
															System.out.println("¿Desea modificar otra equipo?");
															System.out.println("1. Si");
															System.out.println("2. No");
															System.out.println("");
															opcion = teclado.nextInt();
															
															if(opcion == 1){
																codigoVal = true;
																operador3 = 1;
															} else if(opcion ==2){
																codigoVal = true;
																operador3 = 2;
																operador2 = 1;
																operador1 = 1;
															} else {
																System.out.println("");
																System.out.println("No selecciono una opcion valida.");
																System.out.println("");
																operador3 = 2;
																operador2 = 1;
																operador1 = 1;
																codigoVal = true;
															}
															
														}	
												} else {
													codigoVal = false;
												}
												
											}
										if(codigoVal == false){
											operador3 = 1;
											System.out.println("");
											System.out.println("El codigo de equipo ingresado no existe.");
											System.out.println("");
										}
										
										} while(operador3==1);
									}
								 break;
								 
								 /* ----------------- Entra a eliminar un equipo ------------------------------*/
								 case 3:
									if(equipos.size() == 0){
										System.out.println("");
										System.out.println("No hay equipos registrados");
										System.out.println(" ");
										operador2 = 1;
									} else {
										System.out.println("Los equipos registrados son:");
										for(int j=0; j<equipos.size();j++){
											System.out.println("Codigo: " + equipos.get(j).getCodigo() + " Nombre de Equipo: " +equipos.get(j).getNombreEquipo() + " Nombre de Capitan: "+ equipos.get(j).getNombreCapitan());
										}
											
										do{
										System.out.println(" ");
										System.out.println("Ingrese el codigo del equipo que desea eliminar");
										codigo = teclado.nextInt();
										
											for(int i=0; i<equipos.size(); i++){
												if(equipos.get(i).getCodigo() == codigo){
													codigoVal = true; 
													System.out.println( "----------------------------------------------");
													System.out.println("¿Esta seguro de eliminar el equipo?");
													System.out.println("1. Si");
													System.out.println("2. No");
													System.out.println( "----------------------------------------------");
													opcion = teclado.nextInt();
													
													if(opcion == 1){
														equipos.remove(i);
														System.out.println("equipo eliminado con exito");
														System.out.println(" ");
													} else if(opcion !=2) {
														System.out.println("No selecciono una opcion valida");
													}
													
													System.out.println("");
													System.out.println("¿Desea eliminar otra equipo?");
													System.out.println("1. Si");
													System.out.println("2. No");
													System.out.println("");
													opcion = teclado.nextInt();
													teclado.nextLine();
													
													if(opcion == 1){
														if(equipos.size() == 0){
															operador3 = 2;
															operador2 = 1;
															System.out.println("");
															System.out.println("No hay equipos ingresados en el sistema");
															System.out.println(" ");
														} else {
															operador3 = 1;
														}
													} else if(opcion == 2) {
														operador3 = 2;
														operador2 = 1;
														operador1 = 1;
													} else {
														System.out.println("");
														System.out.println("No selecciono una opcion valida.");
														System.out.println("");
														operador3 = 2;
														operador2 = 1;
														operador1 = 1;
													}
														
												} else {
													codigoVal = false;
												}
											}	
										
											if(codigoVal == false){
												operador3 = 1;
												System.out.println("");
												System.out.println( "----------------------------------------------");
												System.out.println("El codigo de equipo ingresado no existe.");
												System.out.println( "----------------------------------------------");
												System.out.println("");
											}
										} while(operador3==1);
									}
								 break;
								 
								 /* ----------------- Regresamos al menu ------------------------------*/
								 case 4:
									fin = 0;
								 break;
								 
								 default:
									System.out.println("Opción no válida");
								 break;
							 }
						}
					break;
					
/* ----------------- Entra al menu para canchas ------------------------------*/
					
					case 2:
						fin = 1;
						while(fin == 1){
							 System.out.println( "1. Ingresar cancha ");
							 System.out.println( "2. Modificacion ");
							 System.out.println( "3. Eliminacion ");
							 System.out.println( "4. Regresar ");
							 
							 opcion = teclado.nextInt();
							 
							 switch(opcion){
								/* ----------------- Crea una cancha ------------------------------*/
								case 1:
									fin = 2;
									while(fin == 2){
										System.out.println("");
										System.out.println( "Ingrese el nombre de la cancha");
										nombreCancha = teclado.nextLine();
										nombreCancha = teclado.nextLine();
										
										modificado = true;
										while(modificado == true){
											System.out.println("");
											System.out.println( "Ingrese el estado de la cancha");
											System.out.println("1. Habilitado");
											System.out.println("2. Deshabilitado");
											System.out.println("");
											opcion = teclado.nextInt();
											
											if(opcion == 1){
												estado = "Habilitado";
												modificado = false;
											}else if(opcion == 2){
												estado = "Deshabilitado";
												modificado = false;
											}else{
												System.out.println("");
												System.out.println( "----------------------------------------------");																
												System.out.println("Opcion no valida");
												System.out.println( "----------------------------------------------");
												System.out.println("");
											}
										}
										
										
										codigo = (int)(Math.random()*1000+1);
										System.out.println("El codigo de la cancha " + nombreCancha + " es: " + codigo);
										cancha = new Cancha (codigo, nombreCancha, estado);
										
										canchas.add(cancha);
										System.out.println("Cancha guardado con exito");
										System.out.println(" ");
										System.out.println("¿Desea ingresar otra Cancha?");
										System.out.println("1. Si");
										System.out.println("2. No");
										System.out.println(" ");
										opcion = teclado.nextInt();
										switch(opcion){
											case 1:
											System.out.println("");
											System.out.println("Regresando ...");
											System.out.println("");

											break;
											case 2:
											fin = 1;
											break;
										}
									}
									

									
								 break;
								 
								 /* ----------------- Modifica los datos de una cancha ------------------------------*/
								 case 2:
									if(canchas.size() == 0){
										System.out.println(" ");
										System.out.println("No hay canchas ingresados en el sistema");
										System.out.println(" ");
										
									} else {
										do{
											System.out.println("Ingrese el codigo de la cancha que desea modificar");
											codigo = teclado.nextInt();
											teclado.nextLine();
											
											for(int i=0; i<canchas.size(); i++){
												if(canchas.get(i).getCodigo() == codigo){
													codigoVal = true;
													System.out.println("Seleccione el dato que desea modificar.");
													System.out.println("1. Nombre del Cancha");
													System.out.println("2. Estado de la cancha");
													opcion = teclado.nextInt();
													
													switch(opcion){
														case 1:
															System.out.println("Ingrese el nombre de la cancha");
															nombreCancha = teclado.nextLine();
															cancha = new Cancha(canchas.get(i).getCodigo(), nombreCancha, canchas.get(i).getEstado());
															canchas.set(i, cancha);
															modificado = true;
														break;

														case 2:
															System.out.println("");
															System.out.println("Ingrese el estado de la cancha");
															System.out.println("1. Habilitado");
															System.out.println("2. Deshabilitado");
															opcion = teclado.nextInt();
															
															if(opcion == 1){
																estado = "Habilitado";
																cancha = new Cancha(canchas.get(i).getCodigo(), canchas.get(i).getNombreCancha(), estado);
																canchas.set(i, cancha);
																modificado = true;
															}else if(opcion == 2){
																estado = "Deshabilitado";
																cancha = new Cancha(canchas.get(i).getCodigo(), canchas.get(i).getNombreCancha(), estado);
																canchas.set(i, cancha);
																modificado = true;
															}else{
																System.out.println("");
																System.out.println( "----------------------------------------------");
																System.out.println("Opcion no valida");
																System.out.println( "----------------------------------------------");																
																System.out.println("");
															}															
														break;
														
														default:
														operador3 = 1;
														modificado = false;
														System.out.println("Debe seleccionar una opcion valida.");
														break;
													}
														if(modificado == true){
															codigoVal = true;
															System.out.println("Cancha modificada con exito");
															System.out.println(" ");
															System.out.println("¿Desea modificar otra cancha?");
															System.out.println("1. Si");
															System.out.println("2. No");
															System.out.println( "");
															opcion = teclado.nextInt();
															
															if(opcion == 1){
																codigoVal = true;
																operador3 = 1;
															} else if(opcion ==2){
																codigoVal = true;
																operador3 = 2;
																operador2 = 1;
																operador1 = 1;
															} else {
																System.out.println( "");
																System.out.println("No selecciono una opcion valida.");
																System.out.println( "");
																operador3 = 2;
																operador2 = 1;
																operador1 = 1;
																codigoVal = true;
															}
															
														}	
												} else {
													codigoVal = false;
												}
												
											}
										if(codigoVal == false){
											operador3 = 1;
											System.out.println("El codigo de cancha ingresada no existe.");
										}
										
										} while(operador3==1);
									}
								 break;
								 
								 /* ----------------- Entra a eliminar canchas ------------------------------*/
								 case 3:
									if(canchas.size() == 0){
										System.out.println("No hay canchas registrados");
										System.out.println(" ");
										operador2 = 1;
									} else {
										System.out.println("Los canchas registrados son:");
										for(int j=0; j<canchas.size();j++){
											System.out.println( "");
											System.out.println("Codigo: " + canchas.get(j).getCodigo() + " Nombre de la Cancha: " +canchas.get(j).getNombreCancha() + " Nombre de Capitan: "+ canchas.get(j).getNombreCancha());
										}
											
										do{
										System.out.println(" ");
										System.out.println("Ingrese el codigo del cancha que desea eliminar");
										codigo = teclado.nextInt();
										
											for(int i=0; i<canchas.size(); i++){
												if(canchas.get(i).getCodigo() == codigo){
													codigoVal = true; 
													System.out.println("¿Esta seguro de eliminar el cancha?");
													System.out.println("1. Si");
													System.out.println("2. No");
													opcion = teclado.nextInt();
													
													if(opcion == 1){
														canchas.remove(i);
														System.out.println("cancha eliminado con exito");
														System.out.println(" ");
													} else if(opcion !=2) {
														System.out.println("No selecciono una opcion valida");
													}
													
													System.out.println("¿Desea eliminar otra cancha?");
													System.out.println("1. Si");
													System.out.println("2. No");
													opcion = teclado.nextInt();
													teclado.nextLine();
													
													if(opcion == 1){
														if(canchas.size() == 0){
															operador3 = 2;
															operador2 = 1;
															System.out.println("No hay canchas ingresados en el sistema");
															System.out.println(" ");
														} else {
															operador3 = 1;
														}
													} else if(opcion == 2) {
														operador3 = 2;
														operador2 = 1;
														operador1 = 1;
													} else {
														System.out.println("No selecciono una opcion valida.");
														operador3 = 2;
														operador2 = 1;
														operador1 = 1;
													}
														
												} else {
													codigoVal = false;
												}
											}	
										
											if(codigoVal == false){
												operador3 = 1;
												System.out.println( "");
												System.out.println( "----------------------------------------------");
												System.out.println("El codigo de cancha ingresado no existe.");
												System.out.println( "----------------------------------------------");
												System.out.println( "");
											}
										} while(operador3==1);
									}
								 break;
								 
								 /* ----------------- Regresamos al menu ------------------------------*/
								 case 4:
									fin = 0;
								 break;
								 
								 default:
								 	System.out.println( "");
									System.out.println( "----------------------------------------------");
									System.out.println("Opción no válida");
									System.out.println( "----------------------------------------------");
									System.out.println( "");
								 break;
							 }
						}
					break;
/* ----------------- Entra al menu para asignaciones ------------------------------*/
					
					case 3:
						fin = 1;
						while(fin == 1){
							if(canchas.size() == 0){
								System.out.println(" ");
								System.out.println("No hay canchas registradas");
								System.out.println(" ");
								operador2 = 1;
								fin = 0;
							}else if(equipos.size() == 0){
								System.out.println(" ");
								System.out.println("No hay equipos registrados");
								System.out.println(" ");
								operador2 = 1;
								fin = 0;
							}else if(equipos.size() < 2){
								System.out.println(" ");
								System.out.println("No hay suficientes equipos registrados");
								System.out.println(" ");
								operador2 = 1;
								fin = 0;
							}else if(equipos.size() < 1){
								System.out.println(" ");
								System.out.println("No hay suficientes canchas registradas o habilitadas");
								System.out.println(" ");
								operador2 = 1;
								fin = 0;
							}else{
								if(asignaciones.size() > 0){
									System.out.println( "Las asignaciones reservadas son las siguientes:");
									for(int j=0; j<asignaciones.size();j++){//  Trea las asignaciones existentes
										System.out.println( "----------------------------------------------");
										System.out.println( "Asignacion #" + (j+1) +
															"Codigo: " + asignaciones.get(j).getCodigo() + 
															" Nombre del equipo 1: " + asignaciones.get(j).getEquipoNombre1() +
															" Nombre del equipo 2: "+ asignaciones.get(j).getEquipoNombre2() + 
															" Nombre de la cancha: "+ asignaciones.get(j).getCanchaNombre() + 
															" Fecha asignada: "+ asignaciones.get(j).getDateTime());
										System.out.println( "----------------------------------------------");
									}									
								}
								
								System.out.println("");
								System.out.println("Los equipos registrados son:");
								for(int j=0; j<equipos.size();j++){ //Trae los equipos existentes
									System.out.println("Codigo: " + equipos.get(j).getCodigo() + " Nombre de Equipo: " +equipos.get(j).getNombreEquipo() + " Nombre de Capitan: "+ equipos.get(j).getNombreCapitan());
								}
								System.out.println("");
								System.out.println("Los canchas registrados son:");
								for(int j=0; j<canchas.size();j++){//  Trea las canchas existentes
									System.out.println("Codigo: " + canchas.get(j).getCodigo() + " Nombre de la Cancha: " +canchas.get(j).getNombreCancha() + " Nombre de Capitan: "+ canchas.get(j).getEstado());
								}
								System.out.println( "----------------------------------------------");
								System.out.println( "1. Ingresar asignacion ");
								System.out.println( "2. Regresar ");
								System.out.println( "----------------------------------------------");
								 
								 opcion = teclado.nextInt();
								 
								 switch(opcion){
									/* ----------------- Crea una asignacion ------------------------------*/
									case 1:
										fin = 2;
										while(fin == 2){
											// Se ingresa la cancha	
											condicion = false;
											while(condicion == false){				
												System.out.println(" ");
												System.out.println( "----------------------------------------------");
												System.out.println("Ingrese el codigo de la cancha");
												System.out.println( "----------------------------------------------");
												codigo = teclado.nextInt();
												
												for(int i=0; i<canchas.size(); i++){
													if(canchas.get(i).getCodigo() == codigo){
														if(canchas.get(i).getEstado() == "Deshabilitado"){
															System.out.println("");															
															System.out.println("Esta cancha esta deshabilitada, elija otra");
															System.out.println("");
															
														}else{
															codigoCancha = canchas.get(i).getCodigo();
															nombreCancha = canchas.get(i).getNombreCancha();
															fin = 2;
															condicion = true;
															canchaHabilitada = true;
															System.out.println("");															
															System.out.println("Cancha asignada con exito");
															System.out.println("");
														}
													}else if(canchaHabilitada == false){
														if(i == canchas.size()){
															System.out.println("");
															System.out.println("Codigo de cancha no utilizable");
															System.out.println("");
														}
													}
												}
											}
											
											// Se ingresa el primer equipo
											condicion = false;
											while(condicion == false){
												System.out.println(" ");
												System.out.println( "----------------------------------------------");
												System.out.println("Ingrese el codigo del equipo 1");
												System.out.println( "----------------------------------------------");
												codigo = teclado.nextInt();
												
												for(int i=0; i<equipos.size(); i++){
													if(equipos.get(i).getCodigo() == codigo){
														codigoEquipo1 = equipos.get(i).getCodigo();
														nombreEquipo1 = equipos.get(i).getNombreEquipo();
														condicion = true;
														codigo = 0;
														System.out.println("Equipo 1 asignado");
													}else{
														System.out.println("Recorriendo equipos");
														if(i == equipos.size()){
															System.out.println("Equipo no utilizable");
														}
													}
												}
											}
											
											// Se ingresa el segundo equipo
											condicion = false;											
											while(condicion == false){
												System.out.println(" ");
												System.out.println( "----------------------------------------------");
												System.out.println("Ingrese el codigo del equipo 2");
												System.out.println( "----------------------------------------------");
												codigo = teclado.nextInt();
												
												for(int i=0; i<equipos.size(); i++){
													if(equipos.get(i).getCodigo() == codigo){
														if(equipos.get(i).getCodigo() == codigoEquipo1){
															System.out.println(" ");
															System.out.println("Este equipo ya fue asignado, elija otra");
															System.out.println(" ");
														}else{
															System.out.println("Equipo 2 asignado");
															codigoEquipo2 = equipos.get(i).getCodigo();
															nombreEquipo2 = equipos.get(i).getNombreEquipo();
															condicion = true;
															codigo = 0;
														}
													}else{
														System.out.println("Recorriendo equipos");
														if(equipos.get(i).getCodigo() < codigoEquipo1){
															System.out.println("Equipo no utilizable");
														}
													}
												}
											}
											
												
											// Se ingresa la fecha
											condicion = false;
											while(condicion == false){
												try{
												    System.out.println("Ingrese la fecha que desee asignar");
													SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
													fechaComoTexto = teclado.nextLine();
													Date fecha = formatDate.parse(fechaComoTexto);
													dateTime = fecha;
													System.out.println("");
													formatDate = new SimpleDateFormat("EEE, d MMM yyyy");
													System.out.println("Fecha asignada para el " + formatDate.format(fecha) +" con exito !");
													System.out.println("");				
													condicion = true;
												}catch (ParseException e) { 
													System.out.println("");
													System.out.println("La fecha se ingresa con el siguiente formato: dd/MM/yyyy");
													System.out.println("");
												}
											}
											
											// Se guardan los datos
											codigoAsignacion = (int)(Math.random()*1000+1);
										    SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
											formatDate = new SimpleDateFormat("EEE, d MMM yyyy");
											asignacion = new Asignacion (codigoAsignacion, codigoEquipo1, codigoEquipo2, codigoCancha, nombreEquipo1, nombreEquipo2, nombreCancha, dateTime);
											asignaciones.add(asignacion);
											System.out.println("");
											System.out.println("La asignacion tiene el codigo " + codigoAsignacion +" para el equipo" + nombreEquipo1 + " vs el equipo" + nombreEquipo2+ " la cual fue asignada para la fecha: " + formatDate.format(dateTime));
											System.out.println("");

											fin = 3;
											while(fin == 3){
												System.out.println( "----------------------------------------------");
												System.out.println("¿Desea asignar otra fecha?");
												System.out.println("1. Si");
												System.out.println("2. No");
												System.out.println( "----------------------------------------------");
												opcion = teclado.nextInt();
												
												if(opcion == 1){
													fin = 2;
													System.out.println("");
													System.out.println("Regresando ...");
													System.out.println("");
												} else if(opcion == 2){
													fin = 1;
												} else {
													System.out.println("No selecciono una opcion valida.");
												}	
											}
										}										
									 break;
									 /* ----------------- Regresamos al menu ------------------------------*/									 
									 case 2:
										fin = 0;
									 break;
									 
									 default:
										System.out.println("Opción no válida");
									 break;
								}
							}
							
						}	
					break;
/* ----------------- Entra al menu para generar reportes ------------------------------*/
					
					case 4:
						fin = 1;
						while(fin == 1){
							System.out.println( "----------------------------------------------");
							 System.out.println( "1. Ingrese la fecha ");
							 System.out.println( "2. Regresar ");
							 System.out.println( "----------------------------------------------");
							 opcion = teclado.nextInt();
							 
							 switch(opcion){
								 
								 /* ----------------- Entra al menu para ingresar fecha ------------------------------*/
								 case 1:
								 	if(asignaciones.size() > 0){
										try{
											SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
											System.out.println( "Ingrese fecha para generar reporte");
											System.out.println("");														
											fechaComoTexto = teclado.nextLine();
											fechaComoTexto = teclado.nextLine();
											Date fecha = formatDate.parse(fechaComoTexto);
											dateTime = fecha;
											System.out.println("");
											formatDate = new SimpleDateFormat("EEE, d MMM yyyy");
											for(int j=0; j<asignaciones.size();j++){//  Trea las asignaciones existentes
												if(asignaciones.get(j).getDateTime().compareTo(dateTime) == 0){
													System.out.println( "");
													System.out.println( "----------------------------------------------");
													System.out.println( "Asignacion #" + (j + 1)  +
																	"Codigo: " + asignaciones.get(j).getCodigo() + 
																	" Nombre del equipo 1: " + asignaciones.get(j).getEquipoNombre1() +
																	" Nombre del equipo 2: "+ asignaciones.get(j).getEquipoNombre2() + 
																	" Nombre de la cancha: "+ asignaciones.get(j).getCanchaNombre() + 
																	" Fecha asignada: "+ asignaciones.get(j).getDateTime());
													System.out.println( "----------------------------------------------");
													System.out.println( "");
												}else{
													System.out.println( "Analizando ... sin encontrar ...");												
												}
											}
										}catch (ParseException e) { 
											System.out.println("");
											System.out.println("La fecha se ingresa con el siguiente formato: dd/MM/yyyy");
											System.out.println("");
										}
										
																													
									}else{
										System.out.println( "");
										System.out.println( "----------------------------------------------");
										System.out.println( "No hay asignaciones para buscar por fechas");
										System.out.println( "----------------------------------------------");
										System.out.println( "");
									}	
								 break;
								 
								 /* ----------------- Regresar al menu ------------------------------*/

								 case 2:
									 fin = 0;
								 break;

								 default:
									System.out.println("Opción no válida");
								 break;
							}
						}
					break;
						
/* ----------------- Sale de la aplicación ------------------------------*/
						
					case 5:
						 System.exit(0);
					break;
					
					default:
						System.out.println("");
						System.out.println("------------------------------*/");
						System.out.println("Opcion no valida");
						System.out.println("------------------------------*/");
						System.out.println("");
					break;
				}
			}

			
			
		}
}
		
      // }


	
	
