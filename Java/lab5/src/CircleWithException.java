// 1009 Lab 5
// Author @ Zhao Yea (1802992)
// Task 2


public class CircleWithException {
    private int radius;

    public void setRadius(int r) throws Exception, IllegalArgumentException {
        if (r < 0) throw new IllegalArgumentException();
        this.radius = r;
        if (getArea() > 1000) throw new Exception();
    }

    public int getRadius() {
        return radius;
    }

    public int getArea() {
        return (int) (Math.PI * radius * radius);
    }

    public int getDiameter() {
        return 2 * radius;
    }

    public static void main(String[] args) {
        CircleWithException c = new CircleWithException();
        boolean success = true;

        try {
            c.setRadius(5);
            c.setRadius(1000);
            c.setRadius(-5);
            
        } catch (IllegalArgumentException e) {
            success = false;
            System.out.printf("%s: Radius cannot be negative\n", e);
        } catch (Exception e) {
            success = false;
            System.out.printf("%s: area cannot be bigger than 1000\n", e);
        } finally {
            if (!success) System.out.println("this is from finally");
        }
    }
}
