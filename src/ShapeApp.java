public class ShapeApp {
    static void main() {
        var shape1 = new Shape();
        System.out.println(shape1.getCorner());

        var shape2 = new Rectangle();
        System.out.println(shape2.getCorner());
        System.out.println(shape2.getParentCorner());
    }
}
