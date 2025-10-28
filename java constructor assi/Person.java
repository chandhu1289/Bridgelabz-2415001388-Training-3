class Person {
    String name;
    int age;

    // Parameterized Constructor
    Person(String n, int a) {
        name = n;
        age = a;
    }

    // Copy Constructor
    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
