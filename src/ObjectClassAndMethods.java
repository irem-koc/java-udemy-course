import java.util.Objects;

class Laptop{
    String brand;
    String model;
    int price;

//    public String toString(){ //after that it will return obj and its toString call
//        return "brand: " + brand + ", model: " + model + ", price: " + price;
//    }
//    public boolean equals (Laptop other){
//        return this.brand.equals(other.brand) && this.model.equals(other.model) && this.price == other.price;
//    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return price == laptop.price && Objects.equals(brand, laptop.brand) && Objects.equals(model, laptop.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, price);
    }
}
public class ObjectClassAndMethods {
    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.brand = "Samsung Galaxy";
        l.model = "Samsung Galaxy";
        l.price = 50;
        Laptop l2 = new Laptop();
        l2.brand = "Samsung Galaxy";
        l2.model = "Samsung Galaxy";
        l2.price = 50;
        System.out.println(l.equals(l2));
        System.out.println(l); //it returns weird output 4517d9a3
        System.out.println(l.toString()); // every time we call the obj by default toString is call
    }
}
