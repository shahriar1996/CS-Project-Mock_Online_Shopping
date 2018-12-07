package edu.century.finalproject.shoppingcart.collections;

public class ArrayBag<E> implements Cloneable
{
    private Object[] data;
    private int manyItems;

    public ArrayBag()
    {
        final int INITIAL_CAPACITY = 10;
        manyItems = 0;
        data = new Object[INITIAL_CAPACITY];
    }

    public ArrayBag(int initialCapacity)
    {
        if (initialCapacity < 0)
            throw new IllegalArgumentException("The initialCapacity is negative: " + initialCapacity);
        data = new Object[initialCapacity];
        manyItems = 0;
    }

    public void add(E element)
    {
        if (manyItems == data.length)
        { // Ensure twice as much space as we need.
            ensureCapacity((manyItems + 1) * 2);
        }

        data[manyItems] = element;
        manyItems++;
    }

    public void addAll(ArrayBag<E> addend)
    {
        // If addend is null, then a NullPointerException is thrown.
        // In the case that the total number of items is beyond
        // Integer.MAX_VALUE, there will be an arithmetic overflow and
        // the bag will fail.
        ensureCapacity(manyItems + addend.manyItems);

        System.arraycopy(addend.data, 0, data, manyItems, addend.manyItems);
        manyItems += addend.manyItems;
    }

    @SuppressWarnings("unchecked")
    public ArrayBag<E> clone()
    { // Clone an ArrayBag object.
        ArrayBag<E> answer;

        try
        {
            answer = (ArrayBag<E>) super.clone();
        }
        catch (CloneNotSupportedException e)
        { // This exception should not occur. But if it does, it would probably
          // indicate a programming error that made super.clone unavailable.
          // The most common error would be forgetting the "Implements Cloneable"
          // clause at the start of this class.
            throw new RuntimeException("This class does not implement Cloneable");
        }

        answer.data = data.clone();
        return answer;
    }

    public int countOccurrences(E target)
    {
        int answer;
        int index;

        answer = 0;
        for (index = 0; index < manyItems; index++)
            if (target == data[index])
                answer++;
        return answer;
    }

    public void ensureCapacity(int minimumCapacity)
    {
        Object biggerArray[];

        if (data.length < minimumCapacity)
        {
            biggerArray = new Object[minimumCapacity];
            System.arraycopy(data, 0, biggerArray, 0, manyItems);
            data = biggerArray;
        }
    }

    public int getCapacity()
    {
        return data.length;
    }

    @SuppressWarnings("unchecked")
    public E grab()
    {
        int i;

        if (manyItems == 0)
            throw new IllegalStateException("Bag size is zero");

        i = (int) (Math.random() * manyItems) + 1;
        return (E) data[i];
    }

    public boolean remove(E target)
    {
        int index; // The location of target in the data array.

        // First, set index to the location of target in the data array,
        // which could be as small as 0 or as large as manyItems-1; If target
        // is not in the array, then index will be set equal to manyItems;
        if (target == null)
        { // Find the first occurrence of the null reference in the bag.
            index = 0;
            while ((index < manyItems) && (data[index] != null))
                index++;
        }
        else
        { // Find the first occurrence of the target in the bag.
            index = 0;
            while ((index < manyItems) && (!target.equals(data[index])))
                index++;
        }

        if (index == manyItems)
            // The target was not found, so nothing is removed.
            return false;
        else
        { // The target was found at data[index].
          // So reduce manyItems by 1 and copy the last element onto data[index].
            manyItems--;
            data[index] = data[manyItems];
            data[manyItems] = null;
            return true;
        }
    }

    public int size()
    {
        return manyItems;
    }

    public void trimToSize()
    {
        Object[] trimmedArray;

        if (data.length != manyItems)
        {
            trimmedArray = new Object[manyItems];
            System.arraycopy(data, 0, trimmedArray, 0, manyItems);
            data = trimmedArray;
        }
    }

    @SuppressWarnings("unchecked")
    public E get(final int index)
    {
        if ((index < 0) || (index >= this.size()))
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (E) this.data[index];
    }
    public static <E> ArrayBag<E> union(ArrayBag<E> b1, ArrayBag<E> b2)
    {
        // If either b1 or b2 is null, then a NullPointerException is thrown.
        // In the case that the total number of items is beyond
        // Integer.MAX_VALUE, there will be an arithmetic overflow and
        // the bag will fail.
        ArrayBag<E> answer = new ArrayBag<E>(b1.getCapacity() + b2.getCapacity());

        System.arraycopy(b1.data, 0, answer.data, 0, b1.manyItems);
        System.arraycopy(b2.data, 0, answer.data, b1.manyItems, b2.manyItems);
        answer.manyItems = b1.manyItems + b2.manyItems;

        return answer;
    }

}
