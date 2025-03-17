package academy.learnprogramming.assignment;

public abstract class AbstractFactory {
    public abstract IBollywoodMovie getBollywoodMovie(String type) throws Exception;
    public abstract IHollywoodMovie getHollywoodMovie(String type) throws Exception;
}

class BollywoodMovieFactory extends AbstractFactory {
    public IBollywoodMovie getBollywoodMovie(String type) throws Exception {
        IBollywoodMovie movie = null;
        switch (type) {
            case "Action": movie = new BollywoodActionMovie(); break;
            case "Comedy": movie = new BollwoodComedyMovie(); break;
        }

        if (movie == null) throw new Exception("Unidentified movie type");

        return movie;
    }

    public IHollywoodMovie getHollywoodMovie(String type) {
        return null;
    }
}

class HollywoodMovieFactory extends AbstractFactory {
    public IHollywoodMovie getHollywoodMovie(String type) throws Exception {
        IHollywoodMovie movie = null;
        switch (type) {
            case "Action": movie = new HollywoodActionMovie(); break;
            case "Comedy": movie = new HollywoodComedyMovie(); break;
        }

        if (movie == null) throw new Exception("Unidentified movie type");

        return movie;
    }

    public IBollywoodMovie getBollywoodMovie(String type) {
        return null;
    }
}

