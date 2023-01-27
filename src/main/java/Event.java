public class Event extends Task {
    protected String startTime;
    protected String endTime;

    public Event(String description, String startTime, String endTime) {
        super(description);
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public String toString(){
        return this.isMarked
                ? String.format("[E][X] %1$s (from:%2$s to:%3$s)", this.description, this.startTime, this.endTime)
                : String.format("[E][ ] %1$s (from:%2$s to:%3$s)", this.description, this.startTime, this.endTime);
    }
}
