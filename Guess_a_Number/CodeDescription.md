# Documentación del Ejercicio: Adivina el Número Aleatorio

Este documento detalla el análisis, diseño e implementación de un juego de consola en Java donde el usuario debe adivinar un número generado aleatoriamente.

## 1. Enunciado del Ejercicio

El programa genera aleatoriamente un número entero mayor o igual a 0 y menor que 100. Posteriormente, solicita al usuario que adivine el número.
* Si el usuario adivina correctamente, el programa emite un mensaje de éxito y termina.
* Si el número ingresado es menor que el número aleatorio, el programa imprime: "Too low, try again" (Demasiado bajo).
* Si el número ingresado es mayor que el número aleatorio, el programa imprime: "Too high, try again" (Demasiado alto).
* El programa debe seguir pidiendo números hasta que el usuario acierte.

El programa utiliza el método `random` de la clase `Math` para la generación del número.

## 2. Entradas y Salidas

### Entradas (Inputs)
* **Tipo:** Entero (`int`).
* **Fuente:** Teclado (Consola).
* **Descripción:** Intentos numéricos ingresados por el usuario tratando de adivinar el número secreto.

### Salidas (Outputs)
* **Mensajes de guía:** "Guess a Number between 0 and 100".
* **Pistas:** "Too high, try again" o "Too low, try again".
* **Mensaje final:** "You win!".

## 3. Variables a Emplear

| Nombre Variable | Tipo de Dato | Descripción |
| :--- | :--- | :--- |
| `numRnd` | `double` | Almacena el valor decimal aleatorio generado por `Math.random()` (entre 0.0 y 1.0). |
| `intRnd` | `int` | Es el número objetivo final. Resultado de escalar `numRnd` por 100 y castearlo a entero. |
| `numIn` | `int` | Almacena el número introducido por el usuario en cada intento. |
| `input` | `Scanner` | Objeto de la clase `java.util.Scanner` para la lectura de datos desde la consola. |

## 4. Análisis del Problema

Para resolver este problema, se requiere un flujo repetitivo (bucle) ya que no sabemos cuántos intentos necesitará el usuario.

1.  **Generación del número:** La función `Math.random()` devuelve un `double` $x$ tal que $0.0 \leq x < 1.0$. Para obtener un entero entre 0 y 99, multiplicamos por 100 y truncamos los decimales (casting a `int`).
2.  **Comparación:** Se necesita una estructura condicional (`if-else`) para comparar el intento del usuario (`numIn`) contra el número secreto (`intRnd`).
3.  **Ciclo:** Se utilizará un bucle `while` que se mantendrá activo mientras el número ingresado sea **diferente** (`!=`) al número secreto.
4.  **Actualización:** Dentro del bucle, es crítico volver a solicitar el `numIn` después de dar la pista, de lo contrario, se crearía un bucle infinito.

## 5. Diseño del Algoritmo (Pseudocódigo)

```text
INICIO
    Declarar numRnd como double = Math.random()
    Declarar intRnd como int = (int)(numRnd * 100)
    Declarar numIn como int
    Instanciar Scanner input

    IMPRIMIR "Guess a Number between 0 and 100: "
    LEER numIn

    MIENTRAS (intRnd != numIn) HACER
        SI (intRnd <= numIn) ENTONCES
            IMPRIMIR "Too high, try again"
        SINO
            IMPRIMIR "Too low, try again"
        FIN SI
        
        LEER numIn // Actualizar valor para la siguiente iteración
    FIN MIENTRAS

    IMPRIMIR "You win!"
FIN
