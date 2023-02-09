interface Shape {
    void draw();
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Joonistan ristküliku");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Joonistan ruudu");
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Joonistan ringi");
    }
}

class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("RING")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RISTKÜLIK")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("RUUT")) {
            return new Square();
        }
        return null;
    }
}
