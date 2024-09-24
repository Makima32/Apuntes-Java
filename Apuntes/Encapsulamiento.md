# **1. Definición y propósito del encapsulamiento **

## **Definición y propósito del encapsulamiento**

El encapsulamiento es un principio de la POO (programacion orientada a objetos) que oculta los detalles internos de una clase, permitiendo acceder a sus atributos solo a través de métodos controlados. Su propósito es proteger los datos y controlar cómo se accede y modifica la información.

El propósito principal del encapsulamiento es:

* Proteger los datos de modificaciones externas indebidas.
* Controlar el acceso a los atributos mediante métodos.
* Mantener la integridad de los datos en los objetos.



## **Atributos privados y protección de datos**

Cuando declaramos un atributo como privado (private), este no puede ser accedido directamente desde fuera de la clase. Esto asegura que los datos solo puedan ser modificados de manera controlada, protegiendo los atributos de cambios accidentales o malintencionados.

## **Sintaxis básica:**

![Codigo](/Apuntes/Imagenes/Encapsulamiento1.png)


## **Explicacion del codigo**

En este ejemplo, los atributos nombre y edad no pueden ser accedidos ni modificados directamente desde fuera de la clase Persona. Esto garantiza que los datos estén protegidos.



## **Getters y Setters: acceso y modificación controlada**

Para acceder y modificar los atributos privados, usamos métodos getters y setters. Los getters permiten leer el valor de un atributo, mientras que los setters permiten modificarlo de manera controlada.

Getters: Devuelven el valor de un atributo.
Setters: Modifican el valor de un atributo, permitiendo validaciones antes de asignar el nuevo valor.


## **Sintaxis básica:**

![Codigo](/Apuntes/Imagenes/Encapsulamienta2.png)


## **Explicacion del codigo**



## **4. Validación de datos con setters (control de valores)**

En los setters, podemos agregar validaciones para asegurarnos de que los datos introducidos son correctos antes de modificar los atributos. Esto permite mantener la integridad de los datos dentro de los objetos.

En el ejemplo anterior, se valida que la edad no sea negativa antes de modificar el atributo edad. Si el valor no es válido, simplemente no se modifica el atributo y se muestra un mensaje de error.




## **Sintaxis básica:**

![Codigo](/Apuntes/Imagenes/Encapsulamiento3.png)



* Los atributos titular y saldo son privados, lo que protege los datos de accesos externos.

* El método depositar() aumenta el saldo si la cantidad es positiva, y el método retirar() verifica si la cantidad a retirar es válida y si hay suficiente saldo.

* Las validaciones garantizan que no se puedan realizar operaciones incorrectas.


