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

        builderFactura.createFactura();
        for(Item item: shoppingCart.getItems()){
            builderFactura.agregarItemFactura(item);
        }
       return builderFactura.build();
    }
}
