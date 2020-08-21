package home_work_1p;
import java.util.Random;
public class Main {
    public static void main( String[] args ) {
        Random rand = new Random();
        RunAndJump[] runAndJumps = new RunAndJump[3];

        int distance = rand.nextInt(10);
        int heigth = rand.nextInt(10);
        runAndJumps[0] = new Human("Sasha", distance, heigth);

        distance = rand.nextInt(10);
        heigth = rand.nextInt(10);
        runAndJumps[1] = new Robot("R2D2", distance, heigth);

        distance = rand.nextInt(10);
        heigth = rand.nextInt(10);
        runAndJumps[2] = new Cat("Murzik", distance, heigth);

        Barrier[] barriers = new Barrier[6];

        boolean isRoad;
        for (int i = 0; i < barriers.length; i++) {
            distance = rand.nextInt(10);
            isRoad = rand.nextBoolean();
            if (isRoad) {
                barriers[i] = new Treadmill("Road " + i, distance);
            } else {
                barriers[i] = new Wall("Wall " + i, distance);
            }
        }

        for (int i = 0; i < runAndJumps.length; i++) {
            boolean result = true;
            for (int j = 0; j < barriers.length; j++) {

                result = barriers[j].moving(runAndJumps[i]);

                if (!result) {
                    break;
                }
            }

            if (result) {
                System.out.println("Success!!");
            } else {
                System.out.println("unsuccessfully!!");
            }
        }
    }
    }

