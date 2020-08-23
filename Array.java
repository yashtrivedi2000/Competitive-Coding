class Array {
    private int[] items;
    private int count;

    Array(int size) {
        items = new int[size];
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.print(items[i] + " ");
        }
        System.out.println();
    }

    public void insert(int number) {
        if (count == items.length) {
            int[] newArray = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newArray[i] = items[i];
            }
            items = newArray;
        }
        items[count++] = number;

    }

    public void removeAt(int pos) {
        try {

            if (pos > this.count) {
                throw new IllegalArgumentException("No such index available");
            } else {
                for (int i = pos; i < items.length - 1; i++)
                    items[i] = items[i + 1];
                count--;

            }
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }

}
