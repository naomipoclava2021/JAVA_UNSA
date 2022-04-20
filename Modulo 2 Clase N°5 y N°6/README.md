# Trabajo Practico N°2 Modulo 2 - Clase 5 y 6
Herencias. Polimosfismo. Objetos dentros de objetos. Encapsular atributos y metodos.

## Ejercicio N° 1
Usando la clase "Personas" (practico N°2 - Clase 1 ejercicio nro 1). Crear una clase "Alumno" que herede los atributos y metodos de 
"PERSONAS" y agregar los siguientes: 
. Atributos notas: array de notas (matematica, lengua, historia).

. Metodos: 

    . Constructor(se deben pasar los parametros del alumno)
    . generar_notas(): se generan de forma aleatoria
    . mostrar_notas(): muestra las notas del alumno

## Ejercicio N° 2
Escriba una clase que implemente la siguiente jerarquia de clases:

a) Cada clase debe tener los atributos y metodos necesarios para calcular el area.

Importante para tener en cuenta:

Area del triangulo = (base * alturas)/2

Area del rectangulo = base * altura

Area del circulo = 3'14*(radio*radio)

b) Implemente una clase principal que instancie una lista de figuras y muestre su correspondiente area.

## Ejercicio N° 3
Dado el siguiente codigo

```java
    public class TCredito {
	private String numero;
	private String nombre;
	private String banco;
	private double balance;
	private double limite;
	
	public TCredito(String vnumero, String vnombre, String vbanco, double vbalance, double vlimite) {
		numero = vbanco;
		nombre = vnombre;
		banco = vbanco;
		balance = vbalance;
		limite = vlimite;
	}

	public String getNumero() {
		return numero;
	}

	public String getNombre() {
		return nombre;
	}

	public String getBanco() {
		return banco;
	}

	public double getBalance() {
		return balance;
	}

	public double getLimite() {
		return limite;
	}
	
	public boolean puedoComprar(double vprecio) {
		if (vprecio+balance> limite) {
			return false;
		} else {
			balance+= vprecio;
			return true;
		}
	}
	
	public void pagarTarjeta(double vmonto) {
		balance-= vmonto;
	}
	
	public void muestraDatos() {
		System.out.println("numero = "+ getNumero());
		System.out.println("nombre = "+ getNombre());
	}
}
```

```java
    public class Tarjeta {

	public static void main(String[] args) {
		TCredito JPTarjeta = new TCredito("666", "JPerez", "BcoPatagonia", 2000, 10000);
		TCredito DMTarjeta = new TCredito("777", "DMartin", "BcoGalicia", 5000, 10000);
		JPTarjeta.muestraDatos();
	}

}

```
Sabemos que existe una clase TCredito con 5 atributos y 8 metodos. Ademas existe la clase Tarjeta la cual tiene un main. Responda a los siguientes incisos: 

a) JPTarjeta y DMTarjeta son dos nuevas clases?. Sino es asi ¿que son?

b) JPTarjeta.muestraDatos() ¿Que hace?

c) Mejore el metodo muestraDatos() para mostar toda la infomacion disponible.

d) Modifique el main de Tarjeta para probar si JPTarjeta puede comprarse una Ultrabook de $16000. Si no es posible, mostrar un mensaje en pantalla.

e) No estaria de mas tener un metodo que permita aumentarBalance, ¿no?

f) A DMTarjeta le informaron  que debe pagar su tarjeta. Pero solo pagara $1500. Realice el pago y muestre la informacion actualizada de DMTarjeta.

## Ejercicio N ° 4
Dado el siguiente codigo: Teniendo una superclase Fruta, con un atributo peso, y un metodo hacerJugo(). De dicha clase extienden otras tres clases llamadas Manzana, Naranja y Pera.

Se sabe que: Las manzanas dependiendo de su peso dan el 30% de jugo. Las naranjas el 80% y las peras el 60%

