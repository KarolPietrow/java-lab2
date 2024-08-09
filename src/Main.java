public class Main {
    public static void main(String[] args) {
        Point[] points = {
                new Point(50, 150),
                new Point(150, 50),
                new Point(250, 150),
                new Point(150, 250)
        };

        Style customStyle = new Style("red", "blue", 2.0);

        Polygon styledPolygon = new Polygon(points, customStyle);
        System.out.println(styledPolygon.toSvg());

        Polygon defaultPolygon = new Polygon(points);
        System.out.println(defaultPolygon.toSvg());

        Polygon copiedPolygon = new Polygon(defaultPolygon);
    }
}