import java.util.*;   // program to calculate area of n rectangles
public class Rec
{
   private static class Rectangle
   {
      public int x1;
      public int y1;
      public int x2;
      public int y2;
      
      public Rectangle(int x1, int y1, int x2, int y2)
      {
         this.x1 = x1;
         this.y1 = y1;
         this.x2 = x2;
         this.y2 = y2;
      }
      public boolean contains(int x, int y)
      {
         return x1 <= x && x <= x2 && y1 <= y && y <= y2;
      }
      public double getArea()
      {
         return (x2 - x1) * (y2 - y1);
      }   
   }   
    public static void main(String args[])
   {
      ArrayList<Rectangle> rects = new ArrayList<>();
      Scanner scan = new Scanner(System.in);
      System.out.println("enter the number of rectangles: n");
      int count = scan.nextInt();
      while(count-- > 0)
      {
         scan.nextLine();
         System.out.println("Enter co-ordinates values");
         rects.add(new Rectangle(
               scan.nextInt(),
               scan.nextInt(),
               scan.nextInt(),
               scan.nextInt()));
      }
      ArrayList<Integer> xPoints = new ArrayList<>();
      ArrayList<Integer> yPoints = new ArrayList<>();
      for(Rectangle r : rects)
      {
         xPoints.add(r.x1);
         xPoints.add(r.x2);
         yPoints.add(r.y1);
         yPoints.add(r.y2);
      }
      Collections.sort(xPoints);
      Collections.sort(yPoints);  //some sections have 0 area, but they also add 0 
      int totalArea = 0;
      for(int i = 0; i < xPoints.size() - 1; i++)
      {
         for(int j = 0; j < yPoints.size() - 1; j++)
         {
            Rectangle thisSection = new Rectangle(
                  xPoints.get(i),
                  yPoints.get(j),
                  xPoints.get(i+1),
                  yPoints.get(j+1));
            int midx = (xPoints.get(i) + xPoints.get(i+1)) / 2;
            int midy = (yPoints.get(j) + yPoints.get(j+1)) / 2;
            for (int k = 0; k < rects.size(); k++)
            {
               if (rects.get(k).contains(midx,midy))
               {
                  totalArea += thisSection.getArea();   
                  break;
               }   
            }   
         }
      }
      System.out.println("Total area is:" +totalArea); scan.close();}}