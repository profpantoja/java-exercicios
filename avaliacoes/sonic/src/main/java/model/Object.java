package model;

/** Represents an object character, including its name, image file, coordinates and type. */
public class Object extends Character {
    /** The object's type. */
    private TipoObjeto tipo;
    
    /**
     * Creates an object with the specified values.
     * @param name The object's name.
     * @param image The object's image file path.
     * @param x The object's X coordinate.
     * @param y The object's Y coordinate.
     * @param tipo The object's type.
     */
    public Object(String name, String image, int x, int y, TipoObjeto tipo) {
        super.setName(name);
        super.setImage(image);
        super.setX(x);
        super.setY(y);
        this.tipo = tipo;
    }

    /**
     * Returns the object's type
     * @return The object's type.
     */
    public TipoObjeto getTipo() {
        return tipo;
    }

    /**
     * Sets a new type value to the object.
     * @param tipo The new type value.
     */
    public void setTipo(TipoObjeto tipo) {
        this.tipo = tipo;
    }

}
