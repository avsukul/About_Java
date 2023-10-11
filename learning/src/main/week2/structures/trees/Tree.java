package main.week2.structures.trees;

import java.util.*;


public class Tree<T> {


    public static void main(String[] args) {
        Tree<String> root = new Tree<>("Root");

        Tree<String> child1 = new Tree<>("Child1");
        child1.addChild("Grandchild1");
        child1.addChild("Grandchild2");

        Tree<String> child2 = new Tree<>("Child2");
        child2.addChild("Grandchild3");

        root.addChild(child1);
        root.addChild(child2);
        root.addChild("Child3");

//        root.addChildren(Arrays.asList(
//                new trees.Tree<>("Child4"),
//                new trees.Tree<>("Child5"),
//                new trees.Tree<>("Child6")
//        ));


        for(Tree node : root.getChildren()) {

            System.out.println(node.getData());
        }
    }

    private T data = null;
    private List<Tree> children = new ArrayList<>();
    private Tree parent = null;

    public Tree(T data) {
        this.data = data;
    }

    public void addChild(Tree child) {
        child.setParent(this);
        this.children.add(child);
    }

    public void addChild(T data) {
        Tree<T> newChild = new Tree<>(data);
        this.addChild(newChild);
    }

    public void addChildren(List<Tree> children) {
        for(Tree t : children) {
            t.setParent(this);
        }
        this.children.addAll(children);
    }

    public List<Tree> getChildren() {
        return children;
    }

    public T getData() {
        return data;
    }

    private void setParent(Tree parent) {
        this.parent = parent;
    }

    public Tree getParent() {
        return parent;
    }

}
