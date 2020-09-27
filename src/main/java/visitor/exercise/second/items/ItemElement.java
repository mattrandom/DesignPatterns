package visitor.exercise.second.items;

import visitor.exercise.second.visitor.ShoppingCartVisitor;

public interface ItemElement {

    int accept(ShoppingCartVisitor visitor);
}
