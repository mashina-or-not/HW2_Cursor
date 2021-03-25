public class Car {
    //Написать класс «автомобиль», который должен уметь заводится, глушить мотор, ехать и держать необходимую скорость.
    private boolean Engine = false;
    private int currentSpeed;
    private final int maxSpeed = 300;

    public void engineStart() {
        if (Engine)
            System.out.println("Engine already started");
        else {
            Engine = true;
            System.out.println("Engine start");
        }
    }

    public void engineStop() {
        if (!Engine)
            System.out.println("Engine already stopped");
        else {
            Engine = false;
            System.out.println("Engine stop");
        }
    }

    public void speedUp(int speed) {
        if (Engine) {
            if (speed > maxSpeed || speed < 0)
                System.out.println("Impossible speed for this brand of car");
            else {
                currentSpeed += speed;
                if (currentSpeed > maxSpeed || currentSpeed < 0)
                    System.out.println("Impossible speed for this brand of car");
                else if (currentSpeed == 0)
                    System.out.println("The car is standing");
                else
                    System.out.println("Speed: " + currentSpeed);
            }
        } else {
            System.out.println("The engine is off");
        }
    }

    public void currentSpeed() {
        if (Engine) {
            if (currentSpeed == 0)
                System.out.println("The car is standing");
            else
                System.out.println("Current speed: " + currentSpeed);
        } else {
            System.out.println("The engine is off");
        }
    }

    public void speedDown(int speed) {
        if (Engine) {
            if (speed > maxSpeed || speed < 0)
                System.out.println("Impossible speed for this brand of car");
            else {
                currentSpeed -= speed;
                if (currentSpeed < 0)
                    System.out.println("Impossible speed for this brand of car");
                else if (currentSpeed == 0)
                    System.out.println("The car is standing");
                else
                    System.out.println("Speed: " + currentSpeed);
            }
        } else {
            System.out.println("The engine is off");
        }
    }
}