
[`Kotlin Intermedio`](../../Readme.md) > [`Sesión 07`](../Readme.md) > `Ejemplo 2`


## Ejemplo 2: Menus y Eventos

<div style="text-align: justify;">

### 1. Objetivos :dart:

- Implementar acciones al seleccionar las opciones de los menus creados en la Sesion-01.

### 2. Requisitos :clipboard:

1. Android Studio 4.1
2. Kotlin 1.3
3. AVD Virtual device con API 11 (Android 3.0) o superior
4. Conexión a internet
5. Códigos de la Sesion-01 completos

### 3. Desarrollo :computer:

#### OPTIONS MENU

Retomamos el Ejemplo de [options_menu](./options_menu), pero esta vez agregamos funcionalidad a las opciones de menú.

![MainActivity](./images/4.png)


1. Nos dirigimos al MainActivity, y escribimos la función encargada de obtener la opción elegida en el menú.

    ```java
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }
    ```

2. Luego, comparamos cada `id` dentro del Menu.

    ```java
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle presses on the action bar menu items
        when (item.itemId) {
            R.id.item1 -> {
                return true
            }
            // implementar resto de opciones
        }
        return super.onOptionsItemSelected(item)
    }
    ```

3. Finalmente, para el resto de opciones:

    ```java
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle presses on the action bar menu items
        when (item.itemId) {
            R.id.item1 -> {
                Toast.makeText(this, "Item1", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.item2 -> {
                Toast.makeText(this, "Item2", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.item3 -> {
                Toast.makeText(this, "Item3", Toast.LENGTH_LONG).show()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
    ```


#### CONTEXTUAL MENU

Retomamos el Ejemplo de [context_menu](./context_menu), pero esta vez agregamos funcionalidad a las opciones de menú.

![MainActivity](./images/7.gif)

1. Para ejecutar acciones de acuerdo al elemento seleccionado del menú, nos basaremos en la función `onContextItemSelected(item: MenuItem?)`.

    ```java
    override fun onContextItemSelected(item: MenuItem): Boolean {
        when(item?.itemId) {
            R.id.copy -> {
                Toast.makeText(this, "Copy", Toast.LENGTH_SHORT).show()
            }
        }
        return super.onContextItemSelected(item)
    }
    ```

2. Implementa el resto de opciones, reutilizando el código del ejemplo previo.


#### POPUP MENU

Retomamos el Ejemplo de [popup_menu](./popup_menu), pero esta vez agregamos funcionalidad a las opciones de menú.

Este código difiere debido a que implementamos un closure para el popMenu, dentro de este closure mediante un capture list obtenemos la opcion deseada.

1. Agregamos el siguiente código en el evento del botón

    ```java
    override fun onClick(v: View?) {
        var popMenu = PopupMenu(this, v)
        popMenu.menuInflater.inflate(R.menu.popmenu, popMenu.menu)
        // implementar closure
        popMenu.show()
    }
    ```

2. Captamos cada opción de menú con su **id** correspondiente.

    ```java
    override fun onClick(v: View?) {
        var popMenu = PopupMenu(this, v)
            popMenu.menuInflater.inflate(R.menu.popmenu, popMenu.menu)
            popMenu.setOnMenuItemClickListener { item ->
                when(item.itemId) {
                    R.id.item1 -> {
                        Toast.makeText(this, "option 1", Toast.LENGTH_SHORT).show()
                        true
                    }
                }
                false
            }
        popMenu.show()
    }
    ```


#### Referencias: 

> https://developer.android.com/guide/topics/ui/menus?hl=es#xml

[`Anterior`](../Reto-01/Readme.md) | [`Siguiente`](../Reto-02/Readme.md)




</div>

