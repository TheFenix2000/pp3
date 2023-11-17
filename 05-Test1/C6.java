public class C6 {
    private String title;
    private int pages;

    public int getPages() {
        return pages;
    }
    public String getTitle() {
        return title;
    }
    public void setPages(int pages) {
        if (pages > 0) {
            this.pages = pages;
        }
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public static void main(String[] args) {
        C6 o = new C6();
        o.setPages(3);
        o.setPages(-4);
        System.out.println(o.getPages());
    }
}
