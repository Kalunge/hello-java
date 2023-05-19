class Person {
  private String name;
  private int age;

  public void setName(String b) {
    name = b;
  }

  public String showName() {
    return name;
  }

  public void setAge(int a) {
    age = a;
  }

  public int showAge() {
    return age;
  }
}

class Hello {
  public static void main(String[] args) {
    Person person = new Person();

    person.setName("John");

    String newname = person.showName();

    System.out.println(newname);
  }
}