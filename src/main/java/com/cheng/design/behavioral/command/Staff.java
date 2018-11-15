package com.cheng.design.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cheng
 *         2018/11/15 14:51
 */
public class Staff {

    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void executeCommands() {
        for (Command command : commandList) {
            command.execute();
        }
        commandList.clear();
    }
}
