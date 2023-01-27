public class Task {
    protected String description; // name of the task
    protected Boolean isMarked; // whether task is done or not

    public Task(String description) {
        this.description = description;
        this.isMarked = false;
    }
    public void mark() {
        this.isMarked = true;
    }

    public void unmark() {
        this.isMarked = false;
    }

    @Override
    public String toString() {
        return this.isMarked
                ? String.format("[X] %s", this.description)
                : String.format("[ ] %s", this.description);
    }

}
