package Producto;

import java.util.ArrayList;
import java.util.List;

public class Factura {
    private List<FacturaItem> facturaItems;

    public Factura(){
        this.facturaItems=new ArrayList<>();

    }

    public List<FacturaItem> getFacturaItems() {
        return facturaItems;
    }

    public void setFacturaItems(List<FacturaItem> facturaItems) {
        this.facturaItems = facturaItems;
    }

    public void addFacturaItem(FacturaItem facturaItem){
        this.facturaItems.add(facturaItem);
    }

    @Override
    public String toString() {
        return "Factura{" +
                "facturaItems=" + facturaItems +
                '}';
    }
}
