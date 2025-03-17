package academy.learnprogramming.assignment;

public interface IHollywoodMovie {
    String getName();
}

class HollywoodActionMovie implements IHollywoodMovie {
    public String getName() { return "Hollywood-Action"; };
}

class HollywoodComedyMovie implements IHollywoodMovie {
    public String getName() { return "Hollywood-Comedy"; };
}

