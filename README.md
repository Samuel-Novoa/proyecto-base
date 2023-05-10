# Proyecto Base
Samuel Jeronimo Novoa Suta

## Enfoque
Se le ha asignado el desarrollo de una aplicación de consola simple para gestionar un proyecto de ventas de audífonos. La aplicación debe permitir a los usuarios ingresar información básica sobre los productos, como modelo, precio y cantidad en stock. Además, debe ofrecer la posibilidad de realizar ventas y actualizar el inventario de forma adecuada.

Teniendo en cuenta que el proyecto es en consola, la interfaz será de texto, y las funcionalidades se centrarán en la gestión eficiente de los datos y la facilidad de uso. No se incluirán características avanzadas como integración con sistemas de pago o análisis de métricas, ya que el enfoque principal es la simplicidad y el manejo básico de ventas e inventario.

## Historial De Usario
### Descripcion
<hr>
Como cliente, se debe poder explorar el catalogo de audifonos disponibles, para que puede seleccionar el modelo que mejor se adepte a las necesidades.

**Criterios de aceptacion**
+ La aplicacion de consola debe mostrar una lista con los modelos de audifonos disponibles.
+ La lista debe incluir informacion basica del producto como nombre, precio y cantidad en stock.
+ La aplicacion debe permitir al cliente seleccionar un modelo de audifono.
+ Una vez seleccionado el modelo, la aplicacion debe actualizar el invetario y confirmar la venta.

**Escenario [ 1 ]:**
Un cliente quiere explorar el catalogo de audifonos disponibles y realizar una compra.
1. El cliente inicia la aplicacion de consola.
2. La aplicacion muestra una lista de audifonos disponibles con informacion basica [ nombre, precio, cantidad en stock ].
3. El cliente selecciona un modelo de audifono de la lista.
4. La aplicacion verifica si hay suficiente stock para el modelo seleccionado.
5. Si hay stock, la aplicacion confirma la ventana y actualiza el inventario.
6. Si no hay stock, la aplicacion informa al clienta y le permite seleccionar otro modelo o salir de la aplicacion. 

## Equipo de desarrollo
| **Desarrollo Logico** | **Codificardor de codigo** | **Tester** |
|-----|-----|-----|
| Samuel Jeronimo Novoa Suta | Samuel Jeronimo Novoa Suta | Samuel Jeronimo Novoa Suta |

<hr>

## Aproximacion caso de uso
**Nombre:** Tienda de audifonos.
**Actores:** Clientes, Desarrolladores, Administradores de proyecto.
**Porposito:** Gestionar todo el proceso de una tienda de audífonos, contando con stock, ventas y descripciones de productos.
**Curso Normal de Eventos:**
1. El cliente inicia la aplicación de la consola.
2. La aplicación muestra una lista de audífonos disponibles con información básica (nombre, precio, cantidad en stock).
3. El cliente selecciona un modelo de audífono de la lista.
4. La aplicación verifica si hay suficiente stock para el modelo seleccionado.
5. Si hay stock, la aplicación confirma la venta y actualiza el inventario.
6. Si no hay stock, la aplicación informa al cliente y le permite seleccionar otro modelo o salir de la aplicación.

<hr>

## Diagrama de flujo
