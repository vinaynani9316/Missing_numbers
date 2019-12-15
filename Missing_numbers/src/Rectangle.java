class Rectangle            //program to find total area of three rectangle of x & y co-ordinate static input.
{ 
 static class Point 
{ 
	int x, y; 
	public Point(int x, int y) 
	{ 
		this.x = x; 
		this.y = y; 
	} 
}; 
static int totalArea(Point l1, Point r1, Point l2, Point r2, Point l3, Point r3) 
{  
	int area1 = Math.abs(l1.x - r1.x) *  // Area of 1st Rectangle 
				Math.abs(l1.y - r1.y); 

	int area2 = Math.abs(l2.x - r2.x) * // Area of 2nd Rectangle 
				Math.abs(l2.y - r2.y); 

	int area3 = Math.abs(l3.x -r3.x) * // Area of 3rd Rectangle 
			    Math.abs(l3.y-r3.y);
    
	return (area1 + area2 + area3); 
} 
public static void main(String[] args) 
{ 
	Point l1 = new Point( 0, 0 ), 
		r1 = new Point( 2, 2 ); 
	
	Point l2 = new Point( 1, 1 ), 
		r2 = new Point( 3, 3  ); 

	Point l3= new Point( 2, 2 ),
		r3=new Point( 4, 4 );
	
	System.out.println(totalArea(l1, r1, l2, r2, l3, r3)); 
} 
} 


