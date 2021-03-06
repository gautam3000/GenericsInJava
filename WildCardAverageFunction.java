

class Generic < T extends Number>
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

    void sameAverage(Generic<?> generics) {
        if(Average() == generics.Average()) {
            System.out.println("Average is same.");
        }
        else{
            System.out.println("Average is different");
        }
    }
} 
public class GC{
    public static void main(String[] args) {
        Generic<Integer> n1 = new Generic<Integer> (new Integer[] { 10,20,30,40,50} );        
        Generic<Integer> n2 = new Generic<Integer> (new Integer[] { 10,20,30,40,50 } );        
        Generic<Double> n3 = new Generic<Double> (new Double[] { 10.3,20.5,30.6,40.4,50.9 } );        
        Generic<Float> n4 = new Generic<Float> (new Float[] {10.3f,20.5f,30.6f,40.4f,50.9f } );   
        n1.sameAverage(n2);
        n3.sameAverage(n4);
    }
}
