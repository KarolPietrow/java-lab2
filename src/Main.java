public class Main {
    public static void main(String[] args) {
        SvgScene scene = new SvgScene();

        Point[] points1 = {
                new Point(50, 150),
                new Point(100, 50),
                new Point(150, 150)
        };

        Point[] points2 = {
                new Point(200, 200),
                new Point(250, 100),
                new Point(300, 200)
        };

        Polygon polygon1 = new Polygon(points1, new Style("red", "blue", 2.0));
        Polygon polygon2 = new Polygon(points2, null);

        scene.addPolygon(polygon1);
        scene.addPolygon(polygon2);

        scene.save("output.html");
    }
}