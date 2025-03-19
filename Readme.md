## Examen de Test Unitarios

---

### Enunciado

Con el código de este repositorio realiza:

- (*4 puntos*) Los test unitarios de los **dos** métodos, utiliza test **parametrizados**. Suponiendo que la `string` DNI, siempre es un DNI válido.
- (*2 puntos*) En el código, hay un error, ¿lo pudiste comprabar en los test? ¿Plantea la solución?
- (*3 puntos*) Si no hubiera una comprobación previamente encuanto a la longitud de la `string` del DNI, ¿Qué hay que cambiar en los tests para que comprueben estos casos?

Entrega tu repositorio con el código y los test. Además un `Readme` explicando y justificando cada apartado

Formato del `Readme` *1 punto*

---

### Resolución

Los pasos seguidos para la resolución del examen son los siguientes:

Primero verificamos si los dni son correctos, para ello utilizamos e utilizado el test comprobarDNI el cual verificaba el calculo de la letra y si esta era correcta devolvia true, en caso contrario devolvia false.

Lo segundo que hice fue un test para verifica específicamente la letra verificando que si el resto de calcular el dni coincidía con el valor de la letra, mostraba un test correcto.

Lo último que hice fue con un par de test verificar si el la restricción de tamaño de los dni era correct, simplemente verificando el length de los dni nuevos que cree.