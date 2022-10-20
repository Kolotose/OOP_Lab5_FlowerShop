package flower.store.flowers;

import flower.store.FlowerColor;

import static flower.store.FlowerType.TULIP;

public class Tulip extends Flower {
    public Tulip(FlowerColor color) {
        super(color, TULIP);
    }
}
