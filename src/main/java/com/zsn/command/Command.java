package com.zsn.command;

/**
 * @Author: zsn
 * @Date: 2020/6/17 23:22
 */
public abstract class Command {
    public abstract void doit();// exec run
    public abstract void undo();
}
