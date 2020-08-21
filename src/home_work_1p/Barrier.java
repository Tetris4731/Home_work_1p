package home_work_1p;

public abstract class Barrier {
    private String name;

    public Barrier(String name) {
        this.name = name;
    }

    protected abstract boolean moving(RunAndJump runAndJump);

    public String getName() {
        return name;
    }
}
