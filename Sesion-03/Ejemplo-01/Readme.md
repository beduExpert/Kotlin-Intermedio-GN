[`Kotlin Intermedio`](../../Readme.md) > [`Sesión 03`](../Readme.md) > `Ejemplo 1`

## Ejemplo 1: ListView

<div style="text-align: justify;">

### 1. Objetivos :dart:

- Construir un listview básico, con elementos predefinidos.

### 2. Requisitos :clipboard:

1. Android Studio Instalado en nuestra computadora.

### 3. Desarrollo :computer:

1. Abrir un proyecto con una Actividad vacía.

2. En el Layout del *activity_main.xml*, agregamos un ListView que se ajuste al tamaño del Parent (Reemplaza el ConstraintLayout predefinido por un LinearLayout o RelativeLayout). El ListView se debe ver de la siguiente forma:

    ```xml
    <ListView
        android:id="@+id/listView"
        android:smoothScrollbar="true"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        />
    ```

3. Creamos un arreglo con una lista de cualquier clasificación. En este  ejemplo se optó por modelos de coches.

    ```kotlin
    val modeloCoches = arrayOf(
        "Vento",
        "Jetta",
        "Fit",
        "Sonic",
        "206",
        "Tsuru",
        "Versa",
        "Windstar",
        "Safira",
        "Monsa",
        "Lobo",
        "HR-V",
        "Gol",
        "Bora",
        "Rav4",
        "Astra",
        "Mustang",
        "Corsa",
        "Pointer",
        "Aveo",
        "Beetle",
        "Mini cooper"
    )
    ```

4. En el método onCreate, inicializamos el adaptador, por practicidad se opta por un ArrayAdapter (para tomar como modelo un simple array de strings).

    ```kotlin
    val itemsAdapter = ArrayAdapter<String>(
        this, android.R.layout.simple_list_item_1, modeloCoches)
    ```

5. Asignar el adaptador en el listView por medio del método setAdapter (mediante su *property access syntax*)


    ```kotlin
    listView.adapter = itemsAdapter
    ```

6. Agregamos un listener al listView que reaccione al click de alguno de sus elementos (*onClickItemListener*):
    
    ```kotlin
    listView.onItemClickListener =
        OnItemClickListener { parent, view, position, id ->
            //Poner código aquí
        }
    ```

7. Agregamos un Toast para visualizar el valor seleccionado, el listener nos provee con la posición del item en el array, por lo que podemos obtener el string seleccionado poniendo el index en el array. 

    ```kotlin
    Toast.makeText(applicationContext,
        "seleccionaste el coche ${modeloCoches[position]}", 
        Toast.LENGTH_SHORT
    ).show()
    ```

    la pantalla queda de la siguiente manera: 

    <img src="01.png" width="30%">




[`Anterior`](../Readme.md) | [`Siguiente`](../Ejemplo-01a/Readme.md)




</div>
