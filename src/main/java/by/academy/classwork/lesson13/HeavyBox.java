package by.academy.classwork.lesson13;

public class HeavyBox implements Comparable<HeavyBox> {
    int weight;
    int width;
    int height;
    int depth;

    HeavyBox(int w, int h, int d, int m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }

    @Override
    public int compareTo(HeavyBox hb) {
        return this.weight <= hb.weight ? -1 : 1;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                ", width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }
}
