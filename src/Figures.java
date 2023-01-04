 final class Figures {
   static String show(Shape shape){
       return shape.print();
   }
   static void showAll(){
       System.out.println(show(new Circle()) + ", " + show(new Quad()) + ", "
               +  show(new Square()) + ", " +  show(new Triangle()) + ", "
               +  show(new Parallelogram())+ ".");
   }
}
