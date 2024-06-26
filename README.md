# Juego Interactivo - Zoológico

Este proyecto es un juego interactivo basado en un árbol de decisión, donde el usuario responde a una serie de preguntas para determinar un animal específico. El proyecto está implementado en Java utilizando `Swing` para la interfaz gráfica de usuario.

## Descripción del Proyecto

El juego interactivo presenta una serie de preguntas al usuario, como "¿La gente mantiene este animal en la casa?" o "¿Tiene rayas este animal?". Basado en las respuestas "Sí" o "No", el árbol de decisión avanza a la siguiente pregunta hasta que se llega a una conclusión sobre el animal que el usuario está pensando.

## Estructura del Proyecto

El proyecto consta de las siguientes clases principales:

1. `Animal`: Representa un animal con nombre y descripción.
2. `Nodo`: Representa un nodo en el árbol de decisión que puede ser una pregunta o una respuesta.
3. `ArbolDecision`: Construye y maneja la lógica del árbol de decisión.
4. `InterfazGrafica`: Proporciona la interfaz gráfica para interactuar con el árbol de decisión.

## Requisitos

- JDK 8 o superior
- Un entorno de desarrollo Java (Eclipse, IntelliJ IDEA, etc.)

## Cómo Ejecutar el Proyecto

1. Clona el repositorio a tu máquina local:
   ```sh
   git clone https://github.com/tuusuario/nombre-del-repositorio.git
