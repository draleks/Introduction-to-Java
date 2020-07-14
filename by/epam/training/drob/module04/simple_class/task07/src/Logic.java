public class Logic {
    public boolean isExist(Triangle triangle) {
        return triangle.getA() + triangle.getB() > triangle.getC() &&
                triangle.getA() + triangle.getC() > triangle.getB() &&
                triangle.getB() + triangle.getC() > triangle.getA();
    }

    public int perimeter(Triangle triangle) {

        int valuePerimeter = 0;

        if (this.isExist(triangle)) {
            valuePerimeter = triangle.getA() + triangle.getB() + triangle.getC();

        }

        return valuePerimeter;
    }

    public double area(Triangle triangle) {

        double area = 0;

        if (isExist(triangle)) {
            double p = perimeter(triangle) / 2;
            area = Math.sqrt(p * (p - triangle.getA()) * (p - triangle.getB()) * (p - triangle.getC()));

        }

        return area;
    }

    public double medianPoint(Triangle triangle) {

        double medianPoint = 0;

        if (isExist(triangle)) {
            double median = 0.5 * Math.sqrt(2 * triangle.getB() ^ 2 + 2 * triangle.getC() ^ 2 - triangle.getA() ^ 2);
            medianPoint = median / 3 * 2;

        }

        return medianPoint;
    }

}
