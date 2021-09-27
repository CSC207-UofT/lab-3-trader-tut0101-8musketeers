interface Domesticatable {
    /**
     * Return the sound made by this creature.
     * 
     * @return    The sound made by this creature.
     **/
    String sound();
    /**
     * Return the wildness of this creature on a scale of 1-10, where 10 is really wild and 1 is very tame.
     */
    int wildness();

    /**
     * Return how dangerous the creature is.
     */
    String dangerLevel();
}