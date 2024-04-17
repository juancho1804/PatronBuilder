package Builder;

import Producto.FacturaItem;
import entities.Item;

public class BuilderFacturaItem {
    private FacturaItem facturaItem;
    public BuilderFacturaItem(final Item item,final double descuento){
        this.facturaItem=new FacturaItem(item,descuento);
    }
    public BuilderFacturaItem descuento(double descuento){
        this.facturaItem.setDescuento(descuento);
        return this;
    }
    public BuilderFacturaItem item(Item item){
        this.facturaItem.setItem(item);
        return this;
    }
    public FacturaItem build(){
        return this.facturaItem;
    }
}
