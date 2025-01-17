public class Egg {
    public void print(){
        System.out.println("Each egg has an albumen and a yolk.");

    }
    public void nutritionInfo(){
        System.out.println("The egg is a nutritional product");

    }
}

class OstrichEgg extends Egg {
    @Override
    public void print(){
        System.out.println("The albumen and yolk of an ostrich are the largest.");

    }

}
