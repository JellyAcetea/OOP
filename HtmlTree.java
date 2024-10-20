import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;

public class HtmlTree {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JTree Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("html");
        DefaultMutableTreeNode head = new DefaultMutableTreeNode("head");
        DefaultMutableTreeNode body = new DefaultMutableTreeNode("body");

        DefaultMutableTreeNode meta = new DefaultMutableTreeNode("meta");
        DefaultMutableTreeNode title = new DefaultMutableTreeNode("title");
        head.add(meta);
        head.add(title);

        DefaultMutableTreeNode ul = new DefaultMutableTreeNode("ul");
        DefaultMutableTreeNode li1 = new DefaultMutableTreeNode("li");
        DefaultMutableTreeNode li2 = new DefaultMutableTreeNode("li");
        ul.add(li1);
        ul.add(li2);

        DefaultMutableTreeNode h1 = new DefaultMutableTreeNode("h1");
        DefaultMutableTreeNode h2 = new DefaultMutableTreeNode("h2");
        DefaultMutableTreeNode a = new DefaultMutableTreeNode("a");

        body.add(ul);
        body.add(h1);
        body.add(h2);
        body.add(a);

        root.add(head);
        root.add(body);

        JTree tree = new JTree(root);
        JScrollPane scrollPane = new JScrollPane(tree);
        frame.add(scrollPane);
        frame.setVisible(true);
    }
}