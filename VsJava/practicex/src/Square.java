public class Square {
    int x;
    int y;
    int SideLength;

    public Square(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Square(int sideLength){
        this.SideLength = sideLength;
    }
    public String toString(){
        return x + "," + y + "," + SideLength;
    }
}
