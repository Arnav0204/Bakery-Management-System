package bakery;

class Item {
    private int itemNo;
    private int itemCost;
    private int quantity;

    public Item(int itemNo, int itemCost, int quantity) {
        this.itemNo = itemNo;
        this.itemCost = itemCost;
        this.quantity = quantity;
    }

    public int getNo() {
        return this.itemNo;
    }

    public int getCost() {
        return this.itemCost;
    }

    public int getQuantity() {
        return this.quantity;
    }

}

class Bread extends Item {
    public Bread(int quantity) {
        super(1, 20, quantity);
    }
}

class Coffee extends Item {
    public Coffee(int quantity) {
        super(2, 10, quantity);
    }
}

class Pastry extends Item {
    public Pastry(int quantity) {
        super(3, 30, quantity);
    }
}

class Cookie extends Item {
    public Cookie(int quantity) {
        super(4, 40, quantity);
    }
}