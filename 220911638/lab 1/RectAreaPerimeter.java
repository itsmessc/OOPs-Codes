class RectAreaPerimeter{
	public static void main(String args[]){
		int l,b;
		l=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		int area=l*b;
		int perimeter = 2*(l+b);
		System.out.println("area:"+area+" perimeter:"+perimeter);
	}
}