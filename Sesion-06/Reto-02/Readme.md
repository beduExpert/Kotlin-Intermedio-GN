[`Kotlin Intermedio`](../../Readme.md) > [`Sesión 6`](../Readme.md) > `Reto 2`
    
## Reto 2

<div style="text-align: justify;">

### 1. Objetivos :dart:

- Implementar algún atributo de un _Theme_ en un _View_ específico.
- Crear un Theme oscuro.

### 2. Requisitos :clipboard:

- Android Studio instalado

### 3. Desarrollo :computer:

Ahora pondrás en práctica lo visto durante el ejemplo anterior.

Para completar este reto utiliza el proyecto del [Ejemplo 3](../Ejemplo-03/Readme.md) y completa los siguientes puntos:

1. Implementa lo siguiente en el _Drawer_:

     <image src="../Ejemplo-03/images/7.png" width="35%">
     
     Implementar el diseño del código, de forma que quede así:

     <image src="images/1.png" width="35%">
     
     Cambia al _Theme_ ___AppTheme.RedBlue___ para que quede así:

     <image src="images/2.png" width="35%">

2. Genera un nuevo ___Dark Theme___. Utilizando lo visto en el ejemplo 3 de está sesión.


<details><summary>Solución</summary>

```xml
<LinearLayout
     ...
android:paddingBottom="16dp"
android:background="?attr/colorAccent"
     >
<ImageView
```
</details>

<br/>

[`Anterior`](../Ejemplo-03/Readme.md) | [`Siguiente`](../Proyecto/Readme.md)



</div>
