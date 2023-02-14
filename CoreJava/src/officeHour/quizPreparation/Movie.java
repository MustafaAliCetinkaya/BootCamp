package officeHour.quizPreparation;

public abstract class Movie { // line 1
    public abstract void makeMovie();// line 2
}

abstract class Comedy extends Movie { // line 5
    public abstract void makeJoke(); // line 6
}

 abstract class StandUp extends Comedy { // line 9 Movie de bulunan makeMovie() metotu override edilmek zorundadır.
    public void makeJoke() { // line 10
        System.out.println("Joke");
    }

 /*   @Override//We have to override this method. Otherwise, throws error
    public void makeMovie() {

    }*/
}