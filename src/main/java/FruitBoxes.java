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
        TestBoxes.method2Check1();
        TestBoxes.method2Check2();
        TestBoxes.method2Check3();
        TestBoxes.method2Check4();
        // Третий
        TestBoxes.method3Check1();
        TestBoxes.method3Check2();
        // Четвертый
        Box<Box<Apple>> twoBox = new Box<>();
        twoBox.putItem(appleBox);
        BoxUtil.printElementFromBoxes(twoBox);
    }
}

class TestBoxes {
    //Метод 2
    static void method2Check1() {
        Box<Apple> srcBox = new Box<>();
        srcBox.putItem(new Apple());
        Box<Apple> destBox = new Box<>();
        BoxUtil.copyFreshFruitFromBoxToBox(srcBox, destBox);
        System.out.println("method2Check1");
        System.out.println(destBox.getItem());
        //console Apple@2a139a55
    }

    static void method2Check2() {
        Box<Apple> srcBox = new Box<>();
        srcBox.putItem(new Apple());
        Box<Object> destBox = new Box<>();
        BoxUtil.copyFreshFruitFromBoxToBox(srcBox, destBox);
        System.out.println("method2Check2");
        System.out.println(destBox.getItem());
        //console Apple@2a139a55
    }

    static void method2Check3() {
        Box<Apple> srcBox = new Box<>();
        Apple apple = new Apple();
        apple.setFresh(false);
        srcBox.putItem(apple);
        Box<Object> destBox = new Box<>();
        BoxUtil.copyFreshFruitFromBoxToBox(srcBox, destBox);
        System.out.println("method2Check3");
        System.out.println(destBox.getItem());
        //console null
    }

    static void method2Check4() {
        Box<Apple> srcBox = new Box<>();
        Box<Object> destBox = new Box<>();
        BoxUtil.copyFreshFruitFromBoxToBox(srcBox, destBox);
        System.out.println("method2Check4");
        System.out.println(destBox.getItem());
        //console null
    }

    //Метод 3
    static void method3Check1() {
        Box<Apple> box2 = new Box<>();
        box2.putItem(new Apple());
        Box<Box<Apple>> box1 = new Box<>();
        box1.putItem(box2);
        System.out.println("method3Check1");
        BoxUtil.printElementFromTwoBoxes(box1);
        //console Apple@2a139a55
    }

    static void method3Check2() {
        Box<Apple> box3 = new Box<>();
        box3.putItem(new Apple());
        Box<Object> box2 = new Box<>();
        box2.putItem(box3);
        Box<Box<Object>> box1 = new Box<>();
        box1.putItem(box2);
        System.out.println("method3Check2");
        BoxUtil.printElementFromTwoBoxes(box1);
        //console Box@2a139a55
    }
}

