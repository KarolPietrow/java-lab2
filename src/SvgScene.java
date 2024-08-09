import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SvgScene {
    private List<Polygon> polygonList;

    public SvgScene() {
        this.polygonList = new ArrayList<>();
    }

    public void addPolygon(Polygon polygon) {
        this.polygonList.add(polygon);
    }

    public void save(String path) {
        StringBuilder svgContent = new StringBuilder();
        svgContent.append("<!DOCTYPE html>\n<html>\n<body>\n<svg width=\"500\" height=\"500\">\n");

        for (Polygon polygon : polygonList) {
            svgContent.append(polygon.toSvg()).append("\n");
        }

        svgContent.append("</svg>\n</body>\n</html>");

        try (FileWriter writer = new FileWriter(path)) {
            writer.write(svgContent.toString());
        } catch (IOException e) {
            System.err.println("Błąd podczas zapisu pliku: " + e.getMessage());
        };
    }
}
