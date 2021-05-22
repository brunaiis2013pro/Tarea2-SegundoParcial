
public class Estudiante
{
   private int cantEstudiantes;
   private double[] notas;
   private int cont;
    public Estudiante(int cantEstudiantes){
        this.cantEstudiantes = cantEstudiantes;
        notas = new double[cantEstudiantes];
        cont = 0;
    }
        
    public void añadirNotas(double nota){
        if(cont<cantEstudiantes){
            notas[cont] = nota;
            cont++;
        }
    }
    
    public double promedioTodasNotas(){
        double res=0;
        for(int i=0; i<notas.length; i++){
            res += notas[i]; 
        }
        res/=cantEstudiantes;
        
        return res;
    }
    
    public double promedioNotasAprobadas(){
        double res=0;
        int aux=0;
         for(int i=0; i<notas.length; i++){
             if(notas[i]>51){
                 res += notas[i];
                 aux++;
                }
        }
        if(aux>0){
             res/=aux;
        }else{
            System.out.print("No existe ningun estudiante con nota de aprobación");
        }
       return res;
    }
    
    public int cantReprobados(){
        int reprobados=0;
        for(int i=0; i<notas.length; i++){
             if(notas[i]<=51){
                 reprobados++;
             }
        }
        return reprobados;
    }
    
    public int cantAprobados(){
        int aprobados=0;
        for(int i=0; i<notas.length; i++){
             if(notas[i]>51){
                 aprobados++;
             }
        }
        return aprobados;
    }
    
    public String notaMasAlta(){
        double notaAlta=0;
        for(int i=0; i<notas.length; i++){
            if(notas[i] > notaAlta){
                notaAlta = notas[i];
            }
        }
        
        return ("La nota mas alta es: "+notaAlta);
    }
    
}
