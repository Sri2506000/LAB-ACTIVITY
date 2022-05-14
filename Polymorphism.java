class Shape
{ 
 
void draw()

{

System.out.println("drawing...");

}

}  

class Square extends Shape

{ 
 
void draw()

{

System.out.print System.out.println("drawing square...");
} 

}  

class Rectangle extends Shape

{
  
void draw()

{

System.out.println("drawing rectangle...");

}

}
  
class Circle extends Shape

{
  
void draw()

{

System.out.println("drawing circle...");

}  

}  

class Polymorphism
{ 
 
public static void main(String args[])

{
  
Shape s;
  
s=new Square();
  
s.draw();
  
s=new Rectangle();
  
s.draw(); 
 
 s=new Circle();
  
s.draw(); 

} 

}