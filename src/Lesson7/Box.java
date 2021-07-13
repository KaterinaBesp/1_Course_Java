package Lesson7;

public class Box {
    private String color;
    private int size;

    public Box(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Box box = (Box) o;
            if (this.size != box.size) {
                return false;
            } else {
                return this.color != null ? this.color.equals(box.color) : box.color == null;
            }
        } else {
            return false;
        }
    }

    public int hashCode() {
        int result = this.color != null ? this.color.hashCode() : 0;
        result = 31 * result + this.size;
        return result;
    }

    public String toString() {
        return "Box{color='" + this.color + '\'' + ", size=" + this.size + '}';
    }
}
