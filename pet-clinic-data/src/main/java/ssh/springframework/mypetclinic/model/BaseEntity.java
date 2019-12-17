package ssh.springframework.mypetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {
    //this id can be null by using Boxing type
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
