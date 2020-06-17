package com.zsn.command;

/**
 * @Author: zsn
 * @Date: 2020/6/17 23:24
 */
public class CopyCommand extends Command {
    Content c;


    public CopyCommand(Content c) {
        this.c = c;
    }


    @Override
    public void doit() {
        c.msg = c.msg+c.msg ;
    }

    @Override
    public void undo() {
        c.msg = c.msg.substring(0, c.msg.length()/2);
    }
}
