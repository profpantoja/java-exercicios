package model;

/** Represents a sonic character, including its name, life, image file, and coordinates. */
public class Sonic extends Character {

    /**
     * A variable to keep track of the jump state of Sonic.
     */
    private boolean estapulando;

    /**
     * Creates a Sonic object with the specified values.
     * @param name Sonic's name.
     * @param life Sonic's life.
     * @param image Sonic's image file path
     * @param x Sonic's X coordinate.
     * @param y Sonic's Y coordinate.
     */
    public Sonic(String name, int life, String image, int x, int y) {
        super.setName(name);
        super.setLife(life);
        super.setX(x);
        super.setY(y);
        this.setImage(image);

    }

    /**
     * Returns the jump state of Sonic.
     * @return
     */
    public boolean isEstapulando() {
        return estapulando;
    }

    /**
     * Sets a new value to Sonic's jump state variable.
     * @param estapulando A variable to keep track of the jump state of Sonic.
     */
    public void setEstapulando(boolean estapulando) {
        this.estapulando = estapulando;
    }

    @Override
    /**
     * Moves Sonic by one unit in a specified direction.
     * @param direction The desired direction (must be one of the values specified in {@link Direction})
     */
    public void mover(Direction direction) {
        if (direction.equals(Direction.FRONT)) {
            super.setX(super.getX() + 1);
            System.out.println("Move: Frente - ( " + super.getX() + "," + super.getY() + " )");
        }

        else if (direction.equals(Direction.BACK)) {
            super.setX(super.getX() - 1);
            System.out.println("Move: Trás - ( " + super.getX() + "," + super.getY() + " )");
        }

        else if (direction.equals(Direction.UP)) {
            System.out.println("Só pulei mesmo...");
            this.estapulando = true;
            super.setY(super.getY() + 1);
            System.out.println("Move: Cima - ( " + super.getX() + "," + super.getY() + " )");
        }

        else if (direction.equals(Direction.DOWN)) {
            super.setY(super.getY() - 1);
            System.out.println("Move: Baixo - ( " + super.getX() + "," + super.getY() + " )");
        }
    }

}