En un clase Test crea una coleccion de Frutas aleatorias (Manzana, Naranja, Pera) y mostrar la cantidad dee jugo obtenido.

```java
    public class Fruta {
	private double peso;
	
	public Fruta (double Peso) {
		this.setPeso(Peso);
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double hacerJugo() {
		return 0;
	}
	
}
```

## Ejercicio N ° 5
Crear un paquete llamado "model.herencia" dentro de la carpeta srr, dentro del paquete poner en practica el concepto de herencia, para ello Crearemos la Clase Persona, Profesor y Estudiante. La clase padre debera contener 5 atributos, y las clases hijas deberan tener por lo menos 1 o 2 atributos.

Luego de implementar la herencia, crear una Clase llamada "TestHerenciaPersona" (con metodo main) esta clase sera creada dentro del mismo paquete. Crear 5 objetos de cada clase hija y mostrar los datos de cada objeto.

## Ejercicio N ° 6
Dentro del paquete "model.herencia" poner en practica el concepto de herencia, para ello crearemos la Clase Producto, ProductoLacteos y ProductoEnvasado. La clase padre debera contener 5 atributos incluido un id, y las clased hijas ProductoLacteo debera tener un atributo para la cantidad de leche, y la temperatura de refrigeracion, y el ProductoEnvasado debe tener un atributo el tipo de envasado (por ejemplo en bolsa o caja).

Luego de implementar la herencia, crear una Clase llamada "TestHerenciaProducto" (con metodo main) esta clase sera creada dentro del mismo paquete. Crear 6 objetos de cada clase hija y mostrar los datos de cada objeto.

## Ejercicio N ° 7
Dentro del paquete "model.herencia" poner en practica el concepto de herencia, para ello crearemos la Clase Perro, Caniche y Salchicha. La clase padre debera contener 5 atributos incluido un id. Luego de implementar la herencia, crear una Clase llamada "TestHerenciaPerros" (con metodos main) esta clase sera creada dentro del mismo paquete. Crear 5 objetos de cada clase hija y mostrar los datos de cada objeto.

## Ejercicio N ° 8 
Dentro del paquete "model.herencia" poner en practica el concepto de herencia, para ello crearemos la Clase colectivo, ColectivoMedia y ColectivoLarga. La clase padre debera contener 5 atributos incluido id. Y los colectivos de larga distancia tienen un atributo de peso de equipaje que es el peso total que soporta el colectivo para el equipaje. Luego de implementar la herencia, crear una Clase llamada "TestHerenciaColectivo" (con metodos main) esta clase sera creada dentro del mismo paquete. Crear 5 objetos de cada clase hija y mostrar los datos de cada objeto.

## Ejercicio N ° 9
Crea una Clase Animal y las clases Perro, Gato, Gallo. En la clase padre debera el metodo gritar() y sobreescribir el metodo  de las clases hijas, cada clase hija debera gritar a su manera por ejemplo el Gato debe decir "Miau soy un gato". Al finalizar crear la clase TestAnimal(con el metodo main) que permita ver la forma en que gritan estos animales. Pruebe el metodo para todos los animales. Los atributos de todas las clases son a su eleccion. Los valores de los atributos se cargan cuando se crea cada objeto. 

[Nota importante] :  Los metodos pueden devolver un valor o void eso es a su eleccion.

## Ejercicio N ° 10
Teniendo en cuenta las clases creadas en el ejercicio Nro 2 (Formas Geometricas, las clases Rectangulo, Triangulo y Circulo). En la clase padre debera agregar el metodo calcularPerimetro() y sobreescribirlo en las clases Rectangulo, Triangulo y Circulo. Crear tambien la clase TestFigura (con el metodo main) que permita ver la forma en la que cada figura calcula su area. Los atributos de todos las clases son a su eleccion. Los valores de los atributos se cargan cuando se crea cada objeto.

[Nota importante] :  Los metodos pueden devolver un valor o void eso es a su eleccion.