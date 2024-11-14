public class Fish implements Animal{

    @Override
    public void sleep(){
        System.out.println("the fish sleeps in the water");
    }
    @Override
    public void move(){
        System.out.println("the fish moves in the sleep");
    }
    @Override
    public void sound(){
        System.out.println("the fish makes bubling sound");
    }
}
