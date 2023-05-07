public class HufflepuffStudents extends HogwartsStudents {
    private int industriousness;
    private int loyalty;
    private int honour;

    public HufflepuffStudents(String name, int magic, int transgression, int industriousness, int loyalty, int honour){
        super(name, magic, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honour = honour;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" + super.toString() +
                " ,industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honour=" + honour +
                '}';
    }
}

