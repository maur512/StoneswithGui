public class SemiPreciousStone extends Stone implements Comparable<Stone>{


    public String name;
    public SemiPreciousStone(String name,double price, double alpha, double weight){
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.alpha = alpha;
    }
    public String getName(){
        return name;
    }
    public double getWeight(){
        return weight;
    };
    public double getPrice(){
        return price;
    };
    public  double getAlpha(){
        return alpha;
    };
    public  void setWeight(double weight){
        this.weight = weight;
    };
    public  void setPrice(double price){
        this.price = price;
    };
    public  void setAlpha(double alpha){
        this.alpha = alpha;
    };
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return (this.name + " " + this.weight + " " + this.price + " " + this.alpha);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
