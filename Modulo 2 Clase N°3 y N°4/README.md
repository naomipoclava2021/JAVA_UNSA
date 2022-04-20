# Trabajo Practico N° 2 Modulo 2 - Clase 3 y 4
Metodos de calses y metodos especiales.

## Ejercicio N ° 1
Vamos a realizar una clase llamada Raices, donde representamos los valores de una ecuciacion de 2° grado. Tendremos los 3 coeficientes como atributos, llamemosles a,b y c. Hay que isertara estos 3 valores para construir el objeto.

Las operaciones que se podran hacer son las siguientes:

. obtenerRaices(): imprime las 2 posibles soluciones

. obtenerRaiz(): imprime una unica raiz, que sera cuando solo tenga una solucion posible.

. getDiscriminante(): devuelve el valor del discriminate (double), el discriminante tiene la siguiente formula, (b^2)-4ac

. tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.

. tieneRaiz(): devuelve un booleano si tiene una unica solucion, para que esto ocurra, el discriminante debe ser igual que 0.

. calcular(): mostrara por consola las posibles soluciones que tiene nuestra ecucacion, en caso de no existir solucion, mostrarlo tambien.

Formula ecuacion 2° grado: //completar

Solo varia el signo delante de -b

## Ejercicio N ° 2
Crear una clase llamada Cuenta que tendra los atributos: titular (que es una persona) y cantidad (puede tener decimales). El titular sera obligatorio y la cantidad es opcional. Construye los siguientes metodos para la clase:

. Un contructor;

. mostrar(); Muestra los datos de la cuenta;

. ingresar(cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, nos se hara nada;

.  retirar(cantidad): se retira una cantidad a la cuenta. La cuenta puede estar en numero rojos.

## Ejercicio N ° 3
Usando la clase persona del ejercicio 1 crear una clase empleado que debera tener el atributo sueldo basico. Implementar los metodos:

. calculoSueldo(): este se calcula como la cantidad de horas trabajadas por el sueldo basico.

. verEmpleado(): visualizar los datos del empleado.

## Ejercicio N ° 4
Crear una clase Productos con atributos: Nombre, precios, vencimientos, con 2 tipos de productos perecederos y no perecederos.

. Crear sus constructores getters y setters.

. Crear una funcion llamada calcular: en productos simplemente seria calcular precio por cantidad, en perecederos el precio se reducira segun los dias a caducar, si le queda 1 dia se reducira 4 veces el precio, si le queda 2 dias se reducira el precio 3 veces, si le quedan 3 dias se reducira la mitad el precio.

Crear una clase ejecutable y crear un array de productos y muestra el precio total de vender 5 productos de cada uno.

## Ejercicio N ° 5
Crear una agenda telefonica de contactos:

Cada contacto tiene nombre y numero de telefono, un contacto es igual a otro cuando sus nombres son igules. Una agenda de contactos esta formada por una cantidad n de contactos. Podemos definir nosotros la cantidad o por defecto seran 10.

Los metodos de la agenda seran los siguientes:

. añadirContacto(Contacto c): añade un contacto a la agenda, si no se pueden meter mas a la agenda se indicara por pantalla. No se pueden duplicar contactos existentes. -existeContanto(Contacto c): indica si el contacto pasado existe o no.

. listarContactos(): lista todos los contactos.

. buscaContacto(String nombre): busca el contacto por el nombre y mustra su telefono.

. eliminarContacto(String nombre): elimina el contacto y muestra un mensaje de contacto eliminado.

. agendaLlena(): indica si la agenda esta llena

. contactosLibles(): indica cuantos contactos libres quedan
Crear un menu con opciones por consola par probar todas estas funcionalidades.

## Ejercicio N ° 6

Crear una Clase Taxi que contenga los siguientes atributos: id, numero Taxi, tipoDeTarifa(1 o 2), precio de bajada de bandera( 58 0 70). Crear  un objeto taxi utilizando un constructor a su eleccion. Dentro de la clase crear los siguientes metodos:

. crear un metodo cambiarTarifa que permita cambiar el tipo de tarifa del taxi, si vale 1 debe cambiar a 2 y el precio debe ser 70 y si el tipo de tarifa es 2 debe cambiar a 1 y el precio a 48, cuando realice el cambio mostrar un mensaje "cambio de tarifa exitoso".

. Crear un metodo cacularTotalAPagar que permita ingresar la cantidad de metros recorridos, si el tipo de tarifa es 1 se debe cobrar el precio de bajada de bandera apenas sube la persona y por cada metro se le va a cobrar 5 mas, si el tipo de tarifa es 2 se debe cobrar el precio de bajada de bandera apenas sube la persona y por cada metor se le cobra 8 mas. El metodo debe devolver el monto que se le debe pagar al taxi.

Los  metodos deben ser probados en el objeto creado ingresando valores a su eleccion y mostrando los resultados.

## Ejercicio N ° 7
Crear una Clase Producto que
