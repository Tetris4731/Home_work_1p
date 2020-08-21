package home_work_1p;

public class Treadmill extends Barrier {
    private int length;

    public Treadmill(String name, int length) {
        super(name);

        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    protected boolean moving(RunAndJump runAndJump) {
        System.out.println("The road " + super.getName() + " length: " + this.length);

        runAndJump.run();

        if (getLength() <= runAndJump.getRunDistance()) {
            System.out.println("run success");

            return true;
        } else {
            System.out.println("run unsuccessfully");

            return false;
        }
    }

}
