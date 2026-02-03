## Introducción

Comenzaremos estos contenidos cuando acabemos los actuales. Haremos una explicación de los mismos cuando los comencemos.

Hasta ahora hemos visto que un objeto tiene variables / atributos / estado.
Por ejemplo, un **Luchador** tiene vida, ataque y defensa, todos de tipo `int`.

La **composición de objetos** consiste en que un objeto puede tener otros objetos.
Por ejemplo, un objeto **Curso** tiene un nombre de curso, un nombre de titulación y un array de objetos **Alumno** con todos los participantes.
Dichos participantes tendrán a su vez **nombre**, **apellidos** y **fecha de nacimiento**.

---

## Notas importantes

* No hay una única solución correcta, pero sí soluciones mal modeladas.
* Antes de empezar a escribir código, debéis pensar:

    * Qué clases vais a tener.
    * Qué métodos y atributos tendrá cada clase.

Escribe un pequeño texto donde se indique:

* Qué clases tendrás.
* Para cada clase:

    * Qué atributos y métodos tendrá.
* Para cada atributo:

    * Qué tipo de dato es.
    * Qué almacena y qué significa dentro de la lógica del negocio.
* Para cada método:

    * Qué parámetros recibe como entrada.
    * Qué hace el método.
    * Qué devuelve como salida.
    * Cuál es su objetivo y el proceso interno que sigue.

---

## Reglas de diseño

* En el código, el `main` **solo crea objetos y llama a métodos**.
* Toda la lógica de interacción entre objetos debe estar dentro de los propios objetos.
* Ninguna clase debe **saber demasiado** sobre otra.
* Los **atributos deben ser siempre privados**.
* Los **métodos públicos** se usan para la comunicación externa con el objeto.
* Los **métodos privados** se usan solo internamente.
* Si una clase contiene un array, **esa clase es la responsable de gestionarlo**.

    * Por ejemplo, en un curso **no se debe** exponer directamente el array de alumnos mediante un `getAlumnos()` que permita modificarlo desde fuera.

---

## Ejercicios

### Ejercicio 1

Se quiere modelar un videojuego sencillo.
Cada jugador tiene un nombre y una cantidad de vida. Además, cada jugador tiene un inventario donde se guardan los objetos que posee.

Diseña las clases necesarias y programa un ejemplo donde:

* Se cree un jugador.
* Se añadan varios objetos a su inventario.
* Se muestre su estado.

El programa principal **no debe acceder directamente** a los datos del inventario.

---

### Ejercicio 2

Un curso tiene un nombre y un conjunto de alumnos.
Cada alumno tiene un nombre y una nota media.

Diseña las clases necesarias e implementa un programa que:

* Cree un curso con varios alumnos.
* Muestre el nombre del curso y la información de todos sus alumnos.

---

### Ejercicio 3

Un coche tiene una marca y un motor.
El motor tiene una potencia y puede estar encendido o apagado.

Diseña las clases necesarias y un programa que permita:

* Arrancar el coche.
* Apagar el coche.

El programa principal **solo debe interactuar con el coche**, nunca directamente con el motor.

---

### Ejercicio 4

Una cuenta bancaria pertenece a un cliente.
El cliente tiene un nombre y un DNI.
La cuenta tiene un saldo y permite ingresar y retirar dinero.

Diseña las clases necesarias y programa un ejemplo donde:

* Se cree un cliente con una cuenta.
* Se realicen varias operaciones.

El `main` **no debe modificar directamente el saldo**.

---

### Ejercicio 5

Una biblioteca gestiona libros.
Cada libro tiene un título y un autor.
La biblioteca contiene varios libros.

Diseña las clases necesarias y un programa que:

* Permita añadir libros a la biblioteca.
* Muestre todos los libros almacenados.

---

### Ejercicio 6

Un equipo deportivo está formado por varios jugadores.
Cada jugador tiene un nombre y una posición.
El equipo tiene un nombre y una lista de jugadores.

Diseña las clases necesarias y un programa que:

* Muestre el nombre del equipo.
* Liste todos sus jugadores.

---

### Ejercicio 7

Un pedido está formado por varios productos.
Cada producto tiene un nombre y un precio.

El pedido debe poder calcular el precio total de todos sus productos.

Diseña las clases necesarias y programa un ejemplo que:

* Cree un pedido con varios productos.
* Muestre el total a pagar.

---

### Ejercicio 8

Un hotel tiene habitaciones.
Cada habitación tiene un número y un precio por noche.

El hotel debe poder:

* Mostrar todas sus habitaciones.
* Calcular el precio total de una estancia de varias noches.

Diseña las clases necesarias y un programa de ejemplo.

---

### Ejercicio 9

Una empresa tiene empleados.
Cada empleado tiene un nombre y un salario.

La empresa debe poder:

* Mostrar todos los empleados.
* Calcular el gasto total en salarios.

Diseña las clases necesarias y programa un ejemplo completo.

---

### Ejercicio 10

Un carrito de la compra contiene productos.
Cada producto tiene un nombre y un precio.

El carrito debe permitir:

* Añadir productos.
* Mostrar el total de la compra.

Diseña las clases necesarias y programa un ejemplo funcional.

---