import java.util.Scanner;

class Data < T extends Number>
{
    T array[];
    Data (T arr[]) {
        array = arr;
    }

    double Average() {
        double TotalAverage = 0, sum = 0 ;
        for (int i = 0 ; i < array.length ; i++)
        {
            sum += array[i].doubleValue();
        }
        TotalAverage = sum / array.length ;
        return TotalAverage;
    }

    void sameAverage(Data<?> generics) {
        double a = Average() ;
        if(Average() == generics.Average()) {
            System.out.println("Average is same ");
        }
        else{
            System.out.println("Average is different");
        }
    }
} 

public class GenericsSameAverage{
    public static void main(String[] args) {
        Generics<Integer> n1 = new Generics<Integer> (new Integer[] { 10,20,30,40,50} );        ,
        Generics<Integer> n2 = new Generics<Integer> (new Integer[] { 10,20,30,40,50] } );        
        Generics<Double> n3 = new Generics<Double> (new Double[] { 10.3,20.5,30.6,40.4,50.9 } );        
        Generics<Float> n4 = new Generics<Float> (new Float[] {10.3f,20.5f,30.6f,40.4f,50.9f } );   
        n1.sameAverage(n2);
        n3.sameAverage(n4);
    }
}
