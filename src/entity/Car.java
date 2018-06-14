package entity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
/**
 * Created by paul on 2018/5/28.
 */
@Repository(value = "Car")
public class Car {
    private Integer id;
    private String name;
    private Double price;

    @Value(value = "111")
    public void setId(Integer id) {
        this.id = id;
    }
    @Value(value="xili")
    public void setName(String name) {
        this.name = name;
    }
    @Value(value = "5000")
    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
