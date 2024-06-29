[`Kotlin Intermedio`](../../Readme.md) > [`Sesión 01`](../Readme.md) > `Ejemplo 1`

## Ejemplo 2: EditText e imágenes

<div style="text-align: justify;">

### 1. Objetivos :dart:

- Posicionar imágenes en el layout a través de un View.
- Explorar los atributos básicos de un View.

### 2. Requisitos :clipboard:

1. Android Studio Instalado en nuestra computadora.
2. Seguir la instrucciones para esta sesión.

### 3. Desarrollo :computer:

### ImageView

1. Abre __Android Studio__ y crea un nuevo proyecto con Activity Vacía (Empty Activity).

2. Abrimos el archivo XML en la carpeta _layout_.

    Utiliza el siguiente código para sustituir el _ViewGroup_ actual por _LinearLayout_

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
   
3. Agrega un ImageView, mediante el siguiente código:

    ```xml
    <ImageView
        android:layout_height="wrap_content"
        android:layout_width="wrap_content"
        android:src="@drawable/beto"
        />
    ```

4. Existe un atributo ___src___ con un drawable llamado _beto_, por lo que tenemos qué agregar una imagen con ese nombre en el directorio ___res/drawable/___.

    <img src="images/0.png" width="40%">

5. Nuestro diseño se visualiza así:

    <img src="images/wrap_content.png" width="40%">

    El tamaño excesivo se debe a que el ImageView por asignarle _wrap_content_ al ancho y alto, se ajusta al tamaño de la imagen.

    Vamos a definir un tamaño específico para nuestro _View_:

    ```xml
    android:layout_height="48dp"
    android:layout_width="120dp"
    ```

6. Aunque la imagen se alcanza a ver completamente, las dimensiones del _ImageView_ no corresponden a la escala de la imagen. En este _View_ tenemos disponible un atributo para describir el escalamiento que llevará nuestra imagen:

    VALOR | ENUM en ImageView.ScaleType | DESCRIPCION | EJEMPLO
    ------|------------------|-------------|----------
    center | CENTER | centra la imagen sin escalamiento |   <img src="images/center.png" width="80%">
    centerCrop | CENTER_CROP | centra la imagen y mantiene su proporción, haciendo un recorte si la imagen es más grande que el _View_ | <img src="images/center_crop.png" width="80%">
    centerInside | CENTER_INSIDE | redimensiona la imagen manteniendo su proporción para que sus medidas quepan en el _View_ (igual o menor). |  <img src="images/center_inside.png" width="80%">
    fitEnd | FIT_START | redimensiona la imagen manteniendo su proporción para que quepa y se alinee al principio del _View_ | <img src="images/fit_end.png" width="80%">
    fitCenter | FIT_CENTER | redimension la imagen manteniendo su proporción para que quepa y se centre en el _View_ | <img src="images/fit_center.png" width="80%">
    fitEnd | FIT_END | reescala la imagen manteniendo su proporción para que quepa y se alinee al final del _View_ | <img src="images/fit_end.png" width="80%">
    fitEnd | FIT_END | redimensiona la imagen cambiando su proporción para ajustarse a las medidas del _View_ | <img src="images/fit_xy.png" width="80%">

    Experimenta con cada una de estas opciones. Finalmente, utiliza la opción ___centerInside___.

### EditText

1. Ahora agrega un EditText con las siguientes líneas de código después del ImageView:

    ```xml
    <EditText
        android:id="@+id/editText"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        />
    ```

    <img src="images/edit_text.gif" width="40%">

2. Como el tamaño lo ponemos en función del contenido, este se redimensiona al agregar texto, esto no es deseable. Determinaremos un tamaño fijo, modificando el  EditText:

    ```xml
    <EditText
        android:id="@+id/editText"
        android:hint="@string/add_text"
        android:textColorHint="@color/colorAccent"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="24dp"
        android:layout_marginHorizontal="24dp"
        android:inputType="text"
        android:drawableStart="@drawable/boy"
        android:drawablePadding="12dp
        />
    ```

3. En este caso, utilizamos el ancho de nuestro _LinearLayout_ con un margen de 24dp para cada lado, e incluimos el _inputType_ como text (con eso evitamos un texto multilínea).
Este último atributo regula el tipo de dato que introducimos y por ende modifica el teclado, de modo que si nuestro _InputType_ es _phone_, nos desplegará un teclado numérico, o si se trata de un _textEmailAddress_, saldrá un teclado alfanumérico que nos facilita caracteres como el . y @. 

    El texto de descripción se controla por la propiedad hint y su color por _textColorHint_. En este caso, haría falta agregar un string llamado _add_text_ para que funcione correctamente. 

    Finalmente, _drawableStart_ nos da la posibilidad de poner una imagen del lado izquierdo para personalizarlo, existen otros atributos para agregar en otros lados las imágenes e incluso para añadir padding al drawable con _drawablePadding_.

