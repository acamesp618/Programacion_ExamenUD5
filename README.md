## ¿Por qué ItemBiblioteca se ha definido como clase abstracta? 
Se ha definido como clase abstracta para que sus clases hijas tengan como obligatorio tener sus métodos

## Explica por qué la relación entre Libro y Autor es composición y no herencia. 
Es composición porque se encuentran al mismo nivel. La clase Autor no hereda ningún atributo ni método de la clase Libro.
Se puede deducir porque los Libros tienen Autores, por lo que no son sus clases hijas.

## Indica dos ventajas de usar encapsulación en las clases del ejercicio. 
La encapsulación ayuda con la privacidad de la información y para que esta no sea modificada.

## ¿Por qué ConfiguracionSistema podría declararse como final? 
Se declara como final porque no queremos que esa clase sea modificada, por lo tanto sería la ultima clase y de ella no van a surgir ninguna clase hija.

## ¿Qué ocurriría si el atributo contador de ContadorItems no fuera estático? 
Que no tendría el mismo valor para todas las clases. Se establece un atributo estatico para que tengan el mismo valor en diferentes clases.

## En qué situaciones es más adecuado utilizar herencia en lugar de composición. 
Es más adecuado cuanddo queremos especificar una clase que tenga distintos atributos pero adquiriendo así los atributos padre. Es decir, tenemos muchos vehiculos pero queremos especificar si es un coche o una moto ya que cada uno tiene atributos diferentes pero comparten ser un vehiculo.

## ¿Qué métodos importantes heredan todas las clases de Object? Menciona al menos tres. 
Los métodos que heredan son toString(), equals() y hashCode().

## Explica brevemente el polimorfismo y cómo aparece en este ejercicio. 
El polimorfismo es cuando un mismo método se usa en diferentes clases. Se usa por ejemplo al usar el metodo obtenerDescripcion().

## Observa el siguiente método:
1. ¿Qué se imprimirá? Explica por qué ocurre esto en Java.
   Se imprimirá la referencia del titulo, esto ocurre porque no se modifica integramente. Al modificar t, se crea una copia pero el titlo original sigue estando en la "base de datos" el programa

4. 
