package ru.otus.java.basic.homeworks.homework4;

public class Box {
    private final int length;
    private final int width;
    private final int height;
    private String color;
    private boolean open;
    private String item;

    public Box(int length, int width, int height, String color, boolean open) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
        this.open = open;
        this.item = null;
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Цвет коробки: " + this.color);
    }

    public void open() {
        this.open = true;
        System.out.println("Коробка открыта");
    }

    public void close() {
        this.open = false;
        System.out.println("Коробка закрыта");
    }

    public String putItem(String item) {
        if (this.open == false) {
            return "Неудалось положить предмет. Коробка закрыта!";
        }
        if (this.item != null) {
            return "Неудалось положить предмет. Коробка заполнена!";
        }
        ;
        this.item = item;
        return "В коробку положен " + item;
    }

    public String takeItem() {
        if (this.open == false) {
            return "Не удалось забрать предмет из коробки. Коробка закрыта";
        }
        if (this.item == null) {
            return "Не удалось забрать предмет из коробки. Коробка пуста";
        }
        ;
        this.item = null;
        return "Коробку опустошили";
    }

    public String toString() {
        return ("Длинна: " + length +
                ", Ширина: " + width +
                ", Высота: " + height +
                ", Цвет: " + color +
                ", Коробка открыта?: " + open);
    }
}
