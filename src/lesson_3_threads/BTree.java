package lesson_3_threads;

public class BTree<T extends Comparable<T>> implements IBTree<T> { //binary tree &

    private final IBTree<T> left;
    private final IBTree<T> right;
    private final T value;
    private int count;

    public BTree(IBTree<T> left, IBTree<T> right, T value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }

    @Override
    public IBTree getLeft() {
        return left;
    }

    @Override
    public IBTree getRight() {
        return right;
    }

    @Override
    public T getValue() {
        return null;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public void add(T value) {
        if(value.equals(getValue())) {
            count++;
        } else if (value.compareTo(getValue()) > 0)) {
            getLeft().add(value);
        } else {
            getRight().add(value);
        }
    }
}
