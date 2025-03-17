package academy.learnprogramming.assignment;

public interface IBollywoodMovie {
    String getName();
}

class BollywoodActionMovie implements IBollywoodMovie {
    public String getName() { return "Bollywood-Action"; };
}

class BollwoodComedyMovie implements IBollywoodMovie {
    public String getName() { return "Bollywood-Comedy"; };
}

