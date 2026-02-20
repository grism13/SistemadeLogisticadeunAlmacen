**INFORMACION DEL TRABAJO**

*INTEGRANTES*:
-Grisangely Martinez
-Roand Rodriguez
-Eliezer Rodriguez
-Andres Diaz

*PROYECTO*:
Sistema de Logística de un Almacén:
-Cola (Entrada de Mercancía): Los camiones llegan
al muelle y se registran en una cola para ser
descargados en orden de llegada.
-Pila (Almacenamiento en Estantes): Los productos
se apilan en contenedores estrechos. Para sacar el
primer producto que llegó (el del fondo), primero
hay que remover los que están encima

*ROLES DE CADA QUIEN*:
Rol 1: Andrés - Desarrollador de la Cola (Llegada de Camiones)
**Archivos a cargo**: NodoCamion.java y ColaMuelle.java.
Misión: Su tarea es programar desde cero la estructura dinámica usando punteros. Debe asegurar que los camiones se encolen por el final y se desencolen por el frente (FIFO).
+1

Rol 2: Roand - Desarrollador de la Pila (Almacenamiento en Estantes)
**Archivos a cargo**: NodoProducto.java y PilaEstante.java.
Misión: Encargado de construir la lógica de los productos. Debe programar la inserción y extracción siempre desde el tope (LIFO), garantizando que no se pierdan las referencias de los nodos al apilar o desapilar.
+1

Rol 3: Eliezer - Desarrollador de la Interfaz y Menú
**Archivo a cargo**: SistemaAlmacen.java.
Misión: Él construirá el menú interactivo por consola usando Scanner. Deberá crear las opciones lógicas (1. Registrar camión, 2. Descargar camión, 3. Almacenar producto, etc.) e instanciar las clases que hagan Andrés y Roand para que el usuario pueda usarlas.

Rol 4: Gris - Líder de Integración, Git y Documentación
**Archivos a cargo**: Repositorio general, integración en SistemaAlmacen.java y bitacora.txt.
Misión: Como propuse la estructura, sere la encargada de inicializar el repositorio en Git/GitHub hoy mismo con los archivos base. Además, sere responsable de compilar el código de los tres, resolver los errores de integración y llevar el registro diario obligatorio en la bitácora respondiendo a las preguntas exigidas (qué se hizo, qué IA se usó, problemas encontrados). También coordinará el guion para el video de defensa.


*¿QUE DEBEMOS RESPONDER CADA DIA EN LA BITACORA?*
¿Qué se trabajó hoy?
¿Qué inteligencia artificial se utilizó? (Si aplica)
¿Qué prompt se hizo?
¿Qué respondió la IA?
¿Cómo se adaptó esa respuesta al proyecto?
¿Qué problemas se encontraron? (Si los hubo)

-Este proyecto se llevara a cabo con los conocimientos impartidos por el profesor en clase y la guia de nuestra amiga y hermana geminis, IA usada por los integrantes del grupo



#Bitacora dia 1 20/02/2026

# Bitácora día 1 - 20/02/2026

¿Qué se trabajó hoy?
Se definió el alcance del proyecto eligiendo la "Opción A: Sistema de Logística de un Almacén". Se inicializó el repositorio en GitHub con la estructura base de archivos en VSCode y se asignaron los roles de desarrollo para cada integrante. Además, Andrés finalizó el desarrollo del primer módulo funcional: la estructura dinámica de la Cola de Camiones, programando las clases NodoCamion y ColaMuelle utilizando punteros y respetando el principio FIFO.

¿Qué inteligencia artificial se utilizó? (Si aplica)
Se utilizó Gemini.

¿Qué prompt se hizo?
Se realizaron consultas de estructuración inicial, destacando: "Se trata de un proyecto de estructuras de datos... haz un resumen de lo que debe ser el proyecto... explícanos el paso a paso", "¿Qué proyecto debería elegir para mi grupo?" y "Necesito que me des las bases para ir agregando todos los archivos al VSCode".

¿Qué respondió la IA?
La IA desglosó los requerimientos del profesor, recomendó la Opción A por su solidez técnica, propuso la división del código en tres módulos independientes (Cola, Pila y Main), asignó las tareas específicas por integrante, y generó un diagrama de flujo para visualizar la transferencia de datos entre la llegada al muelle y el almacenamiento.

¿Cómo se adaptó esa respuesta al proyecto?
Se creó el archivo README.md plasmando los roles y responsabilidades sugeridos. Se crearon todos los archivos .java base en el entorno de desarrollo y se implementó la lógica de Nodos para los camiones y el muelle (frente y fin) sugerida por la IA.

¿Qué problemas se encontraron? (Si los hubo)
Inicialmente hubo dudas sobre si se debían emplear interfaces gráficas de usuario o colecciones de Java, pero se aclaró a tiempo que el sistema debía ejecutarse 100% por consola y las estructuras debían crearse totalmente desde cero usando nodos.