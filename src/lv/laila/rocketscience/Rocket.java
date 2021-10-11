package lv.laila.rocketscience;

public class Rocket {

    private String name = "Initial Name";
    private String colour;
    private int weight;
    private int height;
    private Engine engine;
    private static int rocketCounter;
    public String id;

    /**
     * Rocket class for building spaceships
     */

    public Rocket() {
        addRocket();
    }

    /**
     * Argument constructor
     * @param name
     * @param colour
     * @param weight
     * @param height
     * @param engine
     * @param id
     */
    public Rocket(String name, String colour, int weight, int height, Engine engine, String id) {

        System.out.println("Original name: " + this.name);
        System.out.println("New name: " + name);

        this.name = name;
        this.colour = colour;
        this.weight = weight;
        this.height = height;
        this.engine = engine;
        this.id = id;
        addRocket();
    }

    public void printRocketData() {
        System.out.println("Rocket {" +
                " " + this.name + ", " +
                " " + this.colour + ", " +
                " " + this.weight + ", " +
                " " + this.height + ", " +
                "}");
    }

    @Override
    protected void finalize() {
        System.out.println("The rocket: " + this.name + " has been destroyed.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    static int countRockets() {
        return rocketCounter;
    }

    static void addRocket() {
        rocketCounter++;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
