package com.zsn.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zsn
 * @Date: 2020/5/17 16:05
 */
abstract class Node {
    abstract public void p();
}

class LeftNode extends Node {
    String context;

    public LeftNode(String context) {
        this.context = context;
    }

    public void p() {
        System.out.println(context);
    }
}
class BranchNode extends Node {
    List<Node> nodes =new ArrayList<Node>();

    String name;

    public BranchNode(String name) {
        this.name = name;
    }

    public void p() {
        System.out.println(name);
    }
    public void add(Node n){
        this.nodes.add(n);
    }
}

public class Main {
    public static void main(String[] args) {
        BranchNode root =new BranchNode("root");
        BranchNode chapter1 =new BranchNode("chapter1");
        BranchNode chapter2 =new BranchNode("chapter2");
        Node c11 =new LeftNode("c11");
        Node c12 =new LeftNode("c12");
        BranchNode b21=new BranchNode("section21");
        Node c211 =new LeftNode("c211");
        Node c212 =new LeftNode("c212");

        root.add(chapter1);
        root.add(chapter2);
        chapter1.add(c11);
        chapter1.add(c12);
        chapter2.add(b21);
        b21.add(c211);
        b21.add(c212);
        tree(root,0);
    }
    static void tree(Node b,int depth){
        for(int i=0;i<depth;i++) System.out.print("--");
        b.p();
        if(b instanceof BranchNode){
            for(Node n:((BranchNode) b).nodes){
                tree(n,depth+1);
            }
        }
    }
}
