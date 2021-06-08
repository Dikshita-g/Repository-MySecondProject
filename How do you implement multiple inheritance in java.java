// First Parent class
class ParentClass1
{
    void show()
    {
        System.out.println("ParentClass1");
    }
}

// Second Parent Class
class ParentClass2
{
    void show()
    {
        System.out.println("ParentClass2");
    }
}
class SubClass extends ParentClass1, ParentClass2{
 public static void main(String[] args) {
  SubClass obj = new SubClass();

  obj.show();
 }
}