public class cars2
{
    public static void main(String[] args)
    {
        String[] color = new String[10];
        color[0] = "Red";
        color[1] = "Green";
        color[2] = "Black";
        color[3] = "Grey";
        color[4] = "Purple";
        color[5] = "Grey";
        color[6] = "Yellow";
        color[7] = "White";
        color[8] = "Black";
        color[9] = "Purple";

        for (int i = 0; i < color.length; i++)
            if (color[i].equals("Black"))
            {
                System.out.println("car number "+i+ " is Black..!");
            }
         else
            {
                System.out.println("car number "+i+ " is not Black..!");
            }
    }
}