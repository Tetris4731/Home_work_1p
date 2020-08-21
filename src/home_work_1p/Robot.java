package home_work_1p;

public class Robot implements RunAndJump{
    private String name;
    private int runDistance;
    private int jumpHeight;

    public Robot( String name, int runDistance, int jumpHeight ) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {
        System.out.println(name + " run " + this.runDistance);
    }

    @Override
    public void jump() {
        System.out.println(name + " jump " + this.jumpHeight);
    }

    @Override
    public int getRunDistance() {
        return this.runDistance;
    }

    @Override
    public int getJumpHeight() {
        return this.jumpHeight;
    }
}
