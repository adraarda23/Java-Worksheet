package Day17_2;
//Aggregation
public class Exercise01 {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Wheel wheel = new Wheel(0, 0);
        Pedal pedal = new Pedal(wheel);
        wheel.increaseRpm();
        pedal.reduceRpm();
        
        wheel.showSpeed();
    }

    static class Bike {}

    static class Wheel {
        private int rpm = 0;
        private double wheelSpeed = 0;

        public Wheel(int rpm, int wheelSpeed) {
            this.rpm = rpm;
            this.wheelSpeed = wheelSpeed;
        }

        public void increaseRpm() {
            rpm += 10;
            setSpeed();
            
        }
        public void setSpeed() {
        	wheelSpeed=rpm*rpm/10.0;
        }

        public void showSpeed() {
            System.out.println(wheelSpeed +" m/sn");
        }

        public int getRpm() {
            return rpm;
        }

        public void reduceSpeed(int speedReducer) {
        	if (wheelSpeed >= 5)
            rpm -= speedReducer;
        	else
        		rpm=0;
        	setSpeed();
        
        }
    }

    static class Pedal {
        private final int speedReducer = 5;
        private Wheel wheel;

        public Pedal(Wheel wheel) {
            this.wheel = wheel;
        }

        public void reduceRpm() {
            wheel.reduceSpeed(speedReducer);
        }
    }
}
