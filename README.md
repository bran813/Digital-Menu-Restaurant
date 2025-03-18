# Práctica 3 - Modelado y Programación

## Descripción
En esta práctica realizamos un sistema virtual para un restaurante, como se pidió en la práctica.

- **Patrones de Diseño**: Los patrones a utilizar son Adapter y Decorator.
- **Adapter**: El adapter fue utilizado principalmente para el menú de los helados y la salsa.
- **Decorator**: El decorator se utilizó para añadir ingredientes extras a los platillos sin cambiar su estructura interna base.


## Estructura del Proyecto
Este proyecto es un sistema de pedidos que permite a los usuarios seleccionar platillos de un restaurante y helados de una heladería. Implementa los patrones de diseño Decorator y Adapter para gestionar las órdenes de manera flexible. Las funcionalidades que tiene este proyecto son: 

Menú de Restaurante: Permite a los usuarios seleccionar platillos y añadir modificaciones como opciones veganas, vegetarianas o sin gluten.

Menú de Helados: Muestra una lista de helados disponibles con diferentes sabores.

Decorador: Permite agregar extras a los platillos y opciones de dieta.

Adaptador: Hace que el menú de helados sea compatible con la interfaz del menú general.

Sistema de pedidos: Gestiona las órdenes realizadas por los clientes.

Registro en archivo: Guarda las órdenes en un archivo de texto para futuras referencias.

## Consideraciones del ejercicio

Para la implementación de este proyecto se tomaron en cuenta las siguientes consideraciones:

Uso del patrón Adapter: Se utilizó para permitir que el menú de helados pueda integrarse de manera uniforme con el menú del restaurante sin modificar su estructura interna.

Uso del patrón Decorator: Se aplicó para añadir funcionalidades adicionales a los platillos sin modificar sus clases base, permitiendo extensibilidad y flexibilidad en el sistema.

Registro de pedidos: Se implementó un sistema de almacenamiento en archivo para permitir que se vuelvan a realizar los pedidos previamente ordenados por alguien. 

## Cómo Ejecutar
1. Compila el código:
   ```bash
   javac principal.java
   ```
2. Ejecuta el programa:
   ```bash
   java Principal
   ```
Este proyecto fue hecho con Java 23.

### Integrantes del equipo "asdfg" 
| Nombre | Número de cuenta |
| --- | --- |
| Emilio Durán Tapia | 318075752 |
| Alan Blancas Ochoa | 316227364 |
| Brandon Zamorano Baños | 316250869|
