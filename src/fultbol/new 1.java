
					cliente= new Cliente(codigo,nom,ape,dir,tel,codigo+nombre[0].toLowerCase()+"@kinal.org");
					usuarios.add(cliente);
					System.out.println("Su correo de sistema es: " + codigo+nombre[0].toLowerCase()+"@kinal.org");
					System.out.println("Cuenta creada con exito.");
					menuPrincipal();
					break; 
				   
				   
				   case 2:	   
					do{
						System.out.println("Ingrese su correo generado por el sistema");
					correo = teclado.nextLine();
					
					if (correo.equals("admin@kinal.org.gt")){
							do{
							System.out.println("1. Productos");
							System.out.println("2. Clientes");
							System.out.println("3. Salir");
							opcion = teclado.nextInt();
							teclado.nextLine();
							
							switch(opcion){
								case 1:
									do{
									System.out.println("1. Ingresar");
									System.out.println("2. Modificar");
									System.out.println("3. Eliminar");
									System.out.println("4. Regresar");
									opcion = teclado.nextInt();
									teclado.nextLine();
									
									switch(opcion){
										case 1:
											do{
											System.out.println("Ingrese el nombre del producto");

											nombreProd = teclado.nextLine(); 

											System.out.println("Ingrese la cantidad del producto");

											cantidad = teclado.nextInt();
											teclado.nextLine();

											System.out.println("Ingrese el precio del producto");
											precioProd = teclado.nextDouble();
											teclado.nextLine();
											
											int codigoP = (int)(Math.random()*1000+1); 
											
											prod = new Producto(codigoP,nombreProd,cantidad, precioProd);
											productos.add(prod);
											System.out.println("Producto guardado con exito");
											System.out.println(" ");
											System.out.println("¿Desea ingresar otro producto?");
											System.out.println("1. Si");
											System.out.println("2. No");
											opcion = teclado.nextInt();
											teclado.nextLine();
											
											if(opcion == 1){
												ingProd = 1;
											} else {
												ingProd = 2;
												opMA = 1;
												opA = 1;
											}
											} while(ingProd==1);
										break;
									
										case 2:
											if(productos.size() == 0){
												System.out.println("No hay productos ingresados en el sistema");
												System.out.println(" ");
												opMA = 1;
											} else {
												System.out.println("Los productos ingresados en el sistema son:");
												for(int j=0; j<productos.size();j++){
													System.out.println("Codigo: " + productos.get(j).getCodigo() + " Nombre: " +productos.get(j).getNombre() + " Cantidad: "+ String.valueOf(productos.get(j).getCantidad())+ " Precio: "+ String.valueOf(productos.get(j).getPrecio()));
												}
													
												do{
												System.out.println("Ingrese el codigo del producto que desea modificar");
												codPro = teclado.nextInt();
												teclado.nextLine();
												
												for(int k=0; k<productos.size(); k++){
													if(productos.get(k).getCodigo() == codPro){
														codigoVal = true;
														System.out.println("Seleccione el dato que desea modificar.");
														System.out.println("1. Nombre");
														System.out.println("2. Cantidad");
														System.out.println("3. Precio");
														opcion = teclado.nextInt();
														teclado.nextLine();
														
														switch(opcion){
															case 1:
																System.out.println("Ingrese el nombre del producto");
																nombreProd = teclado.nextLine();
																prod = new Producto(productos.get(k).getCodigo(), nombreProd, productos.get(k).getCantidad(), productos.get(k).getPrecio());
																productos.set(k, prod);
																modificado = true;
															break;

															case 2:
																System.out.println("Ingrese la cantidad del producto");
																cantidad = teclado.nextInt();
																teclado.nextLine();
																prod = new Producto(productos.get(k).getCodigo(), productos.get(k).getNombre(), cantidad, productos.get(k).getPrecio());
																productos.set(k, prod);
																modificado = true;
															break;
															
															case 3:
																System.out.println("Ingrese el precio del producto");
																precioProd = teclado.nextDouble();
																teclado.nextLine();
																prod = new Producto(productos.get(k).getCodigo(), productos.get(k).getNombre(), productos.get(k).getCantidad(), precioProd);
																productos.set(k, prod);
																modificado = true;
																
															break;
															
															default:
															ingProd = 1;
															modificado = false;
															System.out.println("Debe seleccionar una opcion valida.");
															break;
														}
															if(modificado == true){
																codigoVal = true;
																System.out.println("Producto modificado con exito");
																System.out.println(" ");
																System.out.println("¿Desea modificar otro producto?");
																System.out.println("1. Si");
																System.out.println("2. No");
																opcion = teclado.nextInt();
																teclado.nextLine();
																
																if(opcion == 1){
																	codigoVal = true;
																	ingProd = 1;
																} else if(opcion ==2){
																	codigoVal = true;
																	ingProd = 2;
																	opMA = 1;
																	opA = 1;
																} else {
																	System.out.println("No selecciono una opcion valida.");
																	ingProd = 2;
																	opMA = 1;
																	opA = 1;
																	codigoVal = true;
																}
																
															}	
													} else {
														codigoVal = false;
													}
												}

												if(codigoVal == false){
													ingProd = 1;
													System.out.println("El codigo de producto ingresado no existe.");
												}
												
												} while(ingProd==1);
											}
										break;
									
										case 3:
											if(productos.size() == 0){
												System.out.println("No hay productos ingresados en el sistema");
												System.out.println(" ");
												opMA = 1;
											} else {
												System.out.println("Los productos ingresados en el sistema son:");
												for(int j=0; j<productos.size();j++){
													System.out.println("Codigo: " + productos.get(j).getCodigo() + " Nombre: " +productos.get(j).getNombre() + " Cantidad: "+ String.valueOf(productos.get(j).getCantidad())+ " Precio: "+ String.valueOf(productos.get(j).getPrecio()));
												}
													
												do{
												System.out.println(" ");
												System.out.println("Ingrese el codigo del producto que desea eliminar");
												codPro = teclado.nextInt();
												teclado.nextLine();
												
													for(int k=0; k<productos.size(); k++){
														if(productos.get(k).getCodigo() == codPro){
															codigoVal = true; 
															System.out.println("¿Esta seguro de eliminar el producto?");
															System.out.println("1. Si");
															System.out.println("2. No");
															opcion = teclado.nextInt();
															teclado.nextLine();
															
															if(opcion == 1){
																productos.remove(k);
																System.out.println("Producto eliminado con exito");
																System.out.println(" ");
															} else if(opcion !=2) {
																System.out.println("No selecciono una opcion valida");
															}
															
															System.out.println("¿Desea eliminar otro producto?");
															System.out.println("1. Si");
															System.out.println("2. No");
															opcion = teclado.nextInt();
															teclado.nextLine();
															
															if(opcion == 1){
																if(productos.size() == 0){
																	ingProd = 2;
																	opMA = 1;
																	System.out.println("No hay productos ingresados en el sistema");
																	System.out.println(" ");
																} else {
																	ingProd = 1;
																}
															} else if(opcion == 2) {
																ingProd = 2;
																opMA = 1;
																opA = 1;
															} else {
																System.out.println("No selecciono una opcion valida.");
																ingProd = 2;
																opMA = 1;
																opA = 1;
															}
																
														} else {
															codigoVal = false;
														}
													}	
												
													if(codigoVal == false){
														ingProd = 1;
														System.out.println("El codigo de producto ingresado no existe.");
													}
												} while(ingProd==1);
											}
										break;
									
										case 4:
											opMA = 2;
											opA = 1;
										break;
										
										default:
											opMA = 1;
											System.out.println("Debe seleccionar una opcion valida.");
										break;
									}
									} while(opMA == 1);
								break;
								
								case 2:
								do{
									System.out.println("1. Ingresar");
									System.out.println("2. Modificar");
									System.out.println("3. Eliminar");
									System.out.println("4. Regresar");
									opcion = teclado.nextInt();
									teclado.nextLine();
									
									switch(opcion){
										case 1:
											do{
												codigo = (int)(Math.random()*1000+1); 
				 
												System.out.println("Ingrese su nombre");

												nom = teclado.nextLine();
												nombre = nom.split(" "); 

												System.out.println("Ingrese su apellido");

												ape = teclado.nextLine(); 

												System.out.println("Ingrese su direccion ");

												dir = teclado.nextLine();

												System.out.println("Ingrese su telefono");

												tel = teclado.nextLine();

										   
												cliente = new Cliente(codigo,nom,ape,dir,tel,codigo+nombre[0].toLowerCase()+"@kinal.org");
												usuarios.add(cliente);
												System.out.println("Su correo de sistema es: " + codigo+nombre[0].toLowerCase()+"@kinal.org");
												System.out.println("Cliente guardado con exito");
												System.out.println(" ");
												System.out.println("¿Desea ingresar otro cliente?");
												System.out.println("1. Si");
												System.out.println("2. No");
												opcion = teclado.nextInt();
												teclado.nextLine();
												
												if(opcion == 1){
													ingProd = 1;
												} else {
													ingProd = 2;
													opMA = 1;
													opA = 1;
												}
											} while(ingProd==1);
										break;
									
										case 2:
											if(usuarios.size() == 0){
												System.out.println("No hay clientes ingresados en el sistema");
												System.out.println(" ");
												opMA = 1;
											} else {
												System.out.println("Los clientes ingresados en el sistema son:");
												for(int j=0; j<usuarios.size();j++){
													System.out.println("Codigo: " + usuarios.get(j).getCodigo() + " Nombre: " +usuarios.get(j).getNombre() + " Apellido: "+ usuarios.get(j).getApellido() + " Direccion: "+ usuarios.get(j).getDireccion()+ " Telefono: "+ usuarios.get(j).getTelefono()+ " Correo del sistema: " + usuarios.get(j).getCorreo());
												}
													
												do{
												System.out.println("Ingrese el codigo del cliente que desea modificar");
												codPro = teclado.nextInt();
												teclado.nextLine();
												
												for(int k=0; k<usuarios.size(); k++){
													if(usuarios.get(k).getCodigo() == codPro){
														codigoVal = true;
														System.out.println("Seleccione el dato que desea modificar.");
														System.out.println("1. Nombre");
														System.out.println("2. Apellido");
														System.out.println("3. Direccion");
														System.out.println("4. Telefono");
														opcion = teclado.nextInt();
														teclado.nextLine();
														
														switch(opcion){
															case 1:
																System.out.println("Ingrese el nombre del cliente");
																nom = teclado.nextLine();
																nombre = nom.split(" "); 
																System.out.println("Su nuevo correo de sistema es: " + usuarios.get(k).getCodigo()+nombre[0].toLowerCase()+"@kinal.org");
																cliente = new Cliente(usuarios.get(k).getCodigo(),nom,usuarios.get(k).getApellido(),usuarios.get(k).getDireccion(),usuarios.get(k).telefono,usuarios.get(k).getCodigo()+nombre[0].toLowerCase()+"@kinal.org");
																usuarios.set(k, cliente);
																modificado = true;
															break;

															case 2:
																System.out.println("Ingrese el apellido del cliente");
																ape = teclado.nextLine(); 
																cliente = new Cliente(usuarios.get(k).getCodigo(),usuarios.get(k).getNombre(),ape,usuarios.get(k).getDireccion(),usuarios.get(k).telefono,usuarios.get(k).getCorreo());
																usuarios.set(k, cliente);
																modificado = true;
															break;
															
															case 3:
																System.out.println("Ingrese el direccion del cliente");
																dir = teclado.nextLine(); 
																cliente = new Cliente(usuarios.get(k).getCodigo(),usuarios.get(k).getNombre(),usuarios.get(k).getApellido(),dir,usuarios.get(k).getTelefono(),usuarios.get(k).getCorreo());
																usuarios.set(k, cliente);
																modificado = true;
															break;
															
															case 4:
																System.out.println("Ingrese el telefono del cliente");
																tel = teclado.nextLine(); 
																cliente = new Cliente(usuarios.get(k).getCodigo(),usuarios.get(k).getNombre(),usuarios.get(k).getApellido(),usuarios.get(k).getDireccion(),tel,usuarios.get(k).getCorreo());
																usuarios.set(k, cliente);
																modificado = true;
															break;
															
															default:
															ingProd = 1;
															modificado = false;
															System.out.println("Debe seleccionar una opcion valida.");
															break;
														}
															if(modificado == true){
																System.out.println("Producto modificado con exito");
																System.out.println(" ");
																System.out.println("¿Desea modificar otro producto?");
																System.out.println("1. Si");
																System.out.println("2. No");
																opcion = teclado.nextInt();
																teclado.nextLine();
																
																if(opcion == 1){
																	codigoVal = true;
																	ingProd = 1;
																} else if(opcion ==2){
																	codigoVal = true;
																	ingProd = 2;
																	opMA = 1;
																	opA = 1;
																} else {
																	codigoVal = true;
																	System.out.println("No selecciono una opcion valida.");
																	ingProd = 2;
																	opMA = 1;
																	opA = 1;
																}
																
															}	
													} else {
														codigoVal = false;
													}
												}

												if(codigoVal == false){
													ingProd = 1;
													System.out.println("El codigo de producto ingresado no existe.");
												}
												
												} while(ingProd==1);
											}
										break;
									
										case 3:
											if(usuarios.size() == 0){
												System.out.println("No hay clientes ingresados en el sistema");
												System.out.println(" ");
												opMA = 1;
											} else {
												System.out.println("Los clientes ingresados en el sistema son:");
												for(int j=0; j<usuarios.size();j++){
													System.out.println("Codigo: " + usuarios.get(j).getCodigo() + " Nombre: " +usuarios.get(j).getNombre() + " Apellido: "+ usuarios.get(j).getApellido() + " Direccion: "+ usuarios.get(j).getDireccion()+ " Telefono: "+ usuarios.get(j).getTelefono()+ " Correo del sistema: " + usuarios.get(j).getCorreo());
												}
													
												do{
												System.out.println(" ");
												System.out.println("Ingrese el codigo del producto que desea eliminar");
												codPro = teclado.nextInt();
												teclado.nextLine();
												
													for(int k=0; k<usuarios.size(); k++){
														if(usuarios.get(k).getCodigo() == codPro){
															codigoVal = true; 
															System.out.println("¿Esta seguro de eliminar el cliente?");
															System.out.println("1. Si");
															System.out.println("2. No");
															opcion = teclado.nextInt();
															teclado.nextLine();
															
															if(opcion == 1){
																usuarios.remove(k);
																System.out.println("Cliente eliminado con exito");
																System.out.println(" ");
															} else if(opcion !=2) {
																System.out.println("No selecciono una opcion valida");
															}
															
															System.out.println("¿Desea eliminar otro cliente?");
															System.out.println("1. Si");
															System.out.println("2. No");
															opcion = teclado.nextInt();
															teclado.nextLine();
															
															if(opcion == 1){
																if(usuarios.size() == 0){
																	ingProd = 2;
																	opMA = 1;
																	System.out.println("No hay clientes ingresados en el sistema");
																	System.out.println(" ");
																} else {
																	ingProd = 1;
																}
															} else if(opcion == 2) {
																ingProd = 2;
																opMA = 1;
																opA = 1;
															} else {
																System.out.println("No selecciono una opcion valida.");
																ingProd = 2;
																opMA = 1;
																opA = 1;
															}
																
														} else {
															codigoVal = false;
														}
													}	
												
													if(codigoVal == false){
														ingProd = 1;
														System.out.println("El codigo de cliente ingresado no existe.");
													}
												} while(ingProd==1);
											}
										break;
									
										case 4:
											opMA = 2;
											opA = 1;
										break;
										
										default:
											opMA = 1;
											System.out.println("Debe seleccionar una opcion valida.");
										break;
									}
									} while(opMA == 1);
								break;
								
								case 3:
									System.out.println("Que tenga un buen dia.");
									opA = 2;
									p = 2;
									menuPrincipal();
								break;
								
								default:
									System.out.println("Debe seleccionar una opcion valida.");
								break;
							}
							} while (opA == 1);
							p = 2;
					} else {
						p = 1;
							for(int i=0; i<usuarios.size();i++){
							
								if(correo.equals(usuarios.get(i).getCorreo())){
									codigoVal = true;
									do{
									System.out.println(" ");
									System.out.println("1. Ver catalogo");
									System.out.println("2. Salir sesion");
									opcion = teclado.nextInt();
									teclado.nextLine();
									
									switch(opcion){
										case 1:
											if(productos.size()==0){
												System.out.println("Disculpe pero no hay productos ingresados en el sistema");
												opMU = 1;
												
											} else {
												do{
													codigoProdVal = true;
													for(int j=0; j<productos.size();j++){
														System.out.println(" ");
														System.out.println("Los productos disponibles son:");
														System.out.println("Codigo: " + productos.get(j).getCodigo() + " Nombre: " +productos.get(j).getNombre() + " Cantidad: "+ String.valueOf(productos.get(j).getCantidad())+ " Precio: "+ String.valueOf(productos.get(j).getPrecio()));
													}
													System.out.println("");
												
												
													System.out.println("Ingrese el codigo del producto que desea adquirir:");
													codPro = teclado.nextInt();
													System.out.println("Ingrese la cantidad que desea adquirir:");
													cantidad = teclado.nextInt();
													teclado.nextLine();
													for(int k=0; k<productos.size(); k++){
														if((productos.get(k).getCodigo() == codPro) && (productos.get(k).getCantidad() >= cantidad)){
															codigoProdVal = true;
															Producto producto = new Producto(productos.get(k).getCodigo(), productos.get(k).getNombre(), cantidad, productos.get(k).getPrecio());
															productosFac.add(producto);
															cantidad = productos.get(k).getCantidad() - cantidad;
															if(cantidad >= 0){
																prod = new Producto(productos.get(k).getCodigo(), productos.get(k).getNombre(), cantidad, productos.get(k).getPrecio());
																productos.set(k, prod);
															}
														} else {
															codigoProdVal = false;
														}
													}

													if(codigoProdVal == false){
														System.out.println(" ");
														System.out.println("El producto no se guardo ingreso un codigo inexistente o la cantidad indicada excede de la disponible");
														System.out.println(" ");
													}
													
													System.out.println("¿Desea ingresar otro producto?");
													System.out.println("1. Si");
													System.out.println("2. No");
													opcion = teclado.nextInt();
													teclado.nextLine();
													
													if(opcion==1){
														addProd = 1;
														codigoVal = false;
													} else if(opcion==2){
														addProd = 2;
														opMU = 1;
														codigoVal = false;
														if(productosFac.size() > 0){
															System.out.println("");
															System.out.println("-------------- Factura --------------");
															System.out.println("Cliente: " + usuarios.get(i).getNombre() + " " + usuarios.get(i).getApellido());
															System.out.println("Telefono: " + usuarios.get(i).getTelefono());
															System.out.println("");
															System.out.println("Productos adquiridos");
															for(int j=0; j<productosFac.size();j++){
																subTotal = productosFac.get(j).getCantidad() * productosFac.get(j).getPrecio();
																System.out.println("Nombre: " +productosFac.get(j).getNombre() + " Cantidad: "+ String.valueOf(productosFac.get(j).getCantidad())+ " Precio: "+ String.valueOf(productosFac.get(j).getPrecio()) + " SubTotal: " + String.valueOf(subTotal));
																total = total + subTotal;
															}
															System.out.println(" ");
															System.out.println("Total a pagar: " + String.valueOf(total));
															System.out.println("Agradecemos su compra en nuestra tienda. Esperemos que regrese.");
															System.out.println(" ");
															productosFac = new ArrayList<Producto>();
															System.out.println(" ");
														}
														
														subTotal = 0;
														total =0;
														
													} else {
														System.out.println("Ingrese una opcion valida");
													}
												} while(addProd == 1);
											}	
											p = 2;
										break;
										
										case 2:
											System.out.println("Que tenga un buen dia.");
											opMU = 2;
											p =2;
											menuPrincipal();
										break;
										
										default:
											System.out.println("Debe seleccionar una opcion valida.");
										break;
									}
									p =2;
									} while(opMU == 1);
								} else {
									codigoVal = false;
								}
								
							}
							
							if(codigoVal == false){
								p = 1;
								System.out.println("correo no valido");
							}
						}
					} while(p == 1);
				   break;
				   
				   
				   case 3:
						System.out.println("Que tenga un buen dia.");
				   break;
				   default:	
						System.out.println("Debe seleccionar una opcion valida.");
						menuPrincipal();
				   break;
				   
				   
				   case 1:
									System.out.println( "Ingrese el nombre del equipo");
									texto = teclado.nextLine();
									System.out.println( "Ingrese el nombre del Capitan");
				
								 break;
								 
								 /* ----------------- Entra al menu de modificar cancha ------------------------------*/
								 case 2:
								 
								 break;
								 
								 /* ----------------- Entra al menu de eliminacion de cancha ------------------------------*/
								 case 3:
								 
								 break;
								 
								 /* ----------------- regresamos al menu ------------------------------*/
								 case 4:
									fin = 0;
								 break;
								 
								 default:
									System.out.println("Opción no válida");
								 break;