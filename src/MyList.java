import java.util.Arrays;

public class MyList<E> {
    private int size; // size xác định số phần tử trong danh sách
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[]; //Mảng đối tượng elements chứa các phần tử trong danh sách

    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    public void ensureCapa(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements,newSize); //It copies the specified array, truncating or padding with false (if necessary) so the copy has the specified length.
        //copyOf(int[] original, int newLength)
        // original – original array
        //newLength – copy of original array
    }

    public void add(E e){
        if (size == elements.length){
            ensureCapa();
        }
        elements[size++] = e;
    }

    public E get(int i){
        if ( i >= size || i < 0){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

}
