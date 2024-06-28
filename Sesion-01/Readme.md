[`Kotlin-Intermedio`](../Readme.md) > `Sesión 1`


## Sesión 1: Views

<div style="text-align: justify;">

### Introducción

Un __View__ es una clase que representa la base de todos los componentes para la interfaz gráfica y su representación gráfica está delimitada por un rectángulo. La descripción gráfica de un View así como su posición en la pantalla está determinado por un archivo layout en lenguaje __XML__. Un tipo especial de View es el __ViewGroup__, que es un contenedor de Views y otros ViewGroups con un formato de orden específico, que se encuentran distribuidos jerárquicamente en un árbol de Vistas.

### Instrucciones de la sesión

Para esta sesión, modificaremos el layout inicial de un proyecto creado, de modo que el archivo generado en ___res/layout___ sea reemplazado por este código:

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:gravity="center"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".MainActivity">
     {COLOCA AQUI EL CONTENIDO DEL LAYOUT}
</LinearLayout>
```

<img src="images/view_tree.png" align="right">
<h5>Ejemplo de árbol de Views</h5>

### 1. Objetivos :dart: 

---

<img src="../images/android-kotlin.png" align="right" height="120" hspace="10">

- Identificar los controles esenciales para generar interfaces básicas 
- Utilizar herramientas básicas para debugge
- Implementar los controles y herramientas para modificar el proyecto por defecto

### 2. Contenido :blue_book:

---

<img src="images/button.png" align="right" height="90"> 

#### <ins>Textos y botones</ins>

Se crearán textos y botones desde cero mediante código.

El botón es un componente. que el usuario utiliza para pulsar y disparar un evento. que realizara alguna acción en la aplicación. Es uno de los componentes más comunes dentro de los programas que usan en interfaces gráficas de usuario, así como los textos "texto fijo que el usuario no puede modificar" que sirven para mostrar instruciones y/o información importante al usuario.

- [**`EJEMPLO 1`**](Ejemplo-01/Readme.md)
- [**`RETO 1`**](Reto-01/Readme.md)

---

<img src="images/text_input.png" align="right" height="90"> 

#### <ins>EditText e imágenes</ins>

Ampliaremos el dominio a ImageViews para la visualización de imágenes y EditTexts "Entradas de texto" para ingresar un texto desde el teclado del móvil, y explorando los eventos que este detona. 

- [**`EJEMPLO 2`**](Ejemplo-02/Readme.md)
- [**`RETO 2`**](Reto-02/Readme.md)

---

<img src="images/url_image.png" align="right" height="90"> 

#### <ins>Imágenes mediante URL</ins>

Mostrar imágenes en un ImageView por medio de URLS, utilizando la librería coil disponible en _mavenCentral()_. 

- [**`EJEMPLO 3`**](Ejemplo-03/Readme.md)

---


### 3. Proyecto :hammer:

Con los temas anteriores, construye una pantalla de login y register para la aplicación definida.

- [**`PROYECTO SESIÓN 1`**](Proyecto/Readme.md)

<br/>

[`Anterior`](../Sesion-01/Readme.md) | [`Siguiente`](../Sesion-02/Readme.md)      

</div>

