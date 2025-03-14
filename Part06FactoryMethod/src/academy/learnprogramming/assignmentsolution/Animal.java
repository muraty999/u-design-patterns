package academy.learnprogramming.assignmentsolution;

interface Animal {
    void Speak();
}

class Duck implements Animal
{
    @Override
    public void Speak(){
        System.out.println("Duck says Pack-pack");
    }
}

class Tiger implements Animal
{
    @Override
    public void Speak() {
        System.out.println("Tiger says Halum-Halum");
    }
}

