package Builder;

import Producto.Factura;
import Producto.FacturaItem;

import java.util.ArrayList;
import java.util.List;

public class BuilderFactura {
    private Factura factura;

    public  BuilderFactura(){
        this.factura=new Factura();
        this.factura.setFacturaItems(new ArrayList<>());
    }

    public BuilderFactura facturaItems(final List<FacturaItem>facturaItems){
        this.factura.setFacturaItems(facturaItems);
        return this;
    }

    public BuilderFactura agregarItemFactura(final FacturaItem facturaItem){
        this.factura.addFacturaItem(facturaItem);
        return this;
    }

    public Factura build(){
        return this.factura;
    }

}
