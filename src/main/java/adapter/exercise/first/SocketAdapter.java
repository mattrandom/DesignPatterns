package adapter.exercise.first;

/**
 * Now we want to build an adapter that can produce 3 volts, 12 volts and default 120 volts.
 * So first of all we will create an adapter interface with these methods.
 *
 * Two Way Adapter Pattern
 * While implementing Adapter pattern, there are two approaches – CLASS adapter and OBJECT adapter –
 * however both these approaches produce same result.
 */
public interface SocketAdapter {

    Volt get120Volt();

    Volt get12Volt();

    Volt get3Volt();
}

