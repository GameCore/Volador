package volador;

public class Airplane extends Vehiculo implements Flyer
{
    private String tipo;
    
public void colocarTipo(String tp)
{
  this.tp(tp);
}
  
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
public void tp( String tipoV )
{
tipo = tipoV;
}

public String obtenerTipo()
{
return tipo;
}
//---------------------//
public void tipoV()
{
 System.out.println( "Es de tipo : " + obtenerTipo() );
 
}

}