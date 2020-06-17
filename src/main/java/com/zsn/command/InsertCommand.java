package com.zsn.command;

/**
 * @Author: zsn
 * @Date: 2020/6/17 23:24
 */
public class InsertCommand extends Command {
    Content c;
    String strToInsert = "http://www.zsn.com";

    public InsertCommand(Content c) {
        this.c = c;
    }


    @Override
    public void doit() {
        c.msg = c.msg + strToInsert;
    }

    @Override
    public void undo() {
        c.msg = c.msg.substring(0, c.msg.length() - strToInsert.length());
    }
}
