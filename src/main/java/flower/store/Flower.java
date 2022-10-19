package flower.store;

import lombok.Getter;
import lombok.Setter;



@Setter
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public String getColor() {
        return color.toString();
    }

    public Flower() {
    }

    public Flower(FlowerType flowerType, FlowerColor color) {
        setFlowerType(flowerType);
        setColor(color);
    }

    public Flower(FlowerType flowerType, FlowerColor color, double sepalLength) {
        setFlowerType(flowerType);
        setColor(color);
        setSepalLength(sepalLength);
    }
}
