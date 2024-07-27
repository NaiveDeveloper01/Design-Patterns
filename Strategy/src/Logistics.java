public class Logistics {
    private Transports transports;

    public Logistics(Transports transports)
    {
        this.transports = transports;
    }

    public void shipProduct()
    {
        transports.deliverProduct();
    }
}
