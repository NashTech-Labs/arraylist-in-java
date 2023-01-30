/**
 * The type Arraylist.
 *
 * @param <T> the type parameter
 */
public class arraylist<T> {

    private static int CAPACITY = 10;
    private T[] arr = (T[]) new Object[CAPACITY];
    private int size = 0;

    /**
     * Instantiates a new Arraylist.
     */
    public arraylist() { }

    /**
     * Size int.
     *
     * @return the int
     */
    public int size() {
        return size;
    }

    /**
     * Is empty boolean.
     *
     * @return the boolean
     */
    public boolean isEmpty() {
        return size==0;
    }

    /**
     * Add.
     *
     * @param item the item
     */
    public void add(T item) {
        if(size==CAPACITY) resize();
        arr[size++] = item;
    }
    private boolean resize() {
        int temp = CAPACITY;
        CAPACITY = CAPACITY<<1;
        T[] arrCopy = arr;
        arr = (T[]) new Object[CAPACITY];
        for(int i=0; i<temp; i++) {
            arr[i] = arrCopy[i];
        }
        return true;
    }

    /**
     * Remove t.
     *
     * @param index the index
     * @return the t
     */
    public T remove(int index) {
        if(index<0 || index>=size) throw new ArrayIndexOutOfBoundsException();
        T res = arr[index];
        for(int i=index; i<size-1; i++) {
            arr[i] = arr[i+1];
        }
        --size;
        return res;
    }

    /**
     * Get t.
     *
     * @param index the index
     * @return the t
     */
    public T get(int index) {
        if(index<0 || index>=CAPACITY) throw new ArrayIndexOutOfBoundsException();
        return arr[index];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<size; i++) {
            sb.append(arr[i] + ",");
        }
        return sb.toString().substring(0, sb.length()-1);
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        arraylist<Integer> list = new arraylist<>();

        System.out.println("add(0)");
        list.add(0);
        System.out.println("add(10)");
        list.add(10);
        System.out.println("add(20)");
        list.add(20);
        System.out.println("add(30)");
        list.add(30);
        System.out.println("add(40)");
        list.add(40);
        System.out.println("add(50)");
        list.add(50);

        System.out.println("items: " + list);
        System.out.println("size: " + list.size());
        System.out.println("get(0): " + list.get(0));
        System.out.println("get(1): " + list.get(1));
        System.out.println("get(2): " + list.get(2));
        System.out.println("get(5): " + list.get(5));

        System.out.println();

        System.out.println("remove(3): " + list.remove(3));
        System.out.println("items: " + list);
        System.out.println("size: " + list.size());

        System.out.println();

        System.out.println("remove(3): " + list.remove(3));
        System.out.println("items: " + list);
        System.out.println("size: " + list.size());

        System.out.println();


        System.out.println("remove(3): " + list.remove(3));
        System.out.println("items: " + list);
        System.out.println("size: " + list.size());

        System.out.println();

        System.out.println("add(60)");
        list.add(60);
        System.out.println("add(70)");
        list.add(70);

        System.out.println("items: " + list);
        System.out.println("size: " + list.size());
    }
    }
