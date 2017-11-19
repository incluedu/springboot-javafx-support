package de.felixroske.jfxsupport;

/**
 * Interface for adding userdata functionality to a class
 */
public interface UserData {

    /**
     * Use this to add the Userdata
     *
     * @param data Userdata
     */
    public void addUserData(Object data);

    /**
     * Use this to receive the userdata from the class
     *
     * @return Userdata
     */
    public Object getUserData();

}
