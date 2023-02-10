package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = "WHITE";
    private static final double DEFAULT_RADIUS = 10.0;
    private static final int NUMBER_RANGE = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        FiguresShape[] figureshape = FiguresShape.values();
        switch (figureshape[random.nextInt(figureshape.length)].name()) {
            case "SQUARE": {
                return new Square(random.nextDouble() * MULTIPLAYER, colorSupplier.getRandomColor());
            }
            case "RECTANGLE": {
                return new Rectangle(random.nextDouble() * MULTIPLAYER, random.nextDouble()
                    * MULTIPLAYER, colorSupplier.getRandomColor());
            }
            case "RIGHTTRIANGLE": {
                retun new RightTriangle(random.nextDouble() * MULTIPLAYER, random.nextDouble()
                    * MULTIPLAYER, colorSupplier.getRandomColor());
            }
            case "CIRCLE": {
                return new Circle(random.nextDouble() * MULTIPLAYER, colorSupplier.getRandomColor());
            }
            case "ISOSCELESTRAPEZOID": {
                return new IsoscelesTrapezoid(random.nextDouble() * MULTIPLAYER, random.nextDouble()
                    * MULTIPLAYER, random.nextDouble() * MULTIPLAYER,
                    colorSupplier.getRandomColor());
            }
            default: {
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
