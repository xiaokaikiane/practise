import java.lang.Math;
import java.util.Scanner;
public class P1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            double x0 = in.nextFloat();
            double y0 = in.nextFloat();
            double z0 = in.nextFloat();
            double x1 = in.nextFloat();
            double y1 = in.nextFloat();
            double z1 = in.nextFloat();
            double r=Math.sqrt(Math.pow((x0-x1),2)+Math.pow((y0-y1),2)+Math.pow((z0-z1),2));
            double v=(4*Math.acos(-1)*Math.pow(r,3)/3);
            System.out.printf("%.3f",r);
            System.out.print(" ");
            System.out.printf("%.3f", v);
            System.out.println();
        }
        in.close();
    }
}