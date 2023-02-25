import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Car {
private String marca;
private LocalDate yerOfIssue;
private BoduType boduType;
private int price;

    public Car(String marca, LocalDate yerOfIssue,  BoduType boduType, int price) {
        this.marca = marca;
        this.yerOfIssue = yerOfIssue;
        this.boduType = boduType;
        this.price = price;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setYerOfIssue(LocalDate yerOfIssue) {
        this.yerOfIssue = yerOfIssue;
    }


    public void setBoduType(BoduType boduType) {
        this.boduType = boduType;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMarca() {
        return marca;
    }

    public LocalDate getYerOfIssue() {
        return yerOfIssue;
    }



    public BoduType getBoduType() {
        return boduType;
    }

    public int getPrice() {
        return price;
    }

   void boDyTypeldentification() {
        if (boduType.equals(BoduType.SEDAN)){
            System.out.println("Легкововой кдассындагы машина");
        }else if (boduType.equals(BoduType.HATCHBACK)){
            System.out.println("Легковой кдассындагы машина");
        } else if (boduType.equals(BoduType.CROSSOVER)) {
            System.out.println("внедорожник кдассындагы машина");
        } else if (boduType.equals(BoduType.SOV)) {
            System.out.println("внедорожник кдассындагы машина");
        } else if (boduType.equals(BoduType.WAGON)){
            System.out.println("Универсал класындагы машина");
        }

   }

   void determinationYerOfManufacture(){
       System.out.println("год эксплуатации");
        System.out.println(Period.between((yerOfIssue),LocalDate.now()).getYears());
    }

    @Override
    public String toString() {
        return "Car{" +
                "marca='" + marca + '\'' +
                ", yerOfIssue=" + yerOfIssue +
                ", boduType=" + boduType +
                ", price=" + price +
                '}';
    }
}


