import java.sql.SQLOutput;

public class Box {
    double width;
    double height;
    double length;

    Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;

    }

    Box(double size) {
        width = size;
        height = size;
        length = size;
    }

    Box() {
        width = 0;
        height = 0;
        length = 0;
    }
    Box (Box box){
        this.width =  box.width;
        this.height = box.height;
        this.length = box.length;
    }

    Box( Box box1, Box box2) {
        this.width = box1.width + box2.width;
        this.height = box1.height + box2.height;
        this.length = box1.length + box2.length;
    }

    void setDimens (double width, double height, double length) {
        this.width = width;
        this.length = length;
        this.height = height;
    }
    Box increase (int i ) {
        return new Box (width*i ,height*i,length*i);
    }
    Box sumBox(Box box) {
        return new Box(this.width + box.width, this.length+ box.length, this.height+box.height);
    }
    double volume(){
        return  width * height * length;
    }

    void showVolume() {
        System.out.println(volume());
    }
    int compare(Box box) {
        double thisVolume = volume();
        double boxVolume = box.volume();
        int result;
        if (thisVolume > boxVolume) {
            result = 1;
        } else if (thisVolume > boxVolume) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }
}


