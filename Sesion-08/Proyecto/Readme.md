[`Kotlin Intermedio`](../../Readme.md) > [`Sesión 08`](../Readme.md) > `Proyecto`

## Proyecto: Finalización del proyecto

<div style="text-align: justify;">

### 1. Objetivos :dart:

- Generar variantes de nuestra aplicación.
- Configurar lo básico en gradle.
- Hacer pruebas con nuestra aplicación de _debug_.
- Lanzar una versión de Release de nuestra aplicación.

### 2. Requisitos :clipboard:

- Android Studio Instalado en nuestra computadora.


### 3. Desarrollo :computer:

Ahora cerraremos nuestro proyecto realizando las configuraciones de ___gradle___ aprendidas, también implementaremos algunas variantes de nuestra app y finalmente crearemos sus versiones de release.

Implementar una nueva función para dos versiones puede ser un reto grande, por lo cual te dejamos algunos tips de implementación:

- Para una aplicación que brinde una funcionalidad (como un administrador de gastos), podemos poner una versión que muestre publicidad y otra que no, eso lo podemos hacer mediante un ImageView y un set de imágenes que se muestren de forma aleatoria; esto se puede lograr asignando la imagen de forma dinámica (en el código fuente), la aleatoriedad se puede conseguir metiendo todas las imágenes de publicidad en un arreglo y obteniéndolas con su index, consiguiendo un número aleatorio:

    ```kotlin
    val imageIndex = (0..10).random()
    ```

- Para cualquier aplicación, podemos restringir algún servicio a ciertos países. Dicho servicio puede estar alojado en el drawer, por lo que declararíamos dos diferentes xml con su contenido. Dicho servicio podría hacer navegar a un nuevo Activity.

- Otra podría ser un Theme y algunos elementos gráficos que cambien en tu aplicación. OJO, para que esto cuente, los cambios deben ser significantes.

### Lineamientos

1. Se debe hacer una configuración de gradle similar a la hecha en el [Ejemplo 1](../Ejemplo-01).
2. Se debe crear al menos un par de _flavors_ nuevos (sugerimos hacer una versión demo-full o free-paid).
3. Dichos flavors deben tener congruencia con el giro de la aplicación. Por ejemplo, si creamos una app de noticias, podríamos poner en la versión gratuita ImageViews emulando ser anuncios.
4. Los ___buildTypes___ deben ser ___debug___ y ___release___.  
5. Correr todo el proceso aprendido en el [Ejemplo 3](../Ejemplo-03). Generar al menos dos versiones de release tanto para un ___apk___ como un ___aab___.


#### Checklist

Asegúrate de que tu entregable contiene cada uno de los elementos enlistados a continuación:

- [ ] Crear dos _flavors_ "Puede ser versión gratis y de paga"
- [ ] Generar dos archivos compilados ___apk___ y ___aab___


[`Anterior`](../Ejemplo-03) | [`Regresar`](../../Readme.md)

</div>
