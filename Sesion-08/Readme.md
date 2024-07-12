[`Kotlin-Intermedio`](../Readme.md) > `Sesión 8`


## Sesión 8: Gradle y Preparación para lanzamiento

<div style="text-align: justify;">
  
  
  
### Introducción

La cantidad de aplicaciones disponibles en Google Play no deja de aumentar. Una de las grandes ventajas de la tienda oficial en Android es que hay muchos tipos de apps diferentes, también de multitud de estudios y desarrolladores. Esto permite que desarrolladores pequeños, que están empezando, puedan publicar sus aplicaciones en la tienda sin demasiados problemas.

Para realizar el lanzamiento de una app en Google Play debemos realizar una serie de pasos, la mayoría de ellos se realizan sobre el gradle.

Gradle es un sistema de automatización de construcción de código de software que construye sobre los conceptos de Apache Ant y Apache Maven e introduce un lenguaje específico del dominio (DSL) basado en Groovy en vez de la forma XML utilizada por Apache Maven para declarar la configuración de proyecto.

En este Gradle se especifican librerías, nombre de la app, versiones, entre otras configuraciones del proyecto.


### 1. Objetivos :dart: 

---

<img src="../images/android-kotlin.png" align="right" height="120" hspace="10">

- Definir y ejecutar los pasos previos de configuración
- Crear un archivo apk a partir del proyecto finalizado.
- Evaluar el funcionamiento de la aplicación y crear un App Bundle.
- Analizar y preparar todos los elementos necesarios para el lanzamiento de la aplicación.


### 2. Contenido :blue_book:

---

<img src="images/gradle.png" align="right" height="120"> 

#### <ins>Configuración de gradle</ins>

Realizaremos todos los preparativos en los archivos gradle, para tener un lanzamiento exitoso de la app, así como revisaremos como **ofuscar** nuestro código.

Ofuscar se refiere al acto de realizar un cambio no destructivo, ya sea en el código fuente de un programa informático, cuando el programa está en forma compilada o binaria. Es decir, se cambia el código, manteniendo el funcionamiento original, para dificultar su entendimiento. De esta forma se dificulta los intentos de ingeniería inversa y desensamblado que tienen la intención de obtener una forma de código fuente cercana a la forma original.

- [**`EJEMPLO 1`**](Ejemplo-01/Readme.md)

---

<img src="images/flavors.jpg" align="right" height="120"> 

#### <ins>Build variants</ins>

Construir variantes de una aplicación tiene distintas utilidades, por ejemplo: tener una versión gratuita y una versión de pago. En este ejemplo crearemos diferentes versiones de una aplicación y reflexionaremos en torno a las ventajas de esta utilidad.

- [**`EJEMPLO 2`**](Ejemplo-02/Readme.md)
- [**`RETO 1`**](Reto-01/Readme.md)

---

<img src="images/signing.png" align="right" height="120"> 

#### <ins>Firma de aplicación</ins>

Los formatos Android App Bundle (.aab) y Android Package (.apk) son imprescindible para subir una aplicación a tienda. En este ejercicio generaremos un apk de prueba para instalarlo en un dispositivo. Compilaremos un archivo .aab y probaremos su funcionalidad mediante buildtool. Firmaremos nuestra aplicación de release y la probaremos en búsqueda de algún defecto.

- [**`EJEMPLO 3`**](Ejemplo-03/Readme.md)

---


### 3. Proyecto :hammer:

Con lo aprendido en esta sesión, agrega los detalles finales a tu proyecto y prepáralo para el lanzamiento a la tienda.

- [**`PROYECTO SESIÓN 8`**](Proyecto/Readme.md)

<br/>

[`Anterior`](../Sesion-07/Readme.md)

</div>

