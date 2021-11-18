package interfaces.polymorphism;

@FunctionalInterface
public interface Greater<T> {
    public T greater(T arg1, T args2);
}
