package Producto;

import entities.Item;

public class FacturaItem {

    Item item;
    double descuento;
    double valor;

    public FacturaItem(Item item, double descuento) {
        this.item=item;
        this.descuento = descuento;
        this.valor=item.getImporte()-descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "\nFacturaItem{" +
                "item=" + item.getProduct().getName() +
                ", descuento=" + descuento +
                ", valor=" + valor +
                "}";
    }
}
