package com.sdpgroup6.helps.Model;

public class Workshop {

    private Integer id;
    private String name;
    private Object archived;

    /**
     * @return The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The archived
     */
    public Object getArchived() {
        return archived;
    }

    /**
     * @param archived The archived
     */
    public void setArchived(Object archived) {
        this.archived = archived;
    }

}