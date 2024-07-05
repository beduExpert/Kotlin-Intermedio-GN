[`Kotlin Intermedio`](../../Readme.md) > [`Sesión 02`](../Readme.md) > `Proyecto`

## Proyecto: Activities y Layouts

<div style="text-align: justify;">

### 1. Objetivos :dart:

- Crear un flujo entre Activities.
- Diseñar los layouts de las _Activities_ con ___ConstraintLayout___.

### 2. Requisitos :clipboard:

1. Android Studio Instalado en nuestra computadora.

### 3. Desarrollo :computer:

Ya has creado las primeras pantallas de tu aplicación durante la __Sesión 1__, por lo que ahora queda definir qué sigue después del Inicio de sesión y registro.

A continuación veremos ciertas ideas que nos ayudarán a aterrizar nuestro proyecto.

El proyecto se va a desarrollar por etapas, y como no podemos dimensionar en su totalidad la implementación de los temas por venir, es conveniente hacer una pequeña planeación.

Se considera recomendable que nuestro flujo tenga al menos seis pantallas, que tenga un objetivo principal y otras pantallas de apoyo (perfil, configuración, etc.). Por lo anterior, sería muy complejo desarrollar el flujo de Activities en esta sesión, por lo que se puede empezar por definir el flujo de únicamente dos pantallas o incluso 3. 

Se recalca que es conveniente desarrollar el flujo más simple en la aplicación, puesto a que las complejidades de otras pantallas con distintas funciones pueden ser cubiertas en siguientes temas. Un ejemplo de lo anterior es el flujo entre una pantalla de _inicio de sesión_ y otra que lleve a la información de perfil (puesto que los datos son únicamente informativos) y el inicio de sesión únicamente valida que las credenciales sean correctas. Un ejemplo contrario sería desarrollar una pantalla que arroje los resultados de la busqueda de un producto, puesto que el tema de listas aún no está cubierto ni el de filtros.

### Lineamientos

1. Genera al menos una nueva _Activity_ que interactúe con los _Activity_ previamente creados.
    Por ejemplo una vez que el usuario llene los formularios de Inicio de sesión o registro, puedes simular que ya entró a la pantalla principal como si realmente hubiera iniciado sesión y/o creado su cuenta. 
2. Maqueta el o los _layouts_ con el _Viewgroup_ ___ConstraintLayout___.
3. Agrega a cada _layout_ por lo menos 3 Views, y es sugerido que la distribución de las _Views_ no sea lineal.
4. Implementa en las Activites alguna funcionalidad, como simular un servicio web y/o declarar listeners de botones (se vale investigar _Views_ no vistas en las sesiones). 


[`Anterior`](../Ejemplo-05/Readme.md) | [`Siguiente`](../../Sesion-03/Readme.md)

</div>