4. Ahora revisemos el concepto de focus que determina si un elemento está activo. 
En el caso de un _EditText_, es cuando está seleccionada, apareciendo el cursor en este y mostrándose el teclado para edición.

    <img src="images/inputs.gif" width="40%">

     Se puede deshabilitar la propiedad focusable de un EditText, pero por ahora esto no es requerido. 

    Cuando tenemos varios campos, podemos seleccionar qué elemento se va a enfocar después de terminar de editar en un _EditText_. Por defecto, esto está seteado de arriba para abajo.
    Agregamos un nuevo _EditText_ que pida un teléfono, para esto, limitaremos los caracteres a 10 y agregaremos y declararemos el tipo de input a _phone_:

    ```xml
    <EditText
        android:id="@+id/editText2"
        android:hint="@string/phone"
        android:textColorHint="@color/colorAccent"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="24dp"
        android:maxLength="10"
        android:layout_marginHorizontal="24dp"
        android:inputType="phone"
        android:drawableStart="@drawable/phone"
        android:drawablePadding="12dp"
        />
    ```

    ¡Y listo! Lo que aparece en EditText, puede verse en TextView

    <img src="images/inputs.gif" width="40%">

    Podemos determinar los siguientes campos manualmente mediante los siguientes atributos:


    ATRIBUTO | DESCRIPCION 
    ---------|-------------
    nextFocusDown | determina el siguiente campo navegando hacia abajo
    nextFocusUp | determina el siguiente campo navegando hacia arriba
    nextFocusLeft | determina el siguiente campo navegando hacia la izquierda
    nextFocusRight | determina el siguiente campo navegando hacia la derecha

    también esto se puede hacer de forma programática.


5. Ahora, nos queda manejar algunos eventos del _EditText_, primero vamos a detonar una acción cuando el texto se modifique. Para eso utilizaremos un _TextWatcher_.

   Agregamos las variables:

    ```kotlin
    private lateinit var editText: EditText
    private lateinit var editText2: EditText
    ```

   relacionamos las variables con los id's del layout:
   
    ```kotlin
    textView = findViewById(R.id.textView)
    editText = findViewById(R.id.editText)
    editText2 = findViewById(R.id.editText2)
    ```

   Y agregamos el _listener_ para los eventos de cuando el texto cambia:
   
    ```kotlin
    editText.addTextChangedListener(object : TextWatcher {
        override fun afterTextChanged(s: Editable) {}
        override fun beforeTextChanged(
            s: CharSequence, start: Int,
            count: Int, after: Int
        ) {
        }

        override fun onTextChanged(
            s: CharSequence, start: Int,
            before: Int, count: Int
        ) {
            Log.d("Test","Los valores son: ${editText.text} y ${editText2.text}")
        }
    })
    ```

    Como vemos anteriormente, hay tres callbacks a definir (_afterTextChanged, beforeTextChanged_ y _onTextChanged_), utilizamos el último callback y asignaremos el texto del _EditText_ en nuestro _TextView_.

    y listo! lo que aparezca en el EditText lo visualizamos en el TextView!

    <img src="images/text_changed.gif" width="40%">

    Por último, imprimiremos los valores de los editText, modificando los valores en nuestra línea de comandos Logcat al pulsar sobre un botón.

    ```xml
    <Button
        android:id="@+id/button"
        android:layout_height="wrap_content"
        android:layout_width="wrap_content"
        android:layout_marginTop="12dp"
        android:text="@string/accept"/>
    ```

    Agrega el botón y lo asocias a su id, para no redundar en código omitimos este paso. Finalmente, imprime en consola los textos de los _EditText_ cuando des click al botón:

    ```kotlin
    Log.d("Test","Los valores son: ${editText.text} y ${editText2.text}")
    ```

    Corroboramos el funcionamiento, visualizando el siguiente mensaje en la terminal de android studio "Los valores son: (Usuario) y (Teléfono)"

    <img src="images/1.png" width="70%"/>

<br/>

[`Anterior`](../Reto-01/Readme.md) | [`Siguiente`](../Reto-02/Readme.md)

</div>
