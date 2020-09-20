package chain_of_responsibility.example.third;

public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);

    void dispense(Currency currency);
}
