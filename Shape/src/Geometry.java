public class Geometry {
    public Integer Luas;
    public Integer Keliling;

    public Geometry() {
        System.out.println("\nGeometry Called");
    }

    public Geometry(Integer luas, Integer keliling) {
        System.out.println("\nGeometry Called with parameters");
        this.Luas = luas;
        this.Keliling = keliling;
    }
}
