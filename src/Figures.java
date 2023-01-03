 enum Figures {
     CIRCLE{
          @Override
          public void show() {
               System.out.println(new Circle().print());
          }
     },
     QUAD{
          @Override
          public void show() {
               System.out.println(new Quad().print());
          }
     },
     SQUARE{
          @Override
          public void show() {
               System.out.println(new Square().print());
          }
     },
     TRIANGLE{
          @Override
          public void show() {
               System.out.println(new Triangle().print());
          }
     },
     PARALLELOGRAM{
          @Override
          public void show() {
               System.out.println(new Parallelogram().print());
          }
     };
      public abstract void show();
}
