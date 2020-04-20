import java.util.Scanner;

class Generics < TypeCasting extends Number>
{
    TypeCasting Genericarray[];
    Generics (TypeCasting arr[]) {
        Genericarray = arr;
    }

    double Average() {
        double TotalAverage = 0, sum = 0 ;
        int abcd = Genericarray.length ;
        for (int i = 0 ; i < abcd ; i++)
        {
            sum += Genericarray[i].doubleValue();
        }
        TotalAverage = sum / abcd ;
        // System.out.println("The average is " + TotalAverage);
        return TotalAverage;
    }

    void sameAverage(Generics<?> generics) {
        double a = Average() ;
        if(Average() == generics.Average()) {
            System.out.println("Average is same " + a);
        }
        else{
            System.out.println("Average is different");
        }
    }
} 

public class GenericsSameAverage{
    public static void main(String[] args) {

        int numberz = 5 ;
        Scanner sc = new Scanner(System.in);
        int    [] intArray1      = new int    [numberz];
        int    [] intArray2      = new int    [numberz];
        double [] doubleArray    = new double [numberz];
        float  [] floatArray     = new float  [numberz];
        
        System.out.println("Taking input for intArray1 ");
        System.out.println("Please enter 5 integer:- ");
        for(int i = 0 ; i < numberz ; i++)
        {
            intArray1[i] = sc.nextInt();
        }

        System.out.println("Taking input for intArray2 ");
        System.out.println("Please enter 5 integer:- ");
        for(int i = 0 ; i < numberz ; i++)
        {
            intArray2[i] = sc.nextInt();
        }

        System.out.println("Taking input for doubleArray:- ");
        System.out.println("Please enter 5 double number:- ");
        for(int i = 0 ; i < numberz ; i++)
        {
            doubleArray[i] = sc.nextDouble();
        }

        System.out.println("Taking input for floatArray:- ");
        System.out.println("Please enter 5 float number:- ");
        for(int i = 0 ; i < numberz ; i++)
        {
            floatArray[i] = sc.nextFloat();
        }

        sc.close();
        Generics<Integer> num1 = new Generics<Integer> (new Integer[] {intArray1[0], intArray1[1], intArray1[2], intArray1[3], intArray1[4] } );        
        Generics<Integer> num2 = new Generics<Integer> (new Integer[] {intArray2[0], intArray2[1], intArray2[2], intArray2[3], intArray2[4] } );        
        Generics<Double> decimalnum1 = new Generics<Double> (new Double[] {doubleArray[0], doubleArray[1], doubleArray[2], doubleArray[3], doubleArray[4] } );        
        Generics<Float> decimalnum2 = new Generics<Float> (new Float[] {floatArray[0], floatArray[1], floatArray[2], floatArray[3], floatArray[4] } );  

        System.out.print("For intArray1 and intArray2  ");
        num1.sameAverage(num2);
        System.out.print("For doubleArray and floatArray ");
        decimalnum1.sameAverage(decimalnum2);
    }
}
