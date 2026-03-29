class DynamicArray {
    int[] a;
    int N;

    public DynamicArray(int capacity) {
        a = new int[capacity];
        N = 0;
    }

    public int get(int i) {
        return a[i];
    }

    public void set(int i, int n) {
        a[i] = n;
    }

    public void pushback(int n) {
        if(getSize() == getCapacity())
            resize();
        a[getSize()] = n;
        N++;
    }

    public int popback() {
        int n = a[getSize()-1];
        N--;
        return n;

    }

    private void resize() {
        int[] aux = new int[2*getCapacity()];
        for(int i = 0; i < getCapacity(); i++) {
            aux[i] = a[i];
        }
        a = aux;
    }

    public int getSize() {
        return N;
    }

    public int getCapacity() {
        return a.length;
    }
}
