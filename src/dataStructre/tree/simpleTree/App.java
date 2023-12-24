package dataStructre.tree.simpleTree;

public class App {
    public static void main(String[] args) {
        TreeNode drink=new TreeNode("Drinks");
        TreeNode cold=new TreeNode("Cold");
        TreeNode natural=new TreeNode("Natural");
        TreeNode juice=new TreeNode("Juice");
        TreeNode lemonwater=new TreeNode("Lemon Water");
        TreeNode beverage=new TreeNode("Beverage");
        TreeNode pepsi=new TreeNode("Pepsi");
        TreeNode sprite=new TreeNode("Sprite");
        TreeNode hot=new TreeNode("Hot");
        TreeNode tea=new TreeNode("Tea");
        TreeNode coffee=new TreeNode("Coffee");


        drink.addChildren(cold);
        drink.addChildren(hot);

        cold.addChildren(natural);
        cold.addChildren(beverage);

        natural.addChildren(juice);
        natural.addChildren(lemonwater);
        beverage.addChildren(pepsi);
        beverage.addChildren(sprite);

        hot.addChildren(tea);
        hot.addChildren(coffee);

        System.out.println( drink.print(0));

    }
}
