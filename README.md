# ARSW-LAB2

## Parte I - Before finishing class
> Check the operation of the program and run it. While this occurs, run jVisualVM and check the CPU consumption of the corresponding process. Why is this consumption? Which is the responsible class? 
- ![Estado hilos](https://i.ibb.co/d7F7HZ7/Estado-Hilos.png)
> Make the necessary adjustments so that the solution uses the CPU more efficiently, taking into account that - for now - production is slow and consumption is fast. Verify with JVisualVM that the CPU consumption is reduced. 
- ![Estado hilos](https://i.ibb.co/d7F7HZ7/Estado-Hilos.png)
> Make the producer now produce very fast, and the consumer consumes slow. Taking into account that the producer knows a Stock limit (how many elements he should have, at most in the queue), make that limit be respected. Review the API of the collection used as a queue to see how to ensure that this limit is not exceeded. Verify that, by setting a small limit for the 'stock', there is no high CPU consumption or errors.
- ![Estado Hilos](https://i.ibb.co/tJ1W0KS/Imagen-Estado.png)

## Parte II - Inmortals
> Review the code and identify how the functionality indicated above was implemented. Given the intention of the game, an invariant should be that the sum of the life points of all players is always the same (of course, in an instant of time in which a time increase / reduction operation is not in process ). For this case, for N players, what should this value be?
- La invariante para este caso en donde hay N jugadores, es multiplicar la vida incial que es 100 por el numero de jugadores: _100*N_ 

> Run the application and verify how the ‘pause and check’ option works. Is the invariant fulfilled?
- Cuando ejecutamos la aplicacion y hacemos uso del botón pause and check nos damos cuenta que la invariante no se cumple ya que los diferentes hilos que se utlizan hacen uso de la variable health y esto genera una condicion de carrera ya que mientras uno de los hilos esta modificando la variable otro la esta escribiendo en el programa y esto ocurre por lo que no esta sincronizada o no utiliza metodos thread safe

> Check the operation again (click the button many times). Is the invariant fulfilled or not ?.
- Para este punto se esta cumpliendo la invariante ya que sincronizamos la variable health
> Analyzing the simulation operation scheme, could this create a race condition?
- puede ver la respuesta en [Answers](https://github.com/FelipeRojas15/ARSW-LAB2/edit/master/ANSWERS.txt)
## Autores
- **Jose Luis Gomez Camacho**
- **Brayan Felipe Rojas Bernal**
