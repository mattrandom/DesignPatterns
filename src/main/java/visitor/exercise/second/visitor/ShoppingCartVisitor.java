package visitor.exercise.second.visitor;

import visitor.exercise.second.items.Book;
import visitor.exercise.second.items.Fruit;

public interface ShoppingCartVisitor {

    int visit(Book book);

    int visit(Fruit fruit);
}
