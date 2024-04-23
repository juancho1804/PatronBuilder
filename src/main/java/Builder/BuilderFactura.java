package Builder;

import Producto.Factura;
import Producto.FacturaItem;
import entities.Item;

import java.util.ArrayList;
import java.util.List;

public class BuilderFactura {
    private Factura factura;
    public  BuilderFactura(){


    }

    public BuilderFactura createFactura(){
        this.factura=new Factura();
        return this;

    }



    public BuilderFactura agregarItemFactura(Item item){
        Double descuento = calcularDescuento(factura, item);
        FacturaItem facturaItem=new BuilderFacturaItem(item,calcularDescuento(factura,item)).build();
        this.factura.addFacturaItem(facturaItem);
        return this;
    }

    private double calcularDescuento(Factura factura, Item item) {
        double descuento=0;
        if (item.getCantidad() % 2 == 0){
            descuento = (item.getCantidad()/2) * item.getProduct().getPrice();
        }
        else {
            descuento = ((item.getCantidad()-1)/2) * item.getProduct().getPrice();
        }
        return descuento;
    }

    public Factura build(){
        return this.factura;
    }

}
