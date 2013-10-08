package volador;

class Bird extends Animal implements Flyer
{
    private String tipo;
    

public void takeoff()
   {
   System.out.println("Puede despegar");
   }
public void land()
   {
   System.out.println("Puede aterrizar");
   }
public void fly()
   {
   System.out.println("Puede Volar");
   }

public  void builNest()
{
System.out.println("Puede contruir nidos");
}
public void layEggs()
{
System.out.println("Puede poner huevos");
}
public void eat()
{
System.out.println("Puede comer");
}
public void colocarTipo(String tp)
{
  this.tp(tp);
}
public void tp( String tipoV )
{
tipo = tipoV;
}

public String obtenerTipo()
{
return tipo;
}
public void tipoV()
{
 System.out.println( "Es de tipo :"+ obtenerTipo() );
 
}


}