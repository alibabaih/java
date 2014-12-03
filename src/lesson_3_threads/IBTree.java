package lesson_3_threads;

public interface IBTree {

    public IBTree getLeft();

    public IBTree getRight();

    public T getValue(); //типизированное значение

    public int getCount();

    public void add(T value);

}

// 1 (1)
//ET ET

// 1 (2)
//ET ET

// 1 (1)
// 0 1   ET

// 1 (1)
// 0 (1)  3 (1)