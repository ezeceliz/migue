# Software Engineer Test - Cart y Products

_Esta pequeña app permite agregar y borrar Carritos de compras donde se les puede asignar Productos_

## Comenzando 🚀

_Estas instrucciones te permitirán obtener una copia del proyecto en funcionamiento en tu máquina local para propósitos de desarrollo y pruebas._

### Pre-requisitos 📋

_Necesitas tener instalados en tu máquina_

* Java 17 (mínimo)
* Maven
* Postman


### Instalación y Ejecución 🔧

Una vez que clonas el proyecto con git en tu máquina, ingresas al directorio raiz y ejecutas el comando **mvn spring-boot:run**
Esto va a lanzar la app y abre un servidor web que escucha en localhost en el puerto 8080 por defecto

* #### Crear Carrito ####
Desde el navegador podes crear carritos ingresando a http://localhost:8080/cart/1
_En este caso el /1 corresponde al id del carrito, es decir que se va a crear con este número de id_

* #### Agregar Productos al Carrito ####
Luego desde **Postman** podes hacer una Request de tipo **UPDATE** para agregarle productos al carrito en http://localhost:8080/update-cart/1 (el 1 en este caso es el id del carrito que creamos anteriormente)

Para asignar productos mandas como parámetro de tipo JSON por ejemplo:
```
{
    "id" : 54,
    "description" : "product-test-54",
    "amount" : 113.12
}
```

_Esto lo podes ejecutar varias veces cambiando los valores y se van a ir agregando productos al carrito que elegiste actualizar_

* #### Mostrar información de un Carrito específico ####

Desde el navegador si ingresas a http://localhost:8080/cart/info/1 te va a dar la información del Carrito y sus Productos

* #### Eliminar Carrito ####

_Los carritos y sus productos duran en memoria 10 minutos, si queres ver la información de un carrito que esta almacenado pasado los 10 minutos te va a dar una nueva instancia._

Para borrar un carrito de manera manual a través de **Postman** mandas una Request de tipo **DELETE** en http://localhost:8080/delete-cart/1 y borrarías de la cache el carrito con id 1
