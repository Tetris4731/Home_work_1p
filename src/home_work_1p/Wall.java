package home_work_1p;

public class Wall extends Barrier {
    private int heigth;

    public Wall(String name, int heigth) {
        super(name);

        this.heigth = heigth;
    }

    public int getHeigth() {
        return heigth;
    }

    @Override
    protected boolean moving(RunAndJump runAndJump) {
        System.out.println("The wall " + "heigth: " + this.heigth);

        runAndJump.jump();

        if (getHeigth() <= runAndJump.getJumpHeight()) {
            System.out.println("jump success");

            return true;
        } else {
            System.out.println("jump unsuccessfully");

            return false;
        }
    }

}
