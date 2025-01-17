public class Bird implements Animal {
    @Override
    public void sleep(){
        System.out.println("the bird sleeps in the nest");
    }
    @Override
    public void move(){
        System.out.println("the bird flies");
    }
    @Override
    public void sound(){
        System.out.println("the bird sings");
    }
}
