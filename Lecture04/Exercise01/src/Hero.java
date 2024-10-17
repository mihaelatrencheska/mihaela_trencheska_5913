
public class Hero {
        private int health;

        private int strength;

        public Hero(int health, int strength){
            this.health= health;
            this.strength= strength;
        }

        public void displayStats(){
            System.out.println("Current health: " + health + " current strength " + strength);
        }

        public void takeDamage (int damage){
           health = health - damage;
        }

        public  void powerUp(int increase) {
            strength= strength + increase;

    }
    public static void main(String[] args){
            Hero h = new Hero(100, 10 );
            h.displayStats();
            h.takeDamage(20);
            h.powerUp(10);
            h.displayStats();
    }
    }
