# ARSW-LAB2

## Parte I - Before finishing class
> Check the operation of the program and run it. While this occurs, run jVisualVM and check the CPU consumption of the corresponding process. Why is this consumption? Which is the responsible class? 
- ![Estado hilos](https://i.ibb.co/d7F7HZ7/Estado-Hilos.png)
> Make the necessary adjustments so that the solution uses the CPU more efficiently, taking into account that - for now - production is slow and consumption is fast. Verify with JVisualVM that the CPU consumption is reduced. 
- ![Estado hilos](https://i.ibb.co/d7F7HZ7/Estado-Hilos.png)
> Make the producer now produce very fast, and the consumer consumes slow. Taking into account that the producer knows a Stock limit (how many elements he should have, at most in the queue), make that limit be respected. Review the API of the collection used as a queue to see how to ensure that this limit is not exceeded. Verify that, by setting a small limit for the 'stock', there is no high CPU consumption or errors.
- ![Estado Hilos](https://i.ibb.co/tJ1W0KS/Imagen-Estado.png)

## Autores
- **Jose Luis Gomez Camacho**
- **Brayan Felipe Rojas Bernal**