public class BoxUtil {

    public static <T> void copyFromBoxToBox(final Box<T> src, final Box<? super T> dest) {
        T item = src.getItem();
        dest.putItem(item);
    }

    public static void copyFreshFruitFromBoxToBox(final Box<? extends Fruit> src, final Box<? super Fruit> dest) {
        Fruit item = src.getItem();
        if (item.getIsFresh()) {
            dest.putItem(item);
        }
    }

    public static void printElementFromTwoBoxes(final Box<Box> box) {
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
