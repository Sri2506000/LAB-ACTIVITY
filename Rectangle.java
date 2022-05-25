interface testrec {
	void area();
}

 class Rectangle implements testrec {
	@Override
	public void area() {
		int length=65;
		int breath=35;
		int area=length*breath;
		System.out.println("area of rectangle:"+area);
	}
	public static void main(String[] args) {
	Rectangle r=new Rectangle();
	r.area();
	}
 }
				
 


