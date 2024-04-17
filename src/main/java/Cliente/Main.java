package Cliente;

import Builder.BuilderFactura;
import Builder.BuilderFacturaItem;
import Director.DirectorFactura;
import Director.ShoppingCartDirector;
import entities.Item;
import entities.Producto;
import Producto.FacturaItem;
import Producto.Factura;
import entities.ShoppingCart;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ShoppingCart shoppingCart=new ShoppingCart();
        Producto producto=new Producto(1L,"Bufandas","Desc",2);
        Producto producto1=new Producto(2L,"Ruana","Desc",5);
        Item item=new Item(producto,2);
        Item item1=new Item(producto1,4);
        shoppingCart.getItems().add(item);
        shoppingCart.getItems().add(item1);

        BuilderFactura builderFactura=new BuilderFactura();
        DirectorFactura director=new ShoppingCartDirector(builderFactura,shoppingCart);
        Factura factura=director.buildFactura();

        System.out.println("Factura: "+factura);

        /*
        FacturaItem facturaItem=new BuilderFacturaItem(item,2).build();
        FacturaItem facturaItem1=new BuilderFacturaItem(item1,2).build();
        Factura factura=new BuilderFactura().agregarItemFactura(facturaItem).agregarItemFactura(facturaItem1).build();
        System.out.println(facturaItem);
        System.out.println(factura);

         */

    }
}