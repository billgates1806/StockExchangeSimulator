package model;

public abstract class Order {
    private int id, quantity, accountId;
    private String symbol;
    private double price;
    private OrderType type;

    public Order(int id, String symbol, int quantity, double price, int accountId, OrderType type) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
        this.accountId = accountId;
        this.type = type;
    }

    public int getId() { return id; }
    public String getSymbol() { return symbol; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }
    public int getAccountId() { return accountId; }
    public OrderType getType() { return type; }
}
