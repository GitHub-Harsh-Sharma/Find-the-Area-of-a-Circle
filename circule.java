import java.io.*;
class Circule
{
    public static void main(String args[])throws IOException
        {
            float radius,area;
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(isr);
            System.out.println("Enter the radius of circule");
            radius=Float.parseFloat(br.readLine());
            area=3.14f*radius*radius;
            System.out.println("area="+area);
        }
}
