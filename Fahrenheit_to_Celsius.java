package challenges;


public class C7_Fahrenheit_to_Celsius {
    public static void main(String[] args) {
        float f=98.3f;
        System.out.println(celsius(f));
    }
    public static float celsius(float f) {
        return (f-32)*5/9;
    }
 
}
