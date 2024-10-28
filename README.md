# Introducción a Java
Java es un lenguaje que puede parecer intimidante, pero es uno
de los más utilizados en la industria, y no es por cualquier cosa.
Este es un lenguaje que es universal, osea, puede ser ejecutado
en prácticamente cualquier sistema operativo, siempre y cuando este
tenga instalado el JRE (Java Runtime Environment). Java es un lenguaje
compilado, veloz y fuertemente tipado. A su vez, lenguaje orientado a objetos.
Al contrario de Python, todo en Java es una clase. Incluso el punto de entrada
de una aplicación es una clase.

Para escribir codigo en java, recomiendo mucho JetBrains IntelliJ IDEA. Es un IDE (Entorno de Desarrollo Integrado) muy completo,
moderno y es de JetBrains, los mismos creadores de PyCharm. También, se pueden utilizar otros
IDEs como Visual Studio Code, Netbeans, Eclipse, etc. Sin embargo, la mayoría de desarrolladores
prefieren IntelliJ IDEA por una razón.

### Ejemplos de hello world en distintos lenguajes
```py
# Hello world en python
print("Hello world!")
```
```java 
// Hello world en java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
```

Vamos a empezar creando un proyecto en IntelliJ IDEA. Es indispensable usar in IDE para
java, porque facilita muchisimo el trabajo. Java es un lenguaje en el que se tiene que 
configurar muchas cosas por dentro, así que el IDE nos facilita este trabajo. 

Vamos a tener un Main.java. Este es el  punto de entrada de nuestra aplicación. Es decir,
este es el archivo que se ejecutará cuando presionemos el boton de ejecutar, o Shift + F10. 
```java 
public class Main {
    public static void main(String[] args) {

        // Los prints son un poco más largos
        System.out.println("Hello world!");
    }
}
```
## Definiendo variables 
En Python, si recordamos, simplemente igualabamos el nombre de nuestra variable a un valor. Python
automáticamente detectaba si era un número, string, entre otros. En Java esto no es así. En java, para
definir una variable, tenemos que especificar su tipo.  

input
```java
public class Main {
    public static void main(String[] args) {

        int edad = 18;
        String nombre = "Rodrigo";

        System.out.println("Mi nombre es " + nombre + ", tengo " + edad + " años!");
    }
}
```
output
```
Mi nombre es Rodrigo, tengo 18 años!

Process finished with exit code 0
```

Los tipos de datos en Java son muchos, así que es mejor investigarlos por cuenta propia conforme se usen.
## Control de flujo

#### Condicionales
Los condicionales son parecidos a Python
```java 
public class Main {
    public static void main(String[] args) {

        int edad = 18;
        String nombre = "Rodrigo";

        System.out.println("Mi nombre es " + nombre + ", tengo " + edad + " años!");

        if (edad >= 18) {
            System.out.println("Soy mayor de edad!");
        } else {
            System.out.println("Soy menor");
        }
    }
}
```
La única diferencia es que debemos especificar paréntesis. 
####  Bucles
Aquí ya cambia la cosa. Tenemos los bucles for, while y do while. 

input
```java
public class Main {
    public static void main(String[] args) {

        int edad = 18;
        String nombre = "Rodrigo";

        System.out.println("Mi nombre es " + nombre + ", tengo " + edad + " años!");

        int contador = 0;

        while (contador < 10){
            System.out.println("Contador: " + contador);
            contador++;
        }

        contador = 0;

        do {
            System.out.println("Contador 2: " + contador);
            contador++;
        } while (contador < 10);

        contador = 9;

        while (contador != 9){
            System.out.println("Este código nunca se va a ejecutar");
        }

        do {
            System.out.println("Este código se ejecuta al menos una vez");
        } while (contador != 9);

    }
}
```
output
```
Mi nombre es Rodrigo, tengo 18 años!
Contador: 0
Contador: 1
Contador: 2
Contador: 3
Contador: 4
Contador: 5
Contador: 6
Contador: 7
Contador: 8
Contador: 9
Contador 2: 0
Contador 2: 1
Contador 2: 2
Contador 2: 3
Contador 2: 4
Contador 2: 5
Contador 2: 6
Contador 2: 7
Contador 2: 8
Contador 2: 9
Este código se ejecuta al menos una vez
Soy mayor de edad!

Process finished with exit code 0
```
La diferencia entre while y do while, es que while comprueba la condición primero y luego
ejecuta, mientras que do while ejecuta y luego comprueba la condición.

#### Bucle for
El bucle for es distinto al de python
```java
public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){
            System.out.println("i: " + i);
        }
    }
}
```
Dentro de un bucle for, definimos una variable (en este caso, i), luego, 
definimos una condición que, mientras sea verdadera, se va a ejecutar el bucle. Por 
último, ejecutamos una acción sobre nuestro (en este caso, le sumamos 1). Este es 
el output del código: 
```
i: 0
i: 1
i: 2
i: 3
i: 4
i: 5
i: 6
i: 7
i: 8
i: 9
```

### Funciones
Cuando definimos funciones, tenemos que especificar el tipo de dato que retornan.
```java
public class Main {
    public static int sumita(int num1, int num2){
        return num1 + num2;
    }
    public static void main(String[] args) {
        int suma = sumita(12, 12);
        System.out.println(suma);
    }
}
```
A su vez, se tiene que especificar el tipo de dato de los argumentos
``` 
24

Process finished with exit code 0
```

### Clases
Las clases se tienen que crear por aparte, y lo tenemos que crear en el mismo IDE. En el 
caso de IntelliJ IDEA se trata de ir a nuestro proyecto, luego en src clickeamos New -> Class y le ponemos
un nombre. Como Java es un lenguaje orientado a objetos con muchas posibilidades, no puedo 
cubrir todo eso aquí. 
```java
public class Persona {
    private String name;
    private int edad;
    
    public Persona(String name, int edad) {
        this.name = name;
        this.edad = edad;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

```
Esa es una clase persona. En este caso, es importante entender qué significa private y public.
Este es el nivel de acceso de cada uno de los atributos o métodos. Un atributo private significa 
que solo puede ser accedido desde la misma clase. Para estos, es necesario crear los métodos setters y
getters, los cuales permiten acceder o modificar estos valores desde fuera. Esto se puede generar 
dentro de cualquier IDE. Public significa que puede ser accedido desde fuera de la clase y ser modificado 
o accedido de la manera que se desee. Como se puede observar, hay un método especial que dice 
public Persona. Este es el constructor, y se puede generar desde el mismo IDE de la misma manera (investigar para dado caso).

Esta clase se puede utilizar tal cual desde otro archivo, no hace falta importarla porque está dentro del 
mismo namespace. 
```java
public class Main {
    public static void main(String[] args) {
        Persona yo = new Persona("Rodrigo", 18);

        int edad = yo.getEdad();

        System.out.println("Tengo " + edad + " años");
    }
}
```
output 
```shell
Tengo 18 años

Process finished with exit code 0
```

### ¿Qué queda?
Construir con este lenguaje. Es un lenguaje muy amplio y explicar todo sobre java es muy complicado. 
Recomiendo investigar sobre interfaces gráficas, ya que son bien sencillas con java. También, para crear 
los objetos, recomiendo [LucidChart](https://www.lucidchart.com/). Esta pagina permite crear diagramas 
UML, utiles para proyectos, entre otros.