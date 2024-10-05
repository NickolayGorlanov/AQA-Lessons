package Animals;

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть так далеко.");
        }
    }
}