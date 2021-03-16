public class FruitBoxes {
    public static void main(final String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Fruit fruit1 = new Fruit();
        Fruit fruit2 = new Fruit();

        Box<Fruit> fruitBox = new Box<>();
        fruitBox.putItem(fruit1);
        fruitBox.putItem(fruit2);
        Box<Apple> appleBox = new Box<>();
        appleBox.putItem(apple1);
        appleBox.putItem(apple2);

        // Первый
        BoxUtil.copyFromBoxToBox(appleBox, fruitBox);
        // Второй
        fruit1.setFresh(false);
        apple1.setFresh(true);
        BoxUtil.copyFreshFruitFromBoxToBox(appleBox, fruitBox);
        // Третий
        Box<Box> twoBox = new Box<>();
        twoBox.putItem(appleBox);
        BoxUtil.printElementFromTwoBoxes(twoBox);
        // Четвертый
        BoxUtil.printElementFromBoxes(twoBox);
    }
}
