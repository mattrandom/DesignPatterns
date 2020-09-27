package visitor.exercise.second;

import visitor.exercise.second.items.Book;
import visitor.exercise.second.items.Fruit;
import visitor.exercise.second.items.ItemElement;
import visitor.exercise.second.visitor.ShoppingCartVisitor;
import visitor.exercise.second.visitor.ShoppingCartVisitorImpl;

public class Main {
    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[]{new Book(20, "1234"), new Book(100, "5678"),
                new Fruit(10, 2, "Banana"), new Fruit(5, 5, "Apple")};

        int total = calculatePrice(items);
        System.out.println("Total Cost = " + total);
    }

    private static int calculatePrice(ItemElement[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum = 0;
        for (ItemElement item : items) {
            sum = sum + item.accept(visitor);
        }
        return sum;
    }
}
