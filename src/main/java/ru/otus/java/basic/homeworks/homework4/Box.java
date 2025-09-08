package ru.otus.java.basic.homeworks.homework4;

public class Box {
    private final int length;
    private final int width;
    private String color;
    private boolean open;
    private String[] item;

    public Box(int length, int width, String color, boolean open) {
        this.length = length;
        this.width = width;
        this.color = color;
        this.open = open;
        this.item = new String[1];
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Цвет коробки: " + this.color);
    }

    public void isOpen(boolean open) {
        this.open = open;
        System.out.println("Коробка открыта?: " + this.open);
    }

    public String putItem (String item){
        if (this.item[0] == null && this.open == true) {
            this.item[0] = item;
            return "В коробку положен " + item;
        };
        return "Не удалось положить предмет в коробку";
    }

    public String takeItem (){
        if (this.item[0] != null && this.open == true) {
            this.item[0] = null;
            return "Коробку опустошили";
        };
        return "Не удалось забрать предмет из коробки";
    }

    public String toString() {
        return ("Длинна: " + length +
                ", Ширина: " + width +
                ", Цвет: " + color +
                ", Коробка открыта?: " + open);
    }
}
