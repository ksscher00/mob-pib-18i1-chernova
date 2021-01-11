package ru.sibadi.rest;

public class Rest {
    private final String name;
    private final Food[] menu;
    private final Table[] tables;

    public Rest() {
        this.name = "Oscar";
        this.menu = new Food[]{
                new Food("Martini", 800.00),
                new Food("Wine", 1200.00),
                new Food("Lobster", 1000.00),
                new Food("Steak", 1000.00),
                new Food("Carbonara paste", 800.00)
        };
        this.tables = new Table[]{
                new Table("1",100.0),
                new Table("2", 200.0),
                new Table("3", 300.0),
                new Table("4", 400.0),
                new Table("5", 500.0)
        };
    }

    public String getName() {
        return name;
    }

    public Food[] getMenu() {
        return menu;
    }

    public Table[] getTables() {
        return tables;
    }
}
