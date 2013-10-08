package volador;

class PruebaVolador
{
    
   
public static void main(String [] args)
{
Flyer volar[] = new Flyer[10];

volar[ 0 ] = new SeaPlane();
volar[ 1 ] = new Helicopter();
volar[ 2 ] = new Bird();
volar[ 4 ] = new Superman();
volar[ 5 ] = new Airplane();

for(int vc=0; vc < volar.length; vc++)
{
    
if(volar[vc] instanceof SeaPlane )
{
    SeaPlane volarActual = (SeaPlane) volar[0];
volarActual.colocarTipo("Aereoplano Navio");
volarActual.tipoV();
volarActual.takeoff();
volarActual.land();
volarActual.fly();
}
else
    if(volar[vc] instanceof Helicopter)
    {
        Helicopter volarActual = (Helicopter) volar[vc];
        volarActual.colocarTipo("Helicoptero");
volarActual.tipoV();
volarActual.takeoff();
volarActual.land();
volarActual.fly();
    
    }
    
else
    if( volar[vc] instanceof Bird )
    {
        Bird volarActual = (Bird) volar[vc];
        volarActual.colocarTipo("Ave");
volarActual.tipoV();
volarActual.takeoff();
volarActual.land();
volarActual.fly();
volarActual.builNest();
volarActual.layEggs();
volarActual.eat();
    
    }
else
    if( volar[vc] instanceof Superman )
    {
        Superman volarActual = (Superman) volar[vc];
volarActual.colocarTipo("Alienigena");
volarActual.tipoV();
volarActual.takeoff();
volarActual.land();
volarActual.fly();
volarActual.leapBuilding();
volarActual.stopBullet();
volarActual.eat();
    
    }
else
    if( volar[vc] instanceof Airplane )
    {
        Airplane volarActual = (Airplane) volar[vc];
volarActual.colocarTipo("Aereoplano");
volarActual.tipoV();
volarActual.takeoff();
volarActual.land();
volarActual.fly();
;
    
    }
}
    
}        
}