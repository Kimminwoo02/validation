package hello.itemservice.domain.item;

import lombok.Data;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.ScriptAssert;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
//@ScriptAssert(lang = "javascript",script = "_this.price * _this.quantity >=10000",message = "총합이 10000원이 넘어야 합니다!")
public class Item {

    private Long id;
    @NotBlank(message = "공백이면 안됩니다!")
    private String itemName;
    @NotNull
    @Range(min=1000,max = 1000000)
    private Integer price;
    @Max(9999)
    @NotNull
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
