package flower.store.flowers;

import flower.store.FlowerColor;
import flower.store.FlowerType;
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

    public Flower(FlowerColor color, FlowerType flowerType) {
        setFlowerType(flowerType);
        setColor(color);
    }

    public Flower(FlowerColor color, double sepalLength, FlowerType flowerType) {
        setFlowerType(flowerType);
        setColor(color);
        setSepalLength(sepalLength);
    }
}
