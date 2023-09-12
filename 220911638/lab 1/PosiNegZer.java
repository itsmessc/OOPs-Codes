class PosiNegZer{
	public static void main(String args[]){
		int l,b,p=0,n=0,z=0;
		for(b=0;b<10;b++)
		{
			l=Integer.parseInt(args[b]);
			if(l>0){
				p=p+1;
			}
			else if(l<0){
				n=n+1;
			}
			else {
				z=z+1;
			}
		}
		System.out.println("Positives:"+p);
		System.out.println("negatives:"+n);
		System.out.println("zeros:"+z);
	}
}