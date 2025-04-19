import java.util.Arrays;
import java.util.List;

public class ejercicio2 {
    /*Eres un analista de datos en una escuela y tienes un registro de las calificaciones de los estudiantes en 
    diferentes materias. Cada registro está representado por una cadena de texto que contiene el nombre del estudiante,
     la materia y la calificación, separados por comas. Tu tarea es procesar estos datos para obtener información útil.

Los datos de entrada son una lista de cadenas de texto, donde cada cadena representa una calificación en el formato:
 "estudiante,materia,calificacion". Por ejemplo: */
 List<String> calificaciones = Arrays.asList(
    "Juan,Matematicas,85",
    "Ana,Historia,90",
    "Pedro,Matematicas,70",
    "Juan,Historia,75",
    "Ana,Matematicas,95",
    "Pedro,Historia,80"
);
/*Tareas
Calcular el Promedio de Calificaciones por Estudiante: Calcula el promedio de calificaciones para cada estudiante.
Contar Estudiantes por Materia: Cuenta cuántos estudiantes tienen calificaciones en cada materia.
Filtrar Calificaciones Mayores a un Valor Específico: Filtra y muestra las calificaciones que son mayores a un valor específico.
Obtener la Materia con el Promedio Más Alto: Determina cuál es la materia con el promedio de calificaciones más alto. */
}
