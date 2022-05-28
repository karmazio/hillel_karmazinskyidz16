package base;

public interface Income {
    abstract double income (int quota, double price);
    abstract double income (double sales, double tax);
}
