public class Polygon {
    private final Point[] points;
    private final Style style;

    public Polygon(Point[] points) {
        this(points,null);
    }

    public Polygon(Point[] points, Style style) {
        this.points = points.clone(); // Płytka kopia tablicy
        if (style != null) {
            this.style = style;
        } else {
            this.style = new Style("none", "black", 1.0);
        }
    }

    // Konstruktor kopiujący wykonujący głęboką kopię
    public Polygon(Polygon other) {
        this.points = new Point[other.points.length];

        for (int i = 0; i < other.points.length; i++) {
            Point originalPoint = other.points[i];
            this.points[i] = new Point(originalPoint.x, originalPoint.y);
        }

        if (other.style != null) {
            this.style = new Style(other.style.fillColor, other.style.strokeColor, other.style.strokeWidth);
        } else {
           this.style = null;
        }
    }

    public String toSvg() {
        StringBuilder svg = new StringBuilder("<polygon points=\"");

        for (Point point : points) {
            svg.append(point.x).append(",").append(point.y).append(" ");
        }

        svg.append("\" style=\"").append(style.toSvg()).append("\" />");
        return svg.toString();
    }
}
