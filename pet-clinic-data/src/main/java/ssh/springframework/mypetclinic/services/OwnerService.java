package ssh.springframework.mypetclinic.services;

import ssh.springframework.mypetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);

}
