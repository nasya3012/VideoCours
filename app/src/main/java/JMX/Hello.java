package JMX;

public class Hello implements HelloMBean {

    private  String name;

    @Override
    public void sayHello() {
        System.out.println("Hello MBean");
    }

    @Override
    public int addIntegers(int a, int b) {
        return a+b;
    }

    @Override
    public Person returnPerson() {
        return new Person();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String s) {
        this.name = name;
    }
}
