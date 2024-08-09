public class Segment {
    private final Point start;
    private final Point end;

    public Segment(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public double getLength() {
        int dx = end.x - start.x;
        int dy = end.y - start.y;
        return Math.sqrt(dx*dx+dy*dy);
    }

    public String toSvg() {
        return "<line x1=\"" + start.x +
                "\" y1=\"" + start.y +
                "\" x2=\"" + end.x +
                "\" y2=\"" + end.y +
                "\" style=\"stroke:rgb(0,0,0);stroke-width:2\" />";
    }

    public static Segment[] perpendicular(Segment segment, Point point) {
        int dx = segment.end.x - segment.start.x;
        int dy = segment.end.y - segment.start.y;

        // Normalizacja długości wektora dx, dy do 1 jednostki
        double length = segment.getLength();
        double unitDx = dx / length;
        double unitDy = dy / length;

        // Obliczanie współrzędnych punktów końcowych prostopadłych segmentów
        Point end1 = new Point(point.x - (int)(unitDy * length), point.y + (int)(unitDx * length));
        Point end2 = new Point(point.x + (int)(unitDy * length), point.y - (int)(unitDx * length));

        // Tworzenie dwóch nowych segmentów prostopadłych
        Segment perpendicular1 = new Segment(point, end1);
        Segment perpendicular2 = new Segment(point, end2);

        return new Segment[]{perpendicular1, perpendicular2};
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }
}
