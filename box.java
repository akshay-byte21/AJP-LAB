public class box {
    int width,lenght, depth;
    box(int width, int lenght, int depth){
        this.width=width;
        this.lenght=lenght;
        this.depth=depth;
    }
    int volume(){
        return width*lenght*depth;
    }
    public static void main(String[] args) {
        box b = new box(5,6,7);
        System.out.println("Volume of the box is "+ b.volume());
    }
}
