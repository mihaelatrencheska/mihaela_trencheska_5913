public class Egg {

    public void Egg() {
        System.out.println("the albumen and yolk of an ostrich egg are ");
    }

    public void print() {
        System.out.println("the egg is a nutritional product.");
    }

}
    class OstrichEgg extends Egg {
        @Override
        public void Egg() {
            System.out.println("the albumen and yolk of an ostrich are the largest.");
        }
    }



