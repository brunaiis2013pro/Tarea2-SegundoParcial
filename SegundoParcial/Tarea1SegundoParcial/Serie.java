public class Serie
{
    public int ejercicioOne(int n){
        int a=1;
        int incremento=1;
        int cont=0;
       
        for(int i=0; i<n; i++){
            System.out.print(a + " ");
            cont++;
            
            if(i<n-1){//Aumente esta condicion porque asi evito que se le sume un valor demas a "a" y el return se vea diferente a la serie
                //ejemplo: que me pidan hasta el valor 18 y sin esta condicion se le sumaria +2 y en el return me mostraria a=20
            
                if(incremento ==1){
                    a= a+1;
                    incremento =2;
                   
                }
                else if(incremento==2){
                    a +=2;
                    if(cont==4){
                        incremento = 1;
                        cont = 0;
                    }else{
                        incremento = 3;
                    }
                            
                }else if(incremento==3){
                    a +=3;
                    incremento = 2;
                }
            }
        }
        return a;
    }
    
    public int ejercicioTwo(int num){
        int numAnt1 = 1;
        System.out.print(numAnt1 + " ");
        int numAnt2 = 1;
        System.out.print(numAnt2 + " ");
        int numAnt3 = 1;
        System.out.print(numAnt3 + " ");
        int actual = 0;
        
        System.out.print("");
        
        for(int i = 4; i<=num; i++){
            actual = numAnt3 + numAnt2;
            System.out.print(actual + " ");
            numAnt3 = numAnt2;
            numAnt2 = numAnt1;
            numAnt1 = actual;
        }
        
        return actual;
    }
    
    
    
}
