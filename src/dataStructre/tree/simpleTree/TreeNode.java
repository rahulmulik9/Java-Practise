package dataStructre.tree.simpleTree;

import java.util.ArrayList;
import java.lang.String;

public class TreeNode {
    private String data;
    ArrayList<TreeNode> children;

    public TreeNode(String data) {
        this.data = data;
        this.children = new ArrayList<>();
    }


    public void addChildren(TreeNode node){
        this.children.add(node);
    }
    public String print(int level){
        String rev;
        rev=" ".repeat(level)+data+"\n";
        for (TreeNode node : this.children){
            rev+= node.print(level+1);
        }
        return rev;
    }
}
