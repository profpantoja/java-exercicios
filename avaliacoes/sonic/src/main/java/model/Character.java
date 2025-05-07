package model;

/** Represents a character, including its name, life, image file, and coordinates. */
public class Character {
    /** The character's name. */
    private String name;

    /** The character's life. */
    private int life;

    /** The character's image file path. */
    private String image;

    /** The character's X coordinate. */
    private int x;

    /** The character's Y coordinate. */
    private int y;

    /** Creates a character object with default values. */
    public Character() {
    }

    /**
     * Creates a character object with the specified values.
     * @param name Character's name
     * @param life Character's life
     * @param image Character's image file path
     * @param x Character's X coordinate
     * @param y Character's Y coordinate
     */
    public Character(String name, int life, String image, int x, int y) {
        this.name = name;
        this.life = life;
        this.image = image;
        this.x = x;
        this.y = y;
    }

    /** Returns the name of the character object.
     * @return Character's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the character object.
     * @param name Character's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** Returns the life of the character object.
     * @return Character's life
     */
    public int getLife() {
        return life;
    }

    /**
     * Sets the life of the character object.
     * @param life Character's life
     */
    public void setLife(int life) {
        this.life = life;
    }

    /**
     * Returns the image file of the character object.
     * @return Character's image file path
     */
    public String getImage() {
        return image;
    }

    /**
     * Sets a new image to the character object.
     * @param image Character's image file path
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Returns the X coordinate of the character object.
     * @return Character's X coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Sets a new X coordinate value to the character object.
     * @param x Character's X coordinate
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Returns the Y coordinate of the character object.
     * @return Character's Y coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * Sets a new Y coordinate value to the character object.
     * @param y Character's Y coordinate
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Returns a String with the values of the X and Y coordinates of the character object.
     * @return A String in the format "x: [value], y: [value]" representing the character's coordinates
     */
    public String getCoordinates() {
        return "x: " + this.x + ", y:" + this.y;
    }

    /**
     * Moves the character one unit in a specified direction.
     * @param direction The desired direction (must be one of the values specified in {@link Direction})
     */
    public void mover(Direction direction) {
        if (direction.equals(Direction.FRONT)) {
            this.x += 1;
            System.out.println("Move: Frente - ( " + this.x + "," + this.y + " )");
        }

        else if (direction.equals(Direction.BACK)) {

            this.x -= 1;
            System.out.println("Move: Trás - ( " + this.x + "," + this.y + " )");
        }

        else if (direction.equals(Direction.UP)) {

            this.y += 1;
            System.out.println("Move: Cima - ( " + this.x + "," + this.y + " )");
        }

        else if (direction.equals(Direction.DOWN)) {

            this.y -= 1;
            System.out.println("Move: Baixo - ( " + this.x + "," + this.y + " )");
        }
    }

}
