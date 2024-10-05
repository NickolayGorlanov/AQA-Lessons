package Animals;

class Cat extends Animal {
    private boolean isFull;

    public Cat(String name) {
        super(name);
        this.isFull = false;
    }

    public void eat(Bowl bowl) {
        if (bowl.feedCat(this)) {
            this.isFull = true;
            System.out.println(name + " покушал.");
        } else {
            System.out.println(name + " не может покушать, еды недостаточно.");
        }
    }

    public boolean isFull() {
        return isFull;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " устал и не может бежать дальше.");
        }
    }

}