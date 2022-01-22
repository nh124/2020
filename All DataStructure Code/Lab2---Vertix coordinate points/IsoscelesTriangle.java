public class IsoscelesTriangle extends Triangle
{
    double base;
    double side;
    @Override
    public double area(int x_1, int y_1, int x_2, int y_2, int x_3, int y_3) {
        base = Math.pow(Math.pow((x_2 - x_1),2) +  Math.pow((y_2 - y_1),2),(double)1/2);
        side = Math.pow(Math.pow((x_3 - x_2),2) +  Math.pow((y_3 - y_2),2),(double)1/2);
        return ((base)*Math.pow((Math.pow(side,2) - Math.pow((base/2),2)),(double)1/2))/2;

    }

    @Override
    public double perimeter(int x_1, int y_1, int x_2, int y_2, int x_3, int y_3) {
        return super.perimeter(x_1, y_1, x_2,y_2, x_3, y_3);
    }
}
