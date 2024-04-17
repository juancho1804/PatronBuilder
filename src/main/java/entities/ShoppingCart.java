package entities;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart{

    
    List<Item> items;
    double subTotal;

    public ShoppingCart() {
        this.items = new ArrayList<>();
        this.subTotal=0;

    }


    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public double getSubtotal() {
        return subTotal;
    }

    public void setSubtotal(double subtotal) {
        this.subTotal = subtotal;

    }
    public String imprimirItems(){
        if(items!=null){
            for(Item each:items){
                return each.getProduct().getName();
            }
        }
        return ".";

    }

    public String getLastItem() {
        if (!items.isEmpty()) {
            return items.get(items.size() - 1).getProduct().getName(); // Retorna el último elemento del carrito
        } else {
            return "El carrito de compras está vacío";
        }
    }


}
