package Director;

import Builder.BuilderFactura;
import Producto.Factura;
import entities.ShoppingCart;

public abstract class DirectorFactura {
   protected BuilderFactura builderFactura ;

   public DirectorFactura(BuilderFactura builderFactura){
      this.builderFactura=builderFactura;

   }
   public abstract Factura buildFactura();
}
