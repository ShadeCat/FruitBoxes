public class BoxUtil {

    public static <T> void copyFromBoxToBox(final Box<T> src, final Box<? super T> dest) {
        T item = src.getItem();
        dest.putItem(item);
    }

    public static <T extends Fruit> void copyFreshFruitFromBoxToBox(final Box<T> src, final Box<? super T> dest) {
        T item = src.getItem();
        if (item != null) {
            if (item.getIsFresh()) {
                dest.putItem(item);
            }
        }
    }

    public static <T> void printElementFromTwoBoxes(final Box<? extends Box<T>> box) {
        System.out.println(box.getItem().getItem().toString());
    }

    public static void printElementFromBoxes(final Box<?> box) {
        Box<?> currentBox = box;
        while (true) {
            if (!(currentBox.getItem() instanceof Box)) {
                System.out.println(currentBox.getItem());
                break;
            } else {
                currentBox = (Box<?>) currentBox.getItem();
            }
        }
    }
}
