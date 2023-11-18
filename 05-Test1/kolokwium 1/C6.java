public class C6 {
    private String name;
    private float price;
    private boolean imported;

    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }

    public boolean getImported() {
        return imported;
    }

    public void setName(String name) {
        this.name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }

    public void setPrice(float price) {
        if (price > 0) {
            this.price = price;
        }
    }
    
    public void setImported(boolean imported) {
        this.imported = imported;
    }

    public static void main(String[] args) {
        C6 p = new C6();
        p.setName("cOmPuTer");
        System.out.println(p.getName());
        p.setPrice(4);
        System.out.println(p.getPrice());
        p.setPrice(-3);
        System.out.println(p.getPrice());
    }
}
