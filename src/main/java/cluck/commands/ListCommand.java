package cluck.commands;

import cluck.messages.Messages;
import cluck.tasklist.TaskList;

public class ListCommand implements Command{

    public String execute(TaskList taskList) {
        return Messages.MESSAGE_LIST_DISPLAY + "\n" + taskList.toString();
    }
}
