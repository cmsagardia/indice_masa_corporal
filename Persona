/**
 *
 * @author Usuario
 */
public class Persona {
    
public Persona(){
}

public Persona(String nom,int e){
    
    this.nombre=nom;
    this.edad=e;
    this.peso=0;
    this.altura=0;
}
    
public Persona(String n, int e, double p, double a){
    
    this.nombre=n;
    this.edad=e;
    this.peso=p;
    this.altura=a;
}

public int calcularMC(){
    
    double res;
    res=peso/Math.pow(altura, 2);
    
    if(res<20)
        return -1;
    if (res>=20 & res<=25) 
        return 0;
    else return 1;
}

public String esMayoDeEdad(){
    
    if(edad>21)
        return "Es mayor de edad";
    else
        return "No es mayor de edad";
}

@Override
public String toString(){
    
    return "Nombre: "+nombre+", Edad: "+edad+" ,Peso:"+peso+", Altura:"+altura;
} 

public void setNombre(String nombre){
    
    this.nombre=nombre;
} 

public void setEdad(int edad){
    
    this.edad=edad;
}

public void setPeso(double peso){
    
    this.peso=peso;
}

public void setAltura(double altura){
    
    this.altura=altura;
}

public String getNombre(){
    
    return nombre;
}

public int getEdad(){
    
    return edad;
}

public double getPeso(){
    
    return peso;
}

public double getAltura(){
    
    return altura;
}

private String nombre;
private int edad;
private double peso;
private double altura;
}
