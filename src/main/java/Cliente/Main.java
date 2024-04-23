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
        //Creando una instancia de ShoppingCart
        ShoppingCart shoppingCart=new ShoppingCart();
        //Creando instancias de producto
        Producto producto=new Producto(1L,"Bufandas","Desc",2.3);
        Producto producto1=new Producto(2L,"Ruana","Desc",5);
        //Creando instancias de Item
        Item item=new Item(producto,3);
        Item item1=new Item(producto1,4);
        //añadiendo items a shoppingCart
        shoppingCart.getItems().add(item);
        shoppingCart.getItems().add(item1);
        //Creando una instancia de BuilderFactura
        BuilderFactura builderFactura=new BuilderFactura();
        //Creando una instancia de DirectorFactura, pasando ShoppingCartDirector
        DirectorFactura director=new ShoppingCartDirector(builderFactura,shoppingCart);
        //Construyendo una factura a partir del director
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