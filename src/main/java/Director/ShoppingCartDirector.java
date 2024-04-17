package Director;

import Builder.BuilderFactura;
import Builder.BuilderFacturaItem;
import Producto.Factura;
import Producto.FacturaItem;
import entities.Item;
import entities.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartDirector extends DirectorFactura{
    private ShoppingCart shoppingCart;
    public ShoppingCartDirector(BuilderFactura builderFactura, ShoppingCart shoppingCart){
        super(builderFactura);
        this.shoppingCart=shoppingCart;

    }

    @Override
    public Factura buildFactura() {
        List<FacturaItem> facturaItems=new ArrayList<>();

        for(Item item: shoppingCart.getItems()){
            FacturaItem facturaItem=new BuilderFacturaItem(item,0.0).build();
            facturaItems.add(facturaItem);
        }

        builderFactura.facturaItems(facturaItems);

        return builderFactura.build();
    }
}
