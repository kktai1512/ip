package duke.task;

import duke.task.Task;

public class Deadline extends Task {

    private String deadline;

    public Deadline(String name, String deadline) {
        super(name);
        this.deadline= deadline;
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + String.format("(%s)", this.deadline) ;
    }
}